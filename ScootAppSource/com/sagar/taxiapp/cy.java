package com.sagar.taxiapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class cy
  extends AsyncTask<Void, Void, String>
{
  String a;
  
  public cy(OnDemandSearchAddress paramOnDemandSearchAddress, String paramString)
  {
    this.a = paramString;
  }
  
  protected String a(Void... paramVarArgs)
  {
    paramVarArgs = "https://maps.googleapis.com/maps/api/place/details/json?placeid=" + this.a + "&" + OnDemandSearchAddress.c(this.b);
    Log.e("URL", paramVarArgs);
    try
    {
      paramVarArgs = OnDemandSearchAddress.b(this.b, paramVarArgs);
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
    try
    {
      paramString = new JSONObject(paramString).getJSONObject("result").getJSONObject("geometry").getJSONObject("location");
      OnDemandSearchAddress.c(this.b, paramString.getString("lat"));
      OnDemandSearchAddress.d(this.b, paramString.getString("lng"));
      paramString = new Intent();
      paramString.putExtra("lat", OnDemandSearchAddress.g(this.b));
      paramString.putExtra("lng", OnDemandSearchAddress.h(this.b));
      paramString.putExtra("yourLocation", this.b.q.getString("yourLocation", "Location Not Found"));
      this.b.a(this.b.q.getString("yourLocation", "Location Not Found"));
      if (this.b.getParent() == null) {
        this.b.setResult(-1, paramString);
      }
      for (;;)
      {
        this.b.finish();
        Log.v("Test", "Outside Function onPostExecute of GetLatLong");
        return;
        this.b.getParent().setResult(-1, paramString);
      }
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */