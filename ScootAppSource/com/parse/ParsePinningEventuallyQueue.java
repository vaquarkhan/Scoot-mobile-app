package com.parse;

import a.ac;
import a.o;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

class ParsePinningEventuallyQueue
  extends ParseEventuallyQueue
{
  private static final String TAG = "ParsePinningEventuallyQueue";
  private final Object connectionLock = new Object();
  private ac<Void> connectionTaskCompletionSource = new ac();
  private ArrayList<String> eventuallyPinUUIDQueue = new ArrayList();
  private final ParseHttpClient httpClient;
  private ConnectivityNotifier.ConnectivityListener listener = new ParsePinningEventuallyQueue.1(this);
  private ConnectivityNotifier notifier;
  private TaskQueue operationSetTaskQueue = new TaskQueue();
  private HashMap<String, ac<JSONObject>> pendingEventuallyTasks = new HashMap();
  private HashMap<String, ac<JSONObject>> pendingOperationSetUUIDTasks = new HashMap();
  private TaskQueue taskQueue = new TaskQueue();
  private final Object taskQueueSyncLock = new Object();
  private HashMap<String, EventuallyPin> uuidToEventuallyPin = new HashMap();
  private HashMap<String, ParseOperationSet> uuidToOperationSet = new HashMap();
  
  public ParsePinningEventuallyQueue(Context paramContext, ParseHttpClient paramParseHttpClient)
  {
    setConnected(ConnectivityNotifier.isConnected(paramContext));
    this.httpClient = paramParseHttpClient;
    this.notifier = ConnectivityNotifier.getNotifier(paramContext);
    this.notifier.addListener(this.listener);
    resume();
  }
  
  private o<Void> enqueueEventuallyAsync(ParseRESTCommand paramParseRESTCommand, ParseObject paramParseObject, o<Void> paramo, ac<JSONObject> paramac)
  {
    return paramo.b(new ParsePinningEventuallyQueue.5(this, paramParseObject, paramParseRESTCommand, paramac));
  }
  
  private o<Void> populateQueueAsync()
  {
    return this.taskQueue.enqueue(new ParsePinningEventuallyQueue.6(this));
  }
  
  private o<Void> populateQueueAsync(o<Void> paramo)
  {
    return paramo.b(new ParsePinningEventuallyQueue.8(this)).d(new ParsePinningEventuallyQueue.7(this));
  }
  
  private o<JSONObject> process(EventuallyPin paramEventuallyPin, ParseOperationSet paramParseOperationSet)
  {
    return waitForConnectionAsync().d(new ParsePinningEventuallyQueue.13(this, paramEventuallyPin, paramParseOperationSet));
  }
  
  private o<Void> runEventuallyAsync(EventuallyPin paramEventuallyPin)
  {
    String str = paramEventuallyPin.getUUID();
    if (this.eventuallyPinUUIDQueue.contains(str)) {
      return o.a(null);
    }
    this.eventuallyPinUUIDQueue.add(str);
    this.operationSetTaskQueue.enqueue(new ParsePinningEventuallyQueue.9(this, paramEventuallyPin, str));
    return o.a(null);
  }
  
  private o<Void> runEventuallyAsync(EventuallyPin paramEventuallyPin, o<Void> paramo)
  {
    return paramo.b(new ParsePinningEventuallyQueue.11(this)).d(new ParsePinningEventuallyQueue.10(this, paramEventuallyPin));
  }
  
  private o<Void> waitForConnectionAsync()
  {
    synchronized (this.connectionLock)
    {
      o localo = this.connectionTaskCompletionSource.a();
      return localo;
    }
  }
  
  private o<Void> whenAll(Collection<TaskQueue> paramCollection)
  {
    ArrayList localArrayList = new ArrayList();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add(((TaskQueue)paramCollection.next()).enqueue(new ParsePinningEventuallyQueue.15(this)));
    }
    return o.a(localArrayList);
  }
  
  public void clear()
  {
    pause();
    o localo = this.taskQueue.enqueue(new ParsePinningEventuallyQueue.14(this));
    try
    {
      ParseTaskUtils.wait(localo);
      simulateReboot();
      resume();
      return;
    }
    catch (ParseException localParseException)
    {
      throw new IllegalStateException(localParseException);
    }
  }
  
  public o<JSONObject> enqueueEventuallyAsync(ParseRESTCommand paramParseRESTCommand, ParseObject paramParseObject)
  {
    Parse.requirePermission("android.permission.ACCESS_NETWORK_STATE");
    ac localac = new ac();
    this.taskQueue.enqueue(new ParsePinningEventuallyQueue.4(this, paramParseRESTCommand, paramParseObject, localac));
    return localac.a();
  }
  
  public void onDestroy()
  {
    this.notifier.removeListener(this.listener);
  }
  
  public void pause()
  {
    synchronized (this.connectionLock)
    {
      this.connectionTaskCompletionSource.a(new ParsePinningEventuallyQueue.PauseException(null));
      this.connectionTaskCompletionSource = o.b();
      this.connectionTaskCompletionSource.a(new ParsePinningEventuallyQueue.PauseException(null));
      synchronized (this.taskQueueSyncLock)
      {
        Iterator localIterator = this.pendingEventuallyTasks.keySet().iterator();
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((ac)this.pendingEventuallyTasks.get(str)).a(new ParsePinningEventuallyQueue.PauseException(null));
        }
      }
    }
    this.pendingEventuallyTasks.clear();
    this.uuidToOperationSet.clear();
    this.uuidToEventuallyPin.clear();
    try
    {
      ParseTaskUtils.wait(whenAll(Arrays.asList(new TaskQueue[] { this.taskQueue, this.operationSetTaskQueue })));
      return;
    }
    catch (ParseException localParseException)
    {
      throw new IllegalStateException(localParseException);
    }
  }
  
  public int pendingCount()
  {
    try
    {
      int i = ((Integer)ParseTaskUtils.wait(pendingCountAsync())).intValue();
      return i;
    }
    catch (ParseException localParseException)
    {
      throw new IllegalStateException(localParseException);
    }
  }
  
  public o<Integer> pendingCountAsync()
  {
    ac localac = new ac();
    this.taskQueue.enqueue(new ParsePinningEventuallyQueue.2(this, localac));
    return localac.a();
  }
  
  public o<Integer> pendingCountAsync(o<Void> paramo)
  {
    return paramo.b(new ParsePinningEventuallyQueue.3(this));
  }
  
  public void resume()
  {
    if (isConnected())
    {
      this.connectionTaskCompletionSource.a(null);
      this.connectionTaskCompletionSource = o.b();
      this.connectionTaskCompletionSource.a(null);
    }
    for (;;)
    {
      populateQueueAsync();
      return;
      this.connectionTaskCompletionSource = o.b();
    }
  }
  
  public void setConnected(boolean paramBoolean)
  {
    synchronized (this.connectionLock)
    {
      if (isConnected() != paramBoolean)
      {
        super.setConnected(paramBoolean);
        if (paramBoolean)
        {
          this.connectionTaskCompletionSource.a(null);
          this.connectionTaskCompletionSource = o.b();
          this.connectionTaskCompletionSource.a(null);
        }
      }
      else
      {
        return;
      }
      this.connectionTaskCompletionSource = o.b();
    }
  }
  
  void simulateReboot()
  {
    pause();
    this.pendingOperationSetUUIDTasks.clear();
    this.pendingEventuallyTasks.clear();
    this.uuidToOperationSet.clear();
    this.uuidToEventuallyPin.clear();
    resume();
  }
  
  o<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet paramParseOperationSet, EventuallyPin paramEventuallyPin)
  {
    if ((paramEventuallyPin != null) && (paramEventuallyPin.getType() != 1)) {
      return process(paramEventuallyPin, null);
    }
    Object localObject = this.taskQueueSyncLock;
    if ((paramParseOperationSet != null) && (paramEventuallyPin == null)) {}
    ParseOperationSet localParseOperationSet;
    for (;;)
    {
      try
      {
        paramEventuallyPin = paramParseOperationSet.getUUID();
        this.uuidToOperationSet.put(paramEventuallyPin, paramParseOperationSet);
        paramParseOperationSet = paramEventuallyPin;
        paramEventuallyPin = (EventuallyPin)this.uuidToEventuallyPin.get(paramParseOperationSet);
        localParseOperationSet = (ParseOperationSet)this.uuidToOperationSet.get(paramParseOperationSet);
        if ((paramEventuallyPin != null) && (localParseOperationSet != null)) {
          break;
        }
        if (!this.pendingEventuallyTasks.containsKey(paramParseOperationSet)) {
          break label159;
        }
        paramParseOperationSet = (ac)this.pendingEventuallyTasks.get(paramParseOperationSet);
        paramParseOperationSet = paramParseOperationSet.a();
        return paramParseOperationSet;
      }
      finally {}
      if ((paramParseOperationSet == null) && (paramEventuallyPin != null))
      {
        paramParseOperationSet = paramEventuallyPin.getOperationSetUUID();
        this.uuidToEventuallyPin.put(paramParseOperationSet, paramEventuallyPin);
      }
      else
      {
        throw new IllegalStateException("Either operationSet or eventuallyPin must be set.");
        label159:
        paramEventuallyPin = o.b();
        this.pendingEventuallyTasks.put(paramParseOperationSet, paramEventuallyPin);
        paramParseOperationSet = paramEventuallyPin;
      }
    }
    ac localac = (ac)this.pendingEventuallyTasks.get(paramParseOperationSet);
    return process(paramEventuallyPin, localParseOperationSet).b(new ParsePinningEventuallyQueue.12(this, paramParseOperationSet, localac));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */