package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.k;
import java.util.ArrayList;
import java.util.Collections;

final class ae
  implements View.OnClickListener
{
  ae(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void onClick(View paramView)
  {
    if (!CarRentalCabListings.c(this.a).isEmpty())
    {
      CarRentalCabListings.a(this.a, "Price");
      CarRentalCabListings.a(this.a, true);
      CarRentalCabListings.d(this.a, true);
      CarRentalCabListings.k(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.l(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      if ((CarRentalCabListings.f(this.a)) || (CarRentalCabListings.g(this.a)))
      {
        Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.P);
        CarRentalCabListings.j(this.a).a(CarRentalCabListings.h(this.a));
      }
    }
    else
    {
      return;
    }
    Collections.sort(CarRentalCabListings.c(this.a), com.sagar.taxiapp.beans.c.P);
    CarRentalCabListings.j(this.a).a(CarRentalCabListings.c(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */