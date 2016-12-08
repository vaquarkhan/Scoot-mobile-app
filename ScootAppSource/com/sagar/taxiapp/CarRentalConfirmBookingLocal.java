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

public class CarRentalConfirmBookingLocal
  extends ah
{
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private String F;
  private int G;
  private String H;
  private String I;
  private String J;
  private String K;
  private String L;
  private String M;
  private String N;
  private String O;
  private String P;
  private String Q;
  private String R;
  private String S;
  private int T;
  private int U;
  private String V;
  private TextView W;
  private TextView X;
  private TextView Y;
  private TextView Z;
  private TextView aa;
  private TextView ab;
  private TextView ac;
  private TextView ad;
  private TextView ae;
  private TextView af;
  private Button ag;
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
    setContentView(2130968607);
    this.m = getIntent();
    this.n = this.m.getStringExtra("pickupCity");
    this.p = this.m.getStringExtra("pickupDate");
    this.q = this.m.getStringExtra("pickupTime");
    this.r = this.m.getStringExtra("carName");
    this.s = this.m.getStringExtra("days");
    this.t = this.m.getStringExtra("cars");
    this.L = this.m.getStringExtra("carId");
    this.M = this.m.getStringExtra("natureId");
    try
    {
      this.T = Integer.parseInt(this.t);
      this.v = this.m.getStringExtra("paidAmount");
      this.w = this.m.getStringExtra("balanceAmount");
      this.x = this.m.getStringExtra("travelTypeOption");
      this.z = this.m.getStringExtra("perKmRateCharge");
      this.C = this.m.getStringExtra("nightHalt");
      this.D = this.m.getStringExtra("userIPAddress");
      this.E = this.m.getStringExtra("tripTypeOption");
      this.F = this.m.getStringExtra("userId");
      this.u = this.m.getStringExtra("totalAmount");
      this.U = Integer.parseInt(this.u);
      this.U *= this.T;
      this.u = ("" + this.U);
      this.y = this.m.getStringExtra("approxDistance");
      this.G = this.m.getIntExtra("seatingCapacity", 0);
      this.K = this.m.getStringExtra("companyName");
      this.N = this.m.getStringExtra("extraPerHour");
      this.O = this.m.getStringExtra("extraPerKm");
      this.V = this.m.getStringExtra("scootTime");
      this.I = this.m.getStringExtra("extraHourRate");
      this.J = this.m.getStringExtra("localBasicRate");
      this.R = this.m.getStringExtra("pickupCityCode");
      this.S = this.m.getStringExtra("pickupDateTime");
      this.W = ((TextView)findViewById(2131755226));
      this.X = ((TextView)findViewById(2131755231));
      this.Y = ((TextView)findViewById(2131755235));
      this.Z = ((TextView)findViewById(2131755240));
      this.aa = ((TextView)findViewById(2131755243));
      this.ab = ((TextView)findViewById(2131755246));
      this.ag = ((Button)findViewById(2131755258));
      this.ac = ((TextView)findViewById(2131755249));
      this.ad = ((TextView)findViewById(2131755252));
      this.ae = ((TextView)findViewById(2131755255));
      this.af = ((TextView)findViewById(2131755257));
      if (this.K.equalsIgnoreCase("makson")) {
        if (this.E.equalsIgnoreCase("1"))
        {
          this.P = getString(2131296569);
          this.Q = ("₹ " + this.N + "/Hour\n" + "₹ " + this.O + "/Km\n");
          this.P = (this.P + this.Q + getString(2131296571));
          this.af.setText(this.P);
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
            if (Build.VERSION.SDK_INT < 21) {
              break label1183;
            }
            locala.a(getResources().getDrawable(2130837795, null));
          }
          paramBundle = (TextView)paramBundle.findViewById(2131755818);
          paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
          paramBundle.setText("Confirm Booking");
          this.ae.setText(this.t);
          this.W.setText(this.n);
          this.X.setText(this.p);
          this.Y.setText(this.V);
          this.Z.setText("₹ " + this.u);
          if (!this.E.equalsIgnoreCase("4")) {
            break label1197;
          }
          this.aa.setText("Full Day");
          this.ab.setText(this.s);
          this.ac.setText(this.K);
          this.ad.setText(this.r);
          this.ag.setOnClickListener(new ax(this));
          return;
        }
      }
    }
    catch (NumberFormatException paramBundle)
    {
      for (;;)
      {
        a locala;
        this.t = "1";
        this.T = 1;
        continue;
        this.P = getString(2131296570);
        continue;
        if (this.K.equalsIgnoreCase("clear car rental"))
        {
          if (this.E.equalsIgnoreCase("4")) {}
          for (this.P = getString(2131296569);; this.P = getString(2131296570))
          {
            this.Q = ("₹ " + this.I + "/Hour\n" + "₹ " + this.z + "/Km\n");
            this.P = (this.P + this.Q + getString(2131296530));
            this.af.setText(this.P);
            break;
          }
          label1183:
          locala.a(c.a(this, 2130837795));
          continue;
          label1197:
          if (this.E.equalsIgnoreCase("5")) {
            this.aa.setText("Half Day");
          } else if (this.E.equalsIgnoreCase("1")) {
            this.aa.setText("Full Day");
          } else {
            this.aa.setText("Half Day");
          }
        }
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\CarRentalConfirmBookingLocal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */