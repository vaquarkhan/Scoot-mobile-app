package e.b.a;

import e.b.a.b.t;
import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class f
{
  public static final g a = new h();
  private static volatile g b = a;
  private static final AtomicReference<Map<String, i>> c = new AtomicReference();
  
  public static final long a()
  {
    return b.a();
  }
  
  public static final long a(x paramx)
  {
    if (paramx == null) {
      return a();
    }
    return paramx.a();
  }
  
  public static final a a(a parama)
  {
    Object localObject = parama;
    if (parama == null) {
      localObject = t.O();
    }
    return (a)localObject;
  }
  
  public static final DateFormatSymbols a(Locale paramLocale)
  {
    try
    {
      DateFormatSymbols localDateFormatSymbols = (DateFormatSymbols)DateFormatSymbols.class.getMethod("getInstance", new Class[] { Locale.class }).invoke(null, new Object[] { paramLocale });
      return localDateFormatSymbols;
    }
    catch (Exception localException) {}
    return new DateFormatSymbols(paramLocale);
  }
  
  private static void a(Map<String, i> paramMap, String paramString1, String paramString2)
  {
    try
    {
      paramMap.put(paramString1, i.a(paramString2));
      return;
    }
    catch (RuntimeException paramMap) {}
  }
  
  public static final a b(x paramx)
  {
    if (paramx == null) {
      paramx = t.O();
    }
    a locala;
    do
    {
      return paramx;
      locala = paramx.b();
      paramx = locala;
    } while (locala != null);
    return t.O();
  }
  
  public static final Map<String, i> b()
  {
    Map localMap2 = (Map)c.get();
    Map localMap1 = localMap2;
    if (localMap2 == null)
    {
      localMap2 = c();
      localMap1 = localMap2;
      if (!c.compareAndSet(null, localMap2)) {
        localMap1 = (Map)c.get();
      }
    }
    return localMap1;
  }
  
  private static Map<String, i> c()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put("UT", i.a);
    localLinkedHashMap.put("UTC", i.a);
    localLinkedHashMap.put("GMT", i.a);
    a(localLinkedHashMap, "EST", "America/New_York");
    a(localLinkedHashMap, "EDT", "America/New_York");
    a(localLinkedHashMap, "CST", "America/Chicago");
    a(localLinkedHashMap, "CDT", "America/Chicago");
    a(localLinkedHashMap, "MST", "America/Denver");
    a(localLinkedHashMap, "MDT", "America/Denver");
    a(localLinkedHashMap, "PST", "America/Los_Angeles");
    a(localLinkedHashMap, "PDT", "America/Los_Angeles");
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */