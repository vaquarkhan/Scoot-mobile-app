package e.b.a.b;

import e.b.a.d;
import e.b.a.f;
import e.b.a.o;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class p
{
  private static ConcurrentMap<Locale, p> a = new ConcurrentHashMap();
  private final String[] b;
  private final String[] c;
  private final String[] d;
  private final String[] e;
  private final String[] f;
  private final String[] g;
  private final TreeMap<String, Integer> h;
  private final TreeMap<String, Integer> i;
  private final TreeMap<String, Integer> j;
  private final int k;
  private final int l;
  private final int m;
  private final int n;
  private final int o;
  private final int p;
  
  private p(Locale paramLocale)
  {
    Object localObject = f.a(paramLocale);
    this.b = ((DateFormatSymbols)localObject).getEras();
    this.c = b(((DateFormatSymbols)localObject).getWeekdays());
    this.d = b(((DateFormatSymbols)localObject).getShortWeekdays());
    this.e = a(((DateFormatSymbols)localObject).getMonths());
    this.f = a(((DateFormatSymbols)localObject).getShortMonths());
    this.g = ((DateFormatSymbols)localObject).getAmPmStrings();
    localObject = new Integer[13];
    int i1 = 0;
    while (i1 < 13)
    {
      localObject[i1] = Integer.valueOf(i1);
      i1 += 1;
    }
    this.h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    a(this.h, this.b, (Integer[])localObject);
    if ("en".equals(paramLocale.getLanguage()))
    {
      this.h.put("BCE", localObject[0]);
      this.h.put("CE", localObject[1]);
    }
    this.i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    a(this.i, this.c, (Integer[])localObject);
    a(this.i, this.d, (Integer[])localObject);
    a(this.i, 1, 7, (Integer[])localObject);
    this.j = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    a(this.j, this.e, (Integer[])localObject);
    a(this.j, this.f, (Integer[])localObject);
    a(this.j, 1, 12, (Integer[])localObject);
    this.k = c(this.b);
    this.l = c(this.c);
    this.m = c(this.d);
    this.n = c(this.e);
    this.o = c(this.f);
    this.p = c(this.g);
  }
  
  static p a(Locale paramLocale)
  {
    Locale localLocale = paramLocale;
    if (paramLocale == null) {
      localLocale = Locale.getDefault();
    }
    p localp = (p)a.get(localLocale);
    paramLocale = localp;
    if (localp == null)
    {
      localp = new p(localLocale);
      paramLocale = (p)a.putIfAbsent(localLocale, localp);
      if (paramLocale == null) {}
    }
    else
    {
      return paramLocale;
    }
    return localp;
  }
  
  private static void a(TreeMap<String, Integer> paramTreeMap, int paramInt1, int paramInt2, Integer[] paramArrayOfInteger)
  {
    while (paramInt1 <= paramInt2)
    {
      paramTreeMap.put(String.valueOf(paramInt1).intern(), paramArrayOfInteger[paramInt1]);
      paramInt1 += 1;
    }
  }
  
  private static void a(TreeMap<String, Integer> paramTreeMap, String[] paramArrayOfString, Integer[] paramArrayOfInteger)
  {
    int i1 = paramArrayOfString.length;
    for (;;)
    {
      int i2 = i1 - 1;
      if (i2 < 0) {
        break;
      }
      String str = paramArrayOfString[i2];
      i1 = i2;
      if (str != null)
      {
        paramTreeMap.put(str, paramArrayOfInteger[i2]);
        i1 = i2;
      }
    }
  }
  
  private static String[] a(String[] paramArrayOfString)
  {
    String[] arrayOfString = new String[13];
    int i1 = 1;
    while (i1 < 13)
    {
      arrayOfString[i1] = paramArrayOfString[(i1 - 1)];
      i1 += 1;
    }
    return arrayOfString;
  }
  
  private static String[] b(String[] paramArrayOfString)
  {
    String[] arrayOfString = new String[8];
    int i1 = 1;
    if (i1 < 8)
    {
      if (i1 < 7) {}
      for (int i2 = i1 + 1;; i2 = 1)
      {
        arrayOfString[i1] = paramArrayOfString[i2];
        i1 += 1;
        break;
      }
    }
    return arrayOfString;
  }
  
  private static int c(String[] paramArrayOfString)
  {
    int i1 = 0;
    int i2 = paramArrayOfString.length;
    i2 -= 1;
    if (i2 >= 0)
    {
      String str = paramArrayOfString[i2];
      if (str == null) {
        break label41;
      }
      int i3 = str.length();
      if (i3 <= i1) {
        break label41;
      }
      i1 = i3;
    }
    label41:
    for (;;)
    {
      break;
      return i1;
    }
  }
  
  public int a()
  {
    return this.k;
  }
  
  public int a(String paramString)
  {
    Integer localInteger = (Integer)this.h.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    throw new o(d.w(), paramString);
  }
  
  public String a(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public int b()
  {
    return this.n;
  }
  
  public int b(String paramString)
  {
    Integer localInteger = (Integer)this.j.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    throw new o(d.r(), paramString);
  }
  
  public String b(int paramInt)
  {
    return this.e[paramInt];
  }
  
  public int c()
  {
    return this.l;
  }
  
  public int c(String paramString)
  {
    Integer localInteger = (Integer)this.i.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    throw new o(d.l(), paramString);
  }
  
  public String c(int paramInt)
  {
    return this.f[paramInt];
  }
  
  public int d()
  {
    return this.p;
  }
  
  public int d(String paramString)
  {
    String[] arrayOfString = this.g;
    int i1 = arrayOfString.length;
    int i2;
    do
    {
      i2 = i1 - 1;
      if (i2 < 0) {
        break;
      }
      i1 = i2;
    } while (!arrayOfString[i2].equalsIgnoreCase(paramString));
    return i2;
    throw new o(d.k(), paramString);
  }
  
  public String d(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public String e(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public String f(int paramInt)
  {
    return this.g[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */