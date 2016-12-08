package com.sagar.taxiapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.a.f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.sagar.taxiapp.a.an;
import java.net.URI;

public class MyAccounts
  extends ah
{
  private SharedPreferences m;
  private SharedPreferences.Editor n;
  private SwitchCompat o;
  private boolean p;
  private WebView q;
  private RelativeLayout r;
  private DrawerLayout s;
  private TextView t;
  private boolean u = false;
  private ParseObject v;
  private ProgressDialog w;
  private boolean x = false;
  private boolean y = true;
  private an z;
  
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
  
  public void l()
  {
    Dialog localDialog = new Dialog(this);
    localDialog.requestWindowFeature(1);
    localDialog.setContentView(2130968740);
    localDialog.show();
    this.w = new ProgressDialog(this);
    this.w.setMessage("Please wait...");
    this.w.show();
    localDialog.setOnDismissListener(new co(this));
    this.q = ((WebView)localDialog.findViewById(2131755718));
    this.t = ((TextView)localDialog.findViewById(2131755719));
    this.q.getSettings().setJavaScriptEnabled(true);
    this.q.loadUrl("https://devapi.olacabs.com/oauth2/authorize?response_type=token&client_id=NTM5YTY5NzUtNzk3Ni00YmQ1LThjNTAtMGIxNjAwNzFkYjg2&redirect_uri=http://scootapp.com/&scope=profile%20booking&state=state123");
    this.q.setWebViewClient(new cp(this, localDialog));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968615);
    this.m = getSharedPreferences("olaUser", 0);
    this.n = this.m.edit();
    this.o = ((SwitchCompat)findViewById(2131755312));
    this.p = this.m.getBoolean("loggedIn", false);
    paramBundle = ParseUser.getCurrentUser();
    String str;
    Object localObject1;
    if (paramBundle != null)
    {
      str = paramBundle.getString("firstName");
      localObject1 = paramBundle.getString("lastName");
      str = str + " " + (String)localObject1;
    }
    for (paramBundle = paramBundle.getString("displayPictureUrl");; paramBundle = "2130837825")
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject1 = getWindow();
        ((Window)localObject1).addFlags(Integer.MIN_VALUE);
        ((Window)localObject1).clearFlags(67108864);
        ((Window)localObject1).setStatusBarColor(c.c(this, 2131689628));
      }
      localObject1 = (Toolbar)findViewById(2131755145);
      a((Toolbar)localObject1);
      Object localObject2 = h();
      if (localObject2 != null)
      {
        ((a)localObject2).c(false);
        ((a)localObject2).b(true);
        ((a)localObject2).a(true);
        if (Build.VERSION.SDK_INT >= 21) {
          ((a)localObject2).a(getResources().getDrawable(2130837795, null));
        }
      }
      else
      {
        localObject2 = (TextView)((Toolbar)localObject1).findViewById(2131755818);
        ((TextView)localObject2).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
        ((TextView)localObject2).setText(getResources().getString(2131296461));
        this.r = ((RelativeLayout)findViewById(2131755181));
        localObject2 = (RecyclerView)findViewById(2131755182);
        ((RecyclerView)localObject2).setHasFixedSize(true);
        this.z = new an(str, paramBundle);
        ((RecyclerView)localObject2).setAdapter(this.z);
        this.z.c(3);
        paramBundle = new LinearLayoutManager(this);
        ((RecyclerView)localObject2).setHasFixedSize(true);
        ((RecyclerView)localObject2).setLayoutManager(paramBundle);
        findViewById(2131755186).setOnClickListener(new cg(this));
        findViewById(2131755187).setOnClickListener(new ch(this));
        findViewById(2131755188).setOnClickListener(new ci(this));
        this.s = ((DrawerLayout)findViewById(2131755178));
        paramBundle = new cj(this, this, this.s, (Toolbar)localObject1, 2131296548, 2131296547);
        this.s.a(paramBundle);
        paramBundle.a();
        if (!this.p) {
          break label492;
        }
        this.o.setChecked(true);
      }
      for (;;)
      {
        this.o.setOnCheckedChangeListener(new ck(this));
        return;
        ((a)localObject2).a(c.a(this, 2130837795));
        break;
        label492:
        this.o.setChecked(false);
      }
      str = "";
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\MyAccounts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */