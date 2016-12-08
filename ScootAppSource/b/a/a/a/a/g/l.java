package b.a.a.a.a.g;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.m;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.n;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class l
  extends a
  implements aa
{
  public l(q paramq, String paramString1, String paramString2, n paramn)
  {
    this(paramq, paramString1, paramString2, paramn, d.a);
  }
  
  l(q paramq, String paramString1, String paramString2, n paramn, int paramInt)
  {
    super(paramq, paramString1, paramString2, paramn, paramInt);
  }
  
  private e a(e parame, z paramz)
  {
    a(parame, "X-CRASHLYTICS-API-KEY", paramz.a);
    a(parame, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    a(parame, "X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a());
    a(parame, "Accept", "application/json");
    a(parame, "X-CRASHLYTICS-DEVICE-MODEL", paramz.b);
    a(parame, "X-CRASHLYTICS-OS-BUILD-VERSION", paramz.c);
    a(parame, "X-CRASHLYTICS-OS-DISPLAY-VERSION", paramz.d);
    a(parame, "X-CRASHLYTICS-ADVERTISING-TOKEN", paramz.e);
    a(parame, "X-CRASHLYTICS-INSTALLATION-ID", paramz.f);
    a(parame, "X-CRASHLYTICS-ANDROID-ID", paramz.g);
    return parame;
  }
  
  private JSONObject a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      f.h().a("Fabric", "Failed to parse settings JSON from " + a(), localException);
      f.h().a("Fabric", "Settings response " + paramString);
    }
    return null;
  }
  
  private void a(e parame, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      parame.a(paramString1, paramString2);
    }
  }
  
  private Map<String, String> b(z paramz)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("build_version", paramz.j);
    localHashMap.put("display_version", paramz.i);
    localHashMap.put("source", Integer.toString(paramz.k));
    if (paramz.l != null) {
      localHashMap.put("icon_hash", paramz.l);
    }
    paramz = paramz.h;
    if (!m.c(paramz)) {
      localHashMap.put("instance", paramz);
    }
    return localHashMap;
  }
  
  JSONObject a(e parame)
  {
    int i = parame.b();
    f.h().a("Fabric", "Settings result was: " + i);
    if (a(i)) {
      return a(parame.e());
    }
    f.h().e("Fabric", "Failed to retrieve settings from " + a());
    return null;
  }
  
  public JSONObject a(z paramz)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    try
    {
      Map localMap = b(paramz);
      localObject1 = localObject2;
      localObject2 = a(localMap);
      localObject1 = localObject2;
      paramz = a((e)localObject2, paramz);
      localObject1 = paramz;
      f.h().a("Fabric", "Requesting settings from " + a());
      localObject1 = paramz;
      f.h().a("Fabric", "Settings query params were: " + localMap);
      localObject1 = paramz;
      localObject2 = a(paramz);
      if (paramz != null) {
        f.h().a("Fabric", "Settings request ID: " + paramz.b("X-REQUEST-ID"));
      }
      return (JSONObject)localObject2;
    }
    finally
    {
      if (localObject1 != null) {
        f.h().a("Fabric", "Settings request ID: " + ((e)localObject1).b("X-REQUEST-ID"));
      }
    }
  }
  
  boolean a(int paramInt)
  {
    return (paramInt == 200) || (paramInt == 201) || (paramInt == 202) || (paramInt == 203);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */