package com.scootapp.tv.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.support.v7.a.ah;
import android.util.Log;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class q
  implements FunctionCallback<String>
{
  q(String paramString, com.sagar.taxiapp.beans.b paramb, ah paramah, ProgressDialog paramProgressDialog) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    Log.v("Scoot", "Response " + paramString);
    if (paramParseException == null) {}
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        paramParseException = ParseObject.createWithoutData("CarRentalBookings", paramString.optString("objectId"));
        paramParseException.put("status", "confirmed");
        paramParseException.saveInBackground();
        if (!this.a.equalsIgnoreCase("intercity")) {
          continue;
        }
        a.a(this.b);
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage(paramString.optString("responseMess")).setPositiveButton("OK", new r(this)).show();
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons. Your money will be refunded within 24 hours.").setPositiveButton("OK", new s(this)).show();
        continue;
      }
      this.d.dismiss();
      return;
      com.scootapp.tv.b.b.a(this.b);
      continue;
      new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new t(this)).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */