package d;

import java.io.InputStream;

final class t
  implements ad
{
  t(ae paramae, InputStream paramInputStream) {}
  
  public void close()
  {
    this.b.close();
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (paramLong == 0L) {
      return 0L;
    }
    this.a.throwIfReached();
    z localz = paramf.e(1);
    int i = (int)Math.min(paramLong, 2048 - localz.c);
    i = this.b.read(localz.a, localz.c, i);
    if (i == -1) {
      return -1L;
    }
    localz.c += i;
    paramf.b += i;
    return i;
  }
  
  public ae timeout()
  {
    return this.a;
  }
  
  public String toString()
  {
    return "source(" + this.b + ")";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */