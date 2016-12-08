package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.f;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.POST;

abstract interface OAuth2Service$OAuth2Api
{
  @FormUrlEncoded
  @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
  @POST("/oauth2/token")
  public abstract void getAppAuthToken(@Header("Authorization") String paramString1, @Field("grant_type") String paramString2, f<AppAuthToken> paramf);
  
  @POST("/1.1/guest/activate.json")
  public abstract void getGuestToken(@Header("Authorization") String paramString1, @Body String paramString2, f<b> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuth2Service$OAuth2Api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */