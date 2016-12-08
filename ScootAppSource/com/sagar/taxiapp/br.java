package com.sagar.taxiapp;

import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class br
  extends AsyncTask<String, Void, String>
{
  private br(LocalCarRentalPrePaymentPage paramLocalCarRentalPrePaymentPage) {}
  
  protected String a(String... paramVarArgs)
  {
    LocalCarRentalPrePaymentPage.g(this.a, "key=AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0");
    String str = "";
    try
    {
      paramVarArgs = "input=" + URLEncoder.encode(paramVarArgs[0], "utf-8");
      if (LocalCarRentalPrePaymentPage.L(this.a) == null)
      {
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + LocalCarRentalPrePaymentPage.M(this.a) + "&radius=752360";
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
          paramVarArgs = LocalCarRentalPrePaymentPage.h(this.a, paramVarArgs);
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
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + LocalCarRentalPrePaymentPage.M(this.a) + "&location=" + LocalCarRentalPrePaymentPage.L(this.a).getLatitude() + "," + LocalCarRentalPrePaymentPage.L(this.a).getLongitude() + "&radius=752360";
      }
    }
    return "";
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    this.a.o = new bp(this.a, null);
    this.a.o.execute(new String[] { paramString });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */