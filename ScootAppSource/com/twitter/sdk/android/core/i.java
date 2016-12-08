package com.twitter.sdk.android.core;

import java.net.HttpURLConnection;
import retrofit.client.Request;
import retrofit.client.UrlConnectionClient;

final class i
  extends UrlConnectionClient
{
  i(g paramg) {}
  
  protected HttpURLConnection openConnection(Request paramRequest)
  {
    return this.a.a(super.openConnection(paramRequest));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */