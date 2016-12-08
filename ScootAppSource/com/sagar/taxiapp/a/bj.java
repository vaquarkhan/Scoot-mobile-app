package com.sagar.taxiapp.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import org.json.JSONException;
import org.json.JSONObject;

final class bj
  implements FunctionCallback<String>
{
  bj(bc parambc, ProgressDialog paramProgressDialog, bn parambn) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    this.a.dismiss();
    if (paramParseException == null) {}
    try
    {
      paramParseException = new JSONObject(paramString);
      paramString = paramParseException.optString("refundAmount");
      if (com.scootapp.tv.b.b.a(this.b.b.c()) != 0)
      {
        new AlertDialog.Builder(bc.b(this.c)).setTitle("Booking Status").setMessage("Booking Cancelled Successfully").setPositiveButton(17039379, new bk(this)).show();
        this.b.b.a(1);
        this.c.c();
        if ((!"0".equals(paramString)) || (!"na".equals(paramString)))
        {
          paramParseException = ParseObject.createWithoutData("CarRentalBookings", paramParseException.optString("objectId"));
          paramParseException.put("refundAmount", paramString);
          paramParseException.put("status", "cancelled");
          paramParseException.saveInBackground();
        }
      }
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */