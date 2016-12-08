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

final class ag
  implements View.OnClickListener
{
  ag(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void onClick(View paramView)
  {
    CarRentalCabListings.f(this.a, false);
    if (a.c() > 0)
    {
      if (CarRentalCabListings.r(this.a))
      {
        CarRentalCabListings.n(this.a).animate().translationY(CarRentalCabListings.n(this.a).getHeight() + CarRentalCabListings.o(this.a).getHeight());
        CarRentalCabListings.p(this.a).b();
        CarRentalCabListings.e(this.a, false);
      }
    }
    else {
      return;
    }
    CarRentalCabListings.n(this.a).setAdapter(CarRentalCabListings.s(this.a));
    CarRentalCabListings.e(this.a, true);
    CarRentalCabListings.s(this.a).a(a.b());
    CarRentalCabListings.n(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    CarRentalCabListings.p(this.a).a();
    CarRentalCabListings.h(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */