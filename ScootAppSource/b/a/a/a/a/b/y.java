package b.a.a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import b.a.a.a.f;
import b.a.a.a.q;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class y
{
  private static final Pattern d = Pattern.compile("[^\\p{Alnum}]");
  private static final String e = Pattern.quote("/");
  c a;
  b b;
  boolean c;
  private final ReentrantLock f = new ReentrantLock();
  private final aa g;
  private final boolean h;
  private final boolean i;
  private final Context j;
  private final String k;
  private final String l;
  private final Collection<q> m;
  
  public y(Context paramContext, String paramString1, String paramString2, Collection<q> paramCollection)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("appContext must not be null");
    }
    if (paramString1 == null) {
      throw new IllegalArgumentException("appIdentifier must not be null");
    }
    if (paramCollection == null) {
      throw new IllegalArgumentException("kits must not be null");
    }
    this.j = paramContext;
    this.k = paramString1;
    this.l = paramString2;
    this.m = paramCollection;
    this.g = new aa();
    this.a = new c(paramContext);
    this.h = m.a(paramContext, "com.crashlytics.CollectDeviceIdentifiers", true);
    if (!this.h) {
      f.h().a("Fabric", "Device ID collection disabled for " + paramContext.getPackageName());
    }
    this.i = m.a(paramContext, "com.crashlytics.CollectUserIdentifiers", true);
    if (!this.i) {
      f.h().a("Fabric", "User information collection disabled for " + paramContext.getPackageName());
    }
  }
  
  private String a(SharedPreferences paramSharedPreferences)
  {
    this.f.lock();
    try
    {
      String str2 = paramSharedPreferences.getString("crashlytics.installation.id", null);
      String str1 = str2;
      if (str2 == null)
      {
        str1 = a(UUID.randomUUID().toString());
        paramSharedPreferences.edit().putString("crashlytics.installation.id", str1).commit();
      }
      return str1;
    }
    finally
    {
      this.f.unlock();
    }
  }
  
  private String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return d.matcher(paramString).replaceAll("").toLowerCase(Locale.US);
  }
  
  private void a(Map<z, String> paramMap, z paramz, String paramString)
  {
    if (paramString != null) {
      paramMap.put(paramz, paramString);
    }
  }
  
  private String b(String paramString)
  {
    return paramString.replaceAll(e, "");
  }
  
  public boolean a()
  {
    return this.i;
  }
  
  public String b()
  {
    String str2 = this.l;
    String str1 = str2;
    if (str2 == null)
    {
      SharedPreferences localSharedPreferences = m.a(this.j);
      str2 = localSharedPreferences.getString("crashlytics.installation.id", null);
      str1 = str2;
      if (str2 == null) {
        str1 = a(localSharedPreferences);
      }
    }
    return str1;
  }
  
  public String c()
  {
    return this.k;
  }
  
  public String d()
  {
    return e() + "/" + f();
  }
  
  public String e()
  {
    return b(Build.VERSION.RELEASE);
  }
  
  public String f()
  {
    return b(Build.VERSION.INCREMENTAL);
  }
  
  public String g()
  {
    return String.format(Locale.US, "%s/%s", new Object[] { b(Build.MANUFACTURER), b(Build.MODEL) });
  }
  
  public String h()
  {
    Object localObject = "";
    if (this.h)
    {
      String str = n();
      localObject = str;
      if (str == null)
      {
        SharedPreferences localSharedPreferences = m.a(this.j);
        str = localSharedPreferences.getString("crashlytics.installation.id", null);
        localObject = str;
        if (str == null) {
          localObject = a(localSharedPreferences);
        }
      }
    }
    return (String)localObject;
  }
  
  public Map<z, String> i()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.m.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (q)localIterator.next();
      if ((localObject instanceof t))
      {
        localObject = ((t)localObject).f().entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          a(localHashMap, (z)localEntry.getKey(), (String)localEntry.getValue());
        }
      }
    }
    a(localHashMap, z.d, n());
    a(localHashMap, z.g, m());
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public String j()
  {
    return this.g.a(this.j);
  }
  
  b k()
  {
    try
    {
      if (!this.c)
      {
        this.b = this.a.a();
        this.c = true;
      }
      b localb = this.b;
      return localb;
    }
    finally {}
  }
  
  public Boolean l()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.h)
    {
      b localb = k();
      localObject1 = localObject2;
      if (localb != null) {
        localObject1 = Boolean.valueOf(localb.b);
      }
    }
    return (Boolean)localObject1;
  }
  
  public String m()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.h)
    {
      b localb = k();
      localObject1 = localObject2;
      if (localb != null) {
        localObject1 = localb.a;
      }
    }
    return (String)localObject1;
  }
  
  public String n()
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (this.h)
    {
      String str = Settings.Secure.getString(this.j.getContentResolver(), "android_id");
      localObject1 = localObject2;
      if (!"9774d56d682e549c".equals(str)) {
        localObject1 = a(str);
      }
    }
    return (String)localObject1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */