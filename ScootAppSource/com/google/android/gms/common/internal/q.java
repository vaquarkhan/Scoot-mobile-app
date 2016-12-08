package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class q
  implements ServiceConnection
{
  private final int b;
  
  public q(i parami, int paramInt)
  {
    this.b = paramInt;
  }
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    b.a(paramIBinder, "Expecting a valid IBinder");
    synchronized (i.a(this.a))
    {
      i.a(this.a, bl.a(paramIBinder));
      this.a.a(0, null, this.b);
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName arg1)
  {
    synchronized (i.a(this.a))
    {
      i.a(this.a, null);
      this.a.a.sendMessage(this.a.a.obtainMessage(4, this.b, 1));
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */