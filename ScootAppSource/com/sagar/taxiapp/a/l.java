package com.sagar.taxiapp.a;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.r;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import com.sagar.taxiapp.beans.c;
import java.util.ArrayList;

final class l
  implements View.OnClickListener
{
  l(k paramk, int paramInt) {}
  
  public void onClick(View paramView)
  {
    paramView = (c)k.a(this.b).get(this.a);
    ((ApplicationTaxi)((Activity)k.b(this.b)).getApplication()).a(ab.a).a(new com.google.android.gms.analytics.l().a("USER_EVENTS").b("INTERCITY/RENTAL").c(paramView.a + " " + k.c(this.b) + " selected").a());
    if (paramView.a.equalsIgnoreCase("one way cabs"))
    {
      this.b.a(paramView);
      return;
    }
    if (paramView.a.equalsIgnoreCase("makson"))
    {
      if (k.c(this.b).equalsIgnoreCase("outstation"))
      {
        this.b.e(paramView);
        return;
      }
      this.b.g(paramView);
      return;
    }
    if (paramView.a.equalsIgnoreCase("roder"))
    {
      this.b.b(paramView);
      return;
    }
    if (paramView.a.equalsIgnoreCase("savaari"))
    {
      if (k.c(this.b).equalsIgnoreCase("outstation"))
      {
        this.b.c(paramView);
        return;
      }
      this.b.g(paramView);
      return;
    }
    this.b.d(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */