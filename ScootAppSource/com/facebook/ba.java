package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

final class ba
  extends OutputStream
  implements bd
{
  private final Map<GraphRequest, be> a = new HashMap();
  private final Handler b;
  private GraphRequest c;
  private be d;
  private int e;
  
  ba(Handler paramHandler)
  {
    this.b = paramHandler;
  }
  
  int a()
  {
    return this.e;
  }
  
  void a(long paramLong)
  {
    if (this.d == null)
    {
      this.d = new be(this.b, this.c);
      this.a.put(this.c, this.d);
    }
    this.d.b(paramLong);
    this.e = ((int)(this.e + paramLong));
  }
  
  public void a(GraphRequest paramGraphRequest)
  {
    this.c = paramGraphRequest;
    if (paramGraphRequest != null) {}
    for (paramGraphRequest = (be)this.a.get(paramGraphRequest);; paramGraphRequest = null)
    {
      this.d = paramGraphRequest;
      return;
    }
  }
  
  Map<GraphRequest, be> b()
  {
    return this.a;
  }
  
  public void write(int paramInt)
  {
    a(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramInt2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */