package com.google.a;

import java.util.Map.Entry;
import java.util.Set;

public final class z
  extends w
{
  private final com.google.a.b.w<String, w> a = new com.google.a.b.w();
  
  private w a(Object paramObject)
  {
    if (paramObject == null) {
      return y.a;
    }
    return new ac(paramObject);
  }
  
  public w a(String paramString)
  {
    return (w)this.a.get(paramString);
  }
  
  public void a(String paramString, w paramw)
  {
    Object localObject = paramw;
    if (paramw == null) {
      localObject = y.a;
    }
    this.a.put(paramString, localObject);
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, a(paramString2));
  }
  
  public ac b(String paramString)
  {
    return (ac)this.a.get(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof z)) && (((z)paramObject).a.equals(this.a)));
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public Set<Map.Entry<String, w>> o()
  {
    return this.a.entrySet();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */