package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.common.a.c;
import java.util.HashMap;
import java.util.Map;

final class t
  extends af
  implements i
{
  private boolean b;
  private int c;
  private long d = -1L;
  private boolean e;
  private long f;
  
  protected t(r paramr, ah paramah)
  {
    super(paramah);
  }
  
  private void d()
  {
    if ((this.d >= 0L) || (this.b))
    {
      s().a(r.a(this.a));
      return;
    }
    s().b(r.a(this.a));
  }
  
  protected void a() {}
  
  public void a(long paramLong)
  {
    this.d = paramLong;
    d();
  }
  
  public void a(Activity paramActivity)
  {
    if ((this.c == 0) && (c())) {
      this.e = true;
    }
    this.c += 1;
    HashMap localHashMap;
    r localr;
    if (this.b)
    {
      localObject = paramActivity.getIntent();
      if (localObject != null) {
        this.a.a(((Intent)localObject).getData());
      }
      localHashMap = new HashMap();
      localHashMap.put("&t", "screenview");
      localr = this.a;
      if (r.k(this.a) == null) {
        break label159;
      }
    }
    label159:
    for (Object localObject = r.k(this.a).a(paramActivity);; localObject = paramActivity.getClass().getCanonicalName())
    {
      localr.a("&cd", (String)localObject);
      if (TextUtils.isEmpty((CharSequence)localHashMap.get("&dr")))
      {
        paramActivity = r.a(paramActivity);
        if (!TextUtils.isEmpty(paramActivity)) {
          localHashMap.put("&dr", paramActivity);
        }
      }
      this.a.a(localHashMap);
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    d();
  }
  
  public void b(Activity paramActivity)
  {
    this.c -= 1;
    this.c = Math.max(0, this.c);
    if (this.c == 0) {
      this.f = n().b();
    }
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.e;
      this.e = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean c()
  {
    return n().b() >= this.f + Math.max(1000L, this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */