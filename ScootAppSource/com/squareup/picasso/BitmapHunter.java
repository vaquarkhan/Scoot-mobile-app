package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Handler;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

class BitmapHunter
  implements Runnable
{
  private static final Object DECODE_LOCK = new Object();
  private static final RequestHandler ERRORING_HANDLER = new BitmapHunter.2();
  private static final ThreadLocal<StringBuilder> NAME_BUILDER = new BitmapHunter.1();
  private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
  Action action;
  List<Action> actions;
  final Cache cache;
  final Request data;
  final Dispatcher dispatcher;
  Exception exception;
  int exifRotation;
  Future<?> future;
  final String key;
  Picasso.LoadedFrom loadedFrom;
  final int memoryPolicy;
  int networkPolicy;
  final Picasso picasso;
  Picasso.Priority priority;
  final RequestHandler requestHandler;
  Bitmap result;
  int retryCount;
  final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
  final Stats stats;
  
  BitmapHunter(Picasso paramPicasso, Dispatcher paramDispatcher, Cache paramCache, Stats paramStats, Action paramAction, RequestHandler paramRequestHandler)
  {
    this.picasso = paramPicasso;
    this.dispatcher = paramDispatcher;
    this.cache = paramCache;
    this.stats = paramStats;
    this.action = paramAction;
    this.key = paramAction.getKey();
    this.data = paramAction.getRequest();
    this.priority = paramAction.getPriority();
    this.memoryPolicy = paramAction.getMemoryPolicy();
    this.networkPolicy = paramAction.getNetworkPolicy();
    this.requestHandler = paramRequestHandler;
    this.retryCount = paramRequestHandler.getRetryCount();
  }
  
  static Bitmap applyCustomTransformations(List<Transformation> paramList, Bitmap paramBitmap)
  {
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      Transformation localTransformation = (Transformation)paramList.get(i);
      Bitmap localBitmap;
      try
      {
        localBitmap = localTransformation.transform(paramBitmap);
        if (localBitmap != null) {
          break label158;
        }
        paramBitmap = new StringBuilder().append("Transformation ").append(localTransformation.key()).append(" returned null after ").append(i).append(" previous transformation(s).\n\nTransformation list:\n");
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          paramBitmap.append(((Transformation)paramList.next()).key()).append('\n');
        }
        Picasso.HANDLER.post(new BitmapHunter.4(paramBitmap));
      }
      catch (RuntimeException paramList)
      {
        Picasso.HANDLER.post(new BitmapHunter.3(localTransformation, paramList));
        return null;
      }
      return null;
      label158:
      if ((localBitmap == paramBitmap) && (paramBitmap.isRecycled()))
      {
        Picasso.HANDLER.post(new BitmapHunter.5(localTransformation));
        return null;
      }
      if ((localBitmap != paramBitmap) && (!paramBitmap.isRecycled()))
      {
        Picasso.HANDLER.post(new BitmapHunter.6(localTransformation));
        return null;
      }
      i += 1;
      paramBitmap = localBitmap;
    }
    return paramBitmap;
  }
  
  private Picasso.Priority computeNewPriority()
  {
    int m = 1;
    int k = 0;
    Object localObject1 = Picasso.Priority.LOW;
    int i;
    if ((this.actions != null) && (!this.actions.isEmpty()))
    {
      i = 1;
      j = m;
      if (this.action == null) {
        if (i == 0) {
          break label64;
        }
      }
    }
    Object localObject2;
    label64:
    for (int j = m;; j = 0)
    {
      if (j != 0) {
        break label69;
      }
      localObject2 = localObject1;
      return (Picasso.Priority)localObject2;
      i = 0;
      break;
    }
    label69:
    if (this.action != null) {
      localObject1 = this.action.getPriority();
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (i == 0) {
        break;
      }
      j = this.actions.size();
      i = k;
      localObject2 = localObject1;
      if (i >= j) {
        break;
      }
      localObject2 = ((Action)this.actions.get(i)).getPriority();
      if (((Picasso.Priority)localObject2).ordinal() > ((Picasso.Priority)localObject1).ordinal()) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        i += 1;
        break;
      }
    }
  }
  
  static Bitmap decodeStream(InputStream paramInputStream, Request paramRequest)
  {
    Object localObject = new MarkableInputStream(paramInputStream);
    long l = ((MarkableInputStream)localObject).savePosition(65536);
    paramInputStream = RequestHandler.createBitmapOptions(paramRequest);
    boolean bool1 = RequestHandler.requiresInSampleSize(paramInputStream);
    boolean bool2 = Utils.isWebPFile((InputStream)localObject);
    ((MarkableInputStream)localObject).reset(l);
    if (bool2)
    {
      localObject = Utils.toByteArray((InputStream)localObject);
      if (bool1)
      {
        BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length, paramInputStream);
        RequestHandler.calculateInSampleSize(paramRequest.targetWidth, paramRequest.targetHeight, paramInputStream, paramRequest);
      }
      paramInputStream = BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length, paramInputStream);
    }
    do
    {
      return paramInputStream;
      if (bool1)
      {
        BitmapFactory.decodeStream((InputStream)localObject, null, paramInputStream);
        RequestHandler.calculateInSampleSize(paramRequest.targetWidth, paramRequest.targetHeight, paramInputStream, paramRequest);
        ((MarkableInputStream)localObject).reset(l);
      }
      paramRequest = BitmapFactory.decodeStream((InputStream)localObject, null, paramInputStream);
      paramInputStream = paramRequest;
    } while (paramRequest != null);
    throw new IOException("Failed to decode stream.");
  }
  
  static BitmapHunter forRequest(Picasso paramPicasso, Dispatcher paramDispatcher, Cache paramCache, Stats paramStats, Action paramAction)
  {
    Request localRequest = paramAction.getRequest();
    List localList = paramPicasso.getRequestHandlers();
    int i = 0;
    int j = localList.size();
    while (i < j)
    {
      RequestHandler localRequestHandler = (RequestHandler)localList.get(i);
      if (localRequestHandler.canHandleRequest(localRequest)) {
        return new BitmapHunter(paramPicasso, paramDispatcher, paramCache, paramStats, paramAction, localRequestHandler);
      }
      i += 1;
    }
    return new BitmapHunter(paramPicasso, paramDispatcher, paramCache, paramStats, paramAction, ERRORING_HANDLER);
  }
  
  private static boolean shouldResize(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (!paramBoolean) || (paramInt1 > paramInt3) || (paramInt2 > paramInt4);
  }
  
  static Bitmap transformResult(Request paramRequest, Bitmap paramBitmap, int paramInt)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    boolean bool = paramRequest.onlyScaleDown;
    Object localObject = new Matrix();
    int i2;
    int i3;
    float f1;
    int m;
    int k;
    int n;
    int i1;
    if (paramRequest.needsMatrixTransform())
    {
      i2 = paramRequest.targetWidth;
      i3 = paramRequest.targetHeight;
      f1 = paramRequest.rotationDegrees;
      float f3;
      if (f1 != 0.0F)
      {
        if (paramRequest.hasRotationPivot) {
          ((Matrix)localObject).setRotate(f1, paramRequest.rotationPivotX, paramRequest.rotationPivotY);
        }
      }
      else
      {
        if (!paramRequest.centerCrop) {
          break label291;
        }
        f2 = i2 / i;
        f1 = i3 / j;
        if (f2 <= f1) {
          break label244;
        }
        f3 = j;
        m = (int)Math.ceil(f1 / f2 * f3);
        k = (j - m) / 2;
        f1 = i3 / m;
        n = 0;
        i1 = i;
      }
      for (;;)
      {
        if (shouldResize(bool, i, j, i2, i3)) {
          ((Matrix)localObject).preScale(f2, f1);
        }
        i = n;
        j = k;
        k = i1;
        if (paramInt != 0) {
          ((Matrix)localObject).preRotate(paramInt);
        }
        localObject = Bitmap.createBitmap(paramBitmap, i, j, k, m, (Matrix)localObject, true);
        paramRequest = paramBitmap;
        if (localObject != paramBitmap)
        {
          paramBitmap.recycle();
          paramRequest = (Request)localObject;
        }
        return paramRequest;
        ((Matrix)localObject).setRotate(f1);
        break;
        label244:
        f3 = i;
        i1 = (int)Math.ceil(f2 / f1 * f3);
        n = (i - i1) / 2;
        f2 = i2 / i1;
        k = 0;
        m = j;
      }
      label291:
      if (paramRequest.centerInside)
      {
        f1 = i2 / i;
        f2 = i3 / j;
        if (f1 < f2) {}
        for (;;)
        {
          if (shouldResize(bool, i, j, i2, i3)) {
            ((Matrix)localObject).preScale(f1, f1);
          }
          n = 0;
          i1 = 0;
          m = j;
          k = i;
          i = i1;
          j = n;
          break;
          f1 = f2;
        }
      }
      if (((i2 != 0) || (i3 != 0)) && ((i2 != i) || (i3 != j)))
      {
        if (i2 == 0) {
          break label478;
        }
        f1 = i2 / i;
        label414:
        if (i3 == 0) {
          break label489;
        }
      }
    }
    label478:
    label489:
    for (float f2 = i3 / j;; f2 = i2 / i)
    {
      if (shouldResize(bool, i, j, i2, i3)) {
        ((Matrix)localObject).preScale(f1, f2);
      }
      n = 0;
      i1 = 0;
      m = j;
      k = i;
      i = i1;
      j = n;
      break;
      f1 = i3 / j;
      break label414;
    }
  }
  
  static void updateThreadName(Request paramRequest)
  {
    paramRequest = paramRequest.getName();
    StringBuilder localStringBuilder = (StringBuilder)NAME_BUILDER.get();
    localStringBuilder.ensureCapacity("Picasso-".length() + paramRequest.length());
    localStringBuilder.replace("Picasso-".length(), localStringBuilder.length(), paramRequest);
    Thread.currentThread().setName(localStringBuilder.toString());
  }
  
  void attach(Action paramAction)
  {
    boolean bool = this.picasso.loggingEnabled;
    Request localRequest = paramAction.request;
    if (this.action == null)
    {
      this.action = paramAction;
      if (bool)
      {
        if ((this.actions != null) && (!this.actions.isEmpty())) {
          break label65;
        }
        Utils.log("Hunter", "joined", localRequest.logId(), "to empty hunter");
      }
    }
    label65:
    do
    {
      return;
      Utils.log("Hunter", "joined", localRequest.logId(), Utils.getLogIdsForHunter(this, "to "));
      return;
      if (this.actions == null) {
        this.actions = new ArrayList(3);
      }
      this.actions.add(paramAction);
      if (bool) {
        Utils.log("Hunter", "joined", localRequest.logId(), Utils.getLogIdsForHunter(this, "to "));
      }
      paramAction = paramAction.getPriority();
    } while (paramAction.ordinal() <= this.priority.ordinal());
    this.priority = paramAction;
  }
  
  boolean cancel()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.action == null) {
      if (this.actions != null)
      {
        bool1 = bool2;
        if (!this.actions.isEmpty()) {}
      }
      else
      {
        bool1 = bool2;
        if (this.future != null)
        {
          bool1 = bool2;
          if (this.future.cancel(false)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  void detach(Action paramAction)
  {
    boolean bool = false;
    if (this.action == paramAction)
    {
      this.action = null;
      bool = true;
    }
    for (;;)
    {
      if ((bool) && (paramAction.getPriority() == this.priority)) {
        this.priority = computeNewPriority();
      }
      if (this.picasso.loggingEnabled) {
        Utils.log("Hunter", "removed", paramAction.request.logId(), Utils.getLogIdsForHunter(this, "from "));
      }
      return;
      if (this.actions != null) {
        bool = this.actions.remove(paramAction);
      }
    }
  }
  
  Action getAction()
  {
    return this.action;
  }
  
  List<Action> getActions()
  {
    return this.actions;
  }
  
  Request getData()
  {
    return this.data;
  }
  
  Exception getException()
  {
    return this.exception;
  }
  
  String getKey()
  {
    return this.key;
  }
  
  Picasso.LoadedFrom getLoadedFrom()
  {
    return this.loadedFrom;
  }
  
  int getMemoryPolicy()
  {
    return this.memoryPolicy;
  }
  
  Picasso getPicasso()
  {
    return this.picasso;
  }
  
  Picasso.Priority getPriority()
  {
    return this.priority;
  }
  
  Bitmap getResult()
  {
    return this.result;
  }
  
  Bitmap hunt()
  {
    Object localObject1 = null;
    Object localObject4;
    if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy))
    {
      ??? = this.cache.get(this.key);
      localObject1 = ???;
      if (??? != null)
      {
        this.stats.dispatchCacheHit();
        this.loadedFrom = Picasso.LoadedFrom.MEMORY;
        localObject4 = ???;
        if (this.picasso.loggingEnabled)
        {
          Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
          localObject4 = ???;
        }
      }
    }
    for (;;)
    {
      return (Bitmap)localObject4;
      localObject4 = this.data;
      int i;
      if (this.retryCount == 0)
      {
        i = NetworkPolicy.OFFLINE.index;
        label105:
        ((Request)localObject4).networkPolicy = i;
        ??? = this.requestHandler.load(this.data, this.networkPolicy);
        if (??? != null)
        {
          this.loadedFrom = ((RequestHandler.Result)???).getLoadedFrom();
          this.exifRotation = ((RequestHandler.Result)???).getExifOrientation();
          localObject4 = ((RequestHandler.Result)???).getBitmap();
          localObject1 = localObject4;
          if (localObject4 == null) {
            localObject4 = ((RequestHandler.Result)???).getStream();
          }
        }
      }
      try
      {
        localObject1 = decodeStream((InputStream)localObject4, this.data);
        Utils.closeQuietly((InputStream)localObject4);
        localObject4 = localObject1;
        if (localObject1 == null) {
          continue;
        }
        if (this.picasso.loggingEnabled) {
          Utils.log("Hunter", "decoded", this.data.logId());
        }
        this.stats.dispatchBitmapDecoded((Bitmap)localObject1);
        if (!this.data.needsTransformation())
        {
          localObject4 = localObject1;
          if (this.exifRotation == 0) {
            continue;
          }
        }
      }
      finally
      {
        synchronized (DECODE_LOCK)
        {
          if (!this.data.needsMatrixTransform())
          {
            localObject4 = localObject1;
            if (this.exifRotation == 0) {}
          }
          else
          {
            localObject1 = transformResult(this.data, (Bitmap)localObject1, this.exifRotation);
            localObject4 = localObject1;
            if (this.picasso.loggingEnabled)
            {
              Utils.log("Hunter", "transformed", this.data.logId());
              localObject4 = localObject1;
            }
          }
          localObject1 = localObject4;
          if (this.data.hasCustomTransformations())
          {
            localObject4 = applyCustomTransformations(this.data.transformations, (Bitmap)localObject4);
            localObject1 = localObject4;
            if (this.picasso.loggingEnabled)
            {
              Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
              localObject1 = localObject4;
            }
          }
          localObject4 = localObject1;
          if (localObject1 == null) {
            continue;
          }
          this.stats.dispatchBitmapTransformed((Bitmap)localObject1);
          return (Bitmap)localObject1;
          i = this.networkPolicy;
          break label105;
          localObject2 = finally;
          Utils.closeQuietly((InputStream)localObject4);
          throw ((Throwable)localObject2);
        }
      }
    }
  }
  
  boolean isCancelled()
  {
    return (this.future != null) && (this.future.isCancelled());
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 104	com/squareup/picasso/BitmapHunter:data	Lcom/squareup/picasso/Request;
    //   4: invokestatic 588	com/squareup/picasso/BitmapHunter:updateThreadName	(Lcom/squareup/picasso/Request;)V
    //   7: aload_0
    //   8: getfield 82	com/squareup/picasso/BitmapHunter:picasso	Lcom/squareup/picasso/Picasso;
    //   11: getfield 419	com/squareup/picasso/Picasso:loggingEnabled	Z
    //   14: ifeq +16 -> 30
    //   17: ldc_w 424
    //   20: ldc_w 590
    //   23: aload_0
    //   24: invokestatic 593	com/squareup/picasso/Utils:getLogIdsForHunter	(Lcom/squareup/picasso/BitmapHunter;)Ljava/lang/String;
    //   27: invokestatic 550	com/squareup/picasso/Utils:log	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_0
    //   31: aload_0
    //   32: invokevirtual 595	com/squareup/picasso/BitmapHunter:hunt	()Landroid/graphics/Bitmap;
    //   35: putfield 486	com/squareup/picasso/BitmapHunter:result	Landroid/graphics/Bitmap;
    //   38: aload_0
    //   39: getfield 486	com/squareup/picasso/BitmapHunter:result	Landroid/graphics/Bitmap;
    //   42: ifnonnull +21 -> 63
    //   45: aload_0
    //   46: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   49: aload_0
    //   50: invokevirtual 601	com/squareup/picasso/Dispatcher:dispatchFailed	(Lcom/squareup/picasso/BitmapHunter;)V
    //   53: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   56: ldc_w 603
    //   59: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   62: return
    //   63: aload_0
    //   64: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   67: aload_0
    //   68: invokevirtual 606	com/squareup/picasso/Dispatcher:dispatchComplete	(Lcom/squareup/picasso/BitmapHunter;)V
    //   71: goto -18 -> 53
    //   74: astore_1
    //   75: aload_1
    //   76: getfield 609	com/squareup/picasso/Downloader$ResponseException:localCacheOnly	Z
    //   79: ifeq +13 -> 92
    //   82: aload_1
    //   83: getfield 612	com/squareup/picasso/Downloader$ResponseException:responseCode	I
    //   86: sipush 504
    //   89: if_icmpeq +8 -> 97
    //   92: aload_0
    //   93: aload_1
    //   94: putfield 476	com/squareup/picasso/BitmapHunter:exception	Ljava/lang/Exception;
    //   97: aload_0
    //   98: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   101: aload_0
    //   102: invokevirtual 601	com/squareup/picasso/Dispatcher:dispatchFailed	(Lcom/squareup/picasso/BitmapHunter;)V
    //   105: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   108: ldc_w 603
    //   111: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   114: return
    //   115: astore_1
    //   116: aload_0
    //   117: aload_1
    //   118: putfield 476	com/squareup/picasso/BitmapHunter:exception	Ljava/lang/Exception;
    //   121: aload_0
    //   122: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   125: aload_0
    //   126: invokevirtual 615	com/squareup/picasso/Dispatcher:dispatchRetry	(Lcom/squareup/picasso/BitmapHunter;)V
    //   129: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   132: ldc_w 603
    //   135: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   138: return
    //   139: astore_1
    //   140: aload_0
    //   141: aload_1
    //   142: putfield 476	com/squareup/picasso/BitmapHunter:exception	Ljava/lang/Exception;
    //   145: aload_0
    //   146: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   149: aload_0
    //   150: invokevirtual 615	com/squareup/picasso/Dispatcher:dispatchRetry	(Lcom/squareup/picasso/BitmapHunter;)V
    //   153: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   156: ldc_w 603
    //   159: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   162: return
    //   163: astore_1
    //   164: new 617	java/io/StringWriter
    //   167: dup
    //   168: invokespecial 618	java/io/StringWriter:<init>	()V
    //   171: astore_2
    //   172: aload_0
    //   173: getfield 88	com/squareup/picasso/BitmapHunter:stats	Lcom/squareup/picasso/Stats;
    //   176: invokevirtual 622	com/squareup/picasso/Stats:createSnapshot	()Lcom/squareup/picasso/StatsSnapshot;
    //   179: new 624	java/io/PrintWriter
    //   182: dup
    //   183: aload_2
    //   184: invokespecial 627	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   187: invokevirtual 633	com/squareup/picasso/StatsSnapshot:dump	(Ljava/io/PrintWriter;)V
    //   190: aload_0
    //   191: new 133	java/lang/RuntimeException
    //   194: dup
    //   195: aload_2
    //   196: invokevirtual 634	java/io/StringWriter:toString	()Ljava/lang/String;
    //   199: aload_1
    //   200: invokespecial 637	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   203: putfield 476	com/squareup/picasso/BitmapHunter:exception	Ljava/lang/Exception;
    //   206: aload_0
    //   207: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   210: aload_0
    //   211: invokevirtual 601	com/squareup/picasso/Dispatcher:dispatchFailed	(Lcom/squareup/picasso/BitmapHunter;)V
    //   214: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   217: ldc_w 603
    //   220: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   223: return
    //   224: astore_1
    //   225: aload_0
    //   226: aload_1
    //   227: putfield 476	com/squareup/picasso/BitmapHunter:exception	Ljava/lang/Exception;
    //   230: aload_0
    //   231: getfield 84	com/squareup/picasso/BitmapHunter:dispatcher	Lcom/squareup/picasso/Dispatcher;
    //   234: aload_0
    //   235: invokevirtual 601	com/squareup/picasso/Dispatcher:dispatchFailed	(Lcom/squareup/picasso/BitmapHunter;)V
    //   238: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   241: ldc_w 603
    //   244: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   247: return
    //   248: astore_1
    //   249: invokestatic 408	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   252: ldc_w 603
    //   255: invokevirtual 414	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   258: aload_1
    //   259: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	BitmapHunter
    //   74	20	1	localResponseException	Downloader.ResponseException
    //   115	3	1	localContentLengthException	NetworkRequestHandler.ContentLengthException
    //   139	3	1	localIOException	IOException
    //   163	37	1	localOutOfMemoryError	OutOfMemoryError
    //   224	3	1	localException	Exception
    //   248	11	1	localObject	Object
    //   171	25	2	localStringWriter	java.io.StringWriter
    // Exception table:
    //   from	to	target	type
    //   0	30	74	com/squareup/picasso/Downloader$ResponseException
    //   30	53	74	com/squareup/picasso/Downloader$ResponseException
    //   63	71	74	com/squareup/picasso/Downloader$ResponseException
    //   0	30	115	com/squareup/picasso/NetworkRequestHandler$ContentLengthException
    //   30	53	115	com/squareup/picasso/NetworkRequestHandler$ContentLengthException
    //   63	71	115	com/squareup/picasso/NetworkRequestHandler$ContentLengthException
    //   0	30	139	java/io/IOException
    //   30	53	139	java/io/IOException
    //   63	71	139	java/io/IOException
    //   0	30	163	java/lang/OutOfMemoryError
    //   30	53	163	java/lang/OutOfMemoryError
    //   63	71	163	java/lang/OutOfMemoryError
    //   0	30	224	java/lang/Exception
    //   30	53	224	java/lang/Exception
    //   63	71	224	java/lang/Exception
    //   0	30	248	finally
    //   30	53	248	finally
    //   63	71	248	finally
    //   75	92	248	finally
    //   92	97	248	finally
    //   97	105	248	finally
    //   116	129	248	finally
    //   140	153	248	finally
    //   164	214	248	finally
    //   225	238	248	finally
  }
  
  boolean shouldRetry(boolean paramBoolean, NetworkInfo paramNetworkInfo)
  {
    if (this.retryCount > 0) {}
    for (int i = 1; i == 0; i = 0) {
      return false;
    }
    this.retryCount -= 1;
    return this.requestHandler.shouldRetry(paramBoolean, paramNetworkInfo);
  }
  
  boolean supportsReplay()
  {
    return this.requestHandler.supportsReplay();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\BitmapHunter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */