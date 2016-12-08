package com.squareup.okhttp;

import com.squareup.okhttp.internal.huc.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.huc.HttpsURLConnectionImpl;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public final class OkUrlFactory
  implements Cloneable, URLStreamHandlerFactory
{
  private final OkHttpClient client;
  
  public OkUrlFactory(OkHttpClient paramOkHttpClient)
  {
    this.client = paramOkHttpClient;
  }
  
  public OkHttpClient client()
  {
    return this.client;
  }
  
  public OkUrlFactory clone()
  {
    return new OkUrlFactory(this.client.clone());
  }
  
  public URLStreamHandler createURLStreamHandler(String paramString)
  {
    if ((!paramString.equals("http")) && (!paramString.equals("https"))) {
      return null;
    }
    return new OkUrlFactory.1(this, paramString);
  }
  
  public HttpURLConnection open(URL paramURL)
  {
    return open(paramURL, this.client.getProxy());
  }
  
  HttpURLConnection open(URL paramURL, Proxy paramProxy)
  {
    String str = paramURL.getProtocol();
    OkHttpClient localOkHttpClient = this.client.copyWithDefaults();
    localOkHttpClient.setProxy(paramProxy);
    if (str.equals("http")) {
      return new HttpURLConnectionImpl(paramURL, localOkHttpClient);
    }
    if (str.equals("https")) {
      return new HttpsURLConnectionImpl(paramURL, localOkHttpClient);
    }
    throw new IllegalArgumentException("Unexpected protocol: " + str);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\OkUrlFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */