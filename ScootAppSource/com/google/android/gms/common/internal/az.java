package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class az
  implements ServiceConnection
{
  public az(ay paramay) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (aw.a(this.a.a))
    {
      ay.a(this.a, paramIBinder);
      ay.a(this.a, paramComponentName);
      Iterator localIterator = ay.b(this.a).iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
      }
    }
    ay.a(this.a, 1);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (aw.a(this.a.a))
    {
      ay.a(this.a, null);
      ay.a(this.a, paramComponentName);
      Iterator localIterator = ay.b(this.a).iterator();
      if (localIterator.hasNext()) {
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
      }
    }
    ay.a(this.a, 2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */