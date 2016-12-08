package com.sagar.taxiapp.b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public final class bg
  extends AsyncTask<String, String, String>
{
  Context a;
  String b;
  Double c;
  Double d;
  
  public bg(av paramav, Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  protected String a(String... paramVarArgs)
  {
    av.a(this.e, new Geocoder(this.e.l(), Locale.getDefault()));
    try
    {
      paramVarArgs = av.y(this.e).getFromLocationName(this.b, 1);
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
    av.z(this.e).putString("sourceCityLatLocal", "" + this.c);
    av.z(this.e).putString("sourceCityLngLocal", "" + this.d);
    av.z(this.e).commit();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */