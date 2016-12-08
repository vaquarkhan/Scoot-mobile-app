package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;
import java.util.concurrent.Callable;

final class s
  implements Callable<Boolean>
{
  private final y a;
  
  public s(y paramy)
  {
    this.a = paramy;
  }
  
  public Boolean a()
  {
    if (!this.a.b()) {
      return Boolean.FALSE;
    }
    f.h().a("CrashlyticsCore", "Found previous crash marker.");
    this.a.c();
    return Boolean.TRUE;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */