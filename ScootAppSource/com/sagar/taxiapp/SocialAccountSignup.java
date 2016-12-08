package com.sagar.taxiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.a;
import android.support.v4.b.c;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.ao;
import com.twitter.sdk.android.core.m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SocialAccountSignup
  extends Activity
{
  Bundle a;
  private EditText b;
  private EditText c;
  private EditText d;
  private TextView e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  private DigitsAuthButton p;
  private TextWatcher q = new dr(this);
  
  private void a()
  {
    this.f = this.b.getText().toString();
    this.g = this.c.getText().toString();
    this.h = this.d.getText().toString();
    if (this.g.length() > 0)
    {
      this.l = true;
      if (this.h.length() <= 0) {
        break label142;
      }
      this.m = true;
      label72:
      if (!a(this.f)) {
        break label150;
      }
    }
    label142:
    label150:
    for (this.n = true;; this.n = false)
    {
      if ((!this.l) || (!this.m) || (!this.n)) {
        break label158;
      }
      this.p.setClickable(true);
      this.p.setBackgroundResource(2130837611);
      this.p.setTextColor(-1);
      return;
      this.l = false;
      break;
      this.m = false;
      break label72;
    }
    label158:
    this.p.setClickable(false);
    this.p.setBackgroundResource(2130837610);
    this.p.setTextColor(-12303292);
  }
  
  public static boolean a(String paramString)
  {
    boolean bool = false;
    if (Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(paramString).matches()) {
      bool = true;
    }
    return bool;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968760);
    this.a = getIntent().getExtras();
    this.f = this.a.getString("email");
    this.h = this.a.getString("last_name");
    this.g = this.a.getString("first_name");
    this.i = this.a.getString("password");
    this.j = this.a.getString("signupType");
    this.k = this.a.getString("displayPictureUrl");
    this.e = ((TextView)findViewById(2131755798));
    this.b = ((EditText)findViewById(2131755775));
    this.c = ((EditText)findViewById(2131755797));
    this.d = ((EditText)findViewById(2131755796));
    this.p = ((DigitsAuthButton)findViewById(2131755726));
    this.b.setText(this.f);
    this.c.setText(this.g);
    this.d.setText(this.h);
    this.p.setText("Next");
    ao.f().c();
    a.a(this, new String[] { "android.permission.READ_SMS" }, 1);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    this.c.addTextChangedListener(this.q);
    this.d.addTextChangedListener(this.q);
    this.b.addTextChangedListener(this.q);
    a();
    this.e.setOnClickListener(new dp(this));
    this.p.setCallback(new dq(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131820544, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131755838) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\SocialAccountSignup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */