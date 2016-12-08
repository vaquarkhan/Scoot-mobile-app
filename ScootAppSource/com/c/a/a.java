package com.c.a;

import b.a.a.a.q;
import b.a.a.a.r;
import com.c.a.b.e;
import com.c.a.c.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class a
  extends q<Void>
  implements r
{
  public final com.c.a.a.a a;
  public final e b;
  public final h c;
  public final Collection<? extends q> d;
  
  public a()
  {
    this(new com.c.a.a.a(), new e(), new h());
  }
  
  a(com.c.a.a.a parama, e parame, h paramh)
  {
    this.a = parama;
    this.b = parame;
    this.c = paramh;
    this.d = Collections.unmodifiableCollection(Arrays.asList(new q[] { parama, parame, paramh }));
  }
  
  public String a()
  {
    return "2.5.7.127";
  }
  
  public String b()
  {
    return "com.crashlytics.sdk.android:crashlytics";
  }
  
  public Collection<? extends q> c()
  {
    return this.d;
  }
  
  protected Void d()
  {
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */