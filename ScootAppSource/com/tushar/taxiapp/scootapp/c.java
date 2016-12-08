package com.tushar.taxiapp.scootapp;

import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.scootapp.tv.a.a;

final class c
  implements View.OnClickListener
{
  c(BookingConfirmation paramBookingConfirmation) {}
  
  public void onClick(View paramView)
  {
    if (a.b(this.a))
    {
      if (BookingConfirmation.d(this.a).getString("vehicle_type", "Cab").equalsIgnoreCase("auto"))
      {
        this.a.a(this.a.getString(2131296593), this.a.getString(2131296594));
        return;
      }
      this.a.a(this.a.getString(2131296589), this.a.getString(2131296591));
      return;
    }
    Toast.makeText(this.a, "You do not have an active Internet connection", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */