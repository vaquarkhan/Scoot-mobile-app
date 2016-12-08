package com.sagar.taxiapp;

import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.i;
import com.sagar.taxiapp.a.k;
import com.sagar.taxiapp.a.o;
import java.util.ArrayList;
import java.util.Collections;

final class ah
  implements View.OnClickListener
{
  ah(CarRentalCabListings paramCarRentalCabListings) {}
  
  public void onClick(View paramView)
  {
    int i = 0;
    int j = CarRentalCabListings.c(this.a).size();
    CarRentalCabListings.a(this.a, new ArrayList());
    Log.v("Scoot", CarRentalCabListings.f(this.a) + " " + CarRentalCabListings.g(this.a));
    if (CarRentalCabListings.f(this.a))
    {
      CarRentalCabListings.e(this.a, false);
      paramView = CarRentalCabListings.s(this.a).a();
      if (paramView.isEmpty())
      {
        CarRentalCabListings.h(this.a, false);
        CarRentalCabListings.a(this.a, "CabType");
        if (!CarRentalCabListings.f(this.a)) {
          CarRentalCabListings.a(this.a, (ArrayList)CarRentalCabListings.c(this.a).clone());
        }
        paramView = CarRentalCabListings.q(this.a).a();
        if (!paramView.isEmpty()) {
          break label480;
        }
        CarRentalCabListings.g(this.a, false);
        CarRentalCabListings.a(this.a, "CabCompany");
        label191:
        if ((!CarRentalCabListings.f(this.a)) && (!CarRentalCabListings.g(this.a))) {
          CarRentalCabListings.a(this.a, (ArrayList)CarRentalCabListings.c(this.a).clone());
        }
        if ((CarRentalCabListings.x(this.a)) && (CarRentalCabListings.y(this.a)))
        {
          if ((!CarRentalCabListings.f(this.a)) && (!CarRentalCabListings.g(this.a))) {
            break label833;
          }
          if (!CarRentalCabListings.i(this.a)) {
            break label806;
          }
          Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.M);
          CarRentalCabListings.a(this.a, "Price", "ASC");
        }
      }
    }
    for (;;)
    {
      CarRentalCabListings.j(this.a).a(CarRentalCabListings.h(this.a));
      CarRentalCabListings.z(this.a);
      CarRentalCabListings.j(this.a).a(CarRentalCabListings.h(this.a));
      CarRentalCabListings.p(this.a).b();
      return;
      i = 0;
      while (i < j)
      {
        localObject = (com.sagar.taxiapp.beans.c)CarRentalCabListings.c(this.a).get(i);
        if (paramView.contains(Integer.valueOf(((com.sagar.taxiapp.beans.c)localObject).c))) {
          CarRentalCabListings.h(this.a).add(localObject);
        }
        i += 1;
      }
      CarRentalCabListings.t(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.u(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.u(this.a).setPaintFlags(CarRentalCabListings.u(this.a).getPaintFlags() | 0x8);
      break;
      label480:
      Object localObject = (ArrayList)CarRentalCabListings.h(this.a).clone();
      j = ((ArrayList)localObject).size();
      CarRentalCabListings.h(this.a).clear();
      i = 0;
      while (i < j)
      {
        com.sagar.taxiapp.beans.c localc = (com.sagar.taxiapp.beans.c)((ArrayList)localObject).get(i);
        if (paramView.contains(Integer.valueOf(localc.H))) {
          CarRentalCabListings.h(this.a).add(localc);
        }
        i += 1;
      }
      CarRentalCabListings.v(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.w(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.w(this.a).setPaintFlags(CarRentalCabListings.w(this.a).getPaintFlags() | 0x8);
      break label191;
      if (!CarRentalCabListings.g(this.a)) {
        break label191;
      }
      CarRentalCabListings.f(this.a, false);
      paramView = CarRentalCabListings.q(this.a).a();
      if (paramView.isEmpty())
      {
        CarRentalCabListings.g(this.a, false);
        CarRentalCabListings.a(this.a, "CabCompany");
        break label191;
      }
      while (i < j)
      {
        localObject = (com.sagar.taxiapp.beans.c)CarRentalCabListings.c(this.a).get(i);
        if (paramView.contains(Integer.valueOf(((com.sagar.taxiapp.beans.c)localObject).H))) {
          CarRentalCabListings.h(this.a).add(localObject);
        }
        i += 1;
      }
      CarRentalCabListings.v(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.w(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabListings.w(this.a).setPaintFlags(CarRentalCabListings.w(this.a).getPaintFlags() | 0x8);
      break label191;
      label806:
      Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabListings.a(this.a, "Price", "DESC");
    }
    label833:
    if (CarRentalCabListings.i(this.a))
    {
      Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabListings.a(this.a, "Price", "ASC");
    }
    for (;;)
    {
      CarRentalCabListings.j(this.a).a(CarRentalCabListings.c(this.a));
      break;
      Collections.sort(CarRentalCabListings.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabListings.a(this.a, "Price", "DESC");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */