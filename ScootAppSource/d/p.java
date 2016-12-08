package d;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class p
  implements ad
{
  private int a = 0;
  private final j b;
  private final Inflater c;
  private final q d;
  private final CRC32 e = new CRC32();
  
  public p(ad paramad)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("source == null");
    }
    this.c = new Inflater(true);
    this.b = r.a(paramad);
    this.d = new q(this.b, this.c);
  }
  
  private void a()
  {
    this.b.a(10L);
    int j = this.b.b().b(3L);
    if ((j >> 1 & 0x1) == 1) {}
    long l;
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        a(this.b.b(), 0L, 10L);
      }
      a("ID1ID2", 8075, this.b.j());
      this.b.g(8L);
      if ((j >> 2 & 0x1) == 1)
      {
        this.b.a(2L);
        if (i != 0) {
          a(this.b.b(), 0L, 2L);
        }
        int k = this.b.b().l();
        this.b.a(k);
        if (i != 0) {
          a(this.b.b(), 0L, k);
        }
        this.b.g(k);
      }
      if ((j >> 3 & 0x1) != 1) {
        break label265;
      }
      l = this.b.a((byte)0);
      if (l != -1L) {
        break;
      }
      throw new EOFException();
    }
    if (i != 0) {
      a(this.b.b(), 0L, 1L + l);
    }
    this.b.g(1L + l);
    label265:
    if ((j >> 4 & 0x1) == 1)
    {
      l = this.b.a((byte)0);
      if (l == -1L) {
        throw new EOFException();
      }
      if (i != 0) {
        a(this.b.b(), 0L, 1L + l);
      }
      this.b.g(1L + l);
    }
    if (i != 0)
    {
      a("FHCRC", this.b.l(), (short)(int)this.e.getValue());
      this.e.reset();
    }
  }
  
  private void a(f paramf, long paramLong1, long paramLong2)
  {
    Object localObject;
    long l1;
    long l2;
    for (paramf = paramf.a;; paramf = paramf.f)
    {
      localObject = paramf;
      l1 = paramLong1;
      l2 = paramLong2;
      if (paramLong1 < paramf.c - paramf.b) {
        break;
      }
      paramLong1 -= paramf.c - paramf.b;
    }
    while (l2 > 0L)
    {
      int i = (int)(((z)localObject).b + l1);
      int j = (int)Math.min(((z)localObject).c - i, l2);
      this.e.update(((z)localObject).a, i, j);
      l2 -= j;
      localObject = ((z)localObject).f;
      l1 = 0L;
    }
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 != paramInt1) {
      throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) }));
    }
  }
  
  private void b()
  {
    a("CRC", this.b.m(), (int)this.e.getValue());
    a("ISIZE", this.b.m(), this.c.getTotalOut());
  }
  
  public void close()
  {
    this.d.close();
  }
  
  public long read(f paramf, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    if (paramLong == 0L) {
      return 0L;
    }
    if (this.a == 0)
    {
      a();
      this.a = 1;
    }
    if (this.a == 1)
    {
      long l = paramf.b;
      paramLong = this.d.read(paramf, paramLong);
      if (paramLong != -1L)
      {
        a(paramf, l, paramLong);
        return paramLong;
      }
      this.a = 2;
    }
    if (this.a == 2)
    {
      b();
      this.a = 3;
      if (!this.b.f()) {
        throw new IOException("gzip finished without exhausting source");
      }
    }
    return -1L;
  }
  
  public ae timeout()
  {
    return this.b.timeout();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */