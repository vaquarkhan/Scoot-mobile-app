package com.sagar.taxiapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.SwitchCompat;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.parse.ParseObject;
import java.net.MalformedURLException;
import java.net.URL;

final class cp
  extends WebViewClient
{
  cp(MyAccounts paramMyAccounts, Dialog paramDialog) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    MyAccounts.j(this.b).dismiss();
    MyAccounts.k(this.b).setVisibility(0);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      Object localObject = new URL(paramString);
      String str = ((URL)localObject).getRef();
      if (((URL)localObject).toString().equalsIgnoreCase("https://m.olacabs.com/api/signup")) {
        MyAccounts.c(this.b, true);
      }
      if ((str != null) && (str.charAt(0) == 'a'))
      {
        localObject = MyAccounts.a(paramString);
        if (MyAccounts.h(this.b))
        {
          MyAccounts.a(this.b, new ParseObject("olaNewSignups"));
          MyAccounts.i(this.b).put("acess_token", localObject);
          MyAccounts.i(this.b).saveInBackground();
        }
        MyAccounts.e(this.b).putString("access_token", (String)localObject).apply();
        MyAccounts.e(this.b).putBoolean("loggedIn", true).apply();
        MyAccounts.f(this.b).setChecked(true);
        this.a.dismiss();
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        localMalformedURLException.printStackTrace();
      }
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */