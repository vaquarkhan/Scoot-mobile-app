package com.payu.magicretry.b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Message;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class a
  extends WebViewClient
{
  private com.payu.magicretry.a a;
  
  public a(com.payu.magicretry.a parama)
  {
    this.a = parama;
  }
  
  public void onFormResubmission(WebView paramWebView, Message paramMessage1, Message paramMessage2)
  {
    paramMessage2.sendToTarget();
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    com.payu.magicretry.a.a.a("#### PAYU", "MagicRetryWebViewClient.java: onPageFinished: URL " + paramString);
    super.onPageFinished(paramWebView, paramString);
    if (this.a != null) {
      this.a.b(paramWebView, paramString);
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    com.payu.magicretry.a.a.a("#### PAYU", "MagicRetryWebViewClient.java: onPageStarted: URL " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    if (this.a != null) {
      this.a.a(paramWebView, paramString);
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    com.payu.magicretry.a.a.a("#### PAYU", "MagicRetryWebViewClient.java: onReceivedError: URL " + paramWebView.getUrl());
    if ((Build.VERSION.SDK_INT < 23) && (this.a != null)) {
      this.a.c(paramWebView, paramString2);
    }
  }
  
  public void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    super.onReceivedError(paramWebView, paramWebResourceRequest, paramWebResourceError);
    com.payu.magicretry.a.a.a("#### PAYU", "MagicRetryWebViewClient.java: onReceivedError: URL " + paramWebView.getUrl());
    if ((this.a != null) && (paramWebResourceRequest.isForMainFrame())) {
      this.a.c(paramWebView, paramWebResourceRequest.getUrl().toString());
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    com.payu.magicretry.a.a.a("#### PAYU", "MagicRetryWebViewClient.java: shouldOverrideUrlLoading: URL " + paramString);
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */