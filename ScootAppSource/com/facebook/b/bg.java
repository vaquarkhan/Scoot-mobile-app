package com.facebook.b;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ac;
import com.facebook.o;
import com.facebook.s;

final class bg
  extends WebViewClient
{
  private bg(ba paramba) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    if (!ba.b(this.a)) {
      ba.c(this.a).dismiss();
    }
    ba.d(this.a).setBackgroundColor(0);
    ba.e(this.a).setVisibility(0);
    ba.f(this.a).setVisibility(0);
    ba.a(this.a, true);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    as.a("FacebookSDK.WebDialog", "Webview loading URL: " + paramString);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    if (!ba.b(this.a)) {
      ba.c(this.a).show();
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    this.a.a(new o(paramString1, paramInt, paramString2));
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    paramSslErrorHandler.cancel();
    this.a.a(new o(null, -11, null));
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    boolean bool = false;
    as.a("FacebookSDK.WebDialog", "Redirect URL: " + paramString);
    Bundle localBundle;
    Object localObject;
    if (paramString.startsWith(ba.a(this.a)))
    {
      localBundle = this.a.a(paramString);
      paramWebView = localBundle.getString("error");
      paramString = paramWebView;
      if (paramWebView == null) {
        paramString = localBundle.getString("error_type");
      }
      localObject = localBundle.getString("error_msg");
      paramWebView = (WebView)localObject;
      if (localObject == null) {
        paramWebView = localBundle.getString("error_message");
      }
      localObject = paramWebView;
      if (paramWebView == null) {
        localObject = localBundle.getString("error_description");
      }
      paramWebView = localBundle.getString("error_code");
      if (as.a(paramWebView)) {
        break label311;
      }
    }
    for (;;)
    {
      int i;
      try
      {
        i = Integer.parseInt(paramWebView);
        if ((as.a(paramString)) && (as.a((String)localObject)) && (i == -1))
        {
          this.a.a(localBundle);
          bool = true;
          return bool;
        }
      }
      catch (NumberFormatException paramWebView)
      {
        i = -1;
        continue;
        if ((paramString != null) && ((paramString.equals("access_denied")) || (paramString.equals("OAuthAccessDeniedException"))))
        {
          this.a.cancel();
          continue;
        }
        if (i == 4201)
        {
          this.a.cancel();
          continue;
        }
        paramWebView = new s(i, paramString, (String)localObject);
        this.a.a(new ac(paramWebView, (String)localObject));
        continue;
      }
      if (paramString.startsWith("fbconnect://cancel"))
      {
        this.a.cancel();
        return true;
      }
      if (!paramString.contains("touch"))
      {
        try
        {
          this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
          return true;
        }
        catch (ActivityNotFoundException paramWebView)
        {
          return false;
        }
        label311:
        i = -1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */