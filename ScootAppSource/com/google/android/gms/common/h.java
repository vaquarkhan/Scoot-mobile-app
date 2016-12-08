package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class h
  implements ServiceConnection
{
  boolean a = false;
  private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();
  
  public IBinder a(long paramLong, TimeUnit paramTimeUnit)
  {
    b.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (this.a) {
      throw new IllegalStateException("Cannot call get on this connection more than once");
    }
    this.a = true;
    paramTimeUnit = (IBinder)this.b.poll(paramLong, paramTimeUnit);
    if (paramTimeUnit == null) {
      throw new TimeoutException("Timed out waiting for the service connection");
    }
    return paramTimeUnit;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.b.add(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */