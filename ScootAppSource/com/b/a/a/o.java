package com.b.a.a;

import com.b.a.ae;
import com.b.a.n;
import com.b.a.r;
import com.b.a.w;
import com.b.a.x;
import com.b.a.y;
import java.io.UnsupportedEncodingException;

public abstract class o<T>
  extends r<T>
{
  private static final String a = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  private y<T> b;
  private final String c;
  
  public o(int paramInt, String paramString1, String paramString2, y<T> paramy, x paramx)
  {
    super(paramInt, paramString1, paramx);
    this.b = paramy;
    this.c = paramString2;
  }
  
  protected abstract w<T> a(n paramn);
  
  protected void b(T paramT)
  {
    if (this.b != null) {
      this.b.a(paramT);
    }
  }
  
  protected void c()
  {
    super.c();
    this.b = null;
  }
  
  public String l()
  {
    return p();
  }
  
  public byte[] m()
  {
    return q();
  }
  
  public String p()
  {
    return a;
  }
  
  public byte[] q()
  {
    try
    {
      if (this.c == null) {
        return null;
      }
      byte[] arrayOfByte = this.c.getBytes("utf-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      ae.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] { this.c, "utf-8" });
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */