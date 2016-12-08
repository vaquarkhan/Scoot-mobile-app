package com.scootapp.tv.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.support.v7.a.ah;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class u
  implements FunctionCallback<String>
{
  u(com.sagar.taxiapp.beans.b paramb, String paramString, ah paramah, ProgressDialog paramProgressDialog) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {}
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        paramParseException = paramString.optString("tripId");
        paramString.optString("status");
        this.a.c(paramParseException);
        if (!this.b.equalsIgnoreCase("intercity")) {
          continue;
        }
        a.a(this.a);
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Booking Confirmed Successfully").setPositiveButton("OK", new v(this)).show();
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons. Your money will be refunded within 24 hours.").setPositiveButton("OK", new w(this)).show();
        continue;
      }
      this.d.dismiss();
      return;
      com.scootapp.tv.b.b.a(this.a);
      continue;
      new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new x(this)).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */