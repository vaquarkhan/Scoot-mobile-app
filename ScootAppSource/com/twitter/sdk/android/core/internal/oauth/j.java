package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.g;
import com.twitter.sdk.android.core.internal.l;
import com.twitter.sdk.android.core.t;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.RestAdapter.Builder;

abstract class j
{
  private final t a;
  private final l b;
  private final String c;
  private final RestAdapter d;
  
  public j(t paramt, SSLSocketFactory paramSSLSocketFactory, l paraml)
  {
    this.a = paramt;
    this.b = paraml;
    this.c = l.a("TwitterAndroidSDK", paramt.a());
    if (paramSSLSocketFactory == null) {
      throw new IllegalArgumentException("sslSocketFactory must not be null");
    }
    this.d = new RestAdapter.Builder().setEndpoint(d().a()).setClient(new g(paramSSLSocketFactory)).setRequestInterceptor(new k(this)).build();
  }
  
  protected t c()
  {
    return this.a;
  }
  
  protected l d()
  {
    return this.b;
  }
  
  protected String e()
  {
    return this.c;
  }
  
  protected RestAdapter f()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */