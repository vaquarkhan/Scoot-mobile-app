package e.a;

import java.nio.ByteBuffer;

public final class k
{
  private final ByteBuffer a;
  private int b;
  private int c;
  private int d;
  
  public k(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
    this.d = paramByteBuffer.position();
  }
  
  private final void b(int paramInt)
  {
    this.a.put((byte)(paramInt >>> 24));
    this.a.put((byte)(paramInt >> 16));
    this.a.put((byte)(paramInt >> 8));
    this.a.put((byte)paramInt);
  }
  
  public void a()
  {
    int j = this.c;
    int i = 0;
    while (i < j + 7 >> 3)
    {
      this.a.put((byte)(this.b >>> 24));
      this.b <<= 8;
      i += 1;
    }
  }
  
  public void a(int paramInt)
  {
    this.b |= paramInt << 32 - this.c - 1;
    this.c += 1;
    if (this.c == 32)
    {
      b(this.b);
      this.c = 0;
      this.b = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 32) {
      throw new IllegalArgumentException("Max 32 bit to write");
    }
    if (paramInt2 == 0) {}
    do
    {
      return;
      paramInt1 = -1 >>> 32 - paramInt2 & paramInt1;
      if (32 - this.c < paramInt2) {
        break;
      }
      int i = this.b;
      this.b = (paramInt1 << 32 - this.c - paramInt2 | i);
      this.c += paramInt2;
    } while (this.c != 32);
    b(this.b);
    this.c = 0;
    this.b = 0;
    return;
    paramInt2 -= 32 - this.c;
    this.b |= paramInt1 >>> paramInt2;
    b(this.b);
    this.b = (paramInt1 << 32 - paramInt2);
    this.c = paramInt2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */