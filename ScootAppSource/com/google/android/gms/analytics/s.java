package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ag;
import com.google.android.gms.analytics.internal.ak;
import com.google.android.gms.analytics.internal.as;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.bl;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.w;
import java.util.HashMap;
import java.util.Map;

final class s
  implements Runnable
{
  s(r paramr, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2) {}
  
  public void run()
  {
    boolean bool = true;
    if (r.a(this.h).b()) {
      this.a.put("sc", "start");
    }
    w.b(this.a, "cid", this.h.s().h());
    Object localObject = (String)this.a.get("sf");
    if (localObject != null)
    {
      double d1 = w.a((String)localObject, 100.0D);
      if (w.a(d1, (String)this.a.get("cid")))
      {
        this.h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
        return;
      }
    }
    localObject = r.b(this.h);
    if (this.b)
    {
      w.a(this.a, "ate", ((b)localObject).b());
      w.a(this.a, "adid", ((b)localObject).c());
      localObject = r.c(this.h).c();
      w.a(this.a, "an", ((com.google.android.gms.b.t)localObject).a());
      w.a(this.a, "av", ((com.google.android.gms.b.t)localObject).b());
      w.a(this.a, "aid", ((com.google.android.gms.b.t)localObject).c());
      w.a(this.a, "aiid", ((com.google.android.gms.b.t)localObject).d());
      this.a.put("v", "1");
      this.a.put("_v", ag.b);
      w.a(this.a, "ul", r.d(this.h).b().f());
      w.a(this.a, "sr", r.e(this.h).c());
      if ((!this.c.equals("transaction")) && (!this.c.equals("item"))) {
        break label383;
      }
    }
    label383:
    for (int i = 1;; i = 0)
    {
      if ((i != 0) || (r.f(this.h).a())) {
        break label388;
      }
      r.g(this.h).a(this.a, "Too many hits sent too quickly, rate limiting invoked");
      return;
      this.a.remove("ate");
      this.a.remove("adid");
      break;
    }
    label388:
    long l2 = w.a((String)this.a.get("ht"));
    long l1 = l2;
    if (l2 == 0L) {
      l1 = this.d;
    }
    if (this.e)
    {
      localObject = new d(this.h, this.a, l1, this.f);
      r.h(this.h).c("Dry run enabled. Would have sent hit", localObject);
      return;
    }
    localObject = (String)this.a.get("cid");
    HashMap localHashMap = new HashMap();
    w.a(localHashMap, "uid", this.a);
    w.a(localHashMap, "an", this.a);
    w.a(localHashMap, "aid", this.a);
    w.a(localHashMap, "av", this.a);
    w.a(localHashMap, "aiid", this.a);
    String str = this.g;
    if (!TextUtils.isEmpty((CharSequence)this.a.get("adid"))) {}
    for (;;)
    {
      localObject = new ak(0L, (String)localObject, str, bool, 0L, localHashMap);
      l2 = r.i(this.h).a((ak)localObject);
      this.a.put("_s", String.valueOf(l2));
      localObject = new d(this.h, this.a, l1, this.f);
      r.j(this.h).a((d)localObject);
      return;
      bool = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */