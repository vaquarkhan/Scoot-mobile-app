package b.a.a.a.a.d;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public abstract class g<T>
  implements l
{
  protected final Context a;
  protected final ScheduledExecutorService b;
  protected m<T> c;
  
  public g(Context paramContext, m<T> paramm, d paramd, ScheduledExecutorService paramScheduledExecutorService)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramScheduledExecutorService;
    this.c = paramm;
    paramd.a(this);
  }
  
  public void a(T paramT, boolean paramBoolean)
  {
    a(new h(this, paramT, paramBoolean));
  }
  
  protected void a(Runnable paramRunnable)
  {
    try
    {
      this.b.submit(paramRunnable);
      return;
    }
    catch (Exception paramRunnable)
    {
      b.a.a.a.a.b.m.a(this.a, "Failed to submit events task", paramRunnable);
    }
  }
  
  public void a(String paramString)
  {
    a(new i(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */