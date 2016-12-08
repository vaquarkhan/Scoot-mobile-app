package b.a.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import b.a.a.a.a.b.k;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.y;
import b.a.a.a.a.e.b;
import b.a.a.a.a.g.ab;
import b.a.a.a.a.g.d;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.h;
import b.a.a.a.a.g.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

final class u
  extends q<Boolean>
{
  private final b.a.a.a.a.e.n a = new b();
  private PackageManager b;
  private String c;
  private PackageInfo d;
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;
  private final Future<Map<String, s>> p;
  private final Collection<q> q;
  
  public u(Future<Map<String, s>> paramFuture, Collection<q> paramCollection)
  {
    this.p = paramFuture;
    this.q = paramCollection;
  }
  
  private d a(b.a.a.a.a.g.n paramn, Collection<s> paramCollection)
  {
    Object localObject = E();
    String str = new k().a((Context)localObject);
    localObject = m.a(new String[] { m.m((Context)localObject) });
    int i = b.a.a.a.a.b.s.a(this.m).a();
    return new d(str, D().c(), this.l, this.k, (String)localObject, this.n, i, this.o, "0", paramn, paramCollection);
  }
  
  private boolean a(e parame, b.a.a.a.a.g.n paramn, Collection<s> paramCollection)
  {
    paramn = a(paramn, paramCollection);
    return new ab(this, f(), parame.c, this.a).a(paramn);
  }
  
  private boolean a(String paramString, e parame, Collection<s> paramCollection)
  {
    boolean bool = true;
    if ("new".equals(parame.b)) {
      if (b(paramString, parame, paramCollection)) {
        bool = b.a.a.a.a.g.q.a().d();
      }
    }
    do
    {
      return bool;
      f.h().e("Fabric", "Failed to create app with Crashlytics service.", null);
      return false;
      if ("configured".equals(parame.b)) {
        return b.a.a.a.a.g.q.a().d();
      }
    } while (!parame.e);
    f.h().a("Fabric", "Server says an update is required - forcing a full App update.");
    c(paramString, parame, paramCollection);
    return true;
  }
  
  private boolean b(String paramString, e parame, Collection<s> paramCollection)
  {
    paramString = a(b.a.a.a.a.g.n.a(E(), paramString), paramCollection);
    return new h(this, f(), parame.c, this.a).a(paramString);
  }
  
  private boolean c(String paramString, e parame, Collection<s> paramCollection)
  {
    return a(parame, b.a.a.a.a.g.n.a(E(), paramString), paramCollection);
  }
  
  private w g()
  {
    try
    {
      b.a.a.a.a.g.q.a().a(this, this.i, this.a, this.k, this.l, f()).c();
      w localw = b.a.a.a.a.g.q.a().b();
      return localw;
    }
    catch (Exception localException)
    {
      f.h().e("Fabric", "Error dealing with settings", localException);
    }
    return null;
  }
  
  public String a()
  {
    return "1.3.12.127";
  }
  
  Map<String, s> a(Map<String, s> paramMap, Collection<q> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      q localq = (q)paramCollection.next();
      if (!paramMap.containsKey(localq.b())) {
        paramMap.put(localq.b(), new s(localq.b(), localq.a(), "binary"));
      }
    }
    return paramMap;
  }
  
  public String b()
  {
    return "io.fabric.sdk.android:fabric";
  }
  
  protected Boolean d()
  {
    String str = m.k(E());
    w localw = g();
    if (localw != null) {}
    for (;;)
    {
      try
      {
        if (this.p != null)
        {
          localObject = (Map)this.p.get();
          localObject = a((Map)localObject, this.q);
          bool = a(str, localw.a, ((Map)localObject).values());
          return Boolean.valueOf(bool);
        }
        Object localObject = new HashMap();
        continue;
        boolean bool = false;
      }
      catch (Exception localException)
      {
        f.h().e("Fabric", "Error performing auto configuration.", localException);
      }
    }
  }
  
  String f()
  {
    return m.b(E(), "com.crashlytics.ApiEndpoint");
  }
  
  protected boolean h_()
  {
    try
    {
      this.m = D().j();
      this.b = E().getPackageManager();
      this.c = E().getPackageName();
      this.d = this.b.getPackageInfo(this.c, 0);
      this.k = Integer.toString(this.d.versionCode);
      if (this.d.versionName == null) {}
      for (String str = "0.0";; str = this.d.versionName)
      {
        this.l = str;
        this.n = this.b.getApplicationLabel(E().getApplicationInfo()).toString();
        this.o = Integer.toString(E().getApplicationInfo().targetSdkVersion);
        return true;
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      f.h().e("Fabric", "Failed init", localNameNotFoundException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */