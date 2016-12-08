package com.sagar.taxiapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class aw
  implements View.OnClickListener
{
  aw(CarRentalConfirmBooking paramCarRentalConfirmBooking) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("INTERCITY/RENTAL").c("Intercity confirm button clicked").a());
    paramView = new Intent(this.a, CarRentalPrePaymentPage.class);
    paramView.putExtra("days", CarRentalConfirmBooking.a(this.a));
    paramView.putExtra("paidAmount", CarRentalConfirmBooking.b(this.a));
    paramView.putExtra("balanceAmount", CarRentalConfirmBooking.c(this.a));
    paramView.putExtra("totalAmount", CarRentalConfirmBooking.d(this.a));
    paramView.putExtra("approxDistance", CarRentalConfirmBooking.e(this.a));
    paramView.putExtra("minimumChargedDistance", CarRentalConfirmBooking.f(this.a));
    paramView.putExtra("perKmRateCharge", CarRentalConfirmBooking.g(this.a));
    paramView.putExtra("driverCharges", CarRentalConfirmBooking.h(this.a));
    paramView.putExtra("nightHalt", CarRentalConfirmBooking.i(this.a));
    paramView.putExtra("userId", CarRentalConfirmBooking.j(this.a));
    paramView.putExtra("carName", CarRentalConfirmBooking.k(this.a));
    paramView.putExtra("pickupCity", CarRentalConfirmBooking.l(this.a));
    paramView.putExtra("dropCity", CarRentalConfirmBooking.m(this.a));
    paramView.putExtra("pickupDate", CarRentalConfirmBooking.n(this.a));
    paramView.putExtra("pickupTime", CarRentalConfirmBooking.o(this.a));
    paramView.putExtra("tripTypeOption", CarRentalConfirmBooking.p(this.a));
    paramView.putExtra("userIPAddress", CarRentalConfirmBooking.q(this.a));
    paramView.putExtra("travelTypeOption", CarRentalConfirmBooking.r(this.a));
    paramView.putExtra("onewayPerKmRate", CarRentalConfirmBooking.s(this.a));
    paramView.putExtra("cars", CarRentalConfirmBooking.t(this.a));
    paramView.putExtra("seatingCapacity", CarRentalConfirmBooking.u(this.a));
    paramView.putExtra("provName", CarRentalConfirmBooking.v(this.a));
    paramView.putExtra("scootTime", CarRentalConfirmBooking.w(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */