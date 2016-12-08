package com.scootapp.tv.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.support.v7.a.ah;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class d
  implements FunctionCallback<String>
{
  d(com.sagar.taxiapp.beans.b paramb, String paramString, ah paramah, ProgressDialog paramProgressDialog) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {}
    for (;;)
    {
      try
      {
        Object localObject = new JSONObject(paramString);
        paramString = ((JSONObject)localObject).optString("status");
        paramParseException = ((JSONObject)localObject).optString("tripId");
        localObject = ((JSONObject)localObject).optString("totalAmount");
        if (!paramString.equalsIgnoreCase("success")) {
          continue;
        }
        this.a.c(paramParseException);
        this.a.e((String)localObject);
        if (!this.b.equalsIgnoreCase("intercity")) {
          continue;
        }
        a.a(this.a);
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Booking Confirmed Successfully").setPositiveButton("OK", new e(this)).show();
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new g(this)).show();
        continue;
        new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new f(this)).show();
        continue;
      }
      this.d.dismiss();
      return;
      com.scootapp.tv.b.b.a(this.a);
      continue;
      new AlertDialog.Builder(this.c).setTitle("Booking Status").setMessage("Sorry for the inconvenience. Your booking could not be completed because of technical reasons.").setPositiveButton("OK", new h(this)).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */