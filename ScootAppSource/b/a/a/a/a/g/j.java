package b.a.a.a.a.g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.r;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import org.json.JSONObject;

final class j
  implements v
{
  private final z a;
  private final y b;
  private final r c;
  private final g d;
  private final aa e;
  private final q f;
  private final c g;
  
  public j(q paramq, z paramz, r paramr, y paramy, g paramg, aa paramaa)
  {
    this.f = paramq;
    this.a = paramz;
    this.c = paramr;
    this.b = paramy;
    this.d = paramg;
    this.e = paramaa;
    this.g = new d(this.f);
  }
  
  private void a(JSONObject paramJSONObject, String paramString)
  {
    f.h().a("Fabric", paramString + paramJSONObject.toString());
  }
  
  private w b(u paramu)
  {
    Object localObject = null;
    w localw = null;
    try
    {
      if (!u.b.equals(paramu))
      {
        JSONObject localJSONObject = this.d.a();
        if (localJSONObject == null) {
          break label160;
        }
        localw = this.b.a(this.c, localJSONObject);
        if (localw == null) {
          break label145;
        }
        a(localJSONObject, "Loaded cached settings: ");
        long l = this.c.a();
        if (!u.c.equals(paramu))
        {
          boolean bool = localw.a(l);
          if (bool) {
            break label110;
          }
        }
      }
    }
    catch (Exception localException1)
    {
      label110:
      paramu = (u)localObject;
    }
    try
    {
      f.h().a("Fabric", "Returning cached settings.");
      return localw;
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        paramu = localException1;
        Exception localException2 = localException3;
      }
    }
    f.h().a("Fabric", "Cached settings have expired.");
    return null;
    f.h().e("Fabric", "Failed to get cached settings", localException1);
    return paramu;
    label145:
    f.h().e("Fabric", "Failed to transform cached settings data.", null);
    return null;
    label160:
    f.h().a("Fabric", "No cached settings data found.");
    return null;
  }
  
  public w a()
  {
    return a(u.a);
  }
  
  public w a(u paramu)
  {
    JSONObject localJSONObject = null;
    Object localObject = localJSONObject;
    try
    {
      if (!f.i())
      {
        localObject = localJSONObject;
        if (!d()) {
          localObject = b(paramu);
        }
      }
      paramu = (u)localObject;
      if (localObject == null) {
        paramu = (u)localObject;
      }
      f.h().e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", localException1);
    }
    catch (Exception localException1)
    {
      try
      {
        localJSONObject = this.e.a(this.a);
        paramu = (u)localObject;
        if (localJSONObject != null)
        {
          paramu = (u)localObject;
          localObject = this.b.a(this.c, localJSONObject);
          paramu = (u)localObject;
          this.d.a(((w)localObject).g, localJSONObject);
          paramu = (u)localObject;
          a(localJSONObject, "Loaded settings: ");
          paramu = (u)localObject;
          a(b());
          paramu = (u)localObject;
        }
        localObject = paramu;
        if (paramu != null) {}
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      try
      {
        localObject = b(u.c);
        return (w)localObject;
      }
      catch (Exception localException3)
      {
        break label127;
      }
      localException1 = localException1;
      paramu = null;
    }
    label127:
    return paramu;
  }
  
  @SuppressLint({"CommitPrefEdits"})
  boolean a(String paramString)
  {
    SharedPreferences.Editor localEditor = this.g.b();
    localEditor.putString("existing_instance_identifier", paramString);
    return this.g.a(localEditor);
  }
  
  String b()
  {
    return m.a(new String[] { m.m(this.f.E()) });
  }
  
  String c()
  {
    return this.g.a().getString("existing_instance_identifier", "");
  }
  
  boolean d()
  {
    return !c().equals(b());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */