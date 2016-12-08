package com.tushar.taxiapp.scootapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.a;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.sagar.taxiapp.ds;

public class RideCompletionActivity
  extends android.support.v7.a.ah
{
  private RadioButton A;
  private RadioButton B;
  private RadioButton C;
  private RadioButton D;
  private String E = "";
  private String F = "";
  private String G;
  private String H;
  private TextView m;
  private TextView n;
  private EditText o;
  private EditText p;
  private RatingBar q;
  private Button r;
  private Intent s;
  private ImageView t;
  private SharedPreferences u;
  private SharedPreferences v;
  private SharedPreferences.Editor w;
  private boolean x = false;
  private ScrollView y;
  private RadioButton z;
  
  public void finish()
  {
    super.finish();
  }
  
  public void l()
  {
    this.r.setEnabled(true);
    this.r.setClickable(true);
    this.r.setBackgroundResource(2130837922);
    this.r.setTextColor(-1);
  }
  
  public void m()
  {
    this.r.setEnabled(false);
    this.r.setClickable(false);
    this.r.setBackgroundResource(2130837921);
    this.r.setTextColor(-16777216);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968739);
    this.u = getSharedPreferences("olaBookingDetails", 0);
    this.v = getSharedPreferences("latestOlaRideFeedBackRecord", 0);
    this.w = this.v.edit();
    this.s = getIntent();
    this.m = ((TextView)findViewById(2131755702));
    this.n = ((TextView)findViewById(2131755700));
    this.o = ((EditText)findViewById(2131755717));
    this.p = ((EditText)findViewById(2131755707));
    this.r = ((Button)findViewById(2131755709));
    this.q = ((RatingBar)findViewById(2131755705));
    this.t = ((ImageView)findViewById(2131755706));
    this.y = ((ScrollView)findViewById(2131755708));
    this.z = ((RadioButton)findViewById(2131755402));
    this.A = ((RadioButton)findViewById(2131755405));
    this.B = ((RadioButton)findViewById(2131755408));
    this.C = ((RadioButton)findViewById(2131755411));
    this.D = ((RadioButton)findViewById(2131755715));
    this.G = this.u.getString("time", "");
    this.H = this.u.getString("date", "");
    this.n.setText(this.G + ",\n" + this.H);
    this.q.setActivated(true);
    try
    {
      this.m.setText("" + this.v.getInt("lastRideAmount", 0));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.clearFlags(67108864);
        paramBundle.setStatusBarColor(c.c(this, 2131689628));
      }
      paramBundle = (Toolbar)findViewById(2131755210);
      a(paramBundle);
      localObject = h();
      if (localObject != null)
      {
        ((a)localObject).c(false);
        ((a)localObject).b(false);
        ((a)localObject).a(false);
        if (Build.VERSION.SDK_INT < 21) {}
      }
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText("Feedback");
      this.q.setOnRatingBarChangeListener(new ac(this));
      this.z.setOnCheckedChangeListener(new ad(this));
      this.A.setOnCheckedChangeListener(new ae(this));
      this.B.setOnCheckedChangeListener(new af(this));
      this.C.setOnCheckedChangeListener(new ag(this));
      this.D.setOnCheckedChangeListener(new ah(this));
      this.r.setOnClickListener(new aj(this));
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        Object localObject = new ParseObject("exceptionRideCompletion");
        ((ParseObject)localObject).put("emailid", ParseUser.getCurrentUser().getEmail());
        ((ParseObject)localObject).put("message", paramBundle.getMessage());
        ((ParseObject)localObject).saveInBackground();
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\RideCompletionActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */