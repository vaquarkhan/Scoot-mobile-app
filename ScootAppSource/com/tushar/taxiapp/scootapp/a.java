package com.tushar.taxiapp.scootapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.b.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;

final class a
  implements View.OnClickListener
{
  a(BookingConfirmation paramBookingConfirmation) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.a.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Call Driver Clicked").a());
    BookingConfirmation.a(this.a, new Intent("android.intent.action.CALL"));
    BookingConfirmation.b(this.a).setData(Uri.parse("tel:" + BookingConfirmation.a(this.a).getText().toString()));
    if ((Build.VERSION.SDK_INT >= 23) && (c.a(this.a, "android.permission.CALL_PHONE") != 0))
    {
      BookingConfirmation.c(this.a);
      return;
    }
    this.a.startActivity(BookingConfirmation.b(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */