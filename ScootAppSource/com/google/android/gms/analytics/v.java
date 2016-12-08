package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.ag;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.d;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.b.aa;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.ac;
import com.google.android.gms.b.ad;
import com.google.android.gms.b.af;
import com.google.android.gms.b.t;
import com.google.android.gms.b.u;
import com.google.android.gms.b.x;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class v
  extends com.google.android.gms.analytics.internal.ae
  implements ak
{
  private static DecimalFormat a;
  private final ah b;
  private final String c;
  private final Uri d;
  private final boolean e;
  private final boolean f;
  
  public v(ah paramah, String paramString)
  {
    this(paramah, paramString, true, false);
  }
  
  public v(ah paramah, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramah);
    com.google.android.gms.common.internal.b.a(paramString);
    this.b = paramah;
    this.c = paramString;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.d = a(this.c);
  }
  
  static Uri a(String paramString)
  {
    com.google.android.gms.common.internal.b.a(paramString);
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  static String a(double paramDouble)
  {
    if (a == null) {
      a = new DecimalFormat("0.######");
    }
    return a.format(paramDouble);
  }
  
  private static String a(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    }
    String str;
    do
    {
      return (String)paramObject;
      if (!(paramObject instanceof String)) {
        break;
      }
      str = (String)paramObject;
      paramObject = str;
    } while (!TextUtils.isEmpty(str));
    return null;
    if ((paramObject instanceof Double))
    {
      paramObject = (Double)paramObject;
      if (((Double)paramObject).doubleValue() != 0.0D) {
        return a(((Double)paramObject).doubleValue());
      }
      return null;
    }
    if ((paramObject instanceof Boolean))
    {
      if (paramObject != Boolean.FALSE) {
        return "1";
      }
      return null;
    }
    return String.valueOf(paramObject);
  }
  
  private static String a(Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append("=");
      localStringBuilder.append((String)localEntry.getValue());
    }
    return localStringBuilder.toString();
  }
  
  private static void a(Map<String, String> paramMap, String paramString, double paramDouble)
  {
    if (paramDouble != 0.0D) {
      paramMap.put(paramString, a(paramDouble));
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      paramMap.put(paramString, 23 + paramInt1 + "x" + paramInt2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private static void a(Map<String, String> paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramMap.put(paramString, "1");
    }
  }
  
  public static Map<String, String> b(z paramz)
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = (x)paramz.a(x.class);
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = ((x)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = a(((Map.Entry)localObject2).getValue());
        if (localObject3 != null) {
          localHashMap.put((String)((Map.Entry)localObject2).getKey(), localObject3);
        }
      }
    }
    localObject1 = (ac)paramz.a(ac.class);
    if (localObject1 != null)
    {
      a(localHashMap, "t", ((ac)localObject1).a());
      a(localHashMap, "cid", ((ac)localObject1).b());
      a(localHashMap, "uid", ((ac)localObject1).c());
      a(localHashMap, "sc", ((ac)localObject1).f());
      a(localHashMap, "sf", ((ac)localObject1).h());
      a(localHashMap, "ni", ((ac)localObject1).g());
      a(localHashMap, "adid", ((ac)localObject1).d());
      a(localHashMap, "ate", ((ac)localObject1).e());
    }
    localObject1 = (ad)paramz.a(ad.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cd", ((ad)localObject1).b());
      a(localHashMap, "a", ((ad)localObject1).c());
      a(localHashMap, "dr", ((ad)localObject1).d());
    }
    localObject1 = (aa)paramz.a(aa.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ec", ((aa)localObject1).a());
      a(localHashMap, "ea", ((aa)localObject1).b());
      a(localHashMap, "el", ((aa)localObject1).c());
      a(localHashMap, "ev", ((aa)localObject1).d());
    }
    localObject1 = (u)paramz.a(u.class);
    if (localObject1 != null)
    {
      a(localHashMap, "cn", ((u)localObject1).a());
      a(localHashMap, "cs", ((u)localObject1).b());
      a(localHashMap, "cm", ((u)localObject1).c());
      a(localHashMap, "ck", ((u)localObject1).d());
      a(localHashMap, "cc", ((u)localObject1).e());
      a(localHashMap, "ci", ((u)localObject1).f());
      a(localHashMap, "anid", ((u)localObject1).g());
      a(localHashMap, "gclid", ((u)localObject1).h());
      a(localHashMap, "dclid", ((u)localObject1).i());
      a(localHashMap, "aclid", ((u)localObject1).j());
    }
    localObject1 = (ab)paramz.a(ab.class);
    if (localObject1 != null)
    {
      a(localHashMap, "exd", ((ab)localObject1).a());
      a(localHashMap, "exf", ((ab)localObject1).b());
    }
    localObject1 = (com.google.android.gms.b.ae)paramz.a(com.google.android.gms.b.ae.class);
    if (localObject1 != null)
    {
      a(localHashMap, "sn", ((com.google.android.gms.b.ae)localObject1).a());
      a(localHashMap, "sa", ((com.google.android.gms.b.ae)localObject1).b());
      a(localHashMap, "st", ((com.google.android.gms.b.ae)localObject1).c());
    }
    localObject1 = (af)paramz.a(af.class);
    if (localObject1 != null)
    {
      a(localHashMap, "utv", ((af)localObject1).a());
      a(localHashMap, "utt", ((af)localObject1).b());
      a(localHashMap, "utc", ((af)localObject1).c());
      a(localHashMap, "utl", ((af)localObject1).d());
    }
    localObject1 = (com.google.android.gms.b.v)paramz.a(com.google.android.gms.b.v.class);
    if (localObject1 != null)
    {
      localObject1 = ((com.google.android.gms.b.v)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = w.a(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, (String)((Map.Entry)localObject2).getValue());
        }
      }
    }
    localObject1 = (com.google.android.gms.b.w)paramz.a(com.google.android.gms.b.w.class);
    if (localObject1 != null)
    {
      localObject1 = ((com.google.android.gms.b.w)localObject1).a().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localObject3 = w.b(((Integer)((Map.Entry)localObject2).getKey()).intValue());
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localHashMap.put(localObject3, a(((Double)((Map.Entry)localObject2).getValue()).doubleValue()));
        }
      }
    }
    localObject1 = (com.google.android.gms.b.z)paramz.a(com.google.android.gms.b.z.class);
    if (localObject1 != null)
    {
      localObject2 = ((com.google.android.gms.b.z)localObject1).a();
      if (localObject2 != null)
      {
        localObject2 = ((com.google.android.gms.analytics.a.b)localObject2).a().entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          if (((String)((Map.Entry)localObject3).getKey()).startsWith("&")) {
            localHashMap.put(((String)((Map.Entry)localObject3).getKey()).substring(1), (String)((Map.Entry)localObject3).getValue());
          } else {
            localHashMap.put((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
          }
        }
      }
      localObject2 = ((com.google.android.gms.b.z)localObject1).d().iterator();
      int i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((c)((Iterator)localObject2).next()).a(w.f(i)));
        i += 1;
      }
      localObject2 = ((com.google.android.gms.b.z)localObject1).b().iterator();
      i = 1;
      while (((Iterator)localObject2).hasNext())
      {
        localHashMap.putAll(((a)((Iterator)localObject2).next()).a(w.d(i)));
        i += 1;
      }
      localObject2 = ((com.google.android.gms.b.z)localObject1).c().entrySet().iterator();
      i = 1;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localObject1 = (List)((Map.Entry)localObject3).getValue();
        String str1 = w.i(i);
        Iterator localIterator = ((List)localObject1).iterator();
        int j = 1;
        if (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          localObject1 = String.valueOf(str1);
          String str2 = String.valueOf(w.g(j));
          if (str2.length() != 0) {}
          for (localObject1 = ((String)localObject1).concat(str2);; localObject1 = new String((String)localObject1))
          {
            localHashMap.putAll(locala.a((String)localObject1));
            j += 1;
            break;
          }
        }
        if (!TextUtils.isEmpty((CharSequence)((Map.Entry)localObject3).getKey()))
        {
          localObject1 = String.valueOf(str1);
          str1 = String.valueOf("nm");
          if (str1.length() == 0) {
            break label1283;
          }
        }
        label1283:
        for (localObject1 = ((String)localObject1).concat(str1);; localObject1 = new String((String)localObject1))
        {
          localHashMap.put(localObject1, (String)((Map.Entry)localObject3).getKey());
          i += 1;
          break;
        }
      }
    }
    localObject1 = (com.google.android.gms.b.y)paramz.a(com.google.android.gms.b.y.class);
    if (localObject1 != null)
    {
      a(localHashMap, "ul", ((com.google.android.gms.b.y)localObject1).f());
      a(localHashMap, "sd", ((com.google.android.gms.b.y)localObject1).a());
      a(localHashMap, "sr", ((com.google.android.gms.b.y)localObject1).b(), ((com.google.android.gms.b.y)localObject1).c());
      a(localHashMap, "vp", ((com.google.android.gms.b.y)localObject1).d(), ((com.google.android.gms.b.y)localObject1).e());
    }
    paramz = (t)paramz.a(t.class);
    if (paramz != null)
    {
      a(localHashMap, "an", paramz.a());
      a(localHashMap, "aid", paramz.c());
      a(localHashMap, "aiid", paramz.d());
      a(localHashMap, "av", paramz.b());
    }
    return localHashMap;
  }
  
  public Uri a()
  {
    return this.d;
  }
  
  public void a(z paramz)
  {
    com.google.android.gms.common.internal.b.a(paramz);
    com.google.android.gms.common.internal.b.b(paramz.f(), "Can't deliver not submitted measurement");
    com.google.android.gms.common.internal.b.c("deliver should be called on worker thread");
    Object localObject2 = paramz.a();
    Object localObject1 = (ac)((z)localObject2).b(ac.class);
    if (TextUtils.isEmpty(((ac)localObject1).a())) {
      p().a(b((z)localObject2), "Ignoring measurement without type");
    }
    do
    {
      return;
      if (TextUtils.isEmpty(((ac)localObject1).b()))
      {
        p().a(b((z)localObject2), "Ignoring measurement without client id");
        return;
      }
    } while (this.b.k().f());
    double d1 = ((ac)localObject1).h();
    if (com.google.android.gms.analytics.internal.w.a(d1, ((ac)localObject1).b()))
    {
      b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
      return;
    }
    localObject2 = b((z)localObject2);
    ((Map)localObject2).put("v", "1");
    ((Map)localObject2).put("_v", ag.b);
    ((Map)localObject2).put("tid", this.c);
    if (this.b.k().e())
    {
      c("Dry run is enabled. GoogleAnalytics would have sent", a((Map)localObject2));
      return;
    }
    HashMap localHashMap = new HashMap();
    com.google.android.gms.analytics.internal.w.a(localHashMap, "uid", ((ac)localObject1).c());
    Object localObject3 = (t)paramz.a(t.class);
    if (localObject3 != null)
    {
      com.google.android.gms.analytics.internal.w.a(localHashMap, "an", ((t)localObject3).a());
      com.google.android.gms.analytics.internal.w.a(localHashMap, "aid", ((t)localObject3).c());
      com.google.android.gms.analytics.internal.w.a(localHashMap, "av", ((t)localObject3).b());
      com.google.android.gms.analytics.internal.w.a(localHashMap, "aiid", ((t)localObject3).d());
    }
    localObject3 = ((ac)localObject1).b();
    String str = this.c;
    if (!TextUtils.isEmpty(((ac)localObject1).d())) {}
    for (boolean bool = true;; bool = false)
    {
      localObject1 = new com.google.android.gms.analytics.internal.ak(0L, (String)localObject3, str, bool, 0L, localHashMap);
      ((Map)localObject2).put("_s", String.valueOf(t().a((com.google.android.gms.analytics.internal.ak)localObject1)));
      paramz = new d(p(), (Map)localObject2, paramz.d(), true);
      t().a(paramz);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */