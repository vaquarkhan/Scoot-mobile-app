package com.c.a.c;

import b.a.a.a.a.b.m;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.w;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;

final class ao
  implements Runnable
{
  private final h a;
  private final File b;
  
  public ao(h paramh, File paramFile)
  {
    this.a = paramh;
    this.b = paramFile;
  }
  
  public void run()
  {
    if (!m.n(this.a.E())) {}
    Object localObject;
    do
    {
      return;
      f.h().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
      localObject = q.a().b();
      localObject = this.a.a((w)localObject);
    } while (localObject == null);
    new bv((ar)localObject).a(new bz(this.b, ac.i()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */