package com.twitter.sdk.android.core.identity;

import retrofit.http.GET;
import retrofit.http.Query;

abstract interface ShareEmailClient$EmailService
{
  @GET("/1.1/account/verify_credentials.json?include_email=true")
  public abstract void verifyCredentials(@Query("include_entities") Boolean paramBoolean1, @Query("skip_status") Boolean paramBoolean2, com.twitter.sdk.android.core.f<com.twitter.sdk.android.core.a.f> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\ShareEmailClient$EmailService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */