package com.digits.sdk.android;

import retrofit.RequestInterceptor;
import retrofit.RequestInterceptor.RequestFacade;

final class bv
  implements RequestInterceptor
{
  private final ch a;
  
  public bv(ch paramch)
  {
    this.a = paramch;
  }
  
  public void intercept(RequestInterceptor.RequestFacade paramRequestFacade)
  {
    paramRequestFacade.addHeader("User-Agent", this.a.toString());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */