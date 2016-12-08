package com.payu.custombrowser;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

public final class al
  extends com.payu.magicretry.b.a
{
  private boolean a = true;
  private boolean b = false;
  private String c = "";
  private a d;
  private boolean e;
  
  public al(a parama, com.payu.magicretry.a parama1, String paramString)
  {
    super(parama1);
    this.d = parama;
    this.d.f(paramString);
  }
  
  public void onLoadResource(WebView paramWebView, String paramString)
  {
    if (this.d != null) {
      this.d.d(paramString);
    }
    super.onLoadResource(paramWebView, paramString);
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if (!this.b) {
      this.a = true;
    }
    if (paramString.equals(this.c)) {
      this.a = true;
    }
    for (this.b = false;; this.b = false)
    {
      if (this.d != null)
      {
        this.d.e(paramString);
        if (this.e) {
          this.d.T();
        }
      }
      return;
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    this.a = false;
    if (this.d != null)
    {
      this.d.c(paramString);
      if (this.d.U()) {
        this.e = true;
      }
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    super.onReceivedError(paramWebView, paramWebResourceRequest, paramWebResourceError);
    if (this.d != null) {
      this.d.a();
    }
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (Build.VERSION.SDK_INT <= 10) {
      paramSslErrorHandler.proceed();
    }
    do
    {
      do
      {
        return;
        if (Build.VERSION.SDK_INT < 14) {
          break;
        }
        if (paramSslError.getUrl().contains("https://jsbeasynet.jsbnet.in"))
        {
          paramSslErrorHandler.proceed();
          return;
        }
      } while (this.d == null);
      this.d.a();
      return;
      if (paramSslError.getCertificate().toString().contains("jsbeasynet.jsbnet.in"))
      {
        paramSslErrorHandler.proceed();
        return;
      }
    } while (this.d == null);
    this.d.a();
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    this.c = paramString;
    if (!this.a) {
      this.b = true;
    }
    this.a = false;
    if (this.d != null) {
      this.d.b(paramString);
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */