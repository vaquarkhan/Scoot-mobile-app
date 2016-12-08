package com.google.android.gms.b;

public final class d
{
  private final byte[] a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = Integer.MAX_VALUE;
  private int h = 64;
  private int i = 67108864;
  
  private d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = (paramInt1 + paramInt2);
    this.e = paramInt1;
  }
  
  public static d a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new d(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private void m()
  {
    this.c += this.d;
    int j = this.c;
    if (j > this.g)
    {
      this.d = (j - this.g);
      this.c -= this.d;
      return;
    }
    this.d = 0;
  }
  
  public int a()
  {
    if (j())
    {
      this.f = 0;
      return 0;
    }
    this.f = f();
    if (this.f == 0) {
      throw l.d();
    }
    return this.f;
  }
  
  public void a(int paramInt)
  {
    if (this.f != paramInt) {
      throw l.e();
    }
  }
  
  public byte[] a(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return p.h;
    }
    byte[] arrayOfByte = new byte[paramInt2];
    int j = this.b;
    System.arraycopy(this.a, j + paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public void b()
  {
    int j;
    do
    {
      j = a();
    } while ((j != 0) && (b(j)));
  }
  
  public boolean b(int paramInt)
  {
    switch (p.a(paramInt))
    {
    default: 
      throw l.f();
    case 0: 
      c();
      return true;
    case 1: 
      h();
      return true;
    case 2: 
      f(f());
      return true;
    case 3: 
      b();
      a(p.a(p.b(paramInt), 4));
      return true;
    case 4: 
      return false;
    }
    g();
    return true;
  }
  
  public int c()
  {
    return f();
  }
  
  public int c(int paramInt)
  {
    if (paramInt < 0) {
      throw l.b();
    }
    paramInt = this.e + paramInt;
    int j = this.g;
    if (paramInt > j) {
      throw l.a();
    }
    this.g = paramInt;
    m();
    return j;
  }
  
  public String d()
  {
    int j = f();
    if (j < 0) {
      throw l.b();
    }
    if (j > this.c - this.e) {
      throw l.a();
    }
    String str = new String(this.a, this.e, j, k.a);
    this.e = (j + this.e);
    return str;
  }
  
  public void d(int paramInt)
  {
    this.g = paramInt;
    m();
  }
  
  public void e(int paramInt)
  {
    if (paramInt > this.e - this.b)
    {
      int j = this.e;
      int k = this.b;
      throw new IllegalArgumentException(50 + "Position " + paramInt + " is beyond current " + (j - k));
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException(24 + "Bad position " + paramInt);
    }
    this.e = (this.b + paramInt);
  }
  
  public byte[] e()
  {
    int j = f();
    if (j < 0) {
      throw l.b();
    }
    if (j == 0) {
      return p.h;
    }
    if (j > this.c - this.e) {
      throw l.a();
    }
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(this.a, this.e, arrayOfByte, 0, j);
    this.e = (j + this.e);
    return arrayOfByte;
  }
  
  public int f()
  {
    int j = l();
    if (j >= 0) {}
    int m;
    do
    {
      return j;
      j &= 0x7F;
      k = l();
      if (k >= 0) {
        return j | k << 7;
      }
      j |= (k & 0x7F) << 7;
      k = l();
      if (k >= 0) {
        return j | k << 14;
      }
      j |= (k & 0x7F) << 14;
      m = l();
      if (m >= 0) {
        return j | m << 21;
      }
      k = l();
      m = j | (m & 0x7F) << 21 | k << 28;
      j = m;
    } while (k >= 0);
    int k = 0;
    for (;;)
    {
      if (k >= 5) {
        break label133;
      }
      j = m;
      if (l() >= 0) {
        break;
      }
      k += 1;
    }
    label133:
    throw l.c();
  }
  
  public void f(int paramInt)
  {
    if (paramInt < 0) {
      throw l.b();
    }
    if (this.e + paramInt > this.g)
    {
      f(this.g - this.e);
      throw l.a();
    }
    if (paramInt <= this.c - this.e)
    {
      this.e += paramInt;
      return;
    }
    throw l.a();
  }
  
  public int g()
  {
    return l() & 0xFF | (l() & 0xFF) << 8 | (l() & 0xFF) << 16 | (l() & 0xFF) << 24;
  }
  
  public long h()
  {
    int j = l();
    int k = l();
    int m = l();
    int n = l();
    int i1 = l();
    int i2 = l();
    int i3 = l();
    int i4 = l();
    long l = j;
    return (k & 0xFF) << 8 | l & 0xFF | (m & 0xFF) << 16 | (n & 0xFF) << 24 | (i1 & 0xFF) << 32 | (i2 & 0xFF) << 40 | (i3 & 0xFF) << 48 | (i4 & 0xFF) << 56;
  }
  
  public int i()
  {
    if (this.g == Integer.MAX_VALUE) {
      return -1;
    }
    int j = this.e;
    return this.g - j;
  }
  
  public boolean j()
  {
    return this.e == this.c;
  }
  
  public int k()
  {
    return this.e - this.b;
  }
  
  public byte l()
  {
    if (this.e == this.c) {
      throw l.a();
    }
    byte[] arrayOfByte = this.a;
    int j = this.e;
    this.e = (j + 1);
    return arrayOfByte[j];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */