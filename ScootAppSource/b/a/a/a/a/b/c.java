package b.a.a.a.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import b.a.a.a.t;

final class c
{
  private final Context a;
  private final b.a.a.a.a.f.c b;
  
  public c(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    this.b = new b.a.a.a.a.f.d(paramContext, "TwitterAdvertisingInfoPreferences");
  }
  
  private void a(b paramb)
  {
    new Thread(new d(this, paramb)).start();
  }
  
  @SuppressLint({"CommitPrefEdits"})
  private void b(b paramb)
  {
    if (c(paramb))
    {
      this.b.a(this.b.b().putString("advertising_id", paramb.a).putBoolean("limit_ad_tracking_enabled", paramb.b));
      return;
    }
    this.b.a(this.b.b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
  }
  
  private boolean c(b paramb)
  {
    return (paramb != null) && (!TextUtils.isEmpty(paramb.a));
  }
  
  private b e()
  {
    b localb = c().a();
    if (!c(localb))
    {
      localb = d().a();
      if (!c(localb))
      {
        b.a.a.a.f.h().a("Fabric", "AdvertisingInfo not present");
        return localb;
      }
      b.a.a.a.f.h().a("Fabric", "Using AdvertisingInfo from Service Provider");
      return localb;
    }
    b.a.a.a.f.h().a("Fabric", "Using AdvertisingInfo from Reflection Provider");
    return localb;
  }
  
  public b a()
  {
    b localb = b();
    if (c(localb))
    {
      b.a.a.a.f.h().a("Fabric", "Using AdvertisingInfo from Preference Store");
      a(localb);
      return localb;
    }
    localb = e();
    b(localb);
    return localb;
  }
  
  protected b b()
  {
    return new b(this.b.a().getString("advertising_id", ""), this.b.a().getBoolean("limit_ad_tracking_enabled", false));
  }
  
  public j c()
  {
    return new e(this.a);
  }
  
  public j d()
  {
    return new f(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */