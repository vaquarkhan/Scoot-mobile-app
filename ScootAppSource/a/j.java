package a;

import java.io.Closeable;

public final class j
  implements Closeable
{
  private final Object a;
  private k b;
  private Runnable c;
  private boolean d;
  
  public void close()
  {
    synchronized (this.a)
    {
      if (this.d) {
        return;
      }
      this.d = true;
      this.b.a(this);
      this.b = null;
      this.c = null;
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */