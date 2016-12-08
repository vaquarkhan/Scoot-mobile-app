package com.twitter.sdk.android.core.internal.oauth;

import b.a.a.a.a.e.g;
import b.a.a.a.a.e.s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.t;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;

public final class OAuth2Service
  extends j
{
  OAuth2Service.OAuth2Api a = (OAuth2Service.OAuth2Api)f().create(OAuth2Service.OAuth2Api.class);
  
  public OAuth2Service(t paramt, SSLSocketFactory paramSSLSocketFactory, l paraml)
  {
    super(paramt, paramSSLSocketFactory, paraml);
  }
  
  private String a()
  {
    TwitterAuthConfig localTwitterAuthConfig = c().f();
    return "Basic " + g.a(new StringBuilder().append(s.c(localTwitterAuthConfig.a())).append(":").append(s.c(localTwitterAuthConfig.b())).toString());
  }
  
  public static String a(OAuth2Token paramOAuth2Token)
  {
    return "Bearer " + paramOAuth2Token.d();
  }
  
  public void a(com.twitter.sdk.android.core.f<OAuth2Token> paramf)
  {
    b(new f(this, paramf));
  }
  
  public void a(com.twitter.sdk.android.core.f<b> paramf, OAuth2Token paramOAuth2Token)
  {
    this.a.getGuestToken(a(paramOAuth2Token), "", paramf);
  }
  
  public void b(com.twitter.sdk.android.core.f<AppAuthToken> paramf)
  {
    this.a.getAppAuthToken(a(), "client_credentials", paramf);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuth2Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */