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

final class af
  implements View.OnClickListener
{
  af(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void onClick(View paramView)
  {
    CarRentalCabListings.e(this.a, false);
    if (n.c() > 0)
    {
      if (CarRentalCabListings.m(this.a))
      {
        CarRentalCabListings.n(this.a).animate().translationY(CarRentalCabListings.n(this.a).getHeight() + CarRentalCabListings.o(this.a).getHeight());
        CarRentalCabListings.p(this.a).b();
        CarRentalCabListings.f(this.a, false);
      }
    }
    else {
      return;
    }
    CarRentalCabListings.n(this.a).setAdapter(CarRentalCabListings.q(this.a));
    CarRentalCabListings.f(this.a, true);
    CarRentalCabListings.q(this.a).a(n.b());
    CarRentalCabListings.n(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    CarRentalCabListings.p(this.a).a();
    CarRentalCabListings.g(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */