package com.sagar.taxiapp;

import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.a.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class bk
  implements FunctionCallback<String>
{
  bk(bj parambj, HashMap paramHashMap) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    Log.v("Scoot", "Response " + paramString);
    if (paramParseException == null) {
      try
      {
        paramString = new JSONObject(paramString);
        this.b.b.p = paramString.optString("tripId");
        LocalCarRentalPrePaymentPage.f(this.b.b, paramString.optString("userId"));
        this.a.put("tripId", this.b.b.p);
        this.a.put("userId", LocalCarRentalPrePaymentPage.A(this.b.b));
        a.a(this.b.b, this.a, this.b.b);
        return;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        LocalCarRentalPrePaymentPage.r(this.b.b).dismiss();
        Toast.makeText(this.b.b, "Cab Booking Failed", 1).show();
        return;
      }
    }
    LocalCarRentalPrePaymentPage.r(this.b.b).dismiss();
    Toast.makeText(this.b.b, "Cab Booking Failed", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */