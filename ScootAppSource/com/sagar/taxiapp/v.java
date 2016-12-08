package com.sagar.taxiapp;

import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

final class v
  implements FunctionCallback<String>
{
  v(u paramu) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    try
    {
      paramString = new JSONObject(paramString);
      ActivitySplash.a(this.a.a).putString("Key", new String(Base64.decode(paramString.optString("merchantKey"), 0), Charset.defaultCharset())).apply();
      ActivitySplash.a(this.a.a).putString("Salt", new String(Base64.decode(paramString.optString("merchantSlat"), 0), Charset.defaultCharset())).apply();
      return;
    }
    catch (JSONException paramString)
    {
      Log.e("Scoot", "Error while fetching Keys " + paramString.getLocalizedMessage());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */