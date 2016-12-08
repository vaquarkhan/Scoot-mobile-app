package com.sagar.taxiapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CarRentalConfirmBooking
  extends ah
{
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private String F;
  private String G;
  private int H;
  private String I;
  private int J;
  private int K;
  private String L;
  private String M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private TextView R;
  private TextView S;
  private TextView T;
  private TextView U;
  private TextView V;
  private TextView W;
  private TextView X;
  private Button Y;
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
    this.n = this.m.getStringExtra("pickupCity");
    this.o = this.m.getStringExtra("dropCity");
    this.p = this.m.getStringExtra("pickupDate");
    this.q = this.m.getStringExtra("pickupTime");
    this.r = this.m.getStringExtra("carName");
    this.s = this.m.getStringExtra("days");
    this.t = this.m.getStringExtra("cars");
    try
    {
      this.J = Integer.parseInt(this.t);
      this.v = this.m.getStringExtra("paidAmount");
      this.w = this.m.getStringExtra("balanceAmount");
      this.x = this.m.getStringExtra("travelTypeOption");
      this.y = this.m.getStringExtra("approxDistance");
      this.z = this.m.getStringExtra("perKmRateCharge");
      this.A = this.m.getStringExtra("onewayPerKmRate");
      this.B = this.m.getStringExtra("driverCharges");
      this.C = this.m.getStringExtra("nightHalt");
      this.D = this.m.getStringExtra("userIPAddress");
      this.E = this.m.getStringExtra("tripTypeOption");
      this.F = this.m.getStringExtra("userId");
      this.I = this.m.getStringExtra("minimumChargedDistance");
      this.u = this.m.getStringExtra("totalAmount");
      this.K = Integer.parseInt(this.u);
      this.K *= this.J;
      this.u = ("" + this.K);
      this.H = this.m.getIntExtra("seatingCapacity", 0);
      this.L = this.m.getStringExtra("companyName");
      this.M = this.m.getStringExtra("scootTime");
      this.N = ((TextView)findViewById(2131755226));
      this.O = ((TextView)findViewById(2131755414));
      this.P = ((TextView)findViewById(2131755231));
      this.Q = ((TextView)findViewById(2131755235));
      this.R = ((TextView)findViewById(2131755240));
      this.S = ((TextView)findViewById(2131755418));
      this.T = ((TextView)findViewById(2131755421));
      this.Y = ((Button)findViewById(2131755258));
      this.U = ((TextView)findViewById(2131755249));
      this.V = ((TextView)findViewById(2131755252));
      this.W = ((TextView)findViewById(2131755255));
      this.X = ((TextView)findViewById(2131755257));
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.clearFlags(67108864);
        paramBundle.setStatusBarColor(c.c(this, 2131689628));
      }
      paramBundle = (Toolbar)findViewById(2131755210);
      a(paramBundle);
      locala = h();
      if (locala != null)
      {
        locala.c(false);
        locala.b(true);
        locala.a(true);
        if (Build.VERSION.SDK_INT >= 21) {
          locala.a(getResources().getDrawable(2130837795, null));
        }
      }
      else
      {
        paramBundle = (TextView)paramBundle.findViewById(2131755818);
        paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
        paramBundle.setText("Confirm Booking");
        this.G = (getString(2131296531) + this.y + " Kms" + getString(2131296532) + this.s + " Day(s) and " + this.y + " Kms" + getString(2131296533) + this.y + " Kms and " + this.s + " Day(s)\n" + "₹ " + this.z + "/Km\n" + "₹ " + this.B + "/day driver charges\n" + getString(2131296530));
        this.W.setText(this.t);
        this.N.setText(this.n);
        this.O.setText(this.o);
        this.P.setText(this.p);
        this.Q.setText(this.M);
        this.R.setText("₹ " + this.u);
        this.S.setText(this.y + " Km");
        this.T.setText(this.H + "/Car");
        this.U.setText(this.L);
        this.V.setText(this.r);
        this.X.setText(this.G);
        this.Y.setOnClickListener(new aw(this));
        return;
      }
    }
    catch (NumberFormatException paramBundle)
    {
      for (;;)
      {
        a locala;
        this.t = "1";
        this.J = 1;
        continue;
        locala.a(c.a(this, 2130837795));
      }
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalConfirmBooking.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */