package e.a;

import java.nio.ByteBuffer;

public final class j
{
  protected int a;
  protected int b;
  private ByteBuffer c;
  
  public j(ByteBuffer paramByteBuffer)
  {
    this.c = paramByteBuffer;
    this.b = a();
    this.a = 0;
  }
  
  private int d()
  {
    this.a -= (this.c.remaining() << 3);
    int i = 0;
    if (this.c.hasRemaining()) {
      i = 0x0 | this.c.get() & 0xFF;
    }
    int j = i << 8;
    i = j;
    if (this.c.hasRemaining()) {
      i = j | this.c.get() & 0xFF;
    }
    j = i << 8;
    i = j;
    if (this.c.hasRemaining()) {
      i = j | this.c.get() & 0xFF;
    }
    j = i << 8;
    i = j;
    if (this.c.hasRemaining()) {
      i = j | this.c.get() & 0xFF;
    }
    return i;
  }
  
  private int e()
  {
    if (this.c.hasRemaining()) {
      return this.c.get() & 0xFF;
    }
    return 0;
  }
  
  public final int a()
  {
    if (this.c.remaining() >= 4)
    {
      this.a -= 32;
      return (this.c.get() & 0xFF) << 24 | (this.c.get() & 0xFF) << 16 | (this.c.get() & 0xFF) << 8 | this.c.get() & 0xFF;
    }
    return d();
  }
  
  public int a(int paramInt)
  {
    if (paramInt > 32) {
      throw new IllegalArgumentException("Can not read more then 32 bit");
    }
    int i = 0;
    int j = paramInt;
    if (this.a + paramInt > 31)
    {
      i = this.b;
      int k = this.a;
      j = paramInt - (32 - this.a);
      i = (0x0 | i >>> k) << j;
      this.a = 32;
      this.b = a();
    }
    paramInt = i;
    if (j != 0)
    {
      paramInt = i | this.b >>> 32 - j;
      this.b <<= j;
      this.a += j;
    }
    return paramInt;
  }
  
  public int b()
  {
    int i = this.b;
    this.b <<= 1;
    this.a += 1;
    if (this.a == 32) {
      this.b = a();
    }
    return i >>> 31;
  }
  
  public int b(int paramInt)
  {
    if (paramInt > 24) {
      throw new IllegalArgumentException("Can not check more then 24 bit");
    }
    while (this.a + paramInt > 32)
    {
      this.a -= 8;
      this.b |= e() << this.a;
    }
    return this.b >>> 32 - paramInt;
  }
  
  public int c()
  {
    return (this.c.remaining() << 3) + 32 - this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */