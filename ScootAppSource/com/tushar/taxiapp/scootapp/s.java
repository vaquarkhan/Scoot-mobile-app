package com.tushar.taxiapp.scootapp;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

final class s
  extends BroadcastReceiver
{
  s(OlaBooking paramOlaBooking) {}
  
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
      return;
      if (!paramContext.equals("CALL_DRIVER")) {
        break;
      }
      i = 0;
      break;
      if (!paramContext.equals("ALLOTMENT_FAILED")) {
        break;
      }
      i = 1;
      break;
      if (!paramContext.equals("PENDING")) {
        break;
      }
      i = 2;
      break;
      if (!paramContext.equals("ALLOTMENT_RETRYING")) {
        break;
      }
      i = 3;
      break;
      if (!paramContext.equals("cancelled")) {
        break;
      }
      i = 4;
      break;
      OlaBooking.b(this.a).dismiss();
      paramContext = new Intent(this.a, BookingConfirmation.class);
      this.a.startActivity(paramContext);
      this.a.finish();
      return;
    } while (System.currentTimeMillis() - OlaBooking.c(this.a).longValue() <= 50000L);
    OlaBooking.b(this.a).dismiss();
    Toast.makeText(this.a, "Sorry. Your ride request was not accepted. Please try again", 1).show();
    return;
    Toast.makeText(this.a, "Please wait we are reconnecting to the near by autos.", 1).show();
    this.a.n();
    return;
    Toast.makeText(this.a, "Sorry the driver cancelled your booking. Please try again.", 1).show();
    this.a.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */