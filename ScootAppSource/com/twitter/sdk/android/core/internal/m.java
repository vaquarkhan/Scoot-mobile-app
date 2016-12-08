package com.twitter.sdk.android.core.internal;

import android.text.TextUtils;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.c;
import com.twitter.sdk.android.core.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class m
{
  private final String a;
  private final String b;
  private final Map<String, String> c;
  private final TwitterAuthConfig d;
  private final l e;
  private final String f;
  
  public m(String paramString1, String paramString2, TwitterAuthConfig paramTwitterAuthConfig, l paraml, String paramString3, Map<String, String> paramMap)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramTwitterAuthConfig;
    this.e = paraml;
    this.f = paramString3;
    this.c = paramMap;
  }
  
  public final Map<String, String> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(b());
    if (!TextUtils.isEmpty(this.f)) {
      localHashMap.put("User-Agent", this.f);
    }
    localHashMap.putAll(c());
    return localHashMap;
  }
  
  protected Map<String, String> b()
  {
    return Collections.emptyMap();
  }
  
  public Map<String, String> c()
  {
    if ((this.e != null) && (this.e.d() != null)) {
      return this.e.d().a(this.d, d(), this.b, e());
    }
    return Collections.emptyMap();
  }
  
  protected String d()
  {
    return this.a;
  }
  
  protected Map<String, String> e()
  {
    return this.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */