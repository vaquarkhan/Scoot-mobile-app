package com.sagar.taxiapp;

import android.support.v7.widget.ed;
import android.util.Log;
import android.view.View;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.sagar.taxiapp.beans.m;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class s
  implements FunctionCallback<String>
{
  s(ActivityOffers paramActivityOffers) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {}
    try
    {
      paramParseException = new JSONObject(paramString);
      Log.v("Scoot", "Response " + paramString);
      paramString = paramParseException.optJSONArray("couponOffers");
      int i = 0;
      while (i < paramString.length())
      {
        paramParseException = new m();
        JSONObject localJSONObject = paramString.optJSONObject(i);
        paramParseException.d = localJSONObject.optString("Title");
        paramParseException.c = localJSONObject.optString("Description");
        paramParseException.b = localJSONObject.optString("CouponCode");
        paramParseException.e = localJSONObject.optString("ImageURL");
        paramParseException.f = localJSONObject.optString("ProviderName");
        paramParseException.a = localJSONObject.optString("BackgroundImageURL");
        paramParseException.g = localJSONObject.optString("PoweredBy");
        ActivityOffers.c(this.a).add(paramParseException);
        i += 1;
      }
      ActivityOffers.d(this.a).setVisibility(8);
      ActivityOffers.e(this.a).c();
      ActivityOffers.f(this.a);
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */