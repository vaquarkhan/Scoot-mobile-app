package com.parse;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ParseEventuallyQueue$TestHelper
{
  public static final int COMMAND_ENQUEUED = 3;
  public static final int COMMAND_FAILED = 2;
  public static final int COMMAND_NOT_ENQUEUED = 4;
  public static final int COMMAND_OLD_FORMAT_DISCARDED = 8;
  public static final int COMMAND_SUCCESSFUL = 1;
  private static final int MAX_EVENTS = 1000;
  public static final int NETWORK_DOWN = 7;
  public static final int OBJECT_REMOVED = 6;
  public static final int OBJECT_UPDATED = 5;
  private SparseArray<Semaphore> events = new SparseArray();
  
  private ParseEventuallyQueue$TestHelper()
  {
    clear();
  }
  
  public static String getEventString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalStateException("Encountered unknown event: " + paramInt);
    case 1: 
      return "COMMAND_SUCCESSFUL";
    case 2: 
      return "COMMAND_FAILED";
    case 3: 
      return "COMMAND_ENQUEUED";
    case 4: 
      return "COMMAND_NOT_ENQUEUED";
    case 5: 
      return "OBJECT_UPDATED";
    case 6: 
      return "OBJECT_REMOVED";
    case 7: 
      return "NETWORK_DOWN";
    }
    return "COMMAND_OLD_FORMAT_DISCARDED";
  }
  
  public void clear()
  {
    this.events.clear();
    this.events.put(1, new Semaphore(1000));
    this.events.put(2, new Semaphore(1000));
    this.events.put(3, new Semaphore(1000));
    this.events.put(4, new Semaphore(1000));
    this.events.put(5, new Semaphore(1000));
    this.events.put(6, new Semaphore(1000));
    this.events.put(7, new Semaphore(1000));
    this.events.put(8, new Semaphore(1000));
    int i = 0;
    while (i < this.events.size())
    {
      int j = this.events.keyAt(i);
      ((Semaphore)this.events.get(j)).acquireUninterruptibly(1000);
      i += 1;
    }
  }
  
  public List<String> getUnexpectedEvents()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < this.events.size())
    {
      int j = this.events.keyAt(i);
      if (((Semaphore)this.events.get(j)).availablePermits() > 0) {
        localArrayList.add(getEventString(j));
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public void notify(int paramInt)
  {
    notify(paramInt, null);
  }
  
  public void notify(int paramInt, Throwable paramThrowable)
  {
    ((Semaphore)this.events.get(paramInt)).release();
  }
  
  public int unexpectedEvents()
  {
    int i = 0;
    int j = 0;
    while (i < this.events.size())
    {
      int k = this.events.keyAt(i);
      j += ((Semaphore)this.events.get(k)).availablePermits();
      i += 1;
    }
    return j;
  }
  
  public boolean waitFor(int paramInt)
  {
    return waitFor(paramInt, 1);
  }
  
  public boolean waitFor(int paramInt1, int paramInt2)
  {
    try
    {
      boolean bool = ((Semaphore)this.events.get(paramInt1)).tryAcquire(paramInt2, 10L, TimeUnit.SECONDS);
      return bool;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.printStackTrace();
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseEventuallyQueue$TestHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */