package com.sagar.taxiapp.a;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ed;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sagar.taxiapp.CarRentalConfirmBooking;
import com.sagar.taxiapp.CarRentalConfirmBookingLocal;
import com.sagar.taxiapp.beans.c;
import com.sagar.taxiapp.carrentalservicesbooking.MaksonConfirmBookingPageIntercity;
import com.sagar.taxiapp.carrentalservicesbooking.OneWayCabsConfirmBookingPageIntercity;
import com.sagar.taxiapp.carrentalservicesbooking.RoderIntercityConfirmBooking;
import com.sagar.taxiapp.carrentalservicesbooking.SavaariConfirmBookingPageIntercity;
import com.scootapp.tv.d.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;

public final class k
  extends ed<n>
{
  private Context a;
  private ArrayList<c> b;
  private String c;
  
  public k(Context paramContext, ArrayList<c> paramArrayList, String paramString)
  {
    this.a = paramContext;
    this.b = paramArrayList;
    this.c = paramString;
  }
  
  public int a()
  {
    return this.b.size();
  }
  
  public void a(n paramn, int paramInt)
  {
    c localc = (c)this.b.get(paramInt);
    int i = Integer.parseInt(a.a(localc.c));
    paramn.l.setText(localc.a);
    if (localc.a.equalsIgnoreCase("one way cabs"))
    {
      paramn.r.setVisibility(0);
      if (i == 0) {
        break label178;
      }
      paramn.n.setText(String.format("Passengers: %s", new Object[] { Integer.valueOf(i) }));
      label85:
      paramn.m.setText(localc.b);
      paramn.o.setText(String.format("%s%s", new Object[] { "₹ ", localc.g }));
      if (i > 4) {
        break label202;
      }
      Picasso.with(this.a).load(2130837614).into(paramn.p);
    }
    for (;;)
    {
      paramn.q.setOnClickListener(new l(this, paramInt));
      return;
      paramn.r.setVisibility(4);
      break;
      label178:
      paramn.n.setText(String.format("Passengers: %s", new Object[] { "NA" }));
      break label85;
      label202:
      if ((i >= 6) && (i <= 8)) {
        Picasso.with(this.a).load(2130837924).into(paramn.p);
      } else if (i == 12) {
        Picasso.with(this.a).load(2130837607).into(paramn.p);
      } else {
        Picasso.with(this.a).load(2130837614).into(paramn.p);
      }
    }
  }
  
  public void a(c paramc)
  {
    Intent localIntent = new Intent(this.a, OneWayCabsConfirmBookingPageIntercity.class);
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("dropCity", paramc.i);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("totalAmount", paramc.g);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("seatingCapacity", a.a(paramc.c));
    localIntent.putExtra("scootTime", paramc.I);
    this.a.startActivity(localIntent);
  }
  
  public void a(ArrayList<c> paramArrayList)
  {
    this.b = paramArrayList;
    c();
  }
  
  public void b(c paramc)
  {
    Intent localIntent = new Intent(this.a, RoderIntercityConfirmBooking.class);
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("dropCity", paramc.i);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("totalAmount", paramc.g);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("seatingCapacity", a.a(paramc.c));
    localIntent.putExtra("scootTime", paramc.I);
    localIntent.putExtra("bookingId", paramc.e);
    localIntent.putExtra("preference", paramc.d);
    localIntent.putExtra("days", paramc.t);
    localIntent.putExtra("travelTypeOption", paramc.l);
    localIntent.putExtra("tripTypeOption", paramc.m);
    this.a.startActivity(localIntent);
  }
  
  public n c(ViewGroup paramViewGroup, int paramInt)
  {
    return new n(LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968638, paramViewGroup, false));
  }
  
  public void c(c paramc)
  {
    Intent localIntent = new Intent(this.a, SavaariConfirmBookingPageIntercity.class);
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("dropCity", paramc.i);
    localIntent.putExtra("pickupCityCode", paramc.J);
    localIntent.putExtra("dropCityCode", paramc.K);
    localIntent.putExtra("pickupDateTime", paramc.L);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("totalAmount", paramc.g);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("seatingCapacity", a.a(paramc.c));
    localIntent.putExtra("scootTime", paramc.I);
    localIntent.putExtra("days", paramc.t);
    localIntent.putExtra("travelTypeOption", paramc.l);
    localIntent.putExtra("tripTypeOption", paramc.m);
    localIntent.putExtra("carId", paramc.B);
    this.a.startActivity(localIntent);
  }
  
  public void d(c paramc)
  {
    Dialog localDialog = new Dialog(this.a);
    localDialog.requestWindowFeature(1);
    localDialog.setContentView(2130968637);
    Button localButton = (Button)localDialog.findViewById(2131755425);
    EditText localEditText = (EditText)localDialog.findViewById(2131755424);
    TextView localTextView = (TextView)localDialog.findViewById(2131755423);
    localEditText.clearFocus();
    localTextView.setText(String.format("How many %s cars do you want to book?", new Object[] { paramc.b }));
    localButton.setOnClickListener(new m(this, localEditText, paramc, localDialog));
    localDialog.show();
  }
  
  public void e(c paramc)
  {
    Intent localIntent = new Intent(this.a, MaksonConfirmBookingPageIntercity.class);
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("dropCity", paramc.i);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("totalAmount", paramc.g);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("days", paramc.t);
    localIntent.putExtra("travelTypeOption", paramc.l);
    localIntent.putExtra("tripTypeOption", paramc.m);
    localIntent.putExtra("carId", paramc.B);
    localIntent.putExtra("natureId", paramc.A);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("seatingCapacity", Integer.parseInt(a.a(paramc.c)));
    localIntent.putExtra("PricePerKm", paramc.E);
    localIntent.putExtra("DriverAllowance", paramc.F);
    localIntent.putExtra("NightDetention", paramc.G);
    localIntent.putExtra("scootTime", paramc.I);
    this.a.startActivity(localIntent);
  }
  
  public void f(c paramc)
  {
    Intent localIntent = new Intent(this.a, CarRentalConfirmBooking.class);
    localIntent.putExtra("seatingCapacity", Integer.parseInt(a.a(paramc.c)));
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("dropCity", paramc.i);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("days", paramc.t);
    localIntent.putExtra("cars", paramc.z);
    localIntent.putExtra("paidAmount", paramc.s);
    localIntent.putExtra("balanceAmount", "0");
    localIntent.putExtra("totalAmount", paramc.s);
    localIntent.putExtra("travelTypeOption", paramc.l);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("perKmRateCharge", paramc.n);
    localIntent.putExtra("onewayPerKmRate", paramc.p);
    localIntent.putExtra("minimumChargedDistance", paramc.w);
    localIntent.putExtra("driverCharges", paramc.q);
    localIntent.putExtra("nightHalt", paramc.r);
    localIntent.putExtra("userIPAddress", paramc.v);
    localIntent.putExtra("tripTypeOption", paramc.m);
    localIntent.putExtra("userId", paramc.u);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("scootTime", paramc.I);
    this.a.startActivity(localIntent);
  }
  
  public void g(c paramc)
  {
    Intent localIntent = new Intent(this.a, CarRentalConfirmBookingLocal.class);
    localIntent.putExtra("seatingCapacity", Integer.parseInt(a.a(paramc.c)));
    localIntent.putExtra("pickupCity", paramc.h);
    localIntent.putExtra("pickupDate", paramc.k);
    localIntent.putExtra("pickupTime", paramc.j);
    localIntent.putExtra("carName", paramc.b);
    localIntent.putExtra("days", paramc.t);
    localIntent.putExtra("cars", paramc.z);
    localIntent.putExtra("paidAmount", paramc.s);
    localIntent.putExtra("balanceAmount", "0");
    localIntent.putExtra("totalAmount", paramc.s);
    localIntent.putExtra("travelTypeOption", paramc.l);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("perKmRateCharge", paramc.n);
    localIntent.putExtra("localBasicRate", paramc.x);
    localIntent.putExtra("extraHourRate", paramc.y);
    localIntent.putExtra("nightHalt", paramc.r);
    localIntent.putExtra("userIPAddress", paramc.v);
    localIntent.putExtra("tripTypeOption", paramc.m);
    localIntent.putExtra("userId", paramc.u);
    localIntent.putExtra("carId", paramc.B);
    localIntent.putExtra("natureId", paramc.A);
    localIntent.putExtra("approxDistance", paramc.o);
    localIntent.putExtra("companyName", paramc.a);
    localIntent.putExtra("extraPerKm", paramc.C);
    localIntent.putExtra("extraPerHour", paramc.D);
    localIntent.putExtra("scootTime", paramc.I);
    localIntent.putExtra("pickupCityCode", paramc.J);
    localIntent.putExtra("pickupDateTime", paramc.L);
    this.a.startActivity(localIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */