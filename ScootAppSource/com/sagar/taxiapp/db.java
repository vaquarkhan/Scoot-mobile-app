package com.sagar.taxiapp;

import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class db
  extends AsyncTask<String, Void, String>
{
  private db(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
  protected String a(String... paramVarArgs)
  {
    OnDemandSearchAddress.a(this.a, "key=AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0");
    String str = "";
    try
    {
      paramVarArgs = "input=" + URLEncoder.encode(paramVarArgs[0], "utf-8");
      if (OnDemandSearchAddress.b(this.a) == null)
      {
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + OnDemandSearchAddress.c(this.a) + "&radius=752360";
        paramVarArgs = "https://maps.googleapis.com/maps/api/place/autocomplete/" + "json" + "?" + paramVarArgs;
        Log.e("URL", paramVarArgs);
      }
    }
    catch (UnsupportedEncodingException paramVarArgs)
    {
      for (;;)
      {
        try
        {
          paramVarArgs = OnDemandSearchAddress.b(this.a, paramVarArgs);
          return paramVarArgs;
        }
        catch (Exception paramVarArgs)
        {
          Log.d("Background Task", paramVarArgs.toString());
        }
        paramVarArgs = paramVarArgs;
        paramVarArgs.printStackTrace();
        paramVarArgs = str;
        continue;
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + OnDemandSearchAddress.c(this.a) + "&location=" + OnDemandSearchAddress.b(this.a).getLatitude() + "," + OnDemandSearchAddress.b(this.a).getLongitude() + "&radius=752360";
      }
    }
    return "";
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    OnDemandSearchAddress.a(this.a, new cz(this.a, null));
    OnDemandSearchAddress.d(this.a).execute(new String[] { paramString });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */