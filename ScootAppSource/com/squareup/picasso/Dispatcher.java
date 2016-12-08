package com.squareup.picasso;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

class Dispatcher
{
  static final int AIRPLANE_MODE_CHANGE = 10;
  private static final int AIRPLANE_MODE_OFF = 0;
  private static final int AIRPLANE_MODE_ON = 1;
  private static final int BATCH_DELAY = 200;
  private static final String DISPATCHER_THREAD_NAME = "Dispatcher";
  static final int HUNTER_BATCH_COMPLETE = 8;
  static final int HUNTER_COMPLETE = 4;
  static final int HUNTER_DECODE_FAILED = 6;
  static final int HUNTER_DELAY_NEXT_BATCH = 7;
  static final int HUNTER_RETRY = 5;
  static final int NETWORK_STATE_CHANGE = 9;
  static final int REQUEST_BATCH_RESUME = 13;
  static final int REQUEST_CANCEL = 2;
  static final int REQUEST_GCED = 3;
  static final int REQUEST_SUBMIT = 1;
  private static final int RETRY_DELAY = 500;
  static final int TAG_PAUSE = 11;
  static final int TAG_RESUME = 12;
  boolean airplaneMode;
  final List<BitmapHunter> batch;
  final Cache cache;
  final Context context;
  final Dispatcher.DispatcherThread dispatcherThread = new Dispatcher.DispatcherThread();
  final Downloader downloader;
  final Map<Object, Action> failedActions;
  final Handler handler;
  final Map<String, BitmapHunter> hunterMap;
  final Handler mainThreadHandler;
  final Map<Object, Action> pausedActions;
  final Set<Object> pausedTags;
  final Dispatcher.NetworkBroadcastReceiver receiver;
  final boolean scansNetworkChanges;
  final ExecutorService service;
  final Stats stats;
  
  Dispatcher(Context paramContext, ExecutorService paramExecutorService, Handler paramHandler, Downloader paramDownloader, Cache paramCache, Stats paramStats)
  {
    this.dispatcherThread.start();
    Utils.flushStackLocalLeaks(this.dispatcherThread.getLooper());
    this.context = paramContext;
    this.service = paramExecutorService;
    this.hunterMap = new LinkedHashMap();
    this.failedActions = new WeakHashMap();
    this.pausedActions = new WeakHashMap();
    this.pausedTags = new HashSet();
    this.handler = new Dispatcher.DispatcherHandler(this.dispatcherThread.getLooper(), this);
    this.downloader = paramDownloader;
    this.mainThreadHandler = paramHandler;
    this.cache = paramCache;
    this.stats = paramStats;
    this.batch = new ArrayList(4);
    this.airplaneMode = Utils.isAirplaneModeOn(this.context);
    this.scansNetworkChanges = Utils.hasPermission(paramContext, "android.permission.ACCESS_NETWORK_STATE");
    this.receiver = new Dispatcher.NetworkBroadcastReceiver(this);
    this.receiver.register();
  }
  
  private void batch(BitmapHunter paramBitmapHunter)
  {
    if (paramBitmapHunter.isCancelled()) {}
    do
    {
      return;
      this.batch.add(paramBitmapHunter);
    } while (this.handler.hasMessages(7));
    this.handler.sendEmptyMessageDelayed(7, 200L);
  }
  
  private void flushFailedActions()
  {
    if (!this.failedActions.isEmpty())
    {
      Iterator localIterator = this.failedActions.values().iterator();
      while (localIterator.hasNext())
      {
        Action localAction = (Action)localIterator.next();
        localIterator.remove();
        if (localAction.getPicasso().loggingEnabled) {
          Utils.log("Dispatcher", "replaying", localAction.getRequest().logId());
        }
        performSubmit(localAction, false);
      }
    }
  }
  
  private void logBatch(List<BitmapHunter> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    while (!((BitmapHunter)paramList.get(0)).getPicasso().loggingEnabled) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      BitmapHunter localBitmapHunter = (BitmapHunter)paramList.next();
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(Utils.getLogIdsForHunter(localBitmapHunter));
    }
    Utils.log("Dispatcher", "delivered", localStringBuilder.toString());
  }
  
  private void markForReplay(Action paramAction)
  {
    Object localObject = paramAction.getTarget();
    if (localObject != null)
    {
      paramAction.willReplay = true;
      this.failedActions.put(localObject, paramAction);
    }
  }
  
  private void markForReplay(BitmapHunter paramBitmapHunter)
  {
    Action localAction = paramBitmapHunter.getAction();
    if (localAction != null) {
      markForReplay(localAction);
    }
    paramBitmapHunter = paramBitmapHunter.getActions();
    if (paramBitmapHunter != null)
    {
      int j = paramBitmapHunter.size();
      int i = 0;
      while (i < j)
      {
        markForReplay((Action)paramBitmapHunter.get(i));
        i += 1;
      }
    }
  }
  
  void dispatchAirplaneModeChange(boolean paramBoolean)
  {
    Handler localHandler1 = this.handler;
    Handler localHandler2 = this.handler;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localHandler1.sendMessage(localHandler2.obtainMessage(10, i, 0));
      return;
    }
  }
  
  void dispatchCancel(Action paramAction)
  {
    this.handler.sendMessage(this.handler.obtainMessage(2, paramAction));
  }
  
  void dispatchComplete(BitmapHunter paramBitmapHunter)
  {
    this.handler.sendMessage(this.handler.obtainMessage(4, paramBitmapHunter));
  }
  
  void dispatchFailed(BitmapHunter paramBitmapHunter)
  {
    this.handler.sendMessage(this.handler.obtainMessage(6, paramBitmapHunter));
  }
  
  void dispatchNetworkStateChange(NetworkInfo paramNetworkInfo)
  {
    this.handler.sendMessage(this.handler.obtainMessage(9, paramNetworkInfo));
  }
  
  void dispatchPauseTag(Object paramObject)
  {
    this.handler.sendMessage(this.handler.obtainMessage(11, paramObject));
  }
  
  void dispatchResumeTag(Object paramObject)
  {
    this.handler.sendMessage(this.handler.obtainMessage(12, paramObject));
  }
  
  void dispatchRetry(BitmapHunter paramBitmapHunter)
  {
    this.handler.sendMessageDelayed(this.handler.obtainMessage(5, paramBitmapHunter), 500L);
  }
  
  void dispatchSubmit(Action paramAction)
  {
    this.handler.sendMessage(this.handler.obtainMessage(1, paramAction));
  }
  
  void performAirplaneModeChange(boolean paramBoolean)
  {
    this.airplaneMode = paramBoolean;
  }
  
  void performBatchComplete()
  {
    ArrayList localArrayList = new ArrayList(this.batch);
    this.batch.clear();
    this.mainThreadHandler.sendMessage(this.mainThreadHandler.obtainMessage(8, localArrayList));
    logBatch(localArrayList);
  }
  
  void performCancel(Action paramAction)
  {
    String str = paramAction.getKey();
    BitmapHunter localBitmapHunter = (BitmapHunter)this.hunterMap.get(str);
    if (localBitmapHunter != null)
    {
      localBitmapHunter.detach(paramAction);
      if (localBitmapHunter.cancel())
      {
        this.hunterMap.remove(str);
        if (paramAction.getPicasso().loggingEnabled) {
          Utils.log("Dispatcher", "canceled", paramAction.getRequest().logId());
        }
      }
    }
    if (this.pausedTags.contains(paramAction.getTag()))
    {
      this.pausedActions.remove(paramAction.getTarget());
      if (paramAction.getPicasso().loggingEnabled) {
        Utils.log("Dispatcher", "canceled", paramAction.getRequest().logId(), "because paused request got canceled");
      }
    }
    paramAction = (Action)this.failedActions.remove(paramAction.getTarget());
    if ((paramAction != null) && (paramAction.getPicasso().loggingEnabled)) {
      Utils.log("Dispatcher", "canceled", paramAction.getRequest().logId(), "from replaying");
    }
  }
  
  void performComplete(BitmapHunter paramBitmapHunter)
  {
    if (MemoryPolicy.shouldWriteToMemoryCache(paramBitmapHunter.getMemoryPolicy())) {
      this.cache.set(paramBitmapHunter.getKey(), paramBitmapHunter.getResult());
    }
    this.hunterMap.remove(paramBitmapHunter.getKey());
    batch(paramBitmapHunter);
    if (paramBitmapHunter.getPicasso().loggingEnabled) {
      Utils.log("Dispatcher", "batched", Utils.getLogIdsForHunter(paramBitmapHunter), "for completion");
    }
  }
  
  void performError(BitmapHunter paramBitmapHunter, boolean paramBoolean)
  {
    String str2;
    StringBuilder localStringBuilder;
    if (paramBitmapHunter.getPicasso().loggingEnabled)
    {
      str2 = Utils.getLogIdsForHunter(paramBitmapHunter);
      localStringBuilder = new StringBuilder().append("for error");
      if (!paramBoolean) {
        break label78;
      }
    }
    label78:
    for (String str1 = " (will replay)";; str1 = "")
    {
      Utils.log("Dispatcher", "batched", str2, str1);
      this.hunterMap.remove(paramBitmapHunter.getKey());
      batch(paramBitmapHunter);
      return;
    }
  }
  
  void performNetworkStateChange(NetworkInfo paramNetworkInfo)
  {
    if ((this.service instanceof PicassoExecutorService)) {
      ((PicassoExecutorService)this.service).adjustThreadCount(paramNetworkInfo);
    }
    if ((paramNetworkInfo != null) && (paramNetworkInfo.isConnected())) {
      flushFailedActions();
    }
  }
  
  void performPauseTag(Object paramObject)
  {
    if (!this.pausedTags.add(paramObject)) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.hunterMap.values().iterator();
      while (localIterator.hasNext())
      {
        BitmapHunter localBitmapHunter = (BitmapHunter)localIterator.next();
        boolean bool = localBitmapHunter.getPicasso().loggingEnabled;
        Action localAction = localBitmapHunter.getAction();
        List localList = localBitmapHunter.getActions();
        int i;
        if ((localList != null) && (!localList.isEmpty()))
        {
          i = 1;
          label92:
          if ((localAction == null) && (i == 0)) {
            break label241;
          }
          if ((localAction != null) && (localAction.getTag().equals(paramObject)))
          {
            localBitmapHunter.detach(localAction);
            this.pausedActions.put(localAction.getTarget(), localAction);
            if (bool) {
              Utils.log("Dispatcher", "paused", localAction.request.logId(), "because tag '" + paramObject + "' was paused");
            }
          }
          if (i == 0) {
            break label316;
          }
          i = localList.size() - 1;
          label202:
          if (i < 0) {
            break label316;
          }
          localAction = (Action)localList.get(i);
          if (localAction.getTag().equals(paramObject)) {
            break label243;
          }
        }
        for (;;)
        {
          i -= 1;
          break label202;
          i = 0;
          break label92;
          label241:
          break;
          label243:
          localBitmapHunter.detach(localAction);
          this.pausedActions.put(localAction.getTarget(), localAction);
          if (bool) {
            Utils.log("Dispatcher", "paused", localAction.request.logId(), "because tag '" + paramObject + "' was paused");
          }
        }
        label316:
        if (localBitmapHunter.cancel())
        {
          localIterator.remove();
          if (bool) {
            Utils.log("Dispatcher", "canceled", Utils.getLogIdsForHunter(localBitmapHunter), "all actions paused");
          }
        }
      }
    }
  }
  
  void performResumeTag(Object paramObject)
  {
    if (!this.pausedTags.remove(paramObject)) {}
    Object localObject1;
    do
    {
      return;
      localObject1 = null;
      Iterator localIterator = this.pausedActions.values().iterator();
      while (localIterator.hasNext())
      {
        Action localAction = (Action)localIterator.next();
        if (localAction.getTag().equals(paramObject))
        {
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new ArrayList();
          }
          ((List)localObject2).add(localAction);
          localIterator.remove();
          localObject1 = localObject2;
        }
      }
    } while (localObject1 == null);
    this.mainThreadHandler.sendMessage(this.mainThreadHandler.obtainMessage(13, localObject1));
  }
  
  void performRetry(BitmapHunter paramBitmapHunter)
  {
    boolean bool1 = true;
    if (paramBitmapHunter.isCancelled()) {
      return;
    }
    if (this.service.isShutdown())
    {
      performError(paramBitmapHunter, false);
      return;
    }
    if (this.scansNetworkChanges) {}
    for (NetworkInfo localNetworkInfo = ((ConnectivityManager)Utils.getService(this.context, "connectivity")).getActiveNetworkInfo();; localNetworkInfo = null)
    {
      int i;
      label69:
      boolean bool3;
      if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
      {
        i = 1;
        boolean bool2 = paramBitmapHunter.shouldRetry(this.airplaneMode, localNetworkInfo);
        bool3 = paramBitmapHunter.supportsReplay();
        if (bool2) {
          break label130;
        }
        if ((!this.scansNetworkChanges) || (!bool3)) {
          break label125;
        }
      }
      for (;;)
      {
        performError(paramBitmapHunter, bool1);
        if (!bool1) {
          break;
        }
        markForReplay(paramBitmapHunter);
        return;
        i = 0;
        break label69;
        label125:
        bool1 = false;
      }
      label130:
      if ((!this.scansNetworkChanges) || (i != 0))
      {
        if (paramBitmapHunter.getPicasso().loggingEnabled) {
          Utils.log("Dispatcher", "retrying", Utils.getLogIdsForHunter(paramBitmapHunter));
        }
        if ((paramBitmapHunter.getException() instanceof NetworkRequestHandler.ContentLengthException)) {
          paramBitmapHunter.networkPolicy |= NetworkPolicy.NO_CACHE.index;
        }
        paramBitmapHunter.future = this.service.submit(paramBitmapHunter);
        return;
      }
      performError(paramBitmapHunter, bool3);
      if (!bool3) {
        break;
      }
      markForReplay(paramBitmapHunter);
      return;
    }
  }
  
  void performSubmit(Action paramAction)
  {
    performSubmit(paramAction, true);
  }
  
  void performSubmit(Action paramAction, boolean paramBoolean)
  {
    if (this.pausedTags.contains(paramAction.getTag()))
    {
      this.pausedActions.put(paramAction.getTarget(), paramAction);
      if (paramAction.getPicasso().loggingEnabled) {
        Utils.log("Dispatcher", "paused", paramAction.request.logId(), "because tag '" + paramAction.getTag() + "' is paused");
      }
    }
    do
    {
      do
      {
        return;
        localBitmapHunter = (BitmapHunter)this.hunterMap.get(paramAction.getKey());
        if (localBitmapHunter != null)
        {
          localBitmapHunter.attach(paramAction);
          return;
        }
        if (!this.service.isShutdown()) {
          break;
        }
      } while (!paramAction.getPicasso().loggingEnabled);
      Utils.log("Dispatcher", "ignored", paramAction.request.logId(), "because shut down");
      return;
      BitmapHunter localBitmapHunter = BitmapHunter.forRequest(paramAction.getPicasso(), this, this.cache, this.stats, paramAction);
      localBitmapHunter.future = this.service.submit(localBitmapHunter);
      this.hunterMap.put(paramAction.getKey(), localBitmapHunter);
      if (paramBoolean) {
        this.failedActions.remove(paramAction.getTarget());
      }
    } while (!paramAction.getPicasso().loggingEnabled);
    Utils.log("Dispatcher", "enqueued", paramAction.request.logId());
  }
  
  void shutdown()
  {
    if ((this.service instanceof PicassoExecutorService)) {
      this.service.shutdown();
    }
    this.downloader.shutdown();
    this.dispatcherThread.quit();
    Picasso.HANDLER.post(new Dispatcher.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Dispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */