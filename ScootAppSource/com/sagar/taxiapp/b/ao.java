package com.sagar.taxiapp.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.support.v4.app.aa;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class ao
  extends AsyncTask<Void, Void, String>
{
  String a;
  boolean b;
  
  public ao(v paramv, String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }
  
  protected String a(Void... paramVarArgs)
  {
    paramVarArgs = "https://maps.googleapis.com/maps/api/place/details/json?placeid=" + this.a + "&" + v.D(this.c);
    Log.e("URL", paramVarArgs);
    try
    {
      paramVarArgs = v.d(this.c, paramVarArgs);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      Log.d("Background Task", paramVarArgs.toString());
    }
    return null;
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    Log.v("Test", "Inside Function onPostExecute of GetLatLong Result " + paramString);
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new JSONObject(paramString).getJSONObject("result").getJSONObject("geometry").getJSONObject("location");
        paramString = ((JSONObject)localObject).getString("lat");
        localObject = ((JSONObject)localObject).getString("lng");
        if (this.b)
        {
          v.I(this.c).putString("sourceLat", paramString).apply();
          v.I(this.c).putString("sourceLng", (String)localObject).apply();
          if (v.g(this.c).getText().toString().equalsIgnoreCase(""))
          {
            v.I(this.c).putString("destLat", "").apply();
            v.I(this.c).putString("destLng", "").apply();
            this.c.a(paramString, (String)localObject);
            Log.v("Test", "Outside Function onPostExecute of GetLatLong");
            return;
          }
          this.c.a(paramString, (String)localObject);
          continue;
        }
        v.I(this.c).putString("destLat", paramString).apply();
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      v.I(this.c).putString("destLng", (String)localObject).apply();
      this.c.ak = this.c.l().getSharedPreferences("shareddata", 0);
      this.c.a(this.c.ak.getString("sourceLat", ""), this.c.ak.getString("sourceLng", ""));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */