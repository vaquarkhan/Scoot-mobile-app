package com.digits.sdk.android;

import android.text.TextUtils;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.l;
import java.util.Iterator;
import java.util.List;
import retrofit.client.Header;
import retrofit.client.Response;

public class cb
  extends l<com.twitter.sdk.android.core.c>
{
  public static final ci a = new ci("", false);
  @com.google.a.a.c(a="phone_number")
  private final String b;
  @com.google.a.a.c(a="email")
  private final ci c;
  
  public cb(com.twitter.sdk.android.core.c paramc, long paramLong, String paramString, ci paramci)
  {
    super(paramc, paramLong);
    this.b = paramString;
    this.c = paramci;
  }
  
  public cb(OAuth2Token paramOAuth2Token)
  {
    this(paramOAuth2Token, 0L, "", a);
  }
  
  static cb a(cd paramcd, String paramString)
  {
    if (paramcd == null) {
      throw new NullPointerException("result must not be null");
    }
    if (paramString == null) {
      throw new NullPointerException("phoneNumber must not be null");
    }
    return new cb(new TwitterAuthToken(paramcd.a, paramcd.b), paramcd.d, paramString, a);
  }
  
  public static cb a(eg parameg)
  {
    if (parameg == null) {
      throw new NullPointerException("verifyAccountResponse must not be null");
    }
    TwitterAuthToken localTwitterAuthToken = parameg.a;
    long l = parameg.b;
    String str = parameg.c;
    if (parameg.d != null) {}
    for (parameg = parameg.d;; parameg = a) {
      return new cb(localTwitterAuthToken, l, str, parameg);
    }
  }
  
  static cb a(k<cg> paramk, String paramString)
  {
    if (paramk == null) {
      throw new NullPointerException("result must not be null");
    }
    if (paramk.a == null) {
      throw new NullPointerException("result.data must not be null");
    }
    if (paramk.b == null) {
      throw new NullPointerException("result.response must not be null");
    }
    if (paramString == null) {
      throw new NullPointerException("phoneNumber must not be null");
    }
    Object localObject = paramk.b.getHeaders();
    String str2 = "";
    String str1 = "";
    localObject = ((List)localObject).iterator();
    Header localHeader;
    if (((Iterator)localObject).hasNext())
    {
      localHeader = (Header)((Iterator)localObject).next();
      if ("x-twitter-new-account-oauth-access-token".equals(localHeader.getName()))
      {
        str2 = localHeader.getValue();
        label127:
        if ((TextUtils.isEmpty(str2)) || (TextUtils.isEmpty(str1))) {
          break label194;
        }
      }
    }
    for (;;)
    {
      return new cb(new TwitterAuthToken(str2, str1), ((cg)paramk.a).a, paramString, a);
      if ("x-twitter-new-account-oauth-secret".equals(localHeader.getName()))
      {
        str1 = localHeader.getValue();
        break label127;
        label194:
        break;
      }
      break label127;
    }
  }
  
  private boolean a(long paramLong)
  {
    return (!a()) && (paramLong != -1L);
  }
  
  private boolean a(com.twitter.sdk.android.core.c paramc)
  {
    return ((paramc instanceof TwitterAuthToken)) && (((TwitterAuthToken)paramc).c != null) && (((TwitterAuthToken)paramc).b != null);
  }
  
  public boolean a()
  {
    return e() == 0L;
  }
  
  public boolean b()
  {
    return (a(e())) && (a(d()));
  }
  
  public ci c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool3 = false;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool3;
          } while (paramObject == null);
          bool1 = bool3;
        } while (getClass() != paramObject.getClass());
        bool1 = bool3;
      } while (!super.equals(paramObject));
      paramObject = (cb)paramObject;
      if (this.b == null) {
        break;
      }
      bool1 = bool3;
    } while (!this.b.equals(((cb)paramObject).b));
    if (this.c != null)
    {
      bool1 = bool2;
      if (this.c.equals(((cb)paramObject).c)) {}
    }
    label98:
    for (boolean bool1 = false;; bool1 = bool2)
    {
      return bool1;
      if (((cb)paramObject).b == null) {
        break;
      }
      return false;
      if (((cb)paramObject).c != null) {
        break label98;
      }
    }
  }
  
  public int hashCode()
  {
    int j = 0;
    int k = super.hashCode();
    if (this.b != null) {}
    for (int i = this.b.hashCode();; i = 0)
    {
      if (this.c != null) {
        j = this.c.hashCode();
      }
      return (i + k * 31) * 31 + j;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */