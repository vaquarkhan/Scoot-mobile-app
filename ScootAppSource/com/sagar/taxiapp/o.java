package com.sagar.taxiapp;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class o
  implements View.OnClickListener
{
  o(ActivityOffers paramActivityOffers) {}
  
  public void onClick(View paramView)
  {
    if (ActivityOffers.b(this.a).j(ActivityOffers.a(this.a))) {
      ActivityOffers.b(this.a).i(ActivityOffers.a(this.a));
    }
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Contact Us Clicked").a());
    bi.a(this.a, "contact@scootapp.com", this.a.getString(2131296551), "");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */