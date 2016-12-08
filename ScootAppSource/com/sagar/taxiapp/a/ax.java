package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v4.b.c;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.d.j;
import com.scootapp.tv.d.o;
import org.json.JSONException;
import org.json.JSONObject;

final class ax
  implements FunctionCallback<Object>
{
  ax(aw paramaw, ProgressDialog paramProgressDialog) {}
  
  public void done(Object paramObject, ParseException paramParseException)
  {
    this.a.dismiss();
    if (paramObject != null)
    {
      Log.v("Scoot", "Get Coupon Response " + paramObject.toString());
      try
      {
        paramObject = new JSONObject(paramObject.toString());
        paramParseException = ((JSONObject)paramObject).optString("couponCode", "");
        if ("".equals(paramParseException))
        {
          paramParseException = new j(ar.a(this.b.c)).a(((JSONObject)paramObject).optString("title")).b("").b(0).d("SCOOT").c(paramParseException);
          localAlertDialog = paramParseException.show();
          localAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
          paramParseException.b(new ay(this, localAlertDialog));
          paramParseException.b(((JSONObject)paramObject).optString("imageURL", ""));
          return;
        }
        paramParseException = new j(ar.a(this.b.c)).a(((JSONObject)paramObject).optString("title")).b(o.a()).a(c.c(ar.a(this.b.c), 2131689626)).a(18.0F).b(0).d("SCOOT").c(paramParseException.toUpperCase());
        AlertDialog localAlertDialog = paramParseException.show();
        localAlertDialog.getWindow().setBackgroundDrawableResource(17170445);
        paramParseException.b(new az(this, localAlertDialog));
        paramParseException.b(((JSONObject)paramObject).optString("imageURL", ""));
        return;
      }
      catch (JSONException paramObject)
      {
        ((JSONException)paramObject).printStackTrace();
        return;
      }
    }
    Toast.makeText(ar.a(this.b.c), "Some Error Occured", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */