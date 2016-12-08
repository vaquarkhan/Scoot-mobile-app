package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public abstract interface DigitsApiClient$DeviceService
{
  @FormUrlEncoded
  @POST("/1.1/device/register.json")
  public abstract void register(@Field("raw_phone_number") String paramString1, @Field("text_key") String paramString2, @Field("send_numeric_pin") Boolean paramBoolean, @Field("lang") String paramString3, @Field("client_identifier_string") String paramString4, @Field("verification_type") String paramString5, f<an> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\DigitsApiClient$DeviceService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */