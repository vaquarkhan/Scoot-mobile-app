package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ab
  extends com.google.android.gms.analytics.ab<ab>
{
  public String a;
  public boolean b;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(ab paramab)
  {
    if (!TextUtils.isEmpty(this.a)) {
      paramab.a(this.a);
    }
    if (this.b) {
      paramab.a(this.b);
    }
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", this.a);
    localHashMap.put("fatal", Boolean.valueOf(this.b));
    return a(localHashMap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */