package com.tushar.taxiapp.scootapp;

import android.app.ProgressDialog;
import android.content.SharedPreferences.Editor;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.parse.ParseObject;
import java.net.MalformedURLException;
import java.net.URL;

final class ab
  extends WebViewClient
{
  ab(OlaSignup paramOlaSignup) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    OlaSignup.a(this.a).dismiss();
    OlaSignup.b(this.a).setVisibility(0);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      Object localObject = new URL(paramString);
      String str = ((URL)localObject).getRef();
      if (((URL)localObject).toString().equalsIgnoreCase("https://m.olacabs.com/api/signup")) {
        this.a.p = true;
      }
      if ((str != null) && (str.charAt(0) == 'a'))
      {
        localObject = OlaSignup.a(paramString);
        if (this.a.p)
        {
          this.a.o = new ParseObject("olaNewSignups");
          this.a.o.put("acess_token", localObject);
          this.a.o.saveInBackground();
        }
        this.a.n.putString("access_token", (String)localObject).apply();
        this.a.n.putBoolean("loggedIn", true).apply();
        this.a.setResult(-1);
        this.a.finish();
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */