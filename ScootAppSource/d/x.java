package d;

import java.io.EOFException;
import java.io.InputStream;

final class x
  implements j
{
  public final f a;
  public final ad b;
  private boolean c;
  
  public x(ad paramad)
  {
    this(paramad, new f());
  }
  
  public x(ad paramad, f paramf)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("source == null");
    }
    this.a = paramf;
    this.b = paramad;
  }
  
  public long a(byte paramByte)
  {
    return a(paramByte, 0L);
  }
  
  public long a(byte paramByte, long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    long l;
    do
    {
      l = paramLong;
      if (paramLong < this.a.b) {
        break;
      }
    } while (this.b.read(this.a, 2048L) != -1L);
    return -1L;
    do
    {
      paramLong = this.a.a(paramByte, l);
      if (paramLong != -1L) {
        break;
      }
      l = this.a.b;
    } while (this.b.read(this.a, 2048L) != -1L);
    return -1L;
    return paramLong;
  }
  
  public void a(long paramLong)
  {
    if (!b(paramLong)) {
      throw new EOFException();
    }
  }
  
  public f b()
  {
    return this.a;
  }
  
  public boolean b(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    while (this.a.b < paramLong) {
      if (this.b.read(this.a, 2048L) == -1L) {
        return false;
      }
    }
    return true;
  }
  
  public k c(long paramLong)
  {
    a(paramLong);
    return this.a.c(paramLong);
  }
  
  public void close()
  {
    if (this.c) {
      return;
    }
    this.c = true;
    this.b.close();
    this.a.t();
  }
  
  public boolean f()
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    return (this.a.f()) && (this.b.read(this.a, 2048L) == -1L);
  }
  
  public byte[] f(long paramLong)
  {
    a(paramLong);
    return this.a.f(paramLong);
  }
  
  public InputStream g()
  {
    return new y(this);
  }
  
  public void g(long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    do
    {
      long l = Math.min(paramLong, this.a.a());
      this.a.g(l);
      paramLong -= l;
      if (paramLong <= 0L) {
        break;
      }
    } while ((this.a.b != 0L) || (this.b.read(this.a, 2048L) != -1L));
    throw new EOFException();
  }
  
  public byte i()
  {
    a(1L);
    return this.a.i();
  }
  
  public short j()
  {
    a(2L);
    return this.a.j();
  }
  
  public int k()
  {
    a(4L);
    return this.a.k();
  }
  
  public short l()
  {
    a(2L);
    return this.a.l();
  }
  
  public int m()
  {
    a(4L);
    return this.a.m();
  }
  
  public long n()
  {
    a(1L);
    int i = 0;
    while (b(i + 1))
    {
      byte b1 = this.a.b(i);
      if (((b1 < 48) || (b1 > 57)) && ((i != 0) || (b1 != 45)))
      {
        if (i != 0) {
          break;
        }
        throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[] { Byte.valueOf(b1) }));
      }
      i += 1;
    }
    return this.a.n();
  }
  
  public long o()
  {
    a(1L);
    int i = 0;
    while (b(i + 1))
    {
      byte b1 = this.a.b(i);
      if (((b1 < 48) || (b1 > 57)) && ((b1 < 97) || (b1 > 102)) && ((b1 < 65) || (b1 > 70)))
      {
        if (i != 0) {
          break;
        }
        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] { Byte.valueOf(b1) }));
      }
      i += 1;
    }
    return this.a.o();
  }
  
  public String r()
  {
    long l = a((byte)10);
    if (l == -1L)
    {
      f localf = new f();
      this.a.a(localf, 0L, Math.min(32L, this.a.a()));
      throw new EOFException("\\n not found: size=" + this.a.a() + " content=" + localf.p().d() + "...");
    }
    return this.a.e(l);
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramf == null) {
      throw new IllegalArgumentException("sink == null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    if ((this.a.b == 0L) && (this.b.read(this.a, 2048L) == -1L)) {
      return -1L;
    }
    paramLong = Math.min(paramLong, this.a.b);
    return this.a.read(paramf, paramLong);
  }
  
  public byte[] s()
  {
    this.a.a(this.b);
    return this.a.s();
  }
  
  public ae timeout()
  {
    return this.b.timeout();
  }
  
  public String toString()
  {
    return "buffer(" + this.b + ")";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */