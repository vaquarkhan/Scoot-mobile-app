package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import android.net.Uri.Builder;
import b.a.a.a.a.e.s;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.t;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.client.Response;

public final class OAuth1aService
  extends j
{
  OAuth1aService.OAuthApi a = (OAuth1aService.OAuthApi)f().create(OAuth1aService.OAuthApi.class);
  
  public OAuth1aService(t paramt, SSLSocketFactory paramSSLSocketFactory, l paraml)
  {
    super(paramt, paramSSLSocketFactory, paraml);
  }
  
  public static OAuthResponse a(String paramString)
  {
    paramString = s.a(paramString, false);
    String str1 = (String)paramString.get("oauth_token");
    String str2 = (String)paramString.get("oauth_token_secret");
    String str3 = (String)paramString.get("screen_name");
    if (paramString.containsKey("user_id")) {}
    for (long l = Long.parseLong((String)paramString.get("user_id")); (str1 == null) || (str2 == null); l = 0L) {
      return null;
    }
    return new OAuthResponse(new TwitterAuthToken(str1, str2), str3, l);
  }
  
  String a()
  {
    return d().a() + "/oauth/request_token";
  }
  
  public String a(TwitterAuthConfig paramTwitterAuthConfig)
  {
    return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", c().a()).appendQueryParameter("app", paramTwitterAuthConfig.a()).build().toString();
  }
  
  public String a(TwitterAuthToken paramTwitterAuthToken)
  {
    return d().a(new String[] { "oauth", "authorize" }).appendQueryParameter("oauth_token", paramTwitterAuthToken.b).build().toString();
  }
  
  public void a(f<OAuthResponse> paramf)
  {
    TwitterAuthConfig localTwitterAuthConfig = c().f();
    String str = a();
    this.a.getTempToken(new c().a(localTwitterAuthConfig, null, a(localTwitterAuthConfig), "POST", str, null), "", b(paramf));
  }
  
  public void a(f<OAuthResponse> paramf, TwitterAuthToken paramTwitterAuthToken, String paramString)
  {
    String str = b();
    paramTwitterAuthToken = new c().a(c().f(), paramTwitterAuthToken, null, "POST", str, null);
    this.a.getAccessToken(paramTwitterAuthToken, paramString, "", b(paramf));
  }
  
  f<Response> b(f<OAuthResponse> paramf)
  {
    return new e(this, paramf);
  }
  
  String b()
  {
    return d().a() + "/oauth/access_token";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuth1aService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */