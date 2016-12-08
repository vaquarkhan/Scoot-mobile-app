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

final class aq
  implements View.OnClickListener
{
  aq(CarRentalCabsListingLocal paramCarRentalCabsListingLocal) {}
  
  public void onClick(View paramView)
  {
    int i = 0;
    int j = CarRentalCabsListingLocal.c(this.a).size();
    CarRentalCabsListingLocal.a(this.a, new ArrayList());
    Log.v("Scoot", CarRentalCabsListingLocal.f(this.a) + " " + CarRentalCabsListingLocal.g(this.a));
    if (CarRentalCabsListingLocal.f(this.a))
    {
      CarRentalCabsListingLocal.e(this.a, false);
      paramView = CarRentalCabsListingLocal.s(this.a).a();
      if (paramView.isEmpty())
      {
        CarRentalCabsListingLocal.h(this.a, false);
        CarRentalCabsListingLocal.a(this.a, "CabType");
        if (!CarRentalCabsListingLocal.f(this.a)) {
          CarRentalCabsListingLocal.a(this.a, (ArrayList)CarRentalCabsListingLocal.c(this.a).clone());
        }
        paramView = CarRentalCabsListingLocal.q(this.a).a();
        if (!paramView.isEmpty()) {
          break label480;
        }
        CarRentalCabsListingLocal.g(this.a, false);
        CarRentalCabsListingLocal.a(this.a, "CabCompany");
        label191:
        if ((!CarRentalCabsListingLocal.f(this.a)) && (!CarRentalCabsListingLocal.g(this.a))) {
          CarRentalCabsListingLocal.a(this.a, (ArrayList)CarRentalCabsListingLocal.c(this.a).clone());
        }
        if ((CarRentalCabsListingLocal.x(this.a)) && (CarRentalCabsListingLocal.y(this.a)))
        {
          if ((!CarRentalCabsListingLocal.f(this.a)) && (!CarRentalCabsListingLocal.g(this.a))) {
            break label833;
          }
          if (!CarRentalCabsListingLocal.i(this.a)) {
            break label806;
          }
          Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.M);
          CarRentalCabsListingLocal.a(this.a, "Price", "ASC");
        }
      }
    }
    for (;;)
    {
      CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.h(this.a));
      CarRentalCabsListingLocal.z(this.a);
      CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.h(this.a));
      CarRentalCabsListingLocal.p(this.a).b();
      return;
      i = 0;
      while (i < j)
      {
        localObject = (com.sagar.taxiapp.beans.c)CarRentalCabsListingLocal.c(this.a).get(i);
        if (paramView.contains(Integer.valueOf(((com.sagar.taxiapp.beans.c)localObject).c))) {
          CarRentalCabsListingLocal.h(this.a).add(localObject);
        }
        i += 1;
      }
      CarRentalCabsListingLocal.t(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.u(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.u(this.a).setPaintFlags(CarRentalCabsListingLocal.u(this.a).getPaintFlags() | 0x8);
      break;
      label480:
      Object localObject = (ArrayList)CarRentalCabsListingLocal.h(this.a).clone();
      j = ((ArrayList)localObject).size();
      CarRentalCabsListingLocal.h(this.a).clear();
      i = 0;
      while (i < j)
      {
        com.sagar.taxiapp.beans.c localc = (com.sagar.taxiapp.beans.c)((ArrayList)localObject).get(i);
        if (paramView.contains(Integer.valueOf(localc.H))) {
          CarRentalCabsListingLocal.h(this.a).add(localc);
        }
        i += 1;
      }
      CarRentalCabsListingLocal.v(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.w(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.w(this.a).setPaintFlags(CarRentalCabsListingLocal.w(this.a).getPaintFlags() | 0x8);
      break label191;
      if (!CarRentalCabsListingLocal.g(this.a)) {
        break label191;
      }
      CarRentalCabsListingLocal.f(this.a, false);
      paramView = CarRentalCabsListingLocal.q(this.a).a();
      if (paramView.isEmpty())
      {
        CarRentalCabsListingLocal.g(this.a, false);
        CarRentalCabsListingLocal.a(this.a, "CabCompany");
        break label191;
      }
      while (i < j)
      {
        localObject = (com.sagar.taxiapp.beans.c)CarRentalCabsListingLocal.c(this.a).get(i);
        if (paramView.contains(Integer.valueOf(((com.sagar.taxiapp.beans.c)localObject).H))) {
          CarRentalCabsListingLocal.h(this.a).add(localObject);
        }
        i += 1;
      }
      CarRentalCabsListingLocal.v(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.w(this.a).setTextColor(android.support.v4.b.c.c(this.a, 2131689696));
      CarRentalCabsListingLocal.w(this.a).setPaintFlags(CarRentalCabsListingLocal.w(this.a).getPaintFlags() | 0x8);
      break label191;
      label806:
      Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabsListingLocal.a(this.a, "Price", "DESC");
    }
    label833:
    if (CarRentalCabsListingLocal.i(this.a))
    {
      Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.M);
      CarRentalCabsListingLocal.a(this.a, "Price", "ASC");
    }
    for (;;)
    {
      CarRentalCabsListingLocal.j(this.a).a(CarRentalCabsListingLocal.c(this.a));
      break;
      Collections.sort(CarRentalCabsListingLocal.h(this.a), com.sagar.taxiapp.beans.c.N);
      CarRentalCabsListingLocal.a(this.a, "Price", "DESC");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */