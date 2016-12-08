package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

 enum m
  implements ab, ad
{
  static final int b;
  private static final List<String> c;
  
  static
  {
    c = new ArrayList(i.b());
    Collections.sort(c);
    Iterator localIterator = c.iterator();
    for (int i = 0; localIterator.hasNext(); i = Math.max(i, ((String)localIterator.next()).length())) {}
    b = i;
  }
  
  private m() {}
  
  private static int a(CharSequence paramCharSequence, int paramInt)
  {
    int i = 0;
    int j = c.size() - 1;
    int k = i;
    if (i <= j)
    {
      k = i + j >>> 1;
      int m = c.a(paramCharSequence, paramInt, (String)c.get(k));
      if (m > 0)
      {
        k -= 1;
        j = i;
        i = k;
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        break;
        if (m >= 0) {
          break label94;
        }
        k += 1;
        i = j;
        j = k;
      }
    }
    label94:
    return k;
  }
  
  public int a()
  {
    return b;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    Object localObject1 = null;
    int i = a(paramCharSequence, paramInt);
    String str;
    if (i < c.size())
    {
      str = (String)c.get(i);
      if (c.b(paramCharSequence, paramInt, str))
      {
        localObject2 = str;
        if (localObject1 != null) {
          if (str.length() <= ((String)localObject1).length()) {
            break label113;
          }
        }
      }
    }
    label113:
    for (Object localObject2 = str;; localObject2 = localObject1)
    {
      i += 1;
      localObject1 = localObject2;
      break;
      if (localObject1 != null)
      {
        params.a(i.a((String)localObject1));
        return ((String)localObject1).length() + paramInt;
      }
      return paramInt ^ 0xFFFFFFFF;
    }
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    if (parami != null) {}
    for (parama = parami.e();; parama = "")
    {
      paramAppendable.append(parama);
      return;
    }
  }
  
  public int b()
  {
    return b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */