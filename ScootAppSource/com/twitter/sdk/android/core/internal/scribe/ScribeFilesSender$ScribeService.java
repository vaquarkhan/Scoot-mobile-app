package com.twitter.sdk.android.core.internal.scribe;

import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Path;

abstract interface ScribeFilesSender$ScribeService
{
  @FormUrlEncoded
  @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
  @POST("/{version}/jot/{type}")
  public abstract Response upload(@Path("version") String paramString1, @Path("type") String paramString2, @Field("log[]") String paramString3);
  
  @FormUrlEncoded
  @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
  @POST("/scribe/{sequence}")
  public abstract Response uploadSequence(@Path("sequence") String paramString1, @Field("log[]") String paramString2);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\ScribeFilesSender$ScribeService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */