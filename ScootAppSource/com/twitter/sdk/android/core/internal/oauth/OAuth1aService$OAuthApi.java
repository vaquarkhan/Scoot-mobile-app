package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.f;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Query;

abstract interface OAuth1aService$OAuthApi
{
  @POST("/oauth/access_token")
  public abstract void getAccessToken(@Header("Authorization") String paramString1, @Query("oauth_verifier") String paramString2, @Body String paramString3, f<Response> paramf);
  
  @POST("/oauth/request_token")
  public abstract void getTempToken(@Header("Authorization") String paramString1, @Body String paramString2, f<Response> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuth1aService$OAuthApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */