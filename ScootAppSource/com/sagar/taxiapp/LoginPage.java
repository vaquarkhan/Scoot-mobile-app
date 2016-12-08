package com.sagar.taxiapp;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.b.c;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.k;
import com.facebook.l;
import com.facebook.w;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.auth.api.signin.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.t;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPage
  extends aa
  implements t
{
  private boolean A = false;
  private String B;
  private String C;
  private EditText m;
  private EditText n;
  private RelativeLayout o;
  private RelativeLayout p;
  private Button q;
  private TextView r;
  private TextView s;
  private q t;
  private GoogleSignInOptions u;
  private AccessToken v;
  private com.facebook.login.r w;
  private k x;
  private boolean y = false;
  private boolean z = false;
  
  private void a(e parame)
  {
    if (parame.c()) {
      a(parame.a().c(), "googleplus");
    }
  }
  
  private void a(String paramString, EditText paramEditText)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this, 2131034137);
    localAnimation.setAnimationListener(new bx(this, paramEditText, paramString));
    paramEditText.startAnimation(localAnimation);
  }
  
  private void a(String paramString1, String paramString2)
  {
    ParseQuery localParseQuery = ParseUser.getQuery();
    localParseQuery.whereEqualTo("username", paramString1);
    localParseQuery.findInBackground(new by(this, paramString2, paramString1));
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(paramString).matches()) {
      bool = true;
    }
    return bool;
  }
  
  private void b(String paramString)
  {
    ParseQuery localParseQuery = ParseUser.getQuery();
    localParseQuery.whereEqualTo("username", paramString);
    localParseQuery.findInBackground(new bz(this, paramString));
  }
  
  private void i()
  {
    this.y = true;
    startActivityForResult(a.l.a(this.t), 0);
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (!this.t.i()) {
      this.t.e();
    }
  }
  
  public void h()
  {
    this.y = false;
    this.x = l.a();
    com.facebook.login.r localr = this.w;
    com.facebook.login.r.a().a(this, Arrays.asList(new String[] { "public_profile", "email" }));
    localr = this.w;
    com.facebook.login.r.a().a(this.x, new ca(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (!this.y) {
      this.x.a(paramInt1, paramInt2, paramIntent);
    }
    while (paramInt1 != 0) {
      return;
    }
    a(a.l.a(paramIntent));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968755);
    w.a(getApplicationContext());
    this.u = new d(GoogleSignInOptions.d).b().d();
    this.t = new com.google.android.gms.common.api.r(this).a(this, this).a(a.g, this.u).b();
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    this.m = ((EditText)findViewById(2131755775));
    this.n = ((EditText)findViewById(2131755776));
    this.o = ((RelativeLayout)findViewById(2131755778));
    this.p = ((RelativeLayout)findViewById(2131755783));
    this.r = ((TextView)findViewById(2131755792));
    this.s = ((TextView)findViewById(2131755791));
    this.q = ((Button)findViewById(2131755788));
    this.o.setOnClickListener(new bs(this));
    this.s.setOnClickListener(new bt(this));
    this.p.setOnClickListener(new bu(this));
    this.r.setOnClickListener(new bv(this));
    this.q.setOnClickListener(new bw(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131820545, paramMenu);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\LoginPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */