package com.sagar.taxiapp;

import android.location.Location;
import android.os.AsyncTask;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class bg
  extends AsyncTask<String, Void, String>
{
  private bg(CarRentalPrePaymentPage paramCarRentalPrePaymentPage) {}
  
  protected String a(String... paramVarArgs)
  {
    CarRentalPrePaymentPage.h(this.a, "key=AIzaSyBqRVwi0eTm8A_EiFY9ZABdt9fMV9U9Sk0");
    String str = "";
    try
    {
      paramVarArgs = "input=" + URLEncoder.encode(paramVarArgs[0], "utf-8");
      if (CarRentalPrePaymentPage.P(this.a) == null)
      {
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + CarRentalPrePaymentPage.Q(this.a) + "&radius=752360";
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
          paramVarArgs = CarRentalPrePaymentPage.i(this.a, paramVarArgs);
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
        paramVarArgs = paramVarArgs + "&" + "sensor=false" + "&" + CarRentalPrePaymentPage.Q(this.a) + "&location=" + CarRentalPrePaymentPage.P(this.a).getLatitude() + "," + CarRentalPrePaymentPage.P(this.a).getLongitude() + "&radius=752360";
      }
    }
    return "";
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    this.a.o = new be(this.a, null);
    this.a.o.execute(new String[] { paramString });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */