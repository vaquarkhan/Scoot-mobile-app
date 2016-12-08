package retrofit;

import android.os.Process;

class Platform$Android$2$1
  implements Runnable
{
  Platform$Android$2$1(Platform.Android.2 param2, Runnable paramRunnable) {}
  
  public void run()
  {
    Process.setThreadPriority(10);
    this.val$r.run();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Platform$Android$2$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */