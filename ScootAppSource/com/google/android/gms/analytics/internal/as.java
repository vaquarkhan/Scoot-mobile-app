package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.ad;
import com.google.android.gms.b.t;

public final class as
  extends af
{
  private final t a = new t();
  
  as(ah paramah)
  {
    super(paramah);
  }
  
  protected void a()
  {
    r().a().a(this.a);
    b();
  }
  
  public void b()
  {
    Object localObject = v();
    String str = ((x)localObject).c();
    if (str != null) {
      this.a.a(str);
    }
    localObject = ((x)localObject).b();
    if (localObject != null) {
      this.a.b((String)localObject);
    }
  }
  
  public t c()
  {
    D();
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */