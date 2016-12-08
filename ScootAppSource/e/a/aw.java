package e.a;

import java.nio.ByteBuffer;

public final class aw
{
  private String a;
  private long b;
  private boolean c;
  
  public aw(String paramString)
  {
    this.a = paramString;
  }
  
  public aw(String paramString, long paramLong)
  {
    this.b = paramLong;
    this.a = paramString;
  }
  
  public long a()
  {
    if ((this.c) || (this.b > 4294967296L)) {
      return 16L;
    }
    return 8L;
  }
  
  public void a(int paramInt)
  {
    this.b = (paramInt + a());
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    if (this.b > 4294967296L) {
      paramByteBuffer.putInt(1);
    }
    for (;;)
    {
      paramByteBuffer.put(az.a(this.a));
      if (this.b > 4294967296L) {
        paramByteBuffer.putLong(this.b);
      }
      return;
      paramByteBuffer.putInt((int)this.b);
    }
  }
  
  public String b()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */