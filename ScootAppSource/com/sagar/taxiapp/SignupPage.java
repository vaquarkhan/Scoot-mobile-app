package com.sagar.taxiapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.b.c;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.ao;
import com.facebook.k;
import com.facebook.l;
import com.facebook.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.auth.api.signin.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.t;
import com.twitter.sdk.android.core.m;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupPage
  extends aa
  implements t
{
  private String A;
  private String B;
  private String C;
  private String D;
  private boolean E = false;
  private boolean F = false;
  private boolean G = false;
  private boolean H = false;
  private DigitsAuthButton I;
  private TextWatcher J = new dm(this);
  Intent m;
  private EditText n;
  private EditText o;
  private EditText p;
  private EditText q;
  private RelativeLayout r;
  private RelativeLayout s;
  private q t;
  private GoogleSignInOptions u;
  private TextView v;
  private TextView w;
  private com.facebook.login.r x;
  private k y;
  private boolean z = false;
  
  private void a(e parame)
  {
    GoogleSignInAccount localGoogleSignInAccount;
    if (parame.c())
    {
      localGoogleSignInAccount = parame.a();
      parame = new Intent(this, SocialAccountSignup.class);
      parame.putExtra("email", localGoogleSignInAccount.c());
      parame.putExtra("first_name", localGoogleSignInAccount.d().split(" ")[0]);
      parame.putExtra("last_name", localGoogleSignInAccount.d().split(" ")[1]);
      parame.putExtra("password", "googleplus");
      parame.putExtra("signupType", "googleplus");
    }
    try
    {
      parame.putExtra("displayPictureUrl", localGoogleSignInAccount.g().toString());
      startActivity(parame);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        parame.putExtra("displayPictureUrl", "NA");
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(paramString).matches()) {
      bool = true;
    }
    return bool;
  }
  
  private void i()
  {
    this.A = this.n.getText().toString();
    this.C = this.p.getText().toString();
    this.D = this.q.getText().toString();
    this.B = this.o.getText().toString();
    if (this.C.length() > 0)
    {
      this.E = true;
      if (this.D.length() <= 0) {
        break label179;
      }
      this.F = true;
      label86:
      if (!a(this.A)) {
        break label187;
      }
      this.G = true;
      label101:
      if (this.B.length() <= 5) {
        break label195;
      }
    }
    label179:
    label187:
    label195:
    for (this.H = true;; this.H = false)
    {
      if ((!this.E) || (!this.F) || (!this.G) || (!this.H)) {
        break label203;
      }
      this.I.setClickable(true);
      this.I.setBackgroundResource(2130837611);
      this.I.setTextColor(-1);
      return;
      this.E = false;
      break;
      this.F = false;
      break label86;
      this.G = false;
      break label101;
    }
    label203:
    this.I.setClickable(false);
    this.I.setBackgroundResource(2130837908);
    this.I.setTextColor(-12303292);
  }
  
  private void j()
  {
    this.z = true;
    startActivityForResult(com.google.android.gms.auth.api.a.l.a(this.t), 0);
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (!this.t.i()) {
      this.t.e();
    }
  }
  
  public void h()
  {
    this.z = false;
    this.y = l.a();
    com.facebook.login.r localr = this.x;
    com.facebook.login.r.a().a(this, Arrays.asList(new String[] { "public_profile", "email" }));
    localr = this.x;
    com.facebook.login.r.a().a(this.y, new dn(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (!this.z) {
      this.y.a(paramInt1, paramInt2, paramIntent);
    }
    while (paramInt1 != 0) {
      return;
    }
    a(com.google.android.gms.auth.api.a.l.a(paramIntent));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968761);
    w.a(getApplicationContext());
    this.m = getIntent();
    android.support.v4.app.a.a(this, new String[] { "android.permission.READ_SMS" }, 1);
    this.u = new d(GoogleSignInOptions.d).b().d();
    this.t = new com.google.android.gms.common.api.r(this).a(this, this).a(com.google.android.gms.auth.api.a.g, this.u).b();
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    this.w = ((TextView)findViewById(2131755798));
    this.v = ((TextView)findViewById(2131755799));
    this.n = ((EditText)findViewById(2131755775));
    this.o = ((EditText)findViewById(2131755776));
    this.p = ((EditText)findViewById(2131755797));
    this.q = ((EditText)findViewById(2131755796));
    this.r = ((RelativeLayout)findViewById(2131755778));
    this.s = ((RelativeLayout)findViewById(2131755783));
    this.I = ((DigitsAuthButton)findViewById(2131755726));
    this.I.setText("Next");
    this.w.setOnClickListener(new dh(this));
    this.v.setOnClickListener(new di(this));
    this.r.setOnClickListener(new dj(this));
    this.s.setOnClickListener(new dk(this));
    this.p.addTextChangedListener(this.J);
    this.q.addTextChangedListener(this.J);
    this.n.addTextChangedListener(this.J);
    this.o.addTextChangedListener(this.J);
    i();
    this.I.setAuthTheme(2131558612);
    ao.f().c();
    this.I.setCallback(new dl(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131820557, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131755838) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.t.e();
  }
  
  protected void onStop()
  {
    super.onStop();
    if (this.t.i()) {
      this.t.g();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\SignupPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */