package com.tushar.taxiapp.scootapp;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import com.parse.ParseObject;
import com.sagar.taxiapp.ds;
import java.net.URI;

public class OlaSignup
  extends ah
{
  SharedPreferences m;
  SharedPreferences.Editor n;
  ParseObject o = null;
  boolean p = false;
  private ProgressDialog q;
  private TextView r;
  
  public static String a(String paramString)
  {
    paramString = URI.create(paramString).getFragment().split("\\&");
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      String[] arrayOfString = paramString[i].split("\\=");
      if (arrayOfString[0].equals("access_token"))
      {
        if (arrayOfString.length == 1) {
          throw new RuntimeException("missing access token");
        }
        return arrayOfString[1];
      }
      i += 1;
    }
    throw new RuntimeException("no access token");
  }
  
  public void finish()
  {
    super.finish();
  }
  
  public void onBackPressed()
  {
    setResult(0);
    finish();
    super.onBackPressed();
  }
  
  @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968741);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    paramBundle = (Toolbar)findViewById(2131755145);
    a(paramBundle);
    a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label255;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText(getResources().getString(2131296465));
      this.m = getSharedPreferences("olaUser", 0);
      this.n = getSharedPreferences("olaUser", 0).edit();
      this.q = new ProgressDialog(this, 2131558633);
      this.q.setCancelable(false);
      this.q.setProgressStyle(16973854);
      this.q.show();
      paramBundle = (WebView)findViewById(2131755718);
      this.r = ((TextView)findViewById(2131755719));
      paramBundle.getSettings().setJavaScriptEnabled(true);
      paramBundle.loadUrl("https://devapi.olacabs.com/oauth2/authorize?response_type=token&client_id=NTM5YTY5NzUtNzk3Ni00YmQ1LThjNTAtMGIxNjAwNzFkYjg2&redirect_uri=http://scootapp.com/&scope=profile%20booking&state=state123");
      paramBundle.setWebViewClient(new ab(this));
      return;
      label255:
      locala.a(c.a(this, 2130837795));
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    setResult(0);
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\OlaSignup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */