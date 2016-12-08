package com.mixpanel.android.a.d;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class f
  implements c
{
  protected static byte[] b = new byte[0];
  private ByteBuffer a;
  protected boolean c;
  protected e d;
  protected boolean e;
  
  public f() {}
  
  public f(d paramd)
  {
    this.c = paramd.d();
    this.d = paramd.f();
    this.a = paramd.c();
    this.e = paramd.e();
  }
  
  public f(e parame)
  {
    this.d = parame;
    this.a = ByteBuffer.wrap(b);
  }
  
  public void a(e parame)
  {
    this.d = parame;
  }
  
  public void a(ByteBuffer paramByteBuffer)
  {
    this.a = paramByteBuffer;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public ByteBuffer c()
  {
    return this.a;
  }
  
  public boolean d()
  {
    return this.c;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public e f()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "Framedata{ optcode:" + f() + ", fin:" + d() + ", payloadlength:[pos:" + this.a.position() + ", len:" + this.a.remaining() + "], payload:" + Arrays.toString(com.mixpanel.android.a.f.c.a(new String(this.a.array()))) + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */