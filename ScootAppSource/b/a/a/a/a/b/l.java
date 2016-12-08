package b.a.a.a.a.b;

import android.os.Process;

public abstract class l
  implements Runnable
{
  protected abstract void a();
  
  public final void run()
  {
    Process.setThreadPriority(10);
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */