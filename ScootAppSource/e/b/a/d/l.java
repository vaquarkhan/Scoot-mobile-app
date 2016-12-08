package e.b.a.d;

import e.b.a.a;
import e.b.a.c;
import e.b.a.d;
import e.b.a.i;
import e.b.a.t;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class l
  implements ab, ad
{
  private static Map<Locale, Map<d, Object[]>> a = new ConcurrentHashMap();
  private final d b;
  private final boolean c;
  
  l(d paramd, boolean paramBoolean)
  {
    this.b = paramd;
    this.c = paramBoolean;
  }
  
  private String a(long paramLong, a parama, Locale paramLocale)
  {
    parama = this.b.a(parama);
    if (this.c) {
      return parama.b(paramLong, paramLocale);
    }
    return parama.a(paramLong, paramLocale);
  }
  
  public int a()
  {
    if (this.c) {
      return 6;
    }
    return 20;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    Locale localLocale = params.b();
    Object localObject1 = (Map)a.get(localLocale);
    if (localObject1 == null)
    {
      localObject1 = new ConcurrentHashMap();
      a.put(localLocale, localObject1);
    }
    for (;;)
    {
      Object localObject2 = (Object[])((Map)localObject1).get(this.b);
      int i;
      if (localObject2 == null)
      {
        localObject2 = new ConcurrentHashMap(32);
        t localt = new e.b.a.s(0L, i.a).a(this.b);
        i = localt.g();
        int k = localt.h();
        if (k - i > 32) {
          return paramInt ^ 0xFFFFFFFF;
        }
        int j = localt.c(localLocale);
        while (i <= k)
        {
          localt.a(i);
          ((Map)localObject2).put(localt.b(localLocale), Boolean.TRUE);
          ((Map)localObject2).put(localt.b(localLocale).toLowerCase(localLocale), Boolean.TRUE);
          ((Map)localObject2).put(localt.b(localLocale).toUpperCase(localLocale), Boolean.TRUE);
          ((Map)localObject2).put(localt.a(localLocale), Boolean.TRUE);
          ((Map)localObject2).put(localt.a(localLocale).toLowerCase(localLocale), Boolean.TRUE);
          ((Map)localObject2).put(localt.a(localLocale).toUpperCase(localLocale), Boolean.TRUE);
          i += 1;
        }
        i = j;
        if ("en".equals(localLocale.getLanguage()))
        {
          i = j;
          if (this.b == d.w())
          {
            ((Map)localObject2).put("BCE", Boolean.TRUE);
            ((Map)localObject2).put("bce", Boolean.TRUE);
            ((Map)localObject2).put("CE", Boolean.TRUE);
            ((Map)localObject2).put("ce", Boolean.TRUE);
            i = 3;
          }
        }
        ((Map)localObject1).put(this.b, new Object[] { localObject2, Integer.valueOf(i) });
        localObject1 = localObject2;
        i = Math.min(paramCharSequence.length(), i + paramInt);
      }
      for (;;)
      {
        if (i <= paramInt) {
          break label503;
        }
        localObject2 = paramCharSequence.subSequence(paramInt, i).toString();
        if (((Map)localObject1).containsKey(localObject2))
        {
          params.a(this.b, (String)localObject2, localLocale);
          return i;
          localObject1 = (Map)localObject2[0];
          i = ((Integer)localObject2[1]).intValue();
          break;
        }
        i -= 1;
      }
      label503:
      return paramInt ^ 0xFFFFFFFF;
    }
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    try
    {
      paramAppendable.append(a(paramLong, parama, paramLocale));
      return;
    }
    catch (RuntimeException parama)
    {
      paramAppendable.append(65533);
    }
  }
  
  public int b()
  {
    return a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */