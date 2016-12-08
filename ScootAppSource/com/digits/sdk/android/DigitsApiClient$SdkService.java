package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public abstract interface DigitsApiClient$SdkService
{
  @FormUrlEncoded
  @POST("/1.1/sdk/account.json")
  public abstract void account(@Field("phone_number") String paramString1, @Field("numeric_pin") String paramString2, f<cg> paramf);
  
  @FormUrlEncoded
  @POST("/1/sdk/login")
  public abstract void auth(@Field("x_auth_phone_number") String paramString1, @Field("verification_type") String paramString2, @Field("lang") String paramString3, f<i> paramf);
  
  @FormUrlEncoded
  @POST("/1.1/sdk/account/email")
  public abstract void email(@Field("email_address") String paramString, f<cd> paramf);
  
  @FormUrlEncoded
  @POST("/auth/1/xauth_challenge.json")
  public abstract void login(@Field("login_verification_request_id") String paramString1, @Field("login_verification_user_id") long paramLong, @Field("login_verification_challenge_response") String paramString2, f<cd> paramf);
  
  @FormUrlEncoded
  @POST("/auth/1/xauth_pin.json")
  public abstract void verifyPin(@Field("login_verification_request_id") String paramString1, @Field("login_verification_user_id") long paramLong, @Field("pin") String paramString2, f<cd> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\DigitsApiClient$SdkService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */