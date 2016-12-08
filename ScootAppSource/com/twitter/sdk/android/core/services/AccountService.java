package com.twitter.sdk.android.core.services;

import retrofit.http.GET;
import retrofit.http.Query;

public abstract interface AccountService
{
  @GET("/1.1/account/verify_credentials.json")
  public abstract com.twitter.sdk.android.core.a.f verifyCredentials(@Query("include_entities") Boolean paramBoolean1, @Query("skip_status") Boolean paramBoolean2);
  
  @GET("/1.1/account/verify_credentials.json")
  public abstract void verifyCredentials(@Query("include_entities") Boolean paramBoolean1, @Query("skip_status") Boolean paramBoolean2, com.twitter.sdk.android.core.f<com.twitter.sdk.android.core.a.f> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\AccountService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */