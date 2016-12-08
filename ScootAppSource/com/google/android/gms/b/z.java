package com.google.android.gms.b;

import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class z
  extends ab<z>
{
  private final List<a> a = new ArrayList();
  private final List<c> b = new ArrayList();
  private final Map<String, List<a>> c = new HashMap();
  private b d;
  
  public b a()
  {
    return this.d;
  }
  
  public void a(a parama, String paramString)
  {
    if (parama == null) {
      return;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (!this.c.containsKey(str)) {
      this.c.put(str, new ArrayList());
    }
    ((List)this.c.get(str)).add(parama);
  }
  
  public void a(z paramz)
  {
    paramz.a.addAll(this.a);
    paramz.b.addAll(this.b);
    Iterator localIterator = this.c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((List)((Map.Entry)localObject).getValue()).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramz.a((a)((Iterator)localObject).next(), str);
      }
    }
    if (this.d != null) {
      paramz.d = this.d;
    }
  }
  
  public List<a> b()
  {
    return Collections.unmodifiableList(this.a);
  }
  
  public Map<String, List<a>> c()
  {
    return this.c;
  }
  
  public List<c> d()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!this.a.isEmpty()) {
      localHashMap.put("products", this.a);
    }
    if (!this.b.isEmpty()) {
      localHashMap.put("promotions", this.b);
    }
    if (!this.c.isEmpty()) {
      localHashMap.put("impressions", this.c);
    }
    localHashMap.put("productAction", this.d);
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */