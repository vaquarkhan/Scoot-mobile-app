package com.google.android.gms.b;

import com.google.android.gms.analytics.ab;
import com.google.android.gms.common.internal.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class x
  extends ab<x>
{
  private final Map<String, Object> a = new HashMap();
  
  private String a(String paramString)
  {
    b.a(paramString);
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.startsWith("&")) {
        str = paramString.substring(1);
      }
    }
    b.a(str, "Name can not be empty or \"&\"");
    return str;
  }
  
  public Map<String, Object> a()
  {
    return Collections.unmodifiableMap(this.a);
  }
  
  public void a(x paramx)
  {
    b.a(paramx);
    paramx.a.putAll(this.a);
  }
  
  public void a(String paramString1, String paramString2)
  {
    paramString1 = a(paramString1);
    this.a.put(paramString1, paramString2);
  }
  
  public String toString()
  {
    return a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */