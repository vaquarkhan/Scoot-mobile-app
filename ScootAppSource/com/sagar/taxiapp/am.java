package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.k;
import java.util.ArrayList;
import java.util.Collections;

final class am
  implements View.OnClickListener
{
  am(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void onClick(View paramView)
  {
    if (!CarRentalCabsListingLocal.c(this.a).isEmpty())
    {
      CarRentalCabsListingLocal.a(this.a, "Time");
      CarRentalCabsListingLocal.a(this.a, true);
      CarRentalCabsListingLocal.b(this.a, true);
      CarRentalCabsListingLocal.d(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.e(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      if ((!CarRentalCabsListingLocal.f(this.a)) && ((!CarRentalCabsListingLocal.g(this.a)) || (CarRentalCabsListingLocal.h(this.a).isEmpty()))) {
        break label208;
      }
      if (!CarRentalCabsListingLocal.i(this.a)) {
        break label172;
      }
      CarRentalCabsListingLocal.c(this.a, false);
      Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabsListingLocal.a(this.a, "Price", "DESC");
    }
    for (;;)
    {
      CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.h(this.a));
      return;
      label172:
      CarRentalCabsListingLocal.c(this.a, true);
      Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabsListingLocal.a(this.a, "Price", "ASC");
    }
    label208:
    if (CarRentalCabsListingLocal.i(this.a))
    {
      CarRentalCabsListingLocal.c(this.a, false);
      Collections.sort(CarRentalCabsListingLocal.c(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabsListingLocal.a(this.a, "Price", "DESC");
    }
    for (;;)
    {
      CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.c(this.a));
      return;
      CarRentalCabsListingLocal.c(this.a, true);
      Collections.sort(CarRentalCabsListingLocal.c(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabsListingLocal.a(this.a, "Price", "ASC");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */