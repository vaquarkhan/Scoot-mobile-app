package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.k;
import java.util.ArrayList;
import java.util.Collections;

final class ad
  implements View.OnClickListener
{
  ad(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void onClick(View paramView)
  {
    if (!CarRentalCabListings.c(this.a).isEmpty())
    {
      CarRentalCabListings.a(this.a, "Time");
      CarRentalCabListings.a(this.a, true);
      CarRentalCabListings.b(this.a, true);
      CarRentalCabListings.d(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.e(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      if ((!CarRentalCabListings.f(this.a)) && ((!CarRentalCabListings.g(this.a)) || (CarRentalCabListings.h(this.a).isEmpty()))) {
        break label208;
      }
      if (!CarRentalCabListings.i(this.a)) {
        break label172;
      }
      CarRentalCabListings.c(this.a, false);
      Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabListings.a(this.a, "Price", "DESC");
    }
    for (;;)
    {
      CarRentalCabListings.j(this.a).a(CarRentalCabListings.h(this.a));
      return;
      label172:
      CarRentalCabListings.c(this.a, true);
      Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabListings.a(this.a, "Price", "ASC");
    }
    label208:
    if (CarRentalCabListings.i(this.a))
    {
      CarRentalCabListings.c(this.a, false);
      Collections.sort(CarRentalCabListings.c(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabListings.a(this.a, "Price", "DESC");
    }
    for (;;)
    {
      CarRentalCabListings.j(this.a).a(CarRentalCabListings.c(this.a));
      return;
      CarRentalCabListings.c(this.a, true);
      Collections.sort(CarRentalCabListings.c(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabListings.a(this.a, "Price", "ASC");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */