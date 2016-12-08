package com.tushar.taxiapp.scootapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;

final class q
  implements View.OnClickListener
{
  q(OlaBooking paramOlaBooking) {}
  
  public void onClick(View paramView)
  {
    OlaBooking.a(this.a, this.a.getSharedPreferences("olaUser", 0));
    if (!OlaBooking.a(this.a).getBoolean("loggedIn", false))
    {
      paramView = new Intent(this.a, OlaSignup.class);
      this.a.startActivityForResult(paramView, 103);
      return;
    }
    if (!OlaBooking.a(this.a).getString("access_token", "absent").equalsIgnoreCase("absent"))
    {
      this.a.l();
      return;
    }
    paramView = new Intent(this.a, OlaSignup.class);
    this.a.startActivityForResult(paramView, 103);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */