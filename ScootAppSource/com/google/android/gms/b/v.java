package com.google.android.gms.b;

import com.google.android.gms.analytics.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class v
  extends ab<v>
{
  private Map<Integer, String> a = new HashMap(4);
  
  public Map<Integer, String> a()
  {
    return Collections.unmodifiableMap(this.a);
  }
  
  public void a(v paramv)
  {
    paramv.a.putAll(this.a);
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = String.valueOf(localEntry.getKey());
      localHashMap.put(String.valueOf(str).length() + 9 + "dimension" + str, localEntry.getValue());
    }
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */