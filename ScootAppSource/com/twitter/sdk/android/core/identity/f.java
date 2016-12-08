package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.a.a.a.a.e.s;
import java.net.URI;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class f
  extends WebViewClient
{
  private final String a;
  private final g b;
  
  public f(String paramString, g paramg)
  {
    this.a = paramString;
    this.b = paramg;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    this.b.a(paramWebView, paramString);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    this.b.a(new j(paramInt, paramString1, paramString2));
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    this.b.a(new j(paramSslError.getPrimaryError(), null, null));
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.startsWith(this.a))
    {
      paramString = s.a(URI.create(paramString), false);
      paramWebView = new Bundle(paramString.size());
      paramString = paramString.entrySet().iterator();
      while (paramString.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramString.next();
        paramWebView.putString((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      this.b.a(paramWebView);
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */