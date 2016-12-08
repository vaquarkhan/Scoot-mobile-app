package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.a.a;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.sagar.taxiapp.ds;

public class RoderIntercityConfirmBooking
  extends ah
{
  private String A;
  private String B;
  private String C;
  private String D;
  private String E;
  private String F;
  private String G;
  private String H;
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
  private TextView S;
  private Button T;
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
    this.G = this.m.getStringExtra("seatingCapacity");
    this.B = this.m.getStringExtra("PricePerKm");
    this.C = this.m.getStringExtra("DriverAllowance");
    this.D = this.m.getStringExtra("NightDetention");
    this.H = this.m.getStringExtra("scootTime");
    this.E = this.m.getStringExtra("preference");
    this.F = this.m.getStringExtra("bookingId");
    this.A = getString(2131296596);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
    }
    paramBundle = (Toolbar)findViewById(2131755210);
    a(paramBundle);
    a locala = h();
    if (locala != null)
    {
      locala.c(false);
      locala.b(true);
      locala.a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label766;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText("Confirm Booking");
      this.I = ((TextView)findViewById(2131755226));
      this.J = ((TextView)findViewById(2131755414));
      this.K = ((TextView)findViewById(2131755231));
      this.L = ((TextView)findViewById(2131755235));
      this.M = ((TextView)findViewById(2131755240));
      this.N = ((TextView)findViewById(2131755418));
      this.O = ((TextView)findViewById(2131755421));
      this.T = ((Button)findViewById(2131755258));
      this.P = ((TextView)findViewById(2131755249));
      this.Q = ((TextView)findViewById(2131755252));
      this.R = ((TextView)findViewById(2131755255));
      this.S = ((TextView)findViewById(2131755257));
      this.S.setText(this.A);
      this.I.setText(this.v);
      this.J.setText(this.w);
      this.K.setText(this.n);
      this.L.setText(this.H);
      this.M.setText(this.y);
      this.O.setText(String.valueOf(this.G));
      this.P.setText(this.t);
      this.Q.setText(this.u);
      this.R.setText("1");
      this.N.setText(this.z + " Km");
      this.M.setText("₹ " + this.y);
      this.T.setOnClickListener(new c(this));
      return;
      label766:
      locala.a(android.support.v4.b.c.a(this, 2130837795));
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\RoderIntercityConfirmBooking.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */