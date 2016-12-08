package com.sagar.taxiapp;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.sagar.taxiapp.a.o;
import com.scootapp.tv.d.n;

final class ao
  implements View.OnClickListener
{
  ao(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void onClick(View paramView)
  {
    CarRentalCabsListingLocal.e(this.a, false);
    if (n.c() > 0)
    {
      if (CarRentalCabsListingLocal.m(this.a))
      {
        CarRentalCabsListingLocal.n(this.a).animate().translationY(CarRentalCabsListingLocal.n(this.a).getHeight() + CarRentalCabsListingLocal.o(this.a).getHeight());
        CarRentalCabsListingLocal.p(this.a).b();
        CarRentalCabsListingLocal.f(this.a, false);
      }
    }
    else {
      return;
    }
    CarRentalCabsListingLocal.n(this.a).setAdapter(CarRentalCabsListingLocal.q(this.a));
    CarRentalCabsListingLocal.f(this.a, true);
    CarRentalCabsListingLocal.q(this.a).a(n.b());
    CarRentalCabsListingLocal.n(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    CarRentalCabsListingLocal.p(this.a).a();
    CarRentalCabsListingLocal.g(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */