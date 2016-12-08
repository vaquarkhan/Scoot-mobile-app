package com.squareup.okhttp;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class OkUrlFactory$1
  extends URLStreamHandler
{
  OkUrlFactory$1(OkUrlFactory paramOkUrlFactory, String paramString) {}
  
  protected int getDefaultPort()
  {
    if (this.val$protocol.equals("http")) {
      return 80;
    }
    if (this.val$protocol.equals("https")) {
      return 443;
    }
    throw new AssertionError();
  }
  
  protected URLConnection openConnection(URL paramURL)
  {
    return this.this$0.open(paramURL);
  }
  
  protected URLConnection openConnection(URL paramURL, Proxy paramProxy)
  {
    return this.this$0.open(paramURL, paramProxy);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\OkUrlFactory$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */