package b.a.a.a.a.b;

import android.content.Context;
import b.a.a.a.f;
import b.a.a.a.t;
import java.lang.reflect.Method;

final class e
  implements j
{
  private final Context a;
  
  public e(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private String b()
  {
    try
    {
      String str = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(d(), new Object[0]);
      return str;
    }
    catch (Exception localException)
    {
      f.h().d("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
    return null;
  }
  
  private boolean c()
  {
    try
    {
      boolean bool = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(d(), new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      f.h().d("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
    return false;
  }
  
  private Object d()
  {
    try
    {
      Object localObject = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] { Context.class }).invoke(null, new Object[] { this.a });
      return localObject;
    }
    catch (Exception localException)
    {
      f.h().d("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
    return null;
  }
  
  public b a()
  {
    if (a(this.a)) {
      return new b(b(), c());
    }
    return null;
  }
  
  boolean a(Context paramContext)
  {
    try
    {
      int i = ((Integer)Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[] { Context.class }).invoke(null, new Object[] { paramContext })).intValue();
      return i == 0;
    }
    catch (Exception paramContext) {}
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */