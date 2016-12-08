package a;

import java.util.concurrent.CancellationException;

final class u
  implements Runnable
{
  u(i parami, ac paramac, m paramm, o paramo) {}
  
  public void run()
  {
    if ((this.a != null) && (this.a.a()))
    {
      this.b.c();
      return;
    }
    try
    {
      o localo = (o)this.c.then(this.d);
      if (localo == null)
      {
        this.b.b(null);
        return;
      }
    }
    catch (CancellationException localCancellationException)
    {
      this.b.c();
      return;
      localCancellationException.a(new v(this));
      return;
    }
    catch (Exception localException)
    {
      this.b.b(localException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */