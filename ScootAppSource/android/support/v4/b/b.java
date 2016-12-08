package android.support.v4.b;

import android.support.v4.e.c;
import java.util.concurrent.CountDownLatch;

final class b
  extends u<Void, Void, D>
  implements Runnable
{
  boolean a;
  private final CountDownLatch d = new CountDownLatch(1);
  
  b(a parama) {}
  
  protected D a(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.b.e();
      return paramVarArgs;
    }
    catch (c paramVarArgs)
    {
      if (!c()) {
        throw paramVarArgs;
      }
    }
    return null;
  }
  
  protected void a(D paramD)
  {
    try
    {
      this.b.b(this, paramD);
      return;
    }
    finally
    {
      this.d.countDown();
    }
  }
  
  protected void b(D paramD)
  {
    try
    {
      this.b.a(this, paramD);
      return;
    }
    finally
    {
      this.d.countDown();
    }
  }
  
  public void run()
  {
    this.a = false;
    this.b.c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */