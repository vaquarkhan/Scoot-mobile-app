package a;

import java.util.concurrent.CancellationException;

final class t
  implements Runnable
{
  t(i parami, ac paramac, m paramm, o paramo) {}
  
  public void run()
  {
    if ((this.a != null) && (this.a.a()))
    {
      this.b.c();
      return;
    }
    try
    {
      Object localObject = this.c.then(this.d);
      this.b.b(localObject);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */