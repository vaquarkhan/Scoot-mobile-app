package com.c.a.c;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.ah;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.n;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class as
  extends a
  implements ar
{
  public as(q paramq, String paramString1, String paramString2, n paramn)
  {
    super(paramq, paramString1, paramString2, paramn, d.b);
  }
  
  private e a(e parame, aq paramaq)
  {
    parame = parame.a("X-CRASHLYTICS-API-KEY", paramaq.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", h.f().a());
    paramaq = paramaq.b.e().entrySet().iterator();
    while (paramaq.hasNext()) {
      parame = parame.a((Map.Entry)paramaq.next());
    }
    return parame;
  }
  
  private e b(e parame, aq paramaq)
  {
    paramaq = paramaq.b;
    return parame.a("report[file]", paramaq.b(), "application/octet-stream", paramaq.d()).e("report[identifier]", paramaq.c());
  }
  
  public boolean a(aq paramaq)
  {
    paramaq = b(a(b(), paramaq), paramaq);
    f.h().a("CrashlyticsCore", "Sending report to: " + a());
    int i = paramaq.b();
    f.h().a("CrashlyticsCore", "Create report request ID: " + paramaq.b("X-REQUEST-ID"));
    f.h().a("CrashlyticsCore", "Result was: " + i);
    return ah.a(i) == 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */