package com.sagar.taxiapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.digits.sdk.android.DigitsAuthButton;

public class MobileVerification
  extends ah
{
  Bundle m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private TextView u;
  private TextView v;
  private EditText w;
  private Button x;
  private Context y;
  
  public void l()
  {
    new cf(this, 30000L, 1000L).start();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968742);
    this.m = getIntent().getExtras();
    this.n = this.m.getString("emailId");
    this.o = this.m.getString("password");
    this.p = this.m.getString("firstName");
    this.q = this.m.getString("lastName");
    this.r = this.m.getString("phoneNumber");
    this.s = this.m.getString("signupType");
    this.t = this.m.getString("displayPictureUrl");
    this.y = this;
    this.v = ((TextView)findViewById(2131755727));
    this.u = ((TextView)findViewById(2131755722));
    this.w = ((EditText)findViewById(2131755723));
    this.x = ((Button)findViewById(2131755724));
    l();
    paramBundle = (DigitsAuthButton)findViewById(2131755726);
    paramBundle.setText("Hello");
    paramBundle.setAuthTheme(2131558612);
    paramBundle.setCallback(new cc(this));
    this.x.setOnClickListener(new cd(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\MobileVerification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */