package com.sagar.taxiapp;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class h
  implements View.OnClickListener
{
  h(ActivityMainNew paramActivityMainNew) {}
  
  public void onClick(View paramView)
  {
    if (ActivityMainNew.b(this.a).j(ActivityMainNew.a(this.a))) {
      ActivityMainNew.b(this.a).i(ActivityMainNew.a(this.a));
    }
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Contact Us Clicked").a());
    bi.a(this.a, "contact@scootapp.com", this.a.getString(2131296551), "");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */