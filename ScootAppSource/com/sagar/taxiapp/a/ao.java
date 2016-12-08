package com.sagar.taxiapp.a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.a.ah;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.sagar.taxiapp.ActivityBookingHistory;
import com.sagar.taxiapp.ActivityMainNew;
import com.sagar.taxiapp.ActivityOffers;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.MyAccounts;
import com.sagar.taxiapp.ab;

final class ao
  implements View.OnClickListener
{
  ao(an paraman, int paramInt) {}
  
  public void onClick(View paramView)
  {
    switch (this.a - 1)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (an.a(this.b, 0));
          ((ApplicationTaxi)an.a(this.b).getApplicationContext()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Book A Cab Navigation Click").a());
          this.b.c(0);
          paramView = new Intent(an.a(this.b), ActivityMainNew.class);
          an.a(this.b).startActivity(paramView);
          ((ah)an.a(this.b)).finish();
          return;
        } while (an.a(this.b, 1));
        an.a(this.b).getSharedPreferences("apprater", 0).edit().putBoolean("special_offer", true).apply();
        ((ApplicationTaxi)an.a(this.b).getApplicationContext()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Offers Navigation Click").a());
        this.b.c(1);
        paramView = new Intent(an.a(this.b), ActivityOffers.class);
        an.a(this.b).startActivity(paramView);
        ((ah)an.a(this.b)).finish();
        return;
      } while (an.a(this.b, 2));
      ((ApplicationTaxi)an.a(this.b).getApplicationContext()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("My Rides Navigation Click").a());
      this.b.c(2);
      paramView = new Intent(an.a(this.b), ActivityBookingHistory.class);
      an.a(this.b).startActivity(paramView);
      ((ah)an.a(this.b)).finish();
      return;
      ((ApplicationTaxi)an.a(this.b).getApplicationContext()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Terms and Conditions Navigation Click").a());
      paramView = new Bundle();
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(Uri.parse("http://scootapp.com/?termsAndConditions"));
      paramView.putString("content-type", "application/x-www-form-urlencoded");
      localIntent.putExtra("com.android.browser.headers", paramView);
      an.a(this.b).startActivity(localIntent);
      return;
    } while (an.a(this.b, 3));
    ((ApplicationTaxi)an.a(this.b).getApplicationContext()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("My Accounts Click").a());
    this.b.c(3);
    paramView = new Intent(an.a(this.b), MyAccounts.class);
    an.a(this.b).startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */