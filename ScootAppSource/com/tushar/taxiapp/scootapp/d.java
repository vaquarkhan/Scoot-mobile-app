package com.tushar.taxiapp.scootapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.widget.Toast;
import com.a.a.a;
import com.a.a.e;
import com.a.a.f;
import com.sagar.taxiapp.beans.o;
import com.sagar.taxiapp.ds;
import com.scootapp.tv.a.z;

final class d
  extends BroadcastReceiver
{
  d(BookingConfirmation paramBookingConfirmation) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getStringExtra("BOOKING_UPDATED");
    int i = -1;
    switch (paramContext.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    do
    {
      do
      {
        do
        {
          return;
          if (!paramContext.equals("CALL_DRIVER")) {
            break;
          }
          i = 0;
          break;
          if (!paramContext.equals("IN_PROGRESS")) {
            break;
          }
          i = 1;
          break;
          if (!paramContext.equals("COMPLETED")) {
            break;
          }
          i = 2;
          break;
          if (!paramContext.equals("NO_BOOKING")) {
            break;
          }
          i = 3;
          break;
          paramContext = a.a().a().a(ds.a(this.a, "fonts/OpenSans-Regular.ttf")).a(android.support.v4.b.c.c(this.a, 2131689705)).b(30).b().a(paramIntent.getStringExtra("driverETA"), 0);
          BookingConfirmation.e(this.a).setImageDrawable(paramContext);
          BookingConfirmation.e(this.a).a();
        } while (BookingConfirmation.f(this.a) == null);
        BookingConfirmation.g(this.a);
        return;
        BookingConfirmation.e(this.a).b();
        BookingConfirmation.a(this.a, true);
      } while (BookingConfirmation.f(this.a) == null);
      BookingConfirmation.g(this.a);
      return;
      paramContext = new o();
      paramContext.a(paramIntent.getIntExtra(z.p, 0));
      paramContext.b(paramIntent.getStringExtra(z.g));
      BookingConfirmation.a(this.a, paramContext);
      return;
    } while (!"cancelled".equals(com.scootapp.tv.b.c.a(BookingConfirmation.d(this.a).getString("crn", "N/A"))));
    Toast.makeText(this.a, "Your Ride got Cancelled", 1).show();
    this.a.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */