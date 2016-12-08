package com.c.a.a;

import android.content.Context;
import b.a.a.a.a.b.r;
import b.a.a.a.a.d.d;
import b.a.a.a.a.d.k;
import b.a.a.a.a.g.b;
import java.util.UUID;

final class x
  extends d<ab>
{
  private b g;
  
  x(Context paramContext, ag paramag, r paramr, k paramk)
  {
    super(paramContext, paramag, paramr, paramk, 100);
  }
  
  protected String a()
  {
    UUID localUUID = UUID.randomUUID();
    return "sa" + "_" + localUUID.toString() + "_" + this.c.a() + ".tap";
  }
  
  void a(b paramb)
  {
    this.g = paramb;
  }
  
  protected int b()
  {
    if (this.g == null) {
      return super.b();
    }
    return this.g.e;
  }
  
  protected int c()
  {
    if (this.g == null) {
      return super.c();
    }
    return this.g.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */