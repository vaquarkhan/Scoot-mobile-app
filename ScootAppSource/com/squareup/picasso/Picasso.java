package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RemoteViews;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class Picasso
{
  static final Handler HANDLER = new Picasso.1(Looper.getMainLooper());
  static final String TAG = "Picasso";
  static volatile Picasso singleton = null;
  final Cache cache;
  private final Picasso.CleanupThread cleanupThread;
  final Context context;
  final Bitmap.Config defaultBitmapConfig;
  final Dispatcher dispatcher;
  boolean indicatorsEnabled;
  private final Picasso.Listener listener;
  volatile boolean loggingEnabled;
  final ReferenceQueue<Object> referenceQueue;
  private final List<RequestHandler> requestHandlers;
  private final Picasso.RequestTransformer requestTransformer;
  boolean shutdown;
  final Stats stats;
  final Map<Object, Action> targetToAction;
  final Map<ImageView, DeferredRequestCreator> targetToDeferredRequestCreator;
  
  Picasso(Context paramContext, Dispatcher paramDispatcher, Cache paramCache, Picasso.Listener paramListener, Picasso.RequestTransformer paramRequestTransformer, List<RequestHandler> paramList, Stats paramStats, Bitmap.Config paramConfig, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.context = paramContext;
    this.dispatcher = paramDispatcher;
    this.cache = paramCache;
    this.listener = paramListener;
    this.requestTransformer = paramRequestTransformer;
    this.defaultBitmapConfig = paramConfig;
    if (paramList != null) {}
    for (int i = paramList.size();; i = 0)
    {
      paramCache = new ArrayList(i + 7);
      paramCache.add(new ResourceRequestHandler(paramContext));
      if (paramList != null) {
        paramCache.addAll(paramList);
      }
      paramCache.add(new ContactsPhotoRequestHandler(paramContext));
      paramCache.add(new MediaStoreRequestHandler(paramContext));
      paramCache.add(new ContentStreamRequestHandler(paramContext));
      paramCache.add(new AssetRequestHandler(paramContext));
      paramCache.add(new FileRequestHandler(paramContext));
      paramCache.add(new NetworkRequestHandler(paramDispatcher.downloader, paramStats));
      this.requestHandlers = Collections.unmodifiableList(paramCache);
      this.stats = paramStats;
      this.targetToAction = new WeakHashMap();
      this.targetToDeferredRequestCreator = new WeakHashMap();
      this.indicatorsEnabled = paramBoolean1;
      this.loggingEnabled = paramBoolean2;
      this.referenceQueue = new ReferenceQueue();
      this.cleanupThread = new Picasso.CleanupThread(this.referenceQueue, HANDLER);
      this.cleanupThread.start();
      return;
    }
  }
  
  private void cancelExistingRequest(Object paramObject)
  {
    Utils.checkMain();
    Action localAction = (Action)this.targetToAction.remove(paramObject);
    if (localAction != null)
    {
      localAction.cancel();
      this.dispatcher.dispatchCancel(localAction);
    }
    if ((paramObject instanceof ImageView))
    {
      paramObject = (ImageView)paramObject;
      paramObject = (DeferredRequestCreator)this.targetToDeferredRequestCreator.remove(paramObject);
      if (paramObject != null) {
        ((DeferredRequestCreator)paramObject).cancel();
      }
    }
  }
  
  private void deliverAction(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom, Action paramAction)
  {
    if (paramAction.isCancelled()) {}
    do
    {
      do
      {
        return;
        if (!paramAction.willReplay()) {
          this.targetToAction.remove(paramAction.getTarget());
        }
        if (paramBitmap == null) {
          break;
        }
        if (paramLoadedFrom == null) {
          throw new AssertionError("LoadedFrom cannot be null.");
        }
        paramAction.complete(paramBitmap, paramLoadedFrom);
      } while (!this.loggingEnabled);
      Utils.log("Main", "completed", paramAction.request.logId(), "from " + paramLoadedFrom);
      return;
      paramAction.error();
    } while (!this.loggingEnabled);
    Utils.log("Main", "errored", paramAction.request.logId());
  }
  
  public static void setSingletonInstance(Picasso paramPicasso)
  {
    try
    {
      if (singleton != null) {
        throw new IllegalStateException("Singleton instance already exists.");
      }
    }
    finally {}
    singleton = paramPicasso;
  }
  
  public static Picasso with(Context paramContext)
  {
    if (singleton == null) {}
    try
    {
      if (singleton == null) {
        singleton = new Picasso.Builder(paramContext).build();
      }
      return singleton;
    }
    finally {}
  }
  
  public boolean areIndicatorsEnabled()
  {
    return this.indicatorsEnabled;
  }
  
  public void cancelRequest(ImageView paramImageView)
  {
    cancelExistingRequest(paramImageView);
  }
  
  public void cancelRequest(RemoteViews paramRemoteViews, int paramInt)
  {
    cancelExistingRequest(new RemoteViewsAction.RemoteViewsTarget(paramRemoteViews, paramInt));
  }
  
  public void cancelRequest(Target paramTarget)
  {
    cancelExistingRequest(paramTarget);
  }
  
  public void cancelTag(Object paramObject)
  {
    Utils.checkMain();
    ArrayList localArrayList = new ArrayList(this.targetToAction.values());
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      Action localAction = (Action)localArrayList.get(i);
      if (localAction.getTag().equals(paramObject)) {
        cancelExistingRequest(localAction.getTarget());
      }
      i += 1;
    }
  }
  
  void complete(BitmapHunter paramBitmapHunter)
  {
    int k = 1;
    Action localAction = paramBitmapHunter.getAction();
    List localList = paramBitmapHunter.getActions();
    int i;
    int j;
    if ((localList != null) && (!localList.isEmpty()))
    {
      i = 1;
      j = k;
      if (localAction == null)
      {
        if (i == 0) {
          break label57;
        }
        j = k;
      }
      label47:
      if (j != 0) {
        break label62;
      }
    }
    label57:
    label62:
    Uri localUri;
    Exception localException;
    do
    {
      return;
      i = 0;
      break;
      j = 0;
      break label47;
      localUri = paramBitmapHunter.getData().uri;
      localException = paramBitmapHunter.getException();
      Bitmap localBitmap = paramBitmapHunter.getResult();
      paramBitmapHunter = paramBitmapHunter.getLoadedFrom();
      if (localAction != null) {
        deliverAction(localBitmap, paramBitmapHunter, localAction);
      }
      if (i != 0)
      {
        j = localList.size();
        i = 0;
        while (i < j)
        {
          deliverAction(localBitmap, paramBitmapHunter, (Action)localList.get(i));
          i += 1;
        }
      }
    } while ((this.listener == null) || (localException == null));
    this.listener.onImageLoadFailed(this, localUri, localException);
  }
  
  void defer(ImageView paramImageView, DeferredRequestCreator paramDeferredRequestCreator)
  {
    this.targetToDeferredRequestCreator.put(paramImageView, paramDeferredRequestCreator);
  }
  
  void enqueueAndSubmit(Action paramAction)
  {
    Object localObject = paramAction.getTarget();
    if ((localObject != null) && (this.targetToAction.get(localObject) != paramAction))
    {
      cancelExistingRequest(localObject);
      this.targetToAction.put(localObject, paramAction);
    }
    submit(paramAction);
  }
  
  List<RequestHandler> getRequestHandlers()
  {
    return this.requestHandlers;
  }
  
  public StatsSnapshot getSnapshot()
  {
    return this.stats.createSnapshot();
  }
  
  public void invalidate(Uri paramUri)
  {
    if (paramUri == null) {
      throw new IllegalArgumentException("uri == null");
    }
    this.cache.clearKeyUri(paramUri.toString());
  }
  
  public void invalidate(File paramFile)
  {
    if (paramFile == null) {
      throw new IllegalArgumentException("file == null");
    }
    invalidate(Uri.fromFile(paramFile));
  }
  
  public void invalidate(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("path == null");
    }
    invalidate(Uri.parse(paramString));
  }
  
  @Deprecated
  public boolean isDebugging()
  {
    return (areIndicatorsEnabled()) && (isLoggingEnabled());
  }
  
  public boolean isLoggingEnabled()
  {
    return this.loggingEnabled;
  }
  
  public RequestCreator load(int paramInt)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Resource ID must not be zero.");
    }
    return new RequestCreator(this, null, paramInt);
  }
  
  public RequestCreator load(Uri paramUri)
  {
    return new RequestCreator(this, paramUri, 0);
  }
  
  public RequestCreator load(File paramFile)
  {
    if (paramFile == null) {
      return new RequestCreator(this, null, 0);
    }
    return load(Uri.fromFile(paramFile));
  }
  
  public RequestCreator load(String paramString)
  {
    if (paramString == null) {
      return new RequestCreator(this, null, 0);
    }
    if (paramString.trim().length() == 0) {
      throw new IllegalArgumentException("Path must not be empty.");
    }
    return load(Uri.parse(paramString));
  }
  
  public void pauseTag(Object paramObject)
  {
    this.dispatcher.dispatchPauseTag(paramObject);
  }
  
  Bitmap quickMemoryCacheCheck(String paramString)
  {
    paramString = this.cache.get(paramString);
    if (paramString != null)
    {
      this.stats.dispatchCacheHit();
      return paramString;
    }
    this.stats.dispatchCacheMiss();
    return paramString;
  }
  
  void resumeAction(Action paramAction)
  {
    Bitmap localBitmap = null;
    if (MemoryPolicy.shouldReadFromMemoryCache(paramAction.memoryPolicy)) {
      localBitmap = quickMemoryCacheCheck(paramAction.getKey());
    }
    if (localBitmap != null)
    {
      deliverAction(localBitmap, Picasso.LoadedFrom.MEMORY, paramAction);
      if (this.loggingEnabled) {
        Utils.log("Main", "completed", paramAction.request.logId(), "from " + Picasso.LoadedFrom.MEMORY);
      }
    }
    do
    {
      return;
      enqueueAndSubmit(paramAction);
    } while (!this.loggingEnabled);
    Utils.log("Main", "resumed", paramAction.request.logId());
  }
  
  public void resumeTag(Object paramObject)
  {
    this.dispatcher.dispatchResumeTag(paramObject);
  }
  
  @Deprecated
  public void setDebugging(boolean paramBoolean)
  {
    setIndicatorsEnabled(paramBoolean);
  }
  
  public void setIndicatorsEnabled(boolean paramBoolean)
  {
    this.indicatorsEnabled = paramBoolean;
  }
  
  public void setLoggingEnabled(boolean paramBoolean)
  {
    this.loggingEnabled = paramBoolean;
  }
  
  public void shutdown()
  {
    if (this == singleton) {
      throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
    }
    if (this.shutdown) {
      return;
    }
    this.cache.clear();
    this.cleanupThread.shutdown();
    this.stats.shutdown();
    this.dispatcher.shutdown();
    Iterator localIterator = this.targetToDeferredRequestCreator.values().iterator();
    while (localIterator.hasNext()) {
      ((DeferredRequestCreator)localIterator.next()).cancel();
    }
    this.targetToDeferredRequestCreator.clear();
    this.shutdown = true;
  }
  
  void submit(Action paramAction)
  {
    this.dispatcher.dispatchSubmit(paramAction);
  }
  
  Request transformRequest(Request paramRequest)
  {
    Request localRequest = this.requestTransformer.transformRequest(paramRequest);
    if (localRequest == null) {
      throw new IllegalStateException("Request transformer " + this.requestTransformer.getClass().getCanonicalName() + " returned null for " + paramRequest);
    }
    return localRequest;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Picasso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */