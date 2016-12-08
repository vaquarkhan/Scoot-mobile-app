package com.scootapp.tv.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.support.v7.a.ah;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.sagar.taxiapp.beans.b;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class m
  implements FunctionCallback<String>
{
  m(b paramb, ah paramah, ProgressDialog paramProgressDialog) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {}
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        paramParseException = paramString.optString("tripId");
        paramString.optString("totalAmount");
        this.a.c(paramParseException);
        a.a(this.a);
        new AlertDialog.Builder(this.b).setTitle("Booking Status").setMessage("Booking Confirmed Successfully").setPositiveButton("OK", new n(this)).show();
        this.c.dismiss();
        return;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        new AlertDialog.Builder(this.b).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new o(this)).show();
        continue;
      }
      new AlertDialog.Builder(this.b).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new p(this)).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */