package com.sagar.taxiapp;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;

final class ci
  implements View.OnClickListener
{
  ci(MyAccounts paramMyAccounts) {}
  
  public void onClick(View paramView)
  {
    if (MyAccounts.b(this.a).j(MyAccounts.a(this.a))) {
      MyAccounts.b(this.a).i(MyAccounts.a(this.a));
    }
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Share Clicked").a());
    paramView = new Intent("android.intent.action.SEND");
    paramView.setType("text/plain");
    paramView.putExtra("android.intent.extra.TEXT", "Scoot APP- Find the closest cab to you with just one click!\nDownload Now http://scootapp.com/");
    paramView = Intent.createChooser(paramView, "Select app to share");
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */