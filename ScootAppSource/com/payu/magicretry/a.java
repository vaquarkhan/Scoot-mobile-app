package com.payu.magicretry;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.mixpanel.android.mpmetrics.af;
import com.payu.magicretry.WaitingDots.DotsTextView;
import com.payu.magicretry.a.c;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends Fragment
  implements View.OnClickListener
{
  private static List<String> aj = new ArrayList();
  private static boolean an = false;
  private static af ar;
  private static String as;
  private static String at;
  private static String au;
  private WebView a;
  private Map<String, String> ai = new HashMap();
  private LinearLayout ak;
  private LinearLayout al;
  private boolean am = true;
  private boolean ao = true;
  private com.payu.magicretry.c.a ap;
  private String aq = "";
  private int av;
  private String b;
  private Context c;
  private boolean d = true;
  private ProgressBar e;
  private ImageView f;
  private DotsTextView g;
  private b h;
  private boolean i = false;
  
  private void a()
  {
    Log.v("#### PAYU", "PayUWebViewClient.java Reloading URL: " + this.a.getUrl());
    this.b = this.a.getUrl();
    if ((this.ai.size() > 0) && (this.ai.containsKey(this.a.getUrl())))
    {
      if (c.a(this.c))
      {
        this.i = false;
        this.a.postUrl(this.a.getUrl(), ((String)this.ai.get(this.a.getUrl())).getBytes());
        b("m_retry_input", "click_m_retry");
        b();
        return;
      }
      c.b(this.c);
      return;
    }
    if (c.a(this.c))
    {
      this.i = false;
      this.a.reload();
      b("m_retry_input", "click_m_retry");
      b();
      return;
    }
    c.b(this.c);
  }
  
  private void a(View paramView)
  {
    this.e = ((ProgressBar)paramView.findViewById(R.id.magic_reload_progress));
    this.f = ((ImageView)paramView.findViewById(R.id.retry_btn));
    if (Build.VERSION.SDK_INT >= 11) {
      this.g = ((DotsTextView)paramView.findViewById(R.id.waiting_dots));
    }
    this.al = ((LinearLayout)paramView.findViewById(R.id.waiting_dots_parent));
    this.ak = ((LinearLayout)paramView.findViewById(R.id.magic_retry_parent));
    this.ak.setVisibility(0);
    this.al.setVisibility(8);
    this.f.setOnClickListener(this);
  }
  
  public static void a(List<String> paramList)
  {
    aj.clear();
    com.payu.magicretry.a.a.a("#### PAYU", "MR Cleared whitelisted urls, length: " + aj.size());
    aj.addAll(paramList);
    com.payu.magicretry.a.a.a("#### PAYU", "MR Updated whitelisted urls, length: " + aj.size());
  }
  
  public static void a(boolean paramBoolean)
  {
    an = paramBoolean;
  }
  
  private void b()
  {
    this.ak.setVisibility(8);
    this.al.setVisibility(0);
    if (Build.VERSION.SDK_INT >= 11)
    {
      this.g.e();
      return;
    }
    this.e.setVisibility(0);
  }
  
  public static void b(String paramString)
  {
    if ((paramString != null) && (!paramString.equalsIgnoreCase("")))
    {
      String[] arrayOfString = paramString.split("\\|");
      int k = arrayOfString.length;
      int j = 0;
      while (j < k)
      {
        String str = arrayOfString[j];
        com.payu.magicretry.a.a.a("#### PAYU", "Split Url: " + str);
        j += 1;
      }
      if ((arrayOfString != null) && (arrayOfString.length > 0)) {
        a(Arrays.asList(arrayOfString));
      }
      com.payu.magicretry.a.a.a("#### PAYU", "Whitelisted URLs from JS: " + paramString);
    }
  }
  
  private void c()
  {
    if (p())
    {
      if (this.al != null) {
        this.al.setVisibility(8);
      }
      if (Build.VERSION.SDK_INT < 11) {
        break label61;
      }
      if (this.g != null) {
        this.g.f();
      }
    }
    for (;;)
    {
      if (this.ak != null) {
        this.ak.setVisibility(0);
      }
      return;
      label61:
      if (this.e != null) {
        this.e.setVisibility(4);
      }
    }
  }
  
  private boolean c(String paramString)
  {
    if (this.am)
    {
      Iterator localIterator = aj.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((paramString != null) && (paramString.contains(str)))
        {
          com.payu.magicretry.a.a.a("#### PAYU", "WHITELISTED URL FOUND.. SHOWING MAGIC RETRY: " + paramString);
          return true;
        }
      }
      return false;
    }
    return true;
  }
  
  private void d()
  {
    c();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.c = l().getBaseContext();
    this.aq = j().getString("transaction_id");
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.magicretry_fragment, paramViewGroup, false);
    a(paramLayoutInflater);
    paramViewGroup = new ArrayList();
    paramViewGroup.add("https://secure.payu.in/_payment");
    paramViewGroup.add("https://secure.payu.in/_secure_payment");
    paramViewGroup.add("https://www.payumoney.com/txn/#/user/");
    paramViewGroup.add("https://mpi.onlinesbi.com/electraSECURE/vbv/MPIEntry.jsp");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/com.enstage.entransact.servers.AccessControlServerSSL");
    paramViewGroup.add("https://www.citibank.co.in/acspage/cap_nsapi.so");
    paramViewGroup.add("https://acs.icicibank.com/acspage/cap");
    paramViewGroup.add("https://secure.payu.in/_payment");
    paramViewGroup.add("https://www.citibank.co.in/servlets/TransReq");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/com.enstage.entransact.servers.AccessControlServerSSL");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/jsp/MerchantPost.jsp");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/jsp/SCode.jsp");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/com.enstage.entransact.servers.AccessControlServerSSL");
    paramViewGroup.add("https://netsafe.hdfcbank.com/ACSWeb/jsp/payerAuthOptions.jsp");
    paramViewGroup.add("https://cardsecurity.enstage.com/ACSWeb/EnrollWeb/KotakBank/server/AccessControlServer");
    paramViewGroup.add("https://cardsecurity.enstage.com/ACSWeb/EnrollWeb/KotakBank/server/OtpServer");
    paramViewGroup.add("https://www.citibank.co.in/acspage/cap_nsapi.so");
    paramViewGroup.add("https://acs.icicibank.com/acspage/cap");
    paramViewGroup.add("https://secureonline.idbibank.com/ACSWeb/EnrollWeb/IDBIBank/server/AccessControlServer");
    paramViewGroup.add("https://vpos.amxvpos.com/vpcpay");
    if (l() != null) {
      b(l());
    }
    return paramLayoutInflater;
  }
  
  String a(String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      if (this.aq == null)
      {
        str = "";
        localJSONObject.put("txnid", str);
        if (au != null) {
          break label129;
        }
        str = "";
        label38:
        localJSONObject.put("cb_version", str);
        localJSONObject.put("package_name", l().getPackageName());
        if (at != null) {
          break label136;
        }
      }
      label129:
      label136:
      for (String str = "";; str = at)
      {
        localJSONObject.put("bank", str);
        localJSONObject.put("key", paramString1);
        localJSONObject.put("value", paramString2);
        localJSONObject.put("merchant_key", as);
        return localJSONObject.toString();
        str = this.aq;
        break;
        str = au;
        break label38;
      }
      return null;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public void a(Context paramContext)
  {
    super.a(paramContext);
    try
    {
      this.h = ((b)paramContext);
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new ClassCastException(paramContext.toString() + " must implement OnHeadlineSelectedListener");
    }
  }
  
  public void a(WebView paramWebView)
  {
    this.a = paramWebView;
  }
  
  public void a(WebView paramWebView, String paramString) {}
  
  public void a(Map<String, String> paramMap)
  {
    this.ai = paramMap;
  }
  
  public void b(Activity paramActivity)
  {
    this.ap = com.payu.magicretry.c.a.a(paramActivity, "local_cache_analytics_mr");
    if (this.ao) {
      ar = af.a(paramActivity, "68dbbac2c25bc048154999d13cb77a55");
    }
  }
  
  public void b(Context paramContext)
  {
    boolean bool2 = true;
    if (!an)
    {
      bool1 = true;
      if (com.payu.magicretry.a.b.a(paramContext, "MR_SETTINGS", "MR_ENABLED", bool1)) {
        break label51;
      }
    }
    label51:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      a(bool1);
      b(com.payu.magicretry.a.b.a(paramContext, "MR_SETTINGS", "MR_WHITELISTED_URLS", ""));
      return;
      bool1 = false;
      break;
    }
  }
  
  public void b(WebView paramWebView, String paramString)
  {
    if ((l() != null) && (!l().isFinishing()) && (!this.i) && (this.d) && (this.b != null))
    {
      this.h.k_();
      this.d = true;
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    try
    {
      if ((l() != null) && (p()) && (!r()) && (!q()) && (this.ap != null))
      {
        this.ap.a(a(paramString1, paramString2.toLowerCase()));
        if (this.ao)
        {
          paramString1 = new JSONObject();
          paramString1.put("Pakage Name", l().getPackageName() + "");
          paramString1.put("Transaction ID", this.aq);
          ar.a(paramString2, paramString1);
        }
      }
      return;
    }
    catch (JSONException paramString1)
    {
      while (!this.ao) {}
      Log.e("CUSTOM BROWSER", "Unable to add properties to JSONObject", paramString1);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.am = paramBoolean;
  }
  
  public void c(WebView paramWebView, String paramString)
  {
    try
    {
      b("m_retry_error", URLEncoder.encode(paramString, "UTF-8"));
      if (this.av == 0)
      {
        b("mr_version", "1.0.4");
        this.av += 1;
      }
      if (!an)
      {
        com.payu.magicretry.a.a.a("#### PAYU", "WebView URL: " + paramWebView.getUrl() + " FAILING URL: " + paramString);
        d();
        if ((paramString != null) && (c(paramString)))
        {
          this.i = true;
          if (this.h != null) {
            this.h.j_();
          }
          b("m_retry_input", "show_m_retry");
          this.b = paramWebView.getUrl();
        }
      }
      else
      {
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
      this.b = null;
    }
  }
  
  public void e(Bundle paramBundle) {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == R.id.retry_btn) {
      a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */