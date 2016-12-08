package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalPrePaymentPage;

final class d
  implements View.OnClickListener
{
  d(SavaariConfirmBookingPageIntercity paramSavaariConfirmBookingPageIntercity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, CarRentalPrePaymentPage.class);
    paramView.putExtra("pickupDate", SavaariConfirmBookingPageIntercity.a(this.a));
    paramView.putExtra("pickupTime", SavaariConfirmBookingPageIntercity.b(this.a));
    paramView.putExtra("pickupCity", SavaariConfirmBookingPageIntercity.c(this.a));
    paramView.putExtra("dropCity", SavaariConfirmBookingPageIntercity.d(this.a));
    paramView.putExtra("pickupCityCode", SavaariConfirmBookingPageIntercity.e(this.a));
    paramView.putExtra("dropCityCode", SavaariConfirmBookingPageIntercity.f(this.a));
    paramView.putExtra("pickupDateTime", SavaariConfirmBookingPageIntercity.g(this.a));
    paramView.putExtra("days", SavaariConfirmBookingPageIntercity.h(this.a));
    paramView.putExtra("travelTypeOption", SavaariConfirmBookingPageIntercity.i(this.a));
    paramView.putExtra("tripTypeOption", SavaariConfirmBookingPageIntercity.j(this.a));
    paramView.putExtra("totalAmount", SavaariConfirmBookingPageIntercity.k(this.a));
    paramView.putExtra("carName", SavaariConfirmBookingPageIntercity.l(this.a));
    paramView.putExtra("approxDistance", SavaariConfirmBookingPageIntercity.m(this.a));
    paramView.putExtra("provName", SavaariConfirmBookingPageIntercity.n(this.a));
    paramView.putExtra("scootTime", SavaariConfirmBookingPageIntercity.o(this.a));
    paramView.putExtra("carId", SavaariConfirmBookingPageIntercity.p(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */