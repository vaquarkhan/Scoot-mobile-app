package com.d.a;

import android.view.View;
import com.d.b.c;
import com.d.c.a.a;
import java.util.HashMap;
import java.util.Map;

public final class s
  extends an
{
  private static final Map<String, c> h = new HashMap();
  private Object i;
  private String j;
  private c k;
  
  static
  {
    h.put("alpha", t.a);
    h.put("pivotX", t.b);
    h.put("pivotY", t.c);
    h.put("translationX", t.d);
    h.put("translationY", t.e);
    h.put("rotation", t.f);
    h.put("rotationX", t.g);
    h.put("rotationY", t.h);
    h.put("scaleX", t.i);
    h.put("scaleY", t.j);
    h.put("scrollX", t.k);
    h.put("scrollY", t.l);
    h.put("x", t.m);
    h.put("y", t.n);
  }
  
  public static s a(Object paramObject, ai... paramVarArgs)
  {
    s locals = new s();
    locals.i = paramObject;
    locals.a(paramVarArgs);
    return locals;
  }
  
  public s a(long paramLong)
  {
    super.b(paramLong);
    return this;
  }
  
  public void a()
  {
    super.a();
  }
  
  void a(float paramFloat)
  {
    super.a(paramFloat);
    int n = this.f.length;
    int m = 0;
    while (m < n)
    {
      this.f[m].b(this.i);
      m += 1;
    }
  }
  
  public void a(c paramc)
  {
    if (this.f != null)
    {
      ai localai = this.f[0];
      String str = localai.c();
      localai.a(paramc);
      this.g.remove(str);
      this.g.put(this.j, localai);
    }
    if (this.k != null) {
      this.j = paramc.a();
    }
    this.k = paramc;
    this.e = false;
  }
  
  public void a(float... paramVarArgs)
  {
    if ((this.f == null) || (this.f.length == 0))
    {
      if (this.k != null)
      {
        a(new ai[] { ai.a(this.k, paramVarArgs) });
        return;
      }
      a(new ai[] { ai.a(this.j, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  void h()
  {
    if (!this.e)
    {
      if ((this.k == null) && (a.a) && ((this.i instanceof View)) && (h.containsKey(this.j))) {
        a((c)h.get(this.j));
      }
      int n = this.f.length;
      int m = 0;
      while (m < n)
      {
        this.f[m].a(this.i);
        m += 1;
      }
      super.h();
    }
  }
  
  public s i()
  {
    return (s)super.j();
  }
  
  public String toString()
  {
    String str1 = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.i;
    String str2 = str1;
    if (this.f != null)
    {
      int m = 0;
      for (;;)
      {
        str2 = str1;
        if (m >= this.f.length) {
          break;
        }
        str1 = str1 + "\n    " + this.f[m].toString();
        m += 1;
      }
    }
    return str2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */