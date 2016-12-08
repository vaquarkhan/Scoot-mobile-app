package com.tushar.taxiapp.scootapp;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.parse.ParseQuery;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import com.scootapp.tv.b.c;
import org.json.JSONException;
import org.json.JSONObject;

final class x
  implements com.b.a.y<String>
{
  x(OlaBooking paramOlaBooking, String paramString) {}
  
  public void a(String paramString)
  {
    try
    {
      r localr = ((ApplicationTaxi)this.b.getApplication()).a(ab.a);
      localr.a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Cancel Cab Clicked").a());
      paramString = new JSONObject(paramString);
      if (paramString.optString("status").equalsIgnoreCase("SUCCESS"))
      {
        localr.a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Cancel Cab Successful").a());
        c.a(this.a, "cancelled");
        com.scootapp.tv.a.a.a = true;
        ParseQuery.getQuery("OlaRideBookings").getInBackground(this.b.getSharedPreferences("olaBookingDetails", 0).getString("objectId", ""), new y(this));
        Toast.makeText(this.b, "Your booking has been aborted!", 1).show();
        OlaBooking.b(this.b).dismiss();
        return;
      }
      Toast.makeText(this.b, paramString.optString("text"), 1).show();
      c.a(this.a, "cancelled");
      com.scootapp.tv.a.a.a = true;
      OlaBooking.b(this.b).dismiss();
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */