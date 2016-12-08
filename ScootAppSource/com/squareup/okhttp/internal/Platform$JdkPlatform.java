package com.squareup.okhttp.internal;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

class Platform$JdkPlatform
  extends Platform
{
  private final Class<?> sslContextClass;
  
  public Platform$JdkPlatform(Class<?> paramClass)
  {
    this.sslContextClass = paramClass;
  }
  
  public X509TrustManager trustManager(SSLSocketFactory paramSSLSocketFactory)
  {
    paramSSLSocketFactory = readFieldOrNull(paramSSLSocketFactory, this.sslContextClass, "context");
    if (paramSSLSocketFactory == null) {
      return null;
    }
    return (X509TrustManager)readFieldOrNull(paramSSLSocketFactory, X509TrustManager.class, "trustManager");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\Platform$JdkPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */