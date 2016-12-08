package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalPrePaymentPage;

final class c
  implements View.OnClickListener
{
  c(RoderIntercityConfirmBooking paramRoderIntercityConfirmBooking) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, CarRentalPrePaymentPage.class);
    paramView.putExtra("pickupDate", RoderIntercityConfirmBooking.a(this.a));
    paramView.putExtra("pickupTime", RoderIntercityConfirmBooking.b(this.a));
    paramView.putExtra("pickupCity", RoderIntercityConfirmBooking.c(this.a));
    paramView.putExtra("dropCity", RoderIntercityConfirmBooking.d(this.a));
    paramView.putExtra("days", RoderIntercityConfirmBooking.e(this.a));
    paramView.putExtra("travelTypeOption", RoderIntercityConfirmBooking.f(this.a));
    paramView.putExtra("tripTypeOption", RoderIntercityConfirmBooking.g(this.a));
    paramView.putExtra("carId", RoderIntercityConfirmBooking.h(this.a));
    paramView.putExtra("natureId", RoderIntercityConfirmBooking.i(this.a));
    paramView.putExtra("totalAmount", RoderIntercityConfirmBooking.j(this.a));
    paramView.putExtra("carName", RoderIntercityConfirmBooking.k(this.a));
    paramView.putExtra("approxDistance", RoderIntercityConfirmBooking.l(this.a));
    paramView.putExtra("provName", RoderIntercityConfirmBooking.m(this.a));
    paramView.putExtra("scootTime", RoderIntercityConfirmBooking.n(this.a));
    paramView.putExtra("preference", RoderIntercityConfirmBooking.o(this.a));
    paramView.putExtra("bookingId", RoderIntercityConfirmBooking.p(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */