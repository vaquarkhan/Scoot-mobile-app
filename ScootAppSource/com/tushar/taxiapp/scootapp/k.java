package com.tushar.taxiapp.scootapp;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.b.a.y;
import com.google.android.gms.analytics.r;
import com.parse.ParseQuery;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import com.scootapp.tv.b.c;
import org.json.JSONException;
import org.json.JSONObject;

final class k
  implements y<String>
{
  k(j paramj) {}
  
  public void a(String paramString)
  {
    try
    {
      r localr = ((ApplicationTaxi)this.a.h.getApplication()).a(ab.a);
      localr.a(new com.google.android.gms.analytics.l().a("USER_EVENTS").b("USER INTERACTIONS").c("Cancel Cab Clicked").a());
      paramString = new JSONObject(paramString);
      if (paramString.optString("status").equalsIgnoreCase("SUCCESS"))
      {
        localr.a(new com.google.android.gms.analytics.l().a("USER_EVENTS").b("USER INTERACTIONS").c("Cancel Cab Successful").a());
        c.a(this.a.f, "cancelled");
        com.scootapp.tv.a.a.a = true;
        ParseQuery.getQuery("OlaRideBookings").getInBackground(BookingConfirmation.d(this.a.h).getString("objectId", ""), new l(this));
        this.a.h.m.dismiss();
        Toast.makeText(this.a.h, "Your booking has been cancelled successfully!", 1).show();
        this.a.h.finish();
        return;
      }
      this.a.h.m.dismiss();
      Toast.makeText(this.a.h, paramString.optString("text"), 1).show();
      c.a(this.a.f, "cancelled");
      com.scootapp.tv.a.a.a = true;
      this.a.h.finish();
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\tushar\taxiapp\scootapp\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */