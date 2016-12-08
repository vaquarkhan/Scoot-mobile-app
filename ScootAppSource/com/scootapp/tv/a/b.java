package com.scootapp.tv.a;

import android.support.v7.a.ah;
import android.util.Log;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuHashes;
import org.json.JSONException;
import org.json.JSONObject;

final class b
  implements FunctionCallback<String>
{
  b(com.scootapp.tv.c.a parama, ah paramah, PaymentParams paramPaymentParams) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if ((paramString != null) && (!"null".equals(paramString)))
    {
      Log.v("Scoot", "Response " + paramString);
      try
      {
        paramString = new JSONObject(paramString);
        paramParseException = new PayuHashes();
        paramParseException.a(paramString.optString("payhash"));
        paramParseException.f(paramString.optString("merchantCodesHash"));
        paramParseException.g(paramString.optString("mobileSdk"));
        paramParseException.h(paramString.optString("detailsForMobileSdk"));
        paramParseException.e(paramString.optString("deleteHash"));
        paramParseException.b(paramString.optString("getUserCardHash"));
        paramParseException.d(paramString.optString("editUserCardHash"));
        paramParseException.c(paramString.optString("saveUserCardHash"));
        this.a.l();
        a.a(this.b, this.c, paramParseException);
        return;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        this.a.m();
        return;
      }
    }
    this.a.m();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */