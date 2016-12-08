package d;

import java.io.IOException;

final class b
  implements ac
{
  b(a parama, ac paramac) {}
  
  public void close()
  {
    this.b.enter();
    try
    {
      this.a.close();
      this.b.exit(true);
      return;
    }
    catch (IOException localIOException)
    {
      throw this.b.exit(localIOException);
    }
    finally
    {
      this.b.exit(false);
    }
  }
  
  public void flush()
  {
    this.b.enter();
    try
    {
      this.a.flush();
      this.b.exit(true);
      return;
    }
    catch (IOException localIOException)
    {
      throw this.b.exit(localIOException);
    }
    finally
    {
      this.b.exit(false);
    }
  }
  
  public ae timeout()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "AsyncTimeout.sink(" + this.a + ")";
  }
  
  public void write(f paramf, long paramLong)
  {
    this.b.enter();
    try
    {
      this.a.write(paramf, paramLong);
      this.b.exit(true);
      return;
    }
    catch (IOException paramf)
    {
      throw this.b.exit(paramf);
    }
    finally
    {
      this.b.exit(false);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */