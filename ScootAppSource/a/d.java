package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class d
  implements Executor
{
  public void execute(Runnable paramRunnable)
  {
    new Handler(Looper.getMainLooper()).post(paramRunnable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */