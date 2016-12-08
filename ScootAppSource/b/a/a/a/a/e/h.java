package b.a.a.a.a.e;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class h<V>
  extends l<V>
{
  private final Closeable a;
  private final boolean b;
  
  protected h(Closeable paramCloseable, boolean paramBoolean)
  {
    this.a = paramCloseable;
    this.b = paramBoolean;
  }
  
  protected void c()
  {
    if ((this.a instanceof Flushable)) {
      ((Flushable)this.a).flush();
    }
    if (this.b) {}
    try
    {
      this.a.close();
      return;
    }
    catch (IOException localIOException) {}
    this.a.close();
    return;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */