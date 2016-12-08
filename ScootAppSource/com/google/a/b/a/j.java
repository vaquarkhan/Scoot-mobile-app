package com.google.a.b.a;

import com.google.a.ac;
import com.google.a.d.d;
import com.google.a.t;
import com.google.a.w;
import com.google.a.y;
import com.google.a.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class j
  extends d
{
  private static final Writer a = new k();
  private static final ac b = new ac("closed");
  private final List<w> c = new ArrayList();
  private String d;
  private w e = y.a;
  
  public j()
  {
    super(a);
  }
  
  private void a(w paramw)
  {
    if (this.d != null)
    {
      if ((!paramw.j()) || (i())) {
        ((z)j()).a(this.d, paramw);
      }
      this.d = null;
      return;
    }
    if (this.c.isEmpty())
    {
      this.e = paramw;
      return;
    }
    w localw = j();
    if ((localw instanceof t))
    {
      ((t)localw).a(paramw);
      return;
    }
    throw new IllegalStateException();
  }
  
  private w j()
  {
    return (w)this.c.get(this.c.size() - 1);
  }
  
  public d a(long paramLong)
  {
    a(new ac(Long.valueOf(paramLong)));
    return this;
  }
  
  public d a(Number paramNumber)
  {
    if (paramNumber == null) {
      return f();
    }
    if (!g())
    {
      double d1 = paramNumber.doubleValue();
      if ((Double.isNaN(d1)) || (Double.isInfinite(d1))) {
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramNumber);
      }
    }
    a(new ac(paramNumber));
    return this;
  }
  
  public d a(String paramString)
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof z))
    {
      this.d = paramString;
      return this;
    }
    throw new IllegalStateException();
  }
  
  public d a(boolean paramBoolean)
  {
    a(new ac(Boolean.valueOf(paramBoolean)));
    return this;
  }
  
  public w a()
  {
    if (!this.c.isEmpty()) {
      throw new IllegalStateException("Expected one JSON element but was " + this.c);
    }
    return this.e;
  }
  
  public d b()
  {
    t localt = new t();
    a(localt);
    this.c.add(localt);
    return this;
  }
  
  public d b(String paramString)
  {
    if (paramString == null) {
      return f();
    }
    a(new ac(paramString));
    return this;
  }
  
  public d c()
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof t))
    {
      this.c.remove(this.c.size() - 1);
      return this;
    }
    throw new IllegalStateException();
  }
  
  public void close()
  {
    if (!this.c.isEmpty()) {
      throw new IOException("Incomplete document");
    }
    this.c.add(b);
  }
  
  public d d()
  {
    z localz = new z();
    a(localz);
    this.c.add(localz);
    return this;
  }
  
  public d e()
  {
    if ((this.c.isEmpty()) || (this.d != null)) {
      throw new IllegalStateException();
    }
    if ((j() instanceof z))
    {
      this.c.remove(this.c.size() - 1);
      return this;
    }
    throw new IllegalStateException();
  }
  
  public d f()
  {
    a(y.a);
    return this;
  }
  
  public void flush() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */