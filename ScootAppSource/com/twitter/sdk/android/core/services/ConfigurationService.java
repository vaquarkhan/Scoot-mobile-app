package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import retrofit.http.GET;

public abstract interface ConfigurationService
{
  @GET("/1.1/help/configuration.json")
  public abstract void configuration(f<Object> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\ConfigurationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */