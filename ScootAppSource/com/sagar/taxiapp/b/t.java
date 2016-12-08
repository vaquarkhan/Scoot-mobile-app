package com.sagar.taxiapp.b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public final class t
  extends AsyncTask<String, String, String>
{
  Context a;
  String b;
  Double c;
  Double d;
  
  public t(h paramh, Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  protected String a(String... paramVarArgs)
  {
    h.a(this.e, new Geocoder(this.e.l(), Locale.getDefault()));
    try
    {
      paramVarArgs = h.H(this.e).getFromLocationName(this.b, 1);
      this.c = Double.valueOf(((Address)paramVarArgs.get(0)).getLatitude());
      this.d = Double.valueOf(((Address)paramVarArgs.get(0)).getLongitude());
      return null;
    }
    catch (IOException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
      }
    }
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    if (h.I(this.e))
    {
      h.J(this.e).putString("sourceCityLat", "" + this.c);
      h.J(this.e).putString("sourceCityLng", "" + this.d);
      h.J(this.e).commit();
      return;
    }
    h.J(this.e).putString("destinationCityLat", "" + this.c);
    h.J(this.e).putString("destinationCityLng", "" + this.d);
    h.J(this.e).commit();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */