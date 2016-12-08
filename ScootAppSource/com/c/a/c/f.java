package com.c.a.c;

import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;

final class f
  implements Flushable
{
  private final byte[] a;
  private final int b;
  private int c;
  private final OutputStream d;
  
  private f(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    this.d = paramOutputStream;
    this.a = paramArrayOfByte;
    this.c = 0;
    this.b = paramArrayOfByte.length;
  }
  
  public static f a(OutputStream paramOutputStream)
  {
    return a(paramOutputStream, 4096);
  }
  
  public static f a(OutputStream paramOutputStream, int paramInt)
  {
    return new f(paramOutputStream, new byte[paramInt]);
  }
  
  private void a()
  {
    if (this.d == null) {
      throw new g();
    }
    this.d.write(this.a, 0, this.c);
    this.c = 0;
  }
  
  public static int b(float paramFloat)
  {
    return 4;
  }
  
  public static int b(int paramInt, float paramFloat)
  {
    return j(paramInt) + b(paramFloat);
  }
  
  public static int b(int paramInt, long paramLong)
  {
    return j(paramInt) + b(paramLong);
  }
  
  public static int b(int paramInt, b paramb)
  {
    return j(paramInt) + b(paramb);
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    return j(paramInt) + b(paramBoolean);
  }
  
  public static int b(long paramLong)
  {
    return d(paramLong);
  }
  
  public static int b(b paramb)
  {
    return l(paramb.a()) + paramb.a();
  }
  
  public static int b(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int d(int paramInt1, int paramInt2)
  {
    return j(paramInt1) + f(paramInt2);
  }
  
  public static int d(long paramLong)
  {
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      return 1;
    }
    if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
      return 2;
    }
    if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
      return 3;
    }
    if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
      return 4;
    }
    if ((0xFFFFFFF800000000 & paramLong) == 0L) {
      return 5;
    }
    if ((0xFFFFFC0000000000 & paramLong) == 0L) {
      return 6;
    }
    if ((0xFFFE000000000000 & paramLong) == 0L) {
      return 7;
    }
    if ((0xFF00000000000000 & paramLong) == 0L) {
      return 8;
    }
    if ((0x8000000000000000 & paramLong) == 0L) {
      return 9;
    }
    return 10;
  }
  
  public static int e(int paramInt)
  {
    if (paramInt >= 0) {
      return l(paramInt);
    }
    return 10;
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    return j(paramInt1) + g(paramInt2);
  }
  
  public static int f(int paramInt)
  {
    return l(paramInt);
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    return j(paramInt1) + h(paramInt2);
  }
  
  public static int g(int paramInt)
  {
    return e(paramInt);
  }
  
  public static int h(int paramInt)
  {
    return l(n(paramInt));
  }
  
  public static int j(int paramInt)
  {
    return l(cd.a(paramInt, 0));
  }
  
  public static int l(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int n(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }
  
  public void a(byte paramByte)
  {
    if (this.c == this.b) {
      a();
    }
    byte[] arrayOfByte = this.a;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = paramByte;
  }
  
  public void a(float paramFloat)
  {
    m(Float.floatToRawIntBits(paramFloat));
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= 0)
    {
      k(paramInt);
      return;
    }
    c(paramInt);
  }
  
  public void a(int paramInt, float paramFloat)
  {
    g(paramInt, 5);
    a(paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    g(paramInt1, 0);
    b(paramInt2);
  }
  
  public void a(int paramInt, long paramLong)
  {
    g(paramInt, 0);
    a(paramLong);
  }
  
  public void a(int paramInt, b paramb)
  {
    g(paramInt, 2);
    a(paramb);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    g(paramInt, 0);
    a(paramBoolean);
  }
  
  public void a(long paramLong)
  {
    c(paramLong);
  }
  
  public void a(b paramb)
  {
    k(paramb.a());
    c(paramb);
  }
  
  public void a(b paramb, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      paramb.a(this.a, paramInt1, this.c, paramInt2);
      this.c += paramInt2;
      return;
    }
    int j = this.b - this.c;
    paramb.a(this.a, paramInt1, this.c, j);
    int i = paramInt1 + j;
    paramInt1 = paramInt2 - j;
    this.c = this.b;
    a();
    if (paramInt1 <= this.b)
    {
      paramb.a(this.a, i, 0, paramInt1);
      this.c = paramInt1;
      return;
    }
    paramb = paramb.b();
    if (i != paramb.skip(i)) {
      throw new IllegalStateException("Skip failed.");
    }
    do
    {
      this.d.write(this.a, 0, i);
      paramInt1 -= i;
      if (paramInt1 <= 0) {
        break;
      }
      paramInt2 = Math.min(paramInt1, this.b);
      i = paramb.read(this.a, 0, paramInt2);
    } while (i == paramInt2);
    throw new IllegalStateException("Read failed.");
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      i(i);
      return;
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.b - this.c >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.c, paramInt2);
      this.c += paramInt2;
      return;
    }
    int i = this.b - this.c;
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.c, i);
    paramInt1 += i;
    paramInt2 -= i;
    this.c = this.b;
    a();
    if (paramInt2 <= this.b)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.a, 0, paramInt2);
      this.c = paramInt2;
      return;
    }
    this.d.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void b(int paramInt)
  {
    k(paramInt);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    g(paramInt1, 0);
    c(paramInt2);
  }
  
  public void c(int paramInt)
  {
    a(paramInt);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    g(paramInt1, 0);
    d(paramInt2);
  }
  
  public void c(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        i((int)paramLong);
        return;
      }
      i((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public void c(b paramb)
  {
    a(paramb, 0, paramb.a());
  }
  
  public void d(int paramInt)
  {
    k(n(paramInt));
  }
  
  public void flush()
  {
    if (this.d != null) {
      a();
    }
  }
  
  public void g(int paramInt1, int paramInt2)
  {
    k(cd.a(paramInt1, paramInt2));
  }
  
  public void i(int paramInt)
  {
    a((byte)paramInt);
  }
  
  public void k(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        i(paramInt);
        return;
      }
      i(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public void m(int paramInt)
  {
    i(paramInt & 0xFF);
    i(paramInt >> 8 & 0xFF);
    i(paramInt >> 16 & 0xFF);
    i(paramInt >> 24 & 0xFF);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */