package d;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class q
  implements ad
{
  private final j a;
  private final Inflater b;
  private int c;
  private boolean d;
  
  public q(ad paramad, Inflater paramInflater)
  {
    this(r.a(paramad), paramInflater);
  }
  
  q(j paramj, Inflater paramInflater)
  {
    if (paramj == null) {
      throw new IllegalArgumentException("source == null");
    }
    if (paramInflater == null) {
      throw new IllegalArgumentException("inflater == null");
    }
    this.a = paramj;
    this.b = paramInflater;
  }
  
  private void b()
  {
    if (this.c == 0) {
      return;
    }
    int i = this.c - this.b.getRemaining();
    this.c -= i;
    this.a.g(i);
  }
  
  public boolean a()
  {
    if (!this.b.needsInput()) {
      return false;
    }
    b();
    if (this.b.getRemaining() != 0) {
      throw new IllegalStateException("?");
    }
    if (this.a.f()) {
      return true;
    }
    z localz = this.a.b().a;
    this.c = (localz.c - localz.b);
    this.b.setInput(localz.a, localz.b, this.c);
    return false;
  }
  
  public void close()
  {
    if (this.d) {
      return;
    }
    this.b.end();
    this.d = true;
    this.a.close();
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.d) {
      throw new IllegalStateException("closed");
    }
    if (paramLong == 0L) {
      return 0L;
    }
    for (;;)
    {
      boolean bool = a();
      try
      {
        z localz = paramf.e(1);
        int i = this.b.inflate(localz.a, localz.c, 2048 - localz.c);
        if (i > 0)
        {
          localz.c += i;
          paramf.b += i;
          return i;
        }
        if ((this.b.finished()) || (this.b.needsDictionary()))
        {
          b();
          if (localz.b == localz.c)
          {
            paramf.a = localz.a();
            aa.a(localz);
          }
        }
        else
        {
          if (!bool) {
            continue;
          }
          throw new EOFException("source exhausted prematurely");
        }
      }
      catch (DataFormatException paramf)
      {
        throw new IOException(paramf);
      }
    }
    return -1L;
  }
  
  public ae timeout()
  {
    return this.a.timeout();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */