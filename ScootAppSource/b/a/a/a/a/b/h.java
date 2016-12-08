package b.a.a.a.a.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.a.a.a.f;
import b.a.a.a.t;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class h
  implements ServiceConnection
{
  private boolean a = false;
  private final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue(1);
  
  public IBinder a()
  {
    if (this.a) {
      f.h().e("Fabric", "getBinder already called");
    }
    this.a = true;
    try
    {
      IBinder localIBinder = (IBinder)this.b.poll(200L, TimeUnit.MILLISECONDS);
      return localIBinder;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      this.b.put(paramIBinder);
      return;
    }
    catch (InterruptedException paramComponentName) {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.b.clear();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */