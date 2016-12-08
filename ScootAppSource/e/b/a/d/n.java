package e.b.a.d;

import e.b.a.a;
import e.b.a.f;
import e.b.a.i;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class n
  implements ab, ad
{
  private final Map<String, i> a;
  private final int b;
  
  n(int paramInt, Map<String, i> paramMap)
  {
    this.b = paramInt;
    this.a = paramMap;
  }
  
  private String a(long paramLong, i parami, Locale paramLocale)
  {
    if (parami == null) {
      return "";
    }
    switch (this.b)
    {
    default: 
      return "";
    case 0: 
      return parami.b(paramLong, paramLocale);
    }
    return parami.a(paramLong, paramLocale);
  }
  
  public int a()
  {
    if (this.b == 1) {
      return 4;
    }
    return 20;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    Map localMap = this.a;
    Object localObject1;
    label28:
    String str;
    if (localMap != null)
    {
      localObject1 = null;
      Iterator localIterator = localMap.keySet().iterator();
      if (!localIterator.hasNext()) {
        break label101;
      }
      str = (String)localIterator.next();
      if (!c.b(paramCharSequence, paramInt, str)) {
        break label134;
      }
      localObject2 = str;
      if (localObject1 != null) {
        if (str.length() <= ((String)localObject1).length()) {
          break label134;
        }
      }
    }
    label101:
    label134:
    for (Object localObject2 = str;; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break label28;
      localMap = f.b();
      break;
      if (localObject1 != null)
      {
        params.a((i)localMap.get(localObject1));
        return ((String)localObject1).length() + paramInt;
      }
      return paramInt ^ 0xFFFFFFFF;
    }
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    paramAppendable.append(a(paramLong - paramInt, parami, paramLocale));
  }
  
  public int b()
  {
    if (this.b == 1) {
      return 4;
    }
    return 20;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */