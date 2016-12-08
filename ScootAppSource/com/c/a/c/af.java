package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;
import com.c.a.c.a.a.d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

final class af
  implements Callable<Boolean>
{
  af(ac paramac) {}
  
  public Boolean a()
  {
    if (ac.a(this.a).get())
    {
      f.h().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
      return Boolean.FALSE;
    }
    f.h().a("CrashlyticsCore", "Finalizing previously open sessions.");
    d locald = ac.c(this.a).v();
    if (locald != null) {
      ac.a(this.a, locald);
    }
    ac.a(this.a, true);
    f.h().a("CrashlyticsCore", "Closed all previously open sessions");
    return Boolean.TRUE;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */