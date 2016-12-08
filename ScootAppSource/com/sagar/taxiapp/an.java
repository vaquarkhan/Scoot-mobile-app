package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.k;
import java.util.ArrayList;
import java.util.Collections;

final class an
  implements View.OnClickListener
{
  an(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void onClick(View paramView)
  {
    if (!CarRentalCabsListingLocal.c(this.a).isEmpty())
    {
      CarRentalCabsListingLocal.a(this.a, "Price");
      CarRentalCabsListingLocal.a(this.a, true);
      CarRentalCabsListingLocal.d(this.a, true);
      CarRentalCabsListingLocal.k(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.l(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      if ((CarRentalCabsListingLocal.f(this.a)) || (CarRentalCabsListingLocal.g(this.a)))
      {
        Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.P);
        CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.h(this.a));
      }
    }
    else
    {
      return;
    }
    Collections.sort(CarRentalCabsListingLocal.c(this.a), com.sagar.taxiapp.beans.c.P);
    CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.c(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */