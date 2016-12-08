package com.sagar.taxiapp.b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public final class ap
  extends AsyncTask<String, String, String>
{
  Context a;
  
  public ap(v paramv, Context paramContext)
  {
    this.a = paramContext;
  }
  
  protected String a(String... paramVarArgs)
  {
    this.b.b = new Geocoder(v.F(this.b), Locale.getDefault());
    this.b.c = "";
    for (;;)
    {
      try
      {
        this.b.g = this.b.b.getFromLocation(this.b.f.getLatitude(), this.b.f.getLongitude(), 1);
        if ((this.b.g != null) && (this.b.g.size() != 0)) {
          continue;
        }
        this.b.c = "Enter Current Location";
        if (this.b.c.contains("null")) {
          this.b.c = this.b.c.replace("null", "");
        }
        Log.v("Scoot", "Current Location " + this.b.c);
      }
      catch (IOException paramVarArgs)
      {
        int j;
        int i;
        String str;
        StringBuilder localStringBuilder;
        v localv;
        Log.v("Scoot", "IOException " + paramVarArgs);
        this.b.c = "Enter Current Location";
        continue;
      }
      catch (NullPointerException paramVarArgs)
      {
        this.b.c = "Enter Current Location";
        continue;
      }
      return this.b.c;
      paramVarArgs = new String[5];
      v.I(this.b).putString("currentCity", ((Address)this.b.g.get(0)).getLocality()).apply();
      paramVarArgs[2] = (((Address)this.b.g.get(0)).getLocality() + ", ");
      paramVarArgs[3] = (((Address)this.b.g.get(0)).getAdminArea() + ", ");
      paramVarArgs[4] = ((Address)this.b.g.get(0)).getCountryName();
      paramVarArgs[0] = (((Address)this.b.g.get(0)).getFeatureName() + ", ");
      paramVarArgs[1] = (((Address)this.b.g.get(0)).getSubLocality() + ", ");
      j = paramVarArgs.length;
      i = 0;
      if (i < j)
      {
        str = paramVarArgs[i];
        if (!str.equalsIgnoreCase("null, "))
        {
          localStringBuilder = new StringBuilder();
          localv = this.b;
          localv.c += str;
        }
        i += 1;
      }
    }
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    this.b.c = paramString;
    if (this.b.c.equalsIgnoreCase("Enter Current Location"))
    {
      v.e(this.b, String.format("%s,%s", new Object[] { Double.valueOf(this.b.f.getLatitude()), Double.valueOf(this.b.f.getLongitude()) }));
      return;
    }
    v.I(this.b).putString("yourLocation", this.b.c).apply();
    v.d(this.b).setText(this.b.c);
    v.d(this.b).setSelection(0);
    v.d(this.b).clearFocus();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */