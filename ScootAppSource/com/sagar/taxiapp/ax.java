package com.sagar.taxiapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class ax
  implements View.OnClickListener
{
  ax(CarRentalConfirmBookingLocal paramCarRentalConfirmBookingLocal) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("INTERCITY/RENTAL").c("Rental confirm button clicked").a());
    paramView = new Intent(this.a, LocalCarRentalPrePaymentPage.class);
    paramView.putExtra("days", CarRentalConfirmBookingLocal.a(this.a));
    paramView.putExtra("paidAmount", CarRentalConfirmBookingLocal.b(this.a));
    paramView.putExtra("balanceAmount", CarRentalConfirmBookingLocal.c(this.a));
    paramView.putExtra("totalAmount", CarRentalConfirmBookingLocal.d(this.a));
    paramView.putExtra("approxDistance", CarRentalConfirmBookingLocal.e(this.a));
    paramView.putExtra("minimumChargedDistance", CarRentalConfirmBookingLocal.f(this.a));
    paramView.putExtra("perKmRateCharge", CarRentalConfirmBookingLocal.g(this.a));
    paramView.putExtra("driverCharges", CarRentalConfirmBookingLocal.h(this.a));
    paramView.putExtra("nightHalt", CarRentalConfirmBookingLocal.i(this.a));
    paramView.putExtra("userId", CarRentalConfirmBookingLocal.j(this.a));
    paramView.putExtra("carName", CarRentalConfirmBookingLocal.k(this.a));
    paramView.putExtra("pickupCity", CarRentalConfirmBookingLocal.l(this.a));
    paramView.putExtra("dropCity", CarRentalConfirmBookingLocal.m(this.a));
    paramView.putExtra("pickupDate", CarRentalConfirmBookingLocal.n(this.a));
    paramView.putExtra("pickupTime", CarRentalConfirmBookingLocal.o(this.a));
    paramView.putExtra("tripTypeOption", CarRentalConfirmBookingLocal.p(this.a));
    paramView.putExtra("userIPAddress", CarRentalConfirmBookingLocal.q(this.a));
    paramView.putExtra("travelTypeOption", CarRentalConfirmBookingLocal.r(this.a));
    paramView.putExtra("onewayPerKmRate", CarRentalConfirmBookingLocal.s(this.a));
    paramView.putExtra("cars", CarRentalConfirmBookingLocal.t(this.a));
    paramView.putExtra("seatingCapacity", CarRentalConfirmBookingLocal.u(this.a));
    paramView.putExtra("provName", CarRentalConfirmBookingLocal.v(this.a));
    paramView.putExtra("natureId", CarRentalConfirmBookingLocal.w(this.a));
    paramView.putExtra("carId", CarRentalConfirmBookingLocal.x(this.a));
    paramView.putExtra("scootTime", CarRentalConfirmBookingLocal.y(this.a));
    paramView.putExtra("localBasicRate", CarRentalConfirmBookingLocal.z(this.a));
    paramView.putExtra("extraHourRate", CarRentalConfirmBookingLocal.A(this.a));
    paramView.putExtra("pickupCityCode", CarRentalConfirmBookingLocal.B(this.a));
    paramView.putExtra("pickupDateTime", CarRentalConfirmBookingLocal.C(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */