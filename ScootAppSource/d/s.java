package d;

import java.io.OutputStream;

final class s
  implements ac
{
  s(ae paramae, OutputStream paramOutputStream) {}
  
  public void close()
  {
    this.b.close();
  }
  
  public void flush()
  {
    this.b.flush();
  }
  
  public ae timeout()
  {
    return this.a;
  }
  
  public String toString()
  {
    return "sink(" + this.b + ")";
  }
  
  public void write(f paramf, long paramLong)
  {
    ag.a(paramf.b, 0L, paramLong);
    while (paramLong > 0L)
    {
      this.a.throwIfReached();
      z localz = paramf.a;
      int i = (int)Math.min(paramLong, localz.c - localz.b);
      this.b.write(localz.a, localz.b, i);
      localz.b += i;
      long l = paramLong - i;
      paramf.b -= i;
      paramLong = l;
      if (localz.b == localz.c)
      {
        paramf.a = localz.a();
        aa.a(localz);
        paramLong = l;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */