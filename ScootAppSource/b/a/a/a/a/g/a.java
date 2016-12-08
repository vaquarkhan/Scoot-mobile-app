package b.a.a.a.a.g;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import b.a.a.a.a.b.ah;
import b.a.a.a.a.b.m;
import b.a.a.a.a.e.e;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.s;
import b.a.a.a.t;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

abstract class a
  extends b.a.a.a.a.b.a
{
  public a(q paramq, String paramString1, String paramString2, b.a.a.a.a.e.n paramn, int paramInt)
  {
    super(paramq, paramString1, paramString2, paramn, paramInt);
  }
  
  private e a(e parame, d paramd)
  {
    return parame.a("X-CRASHLYTICS-API-KEY", paramd.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a());
  }
  
  private e b(e parame, d paramd)
  {
    e locale = parame.e("app[identifier]", paramd.b).e("app[name]", paramd.f).e("app[display_version]", paramd.c).e("app[build_version]", paramd.d).a("app[source]", Integer.valueOf(paramd.g)).e("app[minimum_sdk_version]", paramd.h).e("app[built_sdk_version]", paramd.i);
    if (!m.c(paramd.e)) {
      locale.e("app[instance_identifier]", paramd.e);
    }
    Object localObject;
    if (paramd.j != null)
    {
      localObject = null;
      parame = null;
    }
    try
    {
      InputStream localInputStream = this.a.E().getResources().openRawResource(paramd.j.b);
      parame = localInputStream;
      localObject = localInputStream;
      locale.e("app[icon][hash]", paramd.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", localInputStream).a("app[icon][width]", Integer.valueOf(paramd.j.c)).a("app[icon][height]", Integer.valueOf(paramd.j.d));
      m.a(localInputStream, "Failed to close app icon InputStream.");
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        localObject = parame;
        f.h().e("Fabric", "Failed to find app icon with resource ID: " + paramd.j.b, localNotFoundException);
        m.a(parame, "Failed to close app icon InputStream.");
      }
    }
    finally
    {
      m.a((Closeable)localObject, "Failed to close app icon InputStream.");
    }
    if (paramd.k != null)
    {
      parame = paramd.k.iterator();
      while (parame.hasNext())
      {
        paramd = (s)parame.next();
        locale.e(a(paramd), paramd.b());
        locale.e(b(paramd), paramd.c());
      }
    }
    return locale;
  }
  
  String a(s params)
  {
    return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[] { params.a() });
  }
  
  public boolean a(d paramd)
  {
    e locale = b(a(b(), paramd), paramd);
    f.h().a("Fabric", "Sending app info to " + a());
    if (paramd.j != null)
    {
      f.h().a("Fabric", "App icon hash is " + paramd.j.a);
      f.h().a("Fabric", "App icon size is " + paramd.j.c + "x" + paramd.j.d);
    }
    int i = locale.b();
    if ("POST".equals(locale.p())) {}
    for (paramd = "Create";; paramd = "Update")
    {
      f.h().a("Fabric", paramd + " app request ID: " + locale.b("X-REQUEST-ID"));
      f.h().a("Fabric", "Result was " + i);
      if (ah.a(i) != 0) {
        break;
      }
      return true;
    }
    return false;
  }
  
  String b(s params)
  {
    return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[] { params.a() });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */