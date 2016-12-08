package com.twitter.sdk.android.core;

import com.google.a.ac;
import com.google.a.ad;
import com.google.a.ae;
import com.google.a.k;
import com.google.a.u;
import com.google.a.v;
import com.google.a.w;
import com.google.a.z;
import com.twitter.sdk.android.core.internal.oauth.AppAuthToken;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  implements ae<c>, v<c>
{
  static final Map<String, Class<? extends c>> a = new HashMap();
  private final k b = new k();
  
  static
  {
    a.put("oauth1a", TwitterAuthToken.class);
    a.put("oauth2", OAuth2Token.class);
    a.put("guest", GuestAuthToken.class);
    a.put("app", AppAuthToken.class);
  }
  
  static String a(Class<? extends c> paramClass)
  {
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Class)localEntry.getValue()).equals(paramClass)) {
        return (String)localEntry.getKey();
      }
    }
    return "";
  }
  
  public w a(c paramc, Type paramType, ad paramad)
  {
    paramType = new z();
    paramType.a("auth_type", a(paramc.getClass()));
    paramType.a("auth_token", this.b.a(paramc));
    return paramType;
  }
  
  public c a(w paramw, Type paramType, u paramu)
  {
    paramType = paramw.k();
    paramw = paramType.b("auth_type").b();
    paramType = paramType.a("auth_token");
    return (c)this.b.a(paramType, (Class)a.get(paramw));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */