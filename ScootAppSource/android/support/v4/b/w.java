package android.support.v4.b;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

final class w
  extends ac<Params, Result>
{
  w(u paramu)
  {
    super(null);
  }
  
  public Result call()
  {
    u.a(this.a).set(true);
    Process.setThreadPriority(10);
    return (Result)u.a(this.a, this.a.a(this.b));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */