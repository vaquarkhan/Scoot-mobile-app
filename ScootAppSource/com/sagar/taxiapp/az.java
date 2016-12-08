package com.sagar.taxiapp;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.a.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class az
  implements FunctionCallback<String>
{
  az(ay paramay, HashMap paramHashMap) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null) {
      try
      {
        paramString = new JSONObject(paramString);
        CarRentalPrePaymentPage.f(this.b.b, paramString.optString("tripId"));
        CarRentalPrePaymentPage.g(this.b.b, paramString.optString("userId"));
        this.a.put("tripId", CarRentalPrePaymentPage.O(this.b.b));
        a.a(this.b.b, this.a, this.b.b);
        return;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        CarRentalPrePaymentPage.r(this.b.b).dismiss();
        Toast.makeText(this.b.b, "Cab Booking Failed", 1).show();
        return;
      }
    }
    CarRentalPrePaymentPage.r(this.b.b).dismiss();
    Toast.makeText(this.b.b, "Cab Booking Failed", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */