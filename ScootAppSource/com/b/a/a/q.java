package com.b.a.a;

import com.b.a.n;
import com.b.a.r;
import com.b.a.w;
import com.b.a.x;
import com.b.a.y;
import java.io.UnsupportedEncodingException;

public class q
  extends r<String>
{
  private y<String> a;
  
  public q(int paramInt, String paramString, y<String> paramy, x paramx)
  {
    super(paramInt, paramString, paramx);
    this.a = paramy;
  }
  
  protected w<String> a(n paramn)
  {
    try
    {
      String str1 = new String(paramn.b, j.a(paramn.c));
      return w.a(str1, j.a(paramn));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str2 = new String(paramn.b);
      }
    }
  }
  
  protected void c()
  {
    super.c();
    this.a = null;
  }
  
  protected void d(String paramString)
  {
    if (this.a != null) {
      this.a.a(paramString);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */