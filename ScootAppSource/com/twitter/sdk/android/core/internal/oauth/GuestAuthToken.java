package com.twitter.sdk.android.core.internal.oauth;

import com.google.a.a.c;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.Map;

public class GuestAuthToken
  extends OAuth2Token
{
  @c(a="guest_token")
  private final String b;
  
  public GuestAuthToken(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1, paramString2);
    this.b = paramString3;
  }
  
  public Map<String, String> a(TwitterAuthConfig paramTwitterAuthConfig, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    paramTwitterAuthConfig = super.a(paramTwitterAuthConfig, paramString1, paramString2, paramMap);
    paramTwitterAuthConfig.put("x-guest-token", b());
    return paramTwitterAuthConfig;
  }
  
  public boolean a()
  {
    return System.currentTimeMillis() >= this.a + 10800000L;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (GuestAuthToken)paramObject;
      if (this.b == null) {
        break;
      }
    } while (this.b.equals(((GuestAuthToken)paramObject).b));
    for (;;)
    {
      return false;
      if (((GuestAuthToken)paramObject).b == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int j = super.hashCode();
    if (this.b != null) {}
    for (int i = this.b.hashCode();; i = 0) {
      return i + j * 31;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\GuestAuthToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */