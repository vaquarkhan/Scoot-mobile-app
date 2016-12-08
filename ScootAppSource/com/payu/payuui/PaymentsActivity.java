package com.payu.payuui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.av;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.payu.custombrowser.ak;
import com.payu.custombrowser.al;
import com.payu.india.Model.PayuConfig;
import com.payu.magicretry.b;
import java.util.HashMap;
import java.util.Map;

public class PaymentsActivity
  extends android.support.v7.a.ah
  implements b
{
  Bundle m;
  String n;
  boolean o = false;
  PayuConfig p;
  com.payu.magicretry.a q;
  String r = null;
  private BroadcastReceiver s = null;
  private String t = "UTF-8";
  private boolean u = false;
  private WebView v;
  private com.payu.india.c.c w;
  private int x;
  
  private void l()
  {
    android.support.v4.app.ah localah = f();
    this.q = new com.payu.magicretry.a();
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("transaction_id", this.r);
    this.q.g((Bundle)localObject);
    localObject = new HashMap();
    ((Map)localObject).put(this.n, this.p.a());
    this.q.a((Map)localObject);
    localah.a().a(R.id.magic_retry_container, this.q, "magicRetry").a();
    b(0);
    this.q.b(true);
  }
  
  public void b(int paramInt)
  {
    av localav = f().a();
    if (!isFinishing())
    {
      if (paramInt != 1) {
        break label33;
      }
      localav.c(this.q).b();
    }
    label33:
    while (paramInt != 0) {
      return;
    }
    localav.b(this.q).b();
    Log.v("#### PAYU", "hidhing magic retry");
  }
  
  public void j_()
  {
    b(1);
  }
  
  public void k_()
  {
    b(0);
  }
  
  public void onBackPressed()
  {
    if (this.o)
    {
      this.o = false;
      localObject = new Intent();
      ((Intent)localObject).putExtra("result", "Transaction canceled due to back pressed!");
      setResult(0, (Intent)localObject);
      finish();
      super.onBackPressed();
      return;
    }
    Object localObject = new AlertDialog.Builder(this);
    ((AlertDialog.Builder)localObject).setCancelable(false);
    ((AlertDialog.Builder)localObject).setMessage("Do you really want to cancel the transaction ?");
    ((AlertDialog.Builder)localObject).setPositiveButton("Ok", new u(this));
    ((AlertDialog.Builder)localObject).setNegativeButton("Cancel", new v(this));
    ((AlertDialog.Builder)localObject).show();
  }
  
  @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface", "AddJavascriptInterface"})
  @TargetApi(19)
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject1;
    label125:
    label275:
    Object localObject2;
    int j;
    label299:
    Object localObject3;
    int i;
    if (paramBundle != null)
    {
      super.onCreate(null);
      finish();
      setContentView(R.layout.activity_payments);
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.clearFlags(67108864);
        paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, R.color.gradient_start));
      }
      paramBundle = (Toolbar)findViewById(R.id.tool_bar);
      a(paramBundle);
      localObject1 = h();
      if (localObject1 != null)
      {
        ((android.support.v7.a.a)localObject1).c(false);
        ((android.support.v7.a.a)localObject1).b(true);
        ((android.support.v7.a.a)localObject1).a(true);
        if (Build.VERSION.SDK_INT < 21) {
          break label425;
        }
        ((android.support.v7.a.a)localObject1).a(getResources().getDrawable(R.drawable.ic_nav_back, null));
      }
      ((TextView)paramBundle.findViewById(R.id.toolbar_title)).setText(getResources().getString(R.string.activity_payments));
      this.v = ((WebView)findViewById(R.id.webview));
      WebView.setWebContentsDebuggingEnabled(true);
      this.w = new com.payu.india.c.c();
      this.m = getIntent().getExtras();
      this.p = ((PayuConfig)this.m.getParcelable("payuConfig"));
      this.x = this.m.getInt("store_one_click_hash");
      this.v = ((WebView)findViewById(R.id.webview));
      switch (this.p.b())
      {
      default: 
        this.n = "https://secure.payu.in/_payment";
        localObject2 = this.p.a().split("&");
        int k = localObject2.length;
        j = 0;
        paramBundle = null;
        if (j >= k) {
          break label568;
        }
        localObject3 = localObject2[j].split("=");
        localObject1 = paramBundle;
        if (localObject3.length >= 2)
        {
          localObject1 = localObject3[0];
          i = -1;
          switch (((String)localObject1).hashCode())
          {
          default: 
            switch (i)
            {
            default: 
              label376:
              localObject1 = paramBundle;
            }
            break;
          }
        }
        break;
      }
    }
    for (;;)
    {
      j += 1;
      paramBundle = (Bundle)localObject1;
      break label299;
      super.onCreate(null);
      break;
      label425:
      ((android.support.v7.a.a)localObject1).a(android.support.v4.b.c.a(this, R.drawable.ic_nav_back));
      break label125;
      this.n = "https://secure.payu.in/_payment";
      break label275;
      this.n = "https://mobiletest.payu.in/_payment";
      break label275;
      this.n = "https://test.payu.in/_payment";
      break label275;
      if (!((String)localObject1).equals("txnid")) {
        break label376;
      }
      i = 0;
      break label376;
      if (!((String)localObject1).equals("key")) {
        break label376;
      }
      i = 1;
      break label376;
      if (!((String)localObject1).equals("pg")) {
        break label376;
      }
      i = 2;
      break label376;
      this.r = localObject3[1];
      localObject1 = paramBundle;
      continue;
      localObject1 = localObject3[1];
      continue;
      localObject1 = paramBundle;
      if (localObject3[1].contentEquals("NB"))
      {
        this.u = true;
        localObject1 = paramBundle;
      }
    }
    for (;;)
    {
      try
      {
        label568:
        Class.forName("com.payu.custombrowser.a");
        localObject2 = new s(this);
        localObject3 = new Bundle();
        ((Bundle)localObject3).putInt("webView", R.id.webview);
        ((Bundle)localObject3).putInt("tranLayout", R.id.trans_overlay);
        ((Bundle)localObject3).putInt("mainLayout", R.id.r_layout);
        ((Bundle)localObject3).putBoolean("viewPortWide", this.u);
        ((Bundle)localObject3).putBoolean("auto_select_otp", true);
        ((Bundle)localObject3).putBoolean("auto_approve", true);
        if (this.r == null)
        {
          localObject1 = String.valueOf(System.currentTimeMillis());
          ((Bundle)localObject3).putString("txnid", (String)localObject1);
          if (paramBundle != null)
          {
            localObject1 = paramBundle;
            ((Bundle)localObject3).putString("merchantid", (String)localObject1);
            ((Bundle)localObject3).putString("sdkname", new com.payu.india.a.a().a());
            ((Bundle)localObject3).putInt("store_one_click_hash", this.x);
            if (getIntent().getExtras().containsKey("showCustom")) {
              ((Bundle)localObject3).putBoolean("showCustom", getIntent().getBooleanExtra("showCustom", false));
            }
            ((Bundle)localObject3).putBoolean("showCustom", true);
            ((com.payu.custombrowser.a)localObject2).g((Bundle)localObject3);
            findViewById(R.id.parent).bringToFront();
          }
        }
        else
        {
          try
          {
            f().a().a(R.anim.fade_in, R.anim.cb_face_out).a(R.id.parent, (Fragment)localObject2).a();
            l();
            this.v.setWebChromeClient(new ak((com.payu.custombrowser.a)localObject2));
            this.v.setWebViewClient(new al((com.payu.custombrowser.a)localObject2, this.q, paramBundle));
            this.q.a(this.v);
            this.q.b(this);
            this.v.postUrl(this.n, this.p.a().getBytes());
            new com.payu.india.c.c().a(this, com.payu.custombrowser.a.a, paramBundle, this.r);
            return;
            localObject1 = this.r;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
            finish();
            continue;
          }
        }
        String str = "could not find";
      }
      catch (ClassNotFoundException paramBundle)
      {
        this.v.getSettings().setCacheMode(2);
        this.v.getSettings().setSupportMultipleWindows(true);
        this.v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        if (this.u) {
          this.v.getSettings().setUseWideViewPort(this.u);
        }
        findViewById(R.id.trans_overlay).setVisibility(8);
        this.v.addJavascriptInterface(new t(this), "PayU");
        this.v.setWebChromeClient(new WebChromeClient());
        this.v.setWebViewClient(new WebViewClient());
        this.v.getSettings().setJavaScriptEnabled(true);
        this.v.getSettings().setDomStorageEnabled(true);
        this.v.postUrl(this.n, this.p.a().getBytes());
        return;
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("result", "Transaction canceled due to back pressed!");
    setResult(0, paramMenuItem);
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\PaymentsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */