package com.facebook.b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R.drawable;
import com.facebook.R.string;
import com.facebook.p;
import com.facebook.q;
import com.facebook.w;
import java.util.Locale;

public class ba
  extends Dialog
{
  private String a;
  private String b = "fbconnect://success";
  private bh c;
  private WebView d;
  private ProgressDialog e;
  private ImageView f;
  private FrameLayout g;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  
  public ba(Context paramContext, String paramString)
  {
    this(paramContext, paramString, 16973840);
  }
  
  public ba(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, k);
    this.a = paramString;
  }
  
  public ba(Context paramContext, String paramString, Bundle paramBundle, int paramInt, bh parambh)
  {
    super(paramContext, k);
    paramContext = paramBundle;
    if (paramBundle == null) {
      paramContext = new Bundle();
    }
    paramContext.putString("redirect_uri", "fbconnect://success");
    paramContext.putString("display", "touch");
    paramContext.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] { w.g() }));
    this.a = as.a(ar.a(), ar.d() + "/" + "dialog/" + paramString, paramContext).toString();
    this.c = parambh;
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    double d1 = 0.5D;
    int k = (int)(paramInt1 / paramFloat);
    if (k <= paramInt2) {
      d1 = 1.0D;
    }
    for (;;)
    {
      return (int)(d1 * paramInt1);
      if (k < paramInt3) {
        d1 = 0.5D + (paramInt3 - k) / (paramInt3 - paramInt2) * 0.5D;
      }
    }
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  private void a(int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.d = new bd(this, getContext().getApplicationContext());
    this.d.setVerticalScrollBarEnabled(false);
    this.d.setHorizontalScrollBarEnabled(false);
    this.d.setWebViewClient(new bg(this, null));
    this.d.getSettings().setJavaScriptEnabled(true);
    this.d.loadUrl(this.a);
    this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.d.setVisibility(4);
    this.d.getSettings().setSavePassword(false);
    this.d.getSettings().setSaveFormData(false);
    this.d.setFocusable(true);
    this.d.setFocusableInTouchMode(true);
    this.d.setOnTouchListener(new be(this));
    localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
    localLinearLayout.addView(this.d);
    localLinearLayout.setBackgroundColor(-872415232);
    this.g.addView(localLinearLayout);
  }
  
  private void e()
  {
    this.f = new ImageView(getContext());
    this.f.setOnClickListener(new bc(this));
    Drawable localDrawable = getContext().getResources().getDrawable(R.drawable.com_facebook_close);
    this.f.setImageDrawable(localDrawable);
    this.f.setVisibility(4);
  }
  
  protected Bundle a(String paramString)
  {
    paramString = Uri.parse(paramString);
    Bundle localBundle = as.b(paramString.getQuery());
    localBundle.putAll(as.b(paramString.getFragment()));
    return localBundle;
  }
  
  protected void a(Bundle paramBundle)
  {
    if ((this.c != null) && (!this.h))
    {
      this.h = true;
      this.c.a(paramBundle, null);
      dismiss();
    }
  }
  
  public void a(bh parambh)
  {
    this.c = parambh;
  }
  
  protected void a(Throwable paramThrowable)
  {
    if ((this.c != null) && (!this.h))
    {
      this.h = true;
      if (!(paramThrowable instanceof p)) {
        break label47;
      }
    }
    label47:
    for (paramThrowable = (p)paramThrowable;; paramThrowable = new p(paramThrowable))
    {
      this.c.a(null, paramThrowable);
      dismiss();
      return;
    }
  }
  
  protected boolean a()
  {
    return this.h;
  }
  
  protected void b(String paramString)
  {
    this.b = paramString;
  }
  
  protected boolean b()
  {
    return this.j;
  }
  
  protected WebView c()
  {
    return this.d;
  }
  
  public void cancel()
  {
    if ((this.c != null) && (!this.h)) {
      a(new q());
    }
  }
  
  public void d()
  {
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int k;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      k = localDisplayMetrics.widthPixels;
      if (localDisplayMetrics.widthPixels >= localDisplayMetrics.heightPixels) {
        break label141;
      }
    }
    label141:
    for (int m = localDisplayMetrics.heightPixels;; m = localDisplayMetrics.widthPixels)
    {
      k = Math.min(a(k, localDisplayMetrics.density, 480, 800), localDisplayMetrics.widthPixels);
      m = Math.min(a(m, localDisplayMetrics.density, 800, 1280), localDisplayMetrics.heightPixels);
      getWindow().setLayout(k, m);
      return;
      k = localDisplayMetrics.heightPixels;
      break;
    }
  }
  
  public void dismiss()
  {
    if (this.d != null) {
      this.d.stopLoading();
    }
    if ((!this.i) && (this.e != null) && (this.e.isShowing())) {
      this.e.dismiss();
    }
    super.dismiss();
  }
  
  public void onAttachedToWindow()
  {
    this.i = false;
    super.onAttachedToWindow();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.e = new ProgressDialog(getContext());
    this.e.requestWindowFeature(1);
    this.e.setMessage(getContext().getString(R.string.com_facebook_loading));
    this.e.setOnCancelListener(new bb(this));
    requestWindowFeature(1);
    this.g = new FrameLayout(getContext());
    d();
    getWindow().setGravity(17);
    getWindow().setSoftInputMode(16);
    e();
    a(this.f.getDrawable().getIntrinsicWidth() / 2 + 1);
    this.g.addView(this.f, new ViewGroup.LayoutParams(-2, -2));
    setContentView(this.g);
  }
  
  public void onDetachedFromWindow()
  {
    this.i = true;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      cancel();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onStart()
  {
    super.onStart();
    d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */