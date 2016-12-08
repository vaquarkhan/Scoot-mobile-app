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

public class OneWayCabsConfirmBookingPageIntercity
  extends ah
{
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private Button H;
  private TextView I;
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
  private TextView x;
  private TextView y;
  private TextView z;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968636);
    this.m = getIntent();
    this.n = this.m.getStringExtra("pickupDate");
    this.o = this.m.getStringExtra("companyName");
    this.p = this.m.getStringExtra("carName");
    this.q = this.m.getStringExtra("pickupCity");
    this.r = this.m.getStringExtra("dropCity");
    this.s = this.m.getStringExtra("pickupTime");
    this.t = this.m.getStringExtra("totalAmount");
    this.u = this.m.getStringExtra("approxDistance");
    this.v = this.m.getStringExtra("seatingCapacity");
    this.w = this.m.getStringExtra("scootTime");
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
      if (Build.VERSION.SDK_INT >= 21) {
        locala.a(getResources().getDrawable(2130837795, null));
      }
    }
    else
    {
      paramBundle = (TextView)paramBundle.findViewById(2131755818);
      paramBundle.setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      paramBundle.setText("Confirm Booking");
      this.x = ((TextView)findViewById(2131755226));
      this.y = ((TextView)findViewById(2131755414));
      this.z = ((TextView)findViewById(2131755231));
      this.A = ((TextView)findViewById(2131755235));
      this.B = ((TextView)findViewById(2131755240));
      this.C = ((TextView)findViewById(2131755418));
      this.D = ((TextView)findViewById(2131755421));
      this.H = ((Button)findViewById(2131755258));
      this.E = ((TextView)findViewById(2131755249));
      this.F = ((TextView)findViewById(2131755252));
      this.G = ((TextView)findViewById(2131755255));
      this.I = ((TextView)findViewById(2131755257));
      this.H.setText("Continue");
      this.x.setText(this.q);
      this.y.setText(this.r);
      this.z.setText(this.n);
      this.A.setText(this.w);
      this.B.setText("₹ " + this.t);
      this.C.setText(this.u + " Km");
      if (!this.v.equalsIgnoreCase("0")) {
        break label631;
      }
      this.D.setText("NA");
    }
    for (;;)
    {
      this.E.setText(this.o);
      this.F.setText(this.p);
      this.G.setText("1");
      this.I.setText(2131296581);
      this.H.setOnClickListener(new b(this));
      return;
      locala.a(c.a(this, 2130837795));
      break;
      label631:
      this.D.setText(this.v);
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\OneWayCabsConfirmBookingPageIntercity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */