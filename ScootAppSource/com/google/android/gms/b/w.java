package com.google.android.gms.b;

import com.google.android.gms.analytics.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class w
  extends ab<w>
{
  private Map<Integer, Double> a = new HashMap(4);
  
  public Map<Integer, Double> a()
  {
    return Collections.unmodifiableMap(this.a);
  }
  
  public void a(w paramw)
  {
    paramw.a.putAll(this.a);
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = String.valueOf(localEntry.getKey());
      localHashMap.put(String.valueOf(str).length() + 6 + "metric" + str, localEntry.getValue());
    }
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */