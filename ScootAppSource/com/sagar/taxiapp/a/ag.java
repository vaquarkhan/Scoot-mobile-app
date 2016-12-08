package com.sagar.taxiapp.a;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.sagar.taxiapp.beans.b;
import com.scootapp.tv.b.a;
import org.json.JSONException;
import org.json.JSONObject;

final class ag
  implements FunctionCallback<String>
{
  ag(s params, ProgressDialog paramProgressDialog, ak paramak) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    this.a.dismiss();
    if (paramParseException == null) {}
    try
    {
      Log.v("Scoot", "Response " + paramString);
      paramString = new JSONObject(paramString);
      paramParseException = paramString.optString("refundAmount");
      if ((!"0".equals(paramParseException)) || (!"na".equals(paramParseException)))
      {
        ParseObject localParseObject = ParseObject.createWithoutData("CarRentalBookings", paramString.optString("objectId"));
        localParseObject.put("refundAmount", paramParseException);
        localParseObject.put("status", "cancelled");
        localParseObject.saveInBackground();
      }
      if (a.a(this.b.b.c()) != 0)
      {
        new AlertDialog.Builder(s.b(this.c)).setTitle(paramString.optString("responseMess")).setMessage(String.format("Refund Amount : %s %s", new Object[] { "₹ ", paramParseException })).setPositiveButton(17039379, new ah(this)).show();
        this.b.b.a(1);
        this.c.c();
      }
      return;
    }
    catch (JSONException paramString)
    {
      Toast.makeText(s.b(this.c), "Some Error Occured", 1).show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */