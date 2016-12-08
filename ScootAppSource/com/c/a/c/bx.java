package com.c.a.c;

import b.a.a.a.a.b.l;
import b.a.a.a.f;
import b.a.a.a.t;
import java.util.Iterator;
import java.util.List;

final class bx
  extends l
{
  private final float b;
  
  bx(bv parambv, float paramFloat)
  {
    this.b = paramFloat;
  }
  
  private void b()
  {
    f.h().a("CrashlyticsCore", "Starting report processing in " + this.b + " second(s)...");
    if (this.b > 0.0F) {}
    for (;;)
    {
      Object localObject2;
      try
      {
        Thread.sleep((this.b * 1000.0F));
        localObject2 = h.f();
        ac localac = ((h)localObject2).o();
        List localList = this.a.a();
        if (localac.a()) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException1)
      {
        Thread.currentThread().interrupt();
        return;
      }
      Object localObject1;
      if ((!localInterruptedException1.isEmpty()) && (!((h)localObject2).z()))
      {
        f.h().a("CrashlyticsCore", "User declined to send. Removing " + localInterruptedException1.size() + " Report(s).");
        localObject1 = localInterruptedException1.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((bu)((Iterator)localObject1).next()).a();
        }
      }
      else
      {
        int i = 0;
        while ((!((List)localObject1).isEmpty()) && (!h.f().o().a()))
        {
          f.h().a("CrashlyticsCore", "Attempting to send " + ((List)localObject1).size() + " report(s)");
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (bu)((Iterator)localObject1).next();
            this.a.a((bu)localObject2);
          }
          localObject1 = this.a.a();
          if (!((List)localObject1).isEmpty())
          {
            long l = bv.b()[Math.min(i, bv.b().length - 1)];
            f.h().a("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + l + " seconds");
            try
            {
              Thread.sleep(l * 1000L);
              i += 1;
            }
            catch (InterruptedException localInterruptedException2)
            {
              Thread.currentThread().interrupt();
              return;
            }
          }
        }
      }
    }
  }
  
  public void a()
  {
    try
    {
      b();
      bv.a(this.a, null);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.h().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", localException);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */