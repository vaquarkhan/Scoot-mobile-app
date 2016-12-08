package com.sagar.taxiapp;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.sagar.taxiapp.a.i;
import com.scootapp.tv.d.a;

final class ap
  implements View.OnClickListener
{
  ap(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void onClick(View paramView)
  {
    CarRentalCabsListingLocal.f(this.a, false);
    if (a.c() > 0)
    {
      if (CarRentalCabsListingLocal.r(this.a))
      {
        CarRentalCabsListingLocal.n(this.a).animate().translationY(CarRentalCabsListingLocal.n(this.a).getHeight() + CarRentalCabsListingLocal.o(this.a).getHeight());
        CarRentalCabsListingLocal.p(this.a).b();
        CarRentalCabsListingLocal.e(this.a, false);
      }
    }
    else {
      return;
    }
    CarRentalCabsListingLocal.n(this.a).setAdapter(CarRentalCabsListingLocal.s(this.a));
    CarRentalCabsListingLocal.e(this.a, true);
    CarRentalCabsListingLocal.s(this.a).a(a.b());
    CarRentalCabsListingLocal.n(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    CarRentalCabsListingLocal.p(this.a).a();
    CarRentalCabsListingLocal.h(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */