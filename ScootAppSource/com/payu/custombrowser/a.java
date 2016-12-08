package com.payu.custombrowser;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.b.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a
  extends Fragment
{
  public static String a = "5.3.7";
  private static String b;
  private ab aA = new ab(this);
  private View aB;
  private ProgressDialog aC;
  private String aD;
  private Activity aE;
  private int aF;
  private String aG;
  private int aH;
  private Drawable aI;
  private Runnable aJ;
  private Timer aK;
  private String aL;
  private ArrayList<String> aM = new ArrayList();
  private boolean aN = true;
  private boolean aO;
  private boolean aP = true;
  private PopupWindow aQ;
  private Bundle aR;
  private FrameLayout aS;
  private boolean aT = true;
  private boolean aU;
  private String aV;
  private boolean aW;
  private boolean aX;
  private boolean aY;
  private int aZ;
  private int ai;
  private int aj;
  private boolean ak;
  private int al;
  private Boolean am = Boolean.valueOf(false);
  private int an = 0;
  private Set<String> ao = new HashSet();
  private Set<String> ap = new HashSet();
  private String aq;
  private View ar;
  private boolean as = false;
  private String at;
  private View au;
  private String av;
  private ad aw;
  private boolean ax;
  private boolean ay;
  private boolean az = true;
  private String ba;
  private String bb;
  private String bc;
  private Boolean bd;
  private ProgressBar be;
  private int bf;
  private ah bg = new ah();
  private JSONObject c;
  private WebView d;
  private final String e = "https://secure.payu.in/js/sdk_js/v3/";
  private BroadcastReceiver f;
  private JSONObject g;
  private boolean h = false;
  private int i;
  
  private void X()
  {
    if ((!this.aU) && (Build.VERSION.SDK_INT >= 23) && (j().getBoolean("smsPermission")))
    {
      this.aU = true;
      if (c.a(this.aE, "android.permission.RECEIVE_SMS") != 0) {
        a(new String[] { "android.permission.RECEIVE_SMS" }, 1);
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          this.aT = true;
        } while (!this.aO);
        try
        {
          this.d.loadUrl("javascript:" + this.c.getString(a(R.string.cb_otp)));
          return;
        }
        catch (JSONException localJSONException1)
        {
          localJSONException1.printStackTrace();
          return;
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
          return;
        }
        if ((Build.VERSION.SDK_INT < 23) || (j().getBoolean("smsPermission"))) {
          break;
        }
        this.aT = false;
      } while (!this.aO);
      try
      {
        this.d.loadUrl("javascript:" + this.c.getString(a(R.string.cb_otp)));
        return;
      }
      catch (JSONException localJSONException2)
      {
        localJSONException2.printStackTrace();
        return;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        return;
      }
      S();
      if (!this.aU) {
        this.aT = true;
      }
    } while (!this.aO);
    try
    {
      this.d.loadUrl("javascript:" + this.c.getString(a(R.string.cb_otp)));
      return;
    }
    catch (JSONException localJSONException3)
    {
      localJSONException3.printStackTrace();
      return;
    }
    catch (Exception localException3)
    {
      localException3.printStackTrace();
    }
  }
  
  private void Y()
  {
    if (j().getString("merchantid") == null) {}
    for (String str = "";; str = j().getString("merchantid")) {
      try
      {
        this.d.loadUrl("javascript:" + this.g.getString("getMagicRetryUrls") + "('" + str + "')");
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  private void Z()
  {
    this.aw = ad.a(this.aE, "local_cache_analytics");
    aa();
  }
  
  private String a(String paramString1, String paramString2, String paramString3)
  {
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        String str;
        if (this.av == null)
        {
          str = "";
          localJSONObject.put("txnid", str);
          localJSONObject.put("cb_version", "5.3.7");
          localJSONObject.put("package_name", this.aE.getPackageName());
          str = paramString3;
          if (paramString3 == null) {
            str = "";
          }
          localJSONObject.put("bank", str);
          localJSONObject.put("key", paramString1);
          localJSONObject.put("value", paramString2);
          if ((b != null) && (!b.trim().equals("")))
          {
            localJSONObject.put("merchant_key", b);
            return localJSONObject.toString();
          }
        }
        else
        {
          str = this.av;
          continue;
        }
        if ((this.aR.getString("merchantid") != null) && (!this.aR.getString("merchantid").trim().equals(""))) {
          localJSONObject.put("merchant_key", this.aR.getString("merchantid"));
        } else {
          localJSONObject.put("merchant_key", "");
        }
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        return null;
      }
    }
  }
  
  private void a(View paramView)
  {
    paramView.measure(-2, -2);
    int j = paramView.getMeasuredHeight();
    this.i = (this.ai - j);
  }
  
  private void a(View paramView, Context paramContext)
  {
    if (paramView != null)
    {
      paramView.startAnimation(AnimationUtils.loadAnimation(paramContext, R.anim.cb_fade_in));
      new Handler().postDelayed(new k(this, paramView), 500L);
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    try
    {
      this.aw.a(a(paramString1, paramString2.toLowerCase(), this.aq));
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (JSONException paramString1) {}
  }
  
  private void a(Set<String> paramSet1, Set<String> paramSet2, String paramString)
  {
    if ((paramSet1 != null) && (paramSet1.size() > 0) && (this.aG != null) && (!paramSet1.contains(this.aG)))
    {
      c(8);
      this.aF = 2;
    }
    this.aD = paramString;
  }
  
  private void aa()
  {
    localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        if (this.aR.getString("sdkname") != null) {
          continue;
        }
        str = "";
        localJSONObject.put("sdk_version", str);
        localJSONObject.put("cb_version", "5.3.7");
        localJSONObject.put("os_version", Build.VERSION.SDK_INT + "");
        localJSONObject.put("resolution", ah.a(this.aE));
        localJSONObject.put("device_manufacturer", Build.MANUFACTURER);
        localJSONObject.put("device_model", Build.MODEL);
        if ((b == null) || (b.equals(""))) {
          continue;
        }
        localJSONObject.put("merchant_key", b);
        ah.a("com.payu.magicretry.MagicRetryFragment", b, "analyticsKey");
      }
      catch (Exception localException)
      {
        String str;
        localException.printStackTrace();
        continue;
        localJSONObject.put("merchant_key", "");
        ah.a("com.payu.magicretry.MagicRetryFragment", "", "analyticsKey");
        continue;
      }
      localJSONObject.put("txnid", this.aR.getString("txnid"));
      localJSONObject.put("network_info", ah.b(this.aE));
      localJSONObject.put("network_strength", ah.c(this.aE));
      new am(this.aE, "cb_local_cache_device").a(localJSONObject.toString());
      return;
      str = this.aR.getString("sdkname");
      continue;
      if ((this.aR.getString("merchantid") == null) || (this.aR.getString("merchantid").trim().equals(""))) {
        continue;
      }
      localJSONObject.put("merchant_key", this.aR.getString("merchantid"));
      ah.a("com.payu.magicretry.MagicRetryFragment", this.aR.getString("merchantid"), "analyticsKey");
    }
  }
  
  private void ab()
  {
    if (this.f == null)
    {
      this.f = new y(this);
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.setPriority(9999999);
      localIntentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
      a(this.f, localIntentFilter);
    }
  }
  
  private void ac()
  {
    ab();
    this.aL = "payment_initiated";
    a("user_input", this.aL);
    new i(this).execute(new Void[] { null, null, null });
  }
  
  private void ad()
  {
    c(8);
  }
  
  private void ae()
  {
    try
    {
      if (this.ai == 0)
      {
        this.d.measure(-1, -1);
        this.d.requestLayout();
        this.ai = this.d.getMeasuredHeight();
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void af()
  {
    if (this.ai == 0) {
      ae();
    }
    this.d.getLayoutParams().height = this.ai;
    this.d.requestLayout();
  }
  
  private void ag()
  {
    this.d.getLayoutParams().height = this.i;
    this.d.requestLayout();
  }
  
  private void ah()
  {
    if (this.g != null) {
      try
      {
        if (this.g.has("pgUrlList"))
        {
          StringTokenizer localStringTokenizer1 = new StringTokenizer(this.g.getString("pgUrlList").replace(" ", ""), "||");
          while (localStringTokenizer1.hasMoreTokens()) {
            this.ao.add(localStringTokenizer1.nextToken());
          }
          return;
        }
      }
      catch (Exception localException)
      {
        ad();
        localException.printStackTrace();
      }
    }
    ad();
    if (this.g.has("postPaymentPgUrlList"))
    {
      StringTokenizer localStringTokenizer2 = new StringTokenizer(this.g.getString("postPaymentPgUrlList").replace(" ", ""), "||");
      while (localStringTokenizer2.hasMoreTokens()) {
        this.ap.add(localStringTokenizer2.nextToken());
      }
    }
    a(this.ao, this.ap, "https://secure.payu.in/_payment_options");
  }
  
  private void ai()
  {
    af();
    this.aj = 1;
    d();
  }
  
  private void aj()
  {
    this.be = new ProgressBar(this.aE, null, 16842872);
    this.be.setMax(100);
    this.be.setProgressDrawable(ah.a(this.aE, R.drawable.cb_progress_bar));
    this.be.setVisibility(0);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, (int)m().getDimension(R.dimen.cb_progress_bar_height));
    localLayoutParams.addRule(10);
    this.be.setLayoutParams(localLayoutParams);
    ((RelativeLayout)this.aE.findViewById(j().getInt("mainLayout"))).addView(this.be, localLayoutParams);
  }
  
  private ProgressDialog b(Context paramContext)
  {
    Drawable localDrawable1 = null;
    Object localObject = localDrawable1;
    if (this.aE != null)
    {
      localObject = localDrawable1;
      if (p())
      {
        localObject = localDrawable1;
        if (paramContext != null)
        {
          localObject = localDrawable1;
          if (!this.aE.isFinishing())
          {
            localObject = LayoutInflater.from(paramContext);
            localDrawable1 = ah.a(this.aE, R.drawable.l_icon1);
            Drawable localDrawable2 = ah.a(this.aE, R.drawable.l_icon2);
            Drawable localDrawable3 = ah.a(this.aE, R.drawable.l_icon3);
            Drawable localDrawable4 = ah.a(this.aE, R.drawable.l_icon4);
            View localView = ((LayoutInflater)localObject).inflate(R.layout.cb_prog_dialog, null);
            ImageView localImageView = (ImageView)localView.findViewById(R.id.imageView);
            localObject = new ProgressDialog(paramContext, R.style.cb_progress_dialog);
            paramContext = new Timer();
            paramContext.scheduleAtFixedRate(new q(this, new Drawable[] { localDrawable1, localDrawable2, localDrawable3, localDrawable4 }, localImageView), 0L, 500L);
            ((ProgressDialog)localObject).show();
            ((ProgressDialog)localObject).setContentView(localView);
            ((ProgressDialog)localObject).setCancelable(true);
            ((ProgressDialog)localObject).setCanceledOnTouchOutside(false);
            ((ProgressDialog)localObject).setOnDismissListener(new t(this, paramContext));
          }
        }
      }
    }
    return (ProgressDialog)localObject;
  }
  
  private void b(View paramView)
  {
    if (this.ai == 0)
    {
      ae();
      af();
    }
    a(paramView);
  }
  
  private void c(int paramInt)
  {
    if ((paramInt == 8) || (paramInt == 4)) {
      if ((this.aC != null) && (this.aC.isShowing()))
      {
        this.aC.dismiss();
        this.aH = 1;
      }
    }
    while (this.aC != null) {
      return;
    }
    this.aC = b(this.aE);
  }
  
  private void d(int paramInt)
  {
    if (this.bf > paramInt) {
      this.be.setProgress(paramInt);
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofInt(this.be, "progress", new int[] { paramInt });
      localObjectAnimator.setDuration(50L);
      localObjectAnimator.setInterpolator(new AccelerateInterpolator());
      localObjectAnimator.start();
    }
    for (;;)
    {
      this.bf = paramInt;
      return;
      this.be.setProgress(paramInt);
    }
  }
  
  private void g(String paramString)
  {
    ab();
    if (this.aL.equals("payment_initiated"))
    {
      this.aL = "CUSTOM_BROWSER";
      this.aM.add("CUSTOM_BROWSER");
      a("cb_status", this.aL);
    }
    if (this.al == 0) {
      this.aj = 2;
    }
    this.ax = true;
    S();
    if (this.au != null) {
      this.au.setVisibility(0);
    }
    View localView = this.aE.getLayoutInflater().inflate(R.layout.wait_for_otp, null);
    Object localObject1 = (ImageView)localView.findViewById(R.id.bank_logo);
    TextView localTextView = (TextView)localView.findViewById(R.id.timer);
    Button localButton = (Button)localView.findViewById(R.id.approve);
    if (this.aI != null) {
      ((ImageView)localObject1).setImageDrawable(this.aI);
    }
    ((EditText)localView.findViewById(R.id.otp_sms)).addTextChangedListener(new l(this, localView, localButton));
    localObject1 = localView.findViewById(R.id.progress);
    ai.a(this.aE, (View)localObject1);
    this.aS.removeAllViews();
    this.aS.addView(localView);
    if (this.aS.isShown())
    {
      this.aj = 2;
      if ((this.aj == 1) && (this.ar != null)) {
        this.ar.setVisibility(0);
      }
    }
    for (;;)
    {
      try
      {
        localObject2 = new JSONObject(paramString);
        if ((!((JSONObject)localObject2).has(a(R.string.cb_regenerate))) || (!((JSONObject)localObject2).getBoolean(a(R.string.cb_regenerate)))) {
          continue;
        }
        j = 1;
        if ((!((JSONObject)localObject2).has(a(R.string.cb_skip_screen))) || (!((JSONObject)localObject2).getBoolean(a(R.string.cb_skip_screen)))) {
          continue;
        }
        k = 1;
        if ((!((JSONObject)localObject2).has(a(R.string.cb_pin))) || (!((JSONObject)localObject2).getBoolean(a(R.string.cb_pin)))) {
          continue;
        }
        m = 1;
        if (k == 0) {
          continue;
        }
        if ((this.aE != null) && (this.aE.findViewById(R.id.otp_sms) != null) && (this.aE.findViewById(R.id.otp_sms).getVisibility() != 0))
        {
          localView.findViewById(R.id.retry_text).setVisibility(0);
          if (j == 0) {
            continue;
          }
          localView.findViewById(R.id.Regenerate_layout_gone).setVisibility(0);
          localView.findViewById(R.id.pin_layout_gone).setVisibility(8);
          localView.findViewById(R.id.Enter_manually_gone).setVisibility(0);
          localView.findViewById(R.id.retry_text).setVisibility(0);
          localView.findViewById(R.id.regenerate_layout).setVisibility(0);
          localView.findViewById(R.id.approve).setVisibility(8);
          localView.findViewById(R.id.waiting).setVisibility(8);
          localView.findViewById(R.id.pin).setOnClickListener(this.aA);
          localView.findViewById(R.id.retry).setOnClickListener(this.aA);
          localView.findViewById(R.id.enter_manually).setOnClickListener(this.aA);
          b(localView);
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        int k;
        int m;
        localException.printStackTrace();
        continue;
        localView.findViewById(R.id.pin_layout_gone).setVisibility(8);
        continue;
        if (this.aK == null) {
          continue;
        }
        this.aK.cancel();
        this.aK.purge();
        this.aK = new Timer();
        this.aK.scheduleAtFixedRate(new m(this), 0L, 1000L);
        continue;
        int j = 30;
        continue;
        af();
      }
      if ((Build.VERSION.SDK_INT >= 23) && ((!j().getBoolean("smsPermission")) || (!this.aT)))
      {
        localObject2 = (EditText)localView.findViewById(R.id.otp_sms);
        localButton.setClickable(false);
        ((LinearLayout)localView.findViewById(R.id.linear_layout_waiting_for_otp)).setOnTouchListener(new n(this, (EditText)localObject2));
        ((EditText)localObject2).setVisibility(0);
        localButton.setVisibility(0);
        localView.findViewById(R.id.waiting).setVisibility(8);
        localView.findViewById(R.id.progress).setVisibility(8);
        localView.findViewById(R.id.regenerate_layout).setVisibility(0);
        localView.findViewById(R.id.Enter_manually_gone).setVisibility(8);
        ((EditText)localObject2).addTextChangedListener(new o(this, localView, localButton));
      }
      if ((Build.VERSION.SDK_INT < 23) || (this.aT)) {
        continue;
      }
      j = 45;
      this.aJ = new p(this, j, localView, localTextView, paramString);
      if ((this.at != null) && (this.aE.findViewById(R.id.otp_sms) != null) && (this.aE.findViewById(R.id.otp_sms).getVisibility() != 0))
      {
        if (this.aK != null) {
          this.aK.cancel();
        }
        this.aE.findViewById(R.id.timer).setVisibility(8);
        if ((this.aL.equals("payment_initiated")) || (this.aL.equals("CUSTOM_BROWSER")))
        {
          this.aL = "received_otp_direct";
          a("otp_received", this.aL);
        }
        ((TextView)localView.findViewById(R.id.otp_sms)).setText(this.at);
        localButton.setText(a(R.string.cb_approve_otp));
        localButton.setClickable(true);
        if (this.aX)
        {
          localButton.performClick();
          this.aL = "auto_approve";
          a("user_input", this.aL);
        }
        ah.a(1.0F, localButton);
        this.aE.findViewById(R.id.otp_recieved).setVisibility(0);
        ai.a((View)localObject1);
        localView.findViewById(R.id.retry_text).setVisibility(8);
        localView.findViewById(R.id.regenerate_layout).setVisibility(8);
        localView.findViewById(R.id.approve).setVisibility(0);
        localView.findViewById(R.id.waiting).setVisibility(8);
        localView.findViewById(R.id.otp_sms).setVisibility(0);
        this.aA.a(localView);
        localView.findViewById(R.id.approve).setOnClickListener(this.aA);
      }
      b(localView);
      if (!this.aS.isShown()) {
        continue;
      }
      this.aj = 2;
      return;
      af();
      break;
      j = 0;
      continue;
      k = 0;
      continue;
      m = 0;
      continue;
      if (m == 0) {
        continue;
      }
      localView.findViewById(R.id.pin_layout_gone).setVisibility(0);
      localView.findViewById(R.id.Regenerate_layout_gone).setVisibility(8);
      localView.findViewById(R.id.Enter_manually_gone).setVisibility(0);
    }
  }
  
  public abstract void S();
  
  void T()
  {
    if (this.aE != null) {
      this.aE.runOnUiThread(new u(this));
    }
  }
  
  boolean U()
  {
    return this.bb != null;
  }
  
  public void V() {}
  
  public void W() {}
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      if ((this.aE != null) && (p())) {
        this.au = this.aE.findViewById(j().getInt("tranLayout"));
      }
      paramLayoutInflater = paramLayoutInflater.inflate(R.layout.bank, null);
      paramLayoutInflater.bringToFront();
      aj();
      this.d.setOnKeyListener(new b(this));
      this.aS = ((FrameLayout)paramLayoutInflater.findViewById(R.id.help_view));
      this.ar = paramLayoutInflater.findViewById(R.id.view);
      paramLayoutInflater.setOnTouchListener(new e(this));
      return paramLayoutInflater;
    }
    catch (Exception paramViewGroup)
    {
      for (;;)
      {
        paramViewGroup.printStackTrace();
      }
    }
  }
  
  public void a()
  {
    try
    {
      if ((this.aE != null) && (!this.aE.isFinishing()))
      {
        d();
        this.aS.removeAllViews();
        if (this.be != null)
        {
          this.be.setVisibility(8);
          this.be.setProgress(0);
        }
        if (this.aQ != null) {
          this.aQ.dismiss();
        }
        if (this.ai != 0)
        {
          af();
          this.aj = 1;
        }
        c(8);
        View localView = ((LayoutInflater)this.aE.getSystemService("layout_inflater")).inflate(R.layout.error_page, null);
        localView.measure(-2, -2);
        if (ah.a(this.aE)) {
          ((TextView)localView.findViewById(R.id.error_title)).setText(this.aE.getResources().getString(R.string.cb_error));
        }
        for (;;)
        {
          localView.setAnimation(AnimationUtils.loadAnimation(l(), R.anim.cb_tranlateup));
          this.aQ = new PopupWindow(localView, -1, localView.getMeasuredHeight() + 20);
          this.aQ.setFocusable(false);
          d();
          localView.findViewById(R.id.cancel).setOnClickListener(new w(this));
          return;
          ((TextView)localView.findViewById(R.id.error_title)).setText(this.aE.getResources().getString(R.string.cb_no_internet));
        }
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void a(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    this.aW = false;
    if (this.aO) {}
    try
    {
      this.d.loadUrl("javascript:" + this.c.getString(a(R.string.cb_otp)));
      if (c.a(this.aE, "android.permission.RECEIVE_SMS") == 0)
      {
        this.aT = true;
        this.at = null;
        ab();
        return;
      }
    }
    catch (JSONException paramArrayOfString)
    {
      for (;;)
      {
        paramArrayOfString.printStackTrace();
      }
      this.aT = false;
      g(this.aV);
    }
  }
  
  public void a(AlertDialog.Builder paramBuilder) {}
  
  public abstract void a(BroadcastReceiver paramBroadcastReceiver);
  
  public abstract void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter);
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    this.aE = l();
    this.aR = j();
    ah.a("com.payu.magicretry.MagicRetryFragment", "5.3.7", "cbVersion");
    this.aX = this.aR.getBoolean("auto_approve", false);
    this.aY = this.aR.getBoolean("auto_select_otp", false);
    Z();
    this.aX = this.aR.getBoolean("auto_approve", false);
    this.aZ = this.aR.getInt("store_one_click_hash");
    this.aY = this.aR.getBoolean("auto_select_otp", false);
    if (this.aE != null)
    {
      this.ak = false;
      paramBundle = CookieManager.getInstance();
      if (Build.VERSION.SDK_INT < 21) {
        break label307;
      }
      paramBundle.removeSessionCookies(null);
      if (!this.aR.containsKey("txnid")) {
        break label314;
      }
    }
    label307:
    label314:
    for (paramBundle = this.aR.getString("txnid");; paramBundle = "123")
    {
      this.av = paramBundle;
      if ((this.av == null) || (this.av.equals(""))) {
        this.av = "123";
      }
      this.d = ((WebView)this.aE.findViewById(j().getInt("webView")));
      this.d.getSettings().setJavaScriptEnabled(true);
      this.d.addJavascriptInterface(this, "PayU");
      this.d.getSettings().setDomStorageEnabled(true);
      this.d.getSettings().setSupportMultipleWindows(true);
      this.d.setOnTouchListener(new x(this));
      if (j().getBoolean("viewPortWide")) {
        this.d.getSettings().setUseWideViewPort(true);
      }
      ac();
      return;
      paramBundle.removeSessionCookie();
      break;
    }
  }
  
  public void b()
  {
    if ((p()) && (!r()) && (this.aE != null))
    {
      this.as = true;
      if (this.am.booleanValue())
      {
        d();
        this.am = Boolean.valueOf(false);
      }
      if ((this.aB != null) && (this.aB.isShown()))
      {
        this.aj = 1;
        af();
        d();
      }
      this.aE.getWindow().setSoftInputMode(3);
      if ((this.c == null) || (!this.aN)) {}
    }
    try
    {
      this.d.loadUrl("javascript:" + this.c.getString(a(R.string.cb_init)));
      if ((this.g != null) && (this.c == null) && (this.au != null)) {
        this.au.setVisibility(8);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  void b(int paramInt)
  {
    if (this.be != null)
    {
      this.be.setVisibility(0);
      if (paramInt != 100) {
        break label60;
      }
      if (this.be != null)
      {
        this.be.setProgress(100);
        new Handler().postDelayed(new v(this), 100L);
      }
    }
    return;
    label60:
    d(paramInt);
  }
  
  public void b(String paramString)
  {
    if (this.be != null) {
      this.be.setProgress(0);
    }
    if (this.aQ != null) {
      this.aQ.dismiss();
    }
  }
  
  public void c()
  {
    if (this.ay)
    {
      d();
      this.ay = false;
    }
    if ((p()) && (!r()))
    {
      this.as = false;
      if (this.g == null) {}
    }
    try
    {
      if (this.aN)
      {
        this.d.loadUrl("javascript:" + this.g.getString(a(R.string.cb_detect_bank)));
        Y();
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
  }
  
  void c(String paramString)
  {
    if (this.aE != null) {
      ah.a(this.aE, "last_url", "s:" + paramString);
    }
    if (this.be != null) {
      this.be.setVisibility(0);
    }
    c(0);
    this.aG = paramString;
    if ((this.aF == 0) && (this.ao != null) && (this.ao.size() > 0) && (!this.ao.contains(paramString))) {
      this.aF = 1;
    }
    if (this.aF == 3) {
      c(8);
    }
    if ((this.aF == 2) && (this.ap != null) && (this.ap.size() > 0))
    {
      Iterator localIterator = this.ap.iterator();
      while (localIterator.hasNext()) {
        if (paramString.contains((String)localIterator.next()))
        {
          this.aC = null;
          c(0);
          ai();
          this.aF = 3;
        }
      }
    }
    if ((this.aD != null) && (paramString.contains(this.aD)))
    {
      ai();
      c(8);
    }
  }
  
  public abstract void d();
  
  void d(String paramString)
  {
    if ((paramString.equalsIgnoreCase("https://mwsrec.npci.org.in/MWS/Scripts/MerchantScript_v1.0.js")) || (paramString.contains("https://swasrec2.npci.org.in")) || (paramString.contains("https://swasrec.npci.org.in")))
    {
      c(8);
      this.aF = 2;
    }
  }
  
  void e(String paramString)
  {
    if (this.aE != null) {
      ah.a(this.aE, "last_url", "f:" + paramString);
    }
    if (this.aF == 1)
    {
      c(8);
      this.aF = 2;
    }
    if (this.aP)
    {
      paramString = this.aE.findViewById(j().getInt("mainLayout"));
      paramString.getViewTreeObserver().addOnGlobalLayoutListener(new aa(this, paramString));
      this.aP = false;
    }
  }
  
  void f(String paramString)
  {
    if ((b == null) || (b.trim().equals(""))) {
      b = paramString;
    }
  }
  
  /* Error */
  public void y()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 1237	android/support/v4/app/Fragment:y	()V
    //   4: aload_0
    //   5: getfield 205	com/payu/custombrowser/a:aE	Landroid/app/Activity;
    //   8: ldc_w 1188
    //   11: invokestatic 1240	com/payu/custombrowser/ah:a	(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;
    //   14: invokestatic 1242	com/payu/custombrowser/ah:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: ldc_w 1244
    //   20: invokestatic 1250	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull +21 -> 46
    //   28: aload_1
    //   29: ldc_w 269
    //   32: invokevirtual 333	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: ifne +11 -> 46
    //   38: aload_0
    //   39: ldc_w 1188
    //   42: aload_1
    //   43: invokespecial 394	com/payu/custombrowser/a:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: aload_0
    //   47: getfield 205	com/payu/custombrowser/a:aE	Landroid/app/Activity;
    //   50: ldc_w 1188
    //   53: invokestatic 1252	com/payu/custombrowser/ah:b	(Landroid/app/Activity;Ljava/lang/String;)V
    //   56: aload_0
    //   57: getfield 1027	com/payu/custombrowser/a:aQ	Landroid/widget/PopupWindow;
    //   60: ifnull +10 -> 70
    //   63: aload_0
    //   64: getfield 1027	com/payu/custombrowser/a:aQ	Landroid/widget/PopupWindow;
    //   67: invokevirtual 1030	android/widget/PopupWindow:dismiss	()V
    //   70: aload_0
    //   71: getfield 128	com/payu/custombrowser/a:aM	Ljava/util/ArrayList;
    //   74: ldc_w 782
    //   77: invokevirtual 1253	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   80: ifne +21 -> 101
    //   83: aload_0
    //   84: ldc_w 1255
    //   87: putfield 503	com/payu/custombrowser/a:aL	Ljava/lang/String;
    //   90: aload_0
    //   91: ldc_w 785
    //   94: aload_0
    //   95: getfield 503	com/payu/custombrowser/a:aL	Ljava/lang/String;
    //   98: invokespecial 394	com/payu/custombrowser/a:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: aload_0
    //   102: ldc_w 1257
    //   105: putfield 503	com/payu/custombrowser/a:aL	Ljava/lang/String;
    //   108: aload_0
    //   109: ldc_w 505
    //   112: aload_0
    //   113: getfield 503	com/payu/custombrowser/a:aL	Ljava/lang/String;
    //   116: invokespecial 394	com/payu/custombrowser/a:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: aload_0
    //   120: getfield 295	com/payu/custombrowser/a:f	Landroid/content/BroadcastReceiver;
    //   123: ifnull +16 -> 139
    //   126: aload_0
    //   127: aload_0
    //   128: getfield 295	com/payu/custombrowser/a:f	Landroid/content/BroadcastReceiver;
    //   131: invokevirtual 1259	com/payu/custombrowser/a:a	(Landroid/content/BroadcastReceiver;)V
    //   134: aload_0
    //   135: aconst_null
    //   136: putfield 295	com/payu/custombrowser/a:f	Landroid/content/BroadcastReceiver;
    //   139: aload_0
    //   140: getfield 737	com/payu/custombrowser/a:aC	Landroid/app/ProgressDialog;
    //   143: ifnull +20 -> 163
    //   146: aload_0
    //   147: getfield 737	com/payu/custombrowser/a:aC	Landroid/app/ProgressDialog;
    //   150: invokevirtual 740	android/app/ProgressDialog:isShowing	()Z
    //   153: ifeq +10 -> 163
    //   156: aload_0
    //   157: getfield 737	com/payu/custombrowser/a:aC	Landroid/app/ProgressDialog;
    //   160: invokevirtual 743	android/app/ProgressDialog:dismiss	()V
    //   163: return
    //   164: astore_1
    //   165: aload_1
    //   166: invokevirtual 260	java/lang/Exception:printStackTrace	()V
    //   169: aload_0
    //   170: getfield 205	com/payu/custombrowser/a:aE	Landroid/app/Activity;
    //   173: ldc_w 1188
    //   176: invokestatic 1252	com/payu/custombrowser/ah:b	(Landroid/app/Activity;Ljava/lang/String;)V
    //   179: goto -123 -> 56
    //   182: astore_1
    //   183: aload_0
    //   184: getfield 205	com/payu/custombrowser/a:aE	Landroid/app/Activity;
    //   187: ldc_w 1188
    //   190: invokestatic 1252	com/payu/custombrowser/ah:b	(Landroid/app/Activity;Ljava/lang/String;)V
    //   193: aload_1
    //   194: athrow
    //   195: astore_1
    //   196: aload_1
    //   197: invokevirtual 260	java/lang/Exception:printStackTrace	()V
    //   200: goto -130 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	203	0	this	a
    //   23	20	1	str	String
    //   164	2	1	localException1	Exception
    //   182	12	1	localObject	Object
    //   195	2	1	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   4	24	164	java/lang/Exception
    //   28	46	164	java/lang/Exception
    //   4	24	182	finally
    //   28	46	182	finally
    //   165	169	182	finally
    //   56	70	195	java/lang/Exception
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */