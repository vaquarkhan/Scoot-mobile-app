package a;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

final class x
  implements Runnable
{
  x(i parami, ac paramac, Callable paramCallable) {}
  
  public void run()
  {
    if ((this.a != null) && (this.a.a()))
    {
      this.b.c();
      return;
    }
    try
    {
      this.b.b(this.c.call());
      return;
    }
    catch (CancellationException localCancellationException)
    {
      this.b.c();
      return;
    }
    catch (Exception localException)
    {
      this.b.b(localException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */