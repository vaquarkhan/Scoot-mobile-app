package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import b.a.a.a.t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.q;

final class a
  implements g
{
  final d a;
  TwitterAuthToken b;
  private final ProgressBar c;
  private final WebView d;
  private final TwitterAuthConfig e;
  private final OAuth1aService f;
  
  a(ProgressBar paramProgressBar, WebView paramWebView, TwitterAuthConfig paramTwitterAuthConfig, OAuth1aService paramOAuth1aService, d paramd)
  {
    this.c = paramProgressBar;
    this.d = paramWebView;
    this.e = paramTwitterAuthConfig;
    this.f = paramOAuth1aService;
    this.a = paramd;
  }
  
  private void b(Bundle paramBundle)
  {
    b.a.a.a.f.h().a("Twitter", "OAuth web view completed successfully");
    if (paramBundle != null)
    {
      String str = paramBundle.getString("oauth_verifier");
      if (str != null)
      {
        b.a.a.a.f.h().a("Twitter", "Converting the request token to an access token.");
        this.f.a(c(), this.b, str);
        return;
      }
    }
    b.a.a.a.f.h().e("Twitter", "Failed to get authorization, bundle incomplete " + paramBundle, null);
    a(1, new q("Failed to get authorization, bundle incomplete"));
  }
  
  private void b(j paramj)
  {
    b.a.a.a.f.h().e("Twitter", "OAuth web view completed with an error", paramj);
    a(1, new q("OAuth web view completed with an error"));
  }
  
  private void d()
  {
    this.d.stopLoading();
    e();
  }
  
  private void e()
  {
    this.c.setVisibility(8);
  }
  
  void a()
  {
    b.a.a.a.f.h().a("Twitter", "Obtaining request token to start the sign in flow");
    this.f.a(b());
  }
  
  protected void a(int paramInt, q paramq)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("auth_error", paramq);
    this.a.a(paramInt, localIntent);
  }
  
  public void a(Bundle paramBundle)
  {
    b(paramBundle);
    d();
  }
  
  void a(WebView paramWebView, WebViewClient paramWebViewClient, String paramString, WebChromeClient paramWebChromeClient)
  {
    WebSettings localWebSettings = paramWebView.getSettings();
    localWebSettings.setAllowFileAccess(false);
    localWebSettings.setJavaScriptEnabled(false);
    localWebSettings.setSaveFormData(false);
    paramWebView.setVerticalScrollBarEnabled(false);
    paramWebView.setHorizontalScrollBarEnabled(false);
    paramWebView.setWebViewClient(paramWebViewClient);
    paramWebView.loadUrl(paramString);
    paramWebView.setVisibility(4);
    paramWebView.setWebChromeClient(paramWebChromeClient);
  }
  
  public void a(WebView paramWebView, String paramString)
  {
    e();
    paramWebView.setVisibility(0);
  }
  
  public void a(j paramj)
  {
    b(paramj);
    d();
  }
  
  com.twitter.sdk.android.core.f<OAuthResponse> b()
  {
    return new b(this);
  }
  
  com.twitter.sdk.android.core.f<OAuthResponse> c()
  {
    return new c(this);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */