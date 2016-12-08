package com.sagar.taxiapp.b;

import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class at
  extends AsyncTask<String, Void, String>
{
  protected String a(String... paramVarArgs)
  {
    v.c(this.a, "key=AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0");
    String str = "";
    try
    {
      paramVarArgs = "input=" + URLEncoder.encode(paramVarArgs[0], "utf-8");
      if (v.C(this.a) == null)
      {
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + v.D(this.a) + "&radius=752360";
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
          paramVarArgs = v.d(this.a, paramVarArgs);
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
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + v.D(this.a) + "&location=" + v.C(this.a).getLatitude() + "," + v.C(this.a).getLongitude() + "&radius=752360";
      }
    }
    return "";
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    v.a(this.a, new aq(this.a, null));
    v.E(this.a).execute(new String[] { paramString });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */