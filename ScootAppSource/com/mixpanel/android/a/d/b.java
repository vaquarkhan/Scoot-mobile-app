package com.mixpanel.android.a.d;

import java.nio.ByteBuffer;

public final class b
  extends f
  implements a
{
  static final ByteBuffer a = ByteBuffer.allocate(0);
  private int f;
  private String g;
  
  public b()
  {
    super(e.f);
    a(true);
  }
  
  public b(int paramInt)
  {
    super(e.f);
    a(true);
    a(paramInt, "");
  }
  
  public b(int paramInt, String paramString)
  {
    super(e.f);
    a(true);
    a(paramInt, paramString);
  }
  
  private void a(int paramInt, String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 1015)
      {
        paramString = "";
        i = 1005;
      }
      if (i == 1005)
      {
        if (paramString.length() > 0) {
          throw new com.mixpanel.android.a.c.b(1002, "A close frame must have a closecode if it has a reason");
        }
      }
      else
      {
        paramString = com.mixpanel.android.a.f.c.a(paramString);
        ByteBuffer localByteBuffer1 = ByteBuffer.allocate(4);
        localByteBuffer1.putInt(i);
        localByteBuffer1.position(2);
        ByteBuffer localByteBuffer2 = ByteBuffer.allocate(paramString.length + 2);
        localByteBuffer2.put(localByteBuffer1);
        localByteBuffer2.put(paramString);
        localByteBuffer2.rewind();
        a(localByteBuffer2);
      }
      return;
    }
  }
  
  private void g()
  {
    this.f = 1005;
    ByteBuffer localByteBuffer1 = super.c();
    localByteBuffer1.mark();
    if (localByteBuffer1.remaining() >= 2)
    {
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(4);
      localByteBuffer2.position(2);
      localByteBuffer2.putShort(localByteBuffer1.getShort());
      localByteBuffer2.position(0);
      this.f = localByteBuffer2.getInt();
      if ((this.f == 1006) || (this.f == 1015) || (this.f == 1005) || (this.f > 4999) || (this.f < 1000) || (this.f == 1004)) {
        throw new com.mixpanel.android.a.c.c("closecode must not be sent over the wire: " + this.f);
      }
    }
    localByteBuffer1.reset();
  }
  
  private void h()
  {
    if (this.f == 1005)
    {
      this.g = com.mixpanel.android.a.f.c.a(super.c());
      return;
    }
    ByteBuffer localByteBuffer = super.c();
    int i = localByteBuffer.position();
    try
    {
      localByteBuffer.position(localByteBuffer.position() + 2);
      this.g = com.mixpanel.android.a.f.c.a(localByteBuffer);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new com.mixpanel.android.a.c.c(localIllegalArgumentException);
    }
    finally
    {
      localByteBuffer.position(i);
    }
  }
  
  public int a()
  {
    return this.f;
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    super.a(paramByteBuffer);
    g();
    h();
  }
  
  public String b()
  {
    return this.g;
  }
  
  public ByteBuffer c()
  {
    if (this.f == 1005) {
      return a;
    }
    return super.c();
  }
  
  public String toString()
  {
    return super.toString() + "code: " + this.f;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */