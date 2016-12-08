package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalPrePaymentPage;

final class a
  implements View.OnClickListener
{
  a(MaksonConfirmBookingPageIntercity paramMaksonConfirmBookingPageIntercity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, CarRentalPrePaymentPage.class);
    paramView.putExtra("pickupDate", MaksonConfirmBookingPageIntercity.a(this.a));
    paramView.putExtra("pickupTime", MaksonConfirmBookingPageIntercity.b(this.a));
    paramView.putExtra("pickupCity", MaksonConfirmBookingPageIntercity.c(this.a));
    paramView.putExtra("dropCity", MaksonConfirmBookingPageIntercity.d(this.a));
    paramView.putExtra("days", MaksonConfirmBookingPageIntercity.e(this.a));
    paramView.putExtra("travelTypeOption", MaksonConfirmBookingPageIntercity.f(this.a));
    paramView.putExtra("tripTypeOption", MaksonConfirmBookingPageIntercity.g(this.a));
    paramView.putExtra("carId", MaksonConfirmBookingPageIntercity.h(this.a));
    paramView.putExtra("natureId", MaksonConfirmBookingPageIntercity.i(this.a));
    paramView.putExtra("totalAmount", MaksonConfirmBookingPageIntercity.j(this.a));
    paramView.putExtra("carName", MaksonConfirmBookingPageIntercity.k(this.a));
    paramView.putExtra("approxDistance", MaksonConfirmBookingPageIntercity.l(this.a));
    paramView.putExtra("provName", MaksonConfirmBookingPageIntercity.m(this.a));
    paramView.putExtra("scootTime", MaksonConfirmBookingPageIntercity.n(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */