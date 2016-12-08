package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.sagar.taxiapp.ds;

public class MaksonConfirmBookingPageIntercity
  extends ah
{
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private int F;
  private String G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private TextView L;
  private TextView M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private TextView R;
  private Button S;
  Intent m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private String u;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968636);
    this.m = getIntent();
    this.n = this.m.getStringExtra("pickupDate");
    this.o = this.m.getStringExtra("days");
    this.p = this.m.getStringExtra("travelTypeOption");
    this.q = this.m.getStringExtra("tripTypeOption");
    this.r = this.m.getStringExtra("carId");
    this.s = this.m.getStringExtra("natureId");
    this.t = this.m.getStringExtra("companyName");
    this.u = this.m.getStringExtra("carName");
    this.v = this.m.getStringExtra("pickupCity");
    this.w = this.m.getStringExtra("dropCity");
    this.x = this.m.getStringExtra("pickupTime");
    this.y = this.m.getStringExtra("totalAmount");
    this.z = this.m.getStringExtra("approxDistance");
    this.F = this.m.getIntExtra("seatingCapacity", 0);
    this.C = this.m.getStringExtra("PricePerKm");
    this.D = this.m.getStringExtra("DriverAllowance");
    this.E = this.m.getStringExtra("NightDetention");
    this.G = this.m.getStringExtra("scootTime");
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    paramBundle = (Toolbar)findViewById(2131755210);
    a(paramBundle);
    android.support.v7.a.a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label929;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText("Confirm Booking");
      this.A = (getString(2131296567) + this.z + " Kms\n");
      this.A = (this.A + "If you use the cab for more than " + this.o + "day(s) and " + this.z + " Kms,\nextra charges as follows:\n");
      this.B = ("₹ " + this.C + "/Km\n" + "₹ " + this.D + "/day driver charges\n" + "₹ " + this.E + "/night driver charges\n");
      this.A = (this.A + this.B + getString(2131296571));
      this.H = ((TextView)findViewById(2131755226));
      this.I = ((TextView)findViewById(2131755414));
      this.J = ((TextView)findViewById(2131755231));
      this.K = ((TextView)findViewById(2131755235));
      this.L = ((TextView)findViewById(2131755240));
      this.M = ((TextView)findViewById(2131755418));
      this.N = ((TextView)findViewById(2131755421));
      this.S = ((Button)findViewById(2131755258));
      this.O = ((TextView)findViewById(2131755249));
      this.P = ((TextView)findViewById(2131755252));
      this.Q = ((TextView)findViewById(2131755255));
      this.R = ((TextView)findViewById(2131755257));
      this.R.setText(this.A);
      this.H.setText(this.v);
      this.I.setText(this.w);
      this.J.setText(this.n);
      this.K.setText(this.G);
      this.L.setText(this.y);
      this.N.setText(String.valueOf(this.F));
      this.O.setText(this.t);
      this.P.setText(this.u);
      this.Q.setText("1");
      this.M.setText(this.z + " Km");
      this.L.setText("₹ " + this.y);
      this.S.setOnClickListener(new a(this));
      return;
      label929:
      locala.a(c.a(this, 2130837795));
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\MaksonConfirmBookingPageIntercity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */