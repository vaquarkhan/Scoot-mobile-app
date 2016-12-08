package com.b.a.a;

import com.b.a.ae;
import com.b.a.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

final class f
{
  public long a;
  public String b;
  public String c;
  public long d;
  public long e;
  public long f;
  public long g;
  public Map<String, String> h;
  
  private f() {}
  
  public f(String paramString, c paramc)
  {
    this.b = paramString;
    this.a = paramc.a.length;
    this.c = paramc.b;
    this.d = paramc.c;
    this.e = paramc.d;
    this.f = paramc.e;
    this.g = paramc.f;
    this.h = paramc.g;
  }
  
  public static f a(InputStream paramInputStream)
  {
    f localf = new f();
    if (d.a(paramInputStream) != 538247942) {
      throw new IOException();
    }
    localf.b = d.c(paramInputStream);
    localf.c = d.c(paramInputStream);
    if (localf.c.equals("")) {
      localf.c = null;
    }
    localf.d = d.b(paramInputStream);
    localf.e = d.b(paramInputStream);
    localf.f = d.b(paramInputStream);
    localf.g = d.b(paramInputStream);
    localf.h = d.d(paramInputStream);
    return localf;
  }
  
  public c a(byte[] paramArrayOfByte)
  {
    c localc = new c();
    localc.a = paramArrayOfByte;
    localc.b = this.c;
    localc.c = this.d;
    localc.d = this.e;
    localc.e = this.f;
    localc.f = this.g;
    localc.g = this.h;
    return localc;
  }
  
  public boolean a(OutputStream paramOutputStream)
  {
    try
    {
      d.a(paramOutputStream, 538247942);
      d.a(paramOutputStream, this.b);
      if (this.c == null) {}
      for (String str = "";; str = this.c)
      {
        d.a(paramOutputStream, str);
        d.a(paramOutputStream, this.d);
        d.a(paramOutputStream, this.e);
        d.a(paramOutputStream, this.f);
        d.a(paramOutputStream, this.g);
        d.a(this.h, paramOutputStream);
        paramOutputStream.flush();
        return true;
      }
      return false;
    }
    catch (IOException paramOutputStream)
    {
      ae.b("%s", new Object[] { paramOutputStream.toString() });
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */