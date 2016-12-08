package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.m;

public final class r
  implements Runnable
{
  private final Context a;
  private final n b;
  
  public r(Context paramContext, n paramn)
  {
    this.a = paramContext;
    this.b = paramn;
  }
  
  public void run()
  {
    try
    {
      m.a(this.a, "Performing time based file roll over.");
      if (!this.b.c()) {
        this.b.d();
      }
      return;
    }
    catch (Exception localException)
    {
      m.a(this.a, "Failed to roll over file", localException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */