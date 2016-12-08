package com.twitter.sdk.android.core.internal.oauth;

import retrofit.RequestInterceptor;
import retrofit.RequestInterceptor.RequestFacade;

final class k
  implements RequestInterceptor
{
  k(j paramj) {}
  
  public void intercept(RequestInterceptor.RequestFacade paramRequestFacade)
  {
    paramRequestFacade.addHeader("User-Agent", this.a.e());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */