package d;

import java.io.OutputStream;

final class v
  implements i
{
  public final f a;
  public final ac b;
  private boolean c;
  
  public v(ac paramac)
  {
    this(paramac, new f());
  }
  
  public v(ac paramac, f paramf)
  {
    if (paramac == null) {
      throw new IllegalArgumentException("sink == null");
    }
    this.a = paramf;
    this.b = paramac;
  }
  
  public long a(ad paramad)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("source == null");
    }
    long l1 = 0L;
    for (;;)
    {
      long l2 = paramad.read(this.a, 2048L);
      if (l2 == -1L) {
        break;
      }
      l1 += l2;
      w();
    }
    return l1;
  }
  
  public f b()
  {
    return this.a;
  }
  
  public i b(k paramk)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.a(paramk);
    return w();
  }
  
  public i b(String paramString)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.a(paramString);
    return w();
  }
  
  public i c(byte[] paramArrayOfByte)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.b(paramArrayOfByte);
    return w();
  }
  
  public i c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
    return w();
  }
  
  public OutputStream c()
  {
    return new w(this);
  }
  
  public void close()
  {
    if (this.c) {}
    do
    {
      return;
      localObject2 = null;
      localObject1 = localObject2;
      for (;;)
      {
        try
        {
          if (this.a.b > 0L)
          {
            this.b.write(this.a, this.a.b);
            localObject1 = localObject2;
          }
        }
        catch (Throwable localThrowable1)
        {
          continue;
        }
        try
        {
          this.b.close();
          localObject2 = localObject1;
        }
        catch (Throwable localThrowable2)
        {
          localObject2 = localObject1;
          if (localObject1 != null) {
            continue;
          }
          localObject2 = localThrowable2;
        }
      }
      this.c = true;
    } while (localObject2 == null);
    ag.a((Throwable)localObject2);
  }
  
  public i e()
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    long l = this.a.a();
    if (l > 0L) {
      this.b.write(this.a, l);
    }
    return this;
  }
  
  public void flush()
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    if (this.a.b > 0L) {
      this.b.write(this.a, this.a.b);
    }
    this.b.flush();
  }
  
  public i g(int paramInt)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.d(paramInt);
    return w();
  }
  
  public i h(int paramInt)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.c(paramInt);
    return w();
  }
  
  public i i(int paramInt)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.b(paramInt);
    return w();
  }
  
  public i j(long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.i(paramLong);
    return w();
  }
  
  public i k(long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.h(paramLong);
    return w();
  }
  
  public ae timeout()
  {
    return this.b.timeout();
  }
  
  public String toString()
  {
    return "buffer(" + this.b + ")";
  }
  
  public i w()
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    long l = this.a.h();
    if (l > 0L) {
      this.b.write(this.a, l);
    }
    return this;
  }
  
  public void write(f paramf, long paramLong)
  {
    if (this.c) {
      throw new IllegalStateException("closed");
    }
    this.a.write(paramf, paramLong);
    w();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */