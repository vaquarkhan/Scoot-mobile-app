package com.sagar.taxiapp.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import com.b.a.y;
import com.parse.ParseQuery;
import com.sagar.taxiapp.beans.b;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class ab
  implements y<String>
{
  ab(s params, ak paramak, int paramInt, String paramString, ProgressDialog paramProgressDialog) {}
  
  public void a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      paramString.optString("payload");
      boolean bool = paramString.optBoolean("success");
      if (a.a(this.a.b.c()) != 0)
      {
        new AlertDialog.Builder(s.b(this.e)).setTitle("Booking Status").setMessage("Booking Cancelled Successfully").setMessage(String.format("Refund Amount : %s %s", new Object[] { "₹ ", Integer.valueOf(this.b) })).setPositiveButton(17039379, new ac(this)).show();
        this.a.b.a(1);
        this.e.c();
        if (bool)
        {
          paramString = ParseQuery.getQuery("CarRentalBookings");
          paramString.whereEqualTo("tripId", this.c);
          paramString.findInBackground(new ad(this));
        }
      }
      this.d.dismiss();
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */