package d;

import java.io.IOException;

final class c
  implements ad
{
  c(a parama, ad paramad) {}
  
  public void close()
  {
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
  
  public long read(f paramf, long paramLong)
  {
    this.b.enter();
    try
    {
      paramLong = this.a.read(paramf, paramLong);
      this.b.exit(true);
      return paramLong;
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
  
  public ae timeout()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "AsyncTimeout.source(" + this.a + ")";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */