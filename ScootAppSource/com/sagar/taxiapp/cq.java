package com.sagar.taxiapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class cq
  implements View.OnClickListener
{
  cq(NewUserScreen paramNewUserScreen) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Login Button Clicked").a());
    paramView = new Intent(this.a, LoginPage.class);
    this.a.startActivity(paramView);
    this.a.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */