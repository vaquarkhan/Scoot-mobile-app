package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import retrofit.http.GET;

public abstract interface DigitsApiClient$AccountService
{
  @GET("/1.1/sdk/account.json")
  public abstract void verifyAccount(f<eg> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\DigitsApiClient$AccountService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */