package com.sagar.taxiapp.carrentalservicesbooking;

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
import com.sagar.taxiapp.ds;

public class SavaariConfirmBookingPageIntercity
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
  private String I;
  private String J;
  private String K;
  private TextView L;
  private TextView M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private TextView R;
  private TextView S;
  private TextView T;
  private TextView U;
  private TextView V;
  private Button W;
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
    this.I = this.m.getStringExtra("pickupCityCode");
    this.J = this.m.getStringExtra("dropCityCode");
    this.K = this.m.getStringExtra("pickupDateTime");
    this.r = this.m.getStringExtra("carId");
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
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
        break label810;
      }
      locala.a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText("Confirm Booking");
      this.L = ((TextView)findViewById(2131755226));
      this.M = ((TextView)findViewById(2131755414));
      this.N = ((TextView)findViewById(2131755231));
      this.O = ((TextView)findViewById(2131755235));
      this.P = ((TextView)findViewById(2131755240));
      this.Q = ((TextView)findViewById(2131755418));
      this.R = ((TextView)findViewById(2131755421));
      this.W = ((Button)findViewById(2131755258));
      this.S = ((TextView)findViewById(2131755249));
      this.T = ((TextView)findViewById(2131755252));
      this.U = ((TextView)findViewById(2131755255));
      this.V = ((TextView)findViewById(2131755257));
      this.V.setText(this.A);
      this.L.setText(this.v);
      this.M.setText(this.w);
      this.N.setText(this.n);
      this.O.setText(this.H);
      this.P.setText(this.y);
      this.R.setText(String.valueOf(this.G));
      this.S.setText(this.t);
      this.T.setText(this.u);
      this.U.setText("1");
      this.Q.setText(this.z + " Km");
      this.P.setText("₹ " + this.y);
      this.W.setOnClickListener(new d(this));
      return;
      label810:
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\SavaariConfirmBookingPageIntercity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */