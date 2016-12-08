package com.sagar.taxiapp.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import org.json.JSONException;
import org.json.JSONObject;

final class bh
  implements FunctionCallback<String>
{
  bh(bc parambc, ProgressDialog paramProgressDialog, bn parambn) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    this.a.dismiss();
    if (paramParseException == null) {}
    try
    {
      Log.v("Scoot", "Response " + paramString);
      paramParseException = new JSONObject(paramString);
      paramString = paramParseException.optString("refundAmount");
      if (com.scootapp.tv.b.b.a(this.b.b.c()) != 0)
      {
        new AlertDialog.Builder(bc.b(this.c)).setTitle(paramParseException.optString("responseMess")).setMessage(String.format("Refund Amount : %s %s", new Object[] { "₹ ", paramString })).setPositiveButton(17039379, new bi(this)).show();
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
      Toast.makeText(bc.b(this.c), "Some Error Occured", 1).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */