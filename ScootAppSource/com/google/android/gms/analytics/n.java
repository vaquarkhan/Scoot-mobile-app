package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class n<T extends n>
{
  b a;
  Map<String, List<a>> b = new HashMap();
  List<c> c = new ArrayList();
  List<a> d = new ArrayList();
  private Map<String, String> e = new HashMap();
  
  public final T a(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      this.e.put(paramString1, paramString2);
      return this;
    }
    i.c("HitBuilder.set() called with a null paramName.");
    return this;
  }
  
  public Map<String, String> a()
  {
    HashMap localHashMap = new HashMap(this.e);
    if (this.a != null) {
      localHashMap.putAll(this.a.a());
    }
    Object localObject = this.c.iterator();
    int i = 1;
    while (((Iterator)localObject).hasNext())
    {
      localHashMap.putAll(((c)((Iterator)localObject).next()).a(w.e(i)));
      i += 1;
    }
    localObject = this.d.iterator();
    i = 1;
    while (((Iterator)localObject).hasNext())
    {
      localHashMap.putAll(((a)((Iterator)localObject).next()).a(w.c(i)));
      i += 1;
    }
    Iterator localIterator1 = this.b.entrySet().iterator();
    i = 1;
    if (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      localObject = (List)localEntry.getValue();
      String str1 = w.h(i);
      Iterator localIterator2 = ((List)localObject).iterator();
      int j = 1;
      if (localIterator2.hasNext())
      {
        a locala = (a)localIterator2.next();
        localObject = String.valueOf(str1);
        String str2 = String.valueOf(w.g(j));
        if (str2.length() != 0) {}
        for (localObject = ((String)localObject).concat(str2);; localObject = new String((String)localObject))
        {
          localHashMap.putAll(locala.a((String)localObject));
          j += 1;
          break;
        }
      }
      if (!TextUtils.isEmpty((CharSequence)localEntry.getKey()))
      {
        localObject = String.valueOf(str1);
        str1 = String.valueOf("nm");
        if (str1.length() == 0) {
          break label357;
        }
      }
      label357:
      for (localObject = ((String)localObject).concat(str1);; localObject = new String((String)localObject))
      {
        localHashMap.put(localObject, (String)localEntry.getKey());
        i += 1;
        break;
      }
    }
    return localHashMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */