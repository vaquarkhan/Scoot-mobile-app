package com.scootapp.olamoneyui;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URLEncoder;

public class OlaMoneyBaseActivity
  extends ah
{
  private String m;
  
  private boolean l()
  {
    try
    {
      getPackageManager().getApplicationInfo("com.test.olacabs", 0);
      return true;
    }
    catch (Exception localException)
    {
      Log.e(OlaMoneyBaseActivity.class.getName(), String.format("Exception occured in %s : %s", new Object[] { "checkOlaCabs()", localException }));
    }
    return false;
  }
  
  @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
  private void m()
  {
    WebView localWebView = (WebView)findViewById(R.id.webview);
    try
    {
      StringBuilder localStringBuilder = new StringBuilder("http://sandbox.olamoney.com/olamoney/webview/index.html");
      String str = Base64.encodeToString(this.m.getBytes(), 0);
      localStringBuilder.append("?bill=").append(str);
      localStringBuilder.append("&phone=").append(URLEncoder.encode("7875432991", "UTF-8"));
      localWebView.getSettings().setJavaScriptEnabled(true);
      localWebView.setWebViewClient(new WebViewClient());
      localWebView.loadUrl(localStringBuilder.toString());
      localWebView.addJavascriptInterface(new a(this), "OlaMoney");
      return;
    }
    catch (Exception localException)
    {
      Log.e(OlaMoneyBaseActivity.class.getName(), String.format("Exception occured in %s : %s", new Object[] { "setupOlaMoneyWebView()", localException }));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt2)
    {
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.activity_ola_money_base);
    if (l()) {
      try
      {
        paramBundle = new Intent("com.olacabs.olamoney.pay");
        paramBundle.setFlags(8388608);
        paramBundle.putExtra("bill", this.m);
        paramBundle.setPackage("com.test.olacabs");
        startActivityForResult(paramBundle, 1011);
        return;
      }
      catch (ActivityNotFoundException paramBundle)
      {
        Log.e(OlaMoneyBaseActivity.class.getName(), String.format("Exception occured in %s : %s", new Object[] { "onCreate()", paramBundle }));
        m();
        return;
      }
    }
    m();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\olamoneyui\OlaMoneyBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */