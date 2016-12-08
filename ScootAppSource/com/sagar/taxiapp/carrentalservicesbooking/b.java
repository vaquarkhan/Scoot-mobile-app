package com.sagar.taxiapp.carrentalservicesbooking;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalPrePaymentPage;

final class b
  implements View.OnClickListener
{
  b(OneWayCabsConfirmBookingPageIntercity paramOneWayCabsConfirmBookingPageIntercity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, CarRentalPrePaymentPage.class);
    paramView.putExtra("pickupDate", OneWayCabsConfirmBookingPageIntercity.a(this.a));
    paramView.putExtra("pickupTime", OneWayCabsConfirmBookingPageIntercity.b(this.a));
    paramView.putExtra("pickupCity", OneWayCabsConfirmBookingPageIntercity.c(this.a));
    paramView.putExtra("dropCity", OneWayCabsConfirmBookingPageIntercity.d(this.a));
    paramView.putExtra("totalAmount", OneWayCabsConfirmBookingPageIntercity.e(this.a));
    paramView.putExtra("carName", OneWayCabsConfirmBookingPageIntercity.f(this.a));
    paramView.putExtra("approxDistance", OneWayCabsConfirmBookingPageIntercity.g(this.a));
    paramView.putExtra("provName", OneWayCabsConfirmBookingPageIntercity.h(this.a));
    paramView.putExtra("scootTime", OneWayCabsConfirmBookingPageIntercity.i(this.a));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\carrentalservicesbooking\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */