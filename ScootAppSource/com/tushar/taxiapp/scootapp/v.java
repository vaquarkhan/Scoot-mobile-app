package com.tushar.taxiapp.scootapp;

import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;

final class v
  implements View.OnClickListener
{
  v(OlaBooking paramOlaBooking) {}
  
  public void onClick(View paramView)
  {
    OlaBooking.a(this.a, this.a.getSharedPreferences("olaBookingDetails", 0).getString("booking_id", "null"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */