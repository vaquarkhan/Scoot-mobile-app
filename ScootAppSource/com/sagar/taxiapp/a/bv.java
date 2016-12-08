package com.sagar.taxiapp.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public final class bv
  extends AsyncTask<String, String, String>
{
  Context a;
  String b;
  Double c;
  Double d;
  SharedPreferences e;
  SharedPreferences.Editor f;
  
  public bv(bt parambt, Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
    this.e = paramContext.getSharedPreferences("shareddata", 0);
    this.f = paramContext.getSharedPreferences("shareddata", 0).edit();
  }
  
  protected String a(String... paramVarArgs)
  {
    paramVarArgs = new Geocoder(this.a, Locale.getDefault());
    try
    {
      paramVarArgs = paramVarArgs.getFromLocationName(this.b, 1);
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
    catch (IndexOutOfBoundsException paramVarArgs)
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
    paramString = new Intent();
    paramString.putExtra("lat", "" + this.c);
    paramString.putExtra("lng", "" + this.d);
    paramString.putExtra("yourLocation", this.b);
    if (((Activity)this.a).getParent() == null) {
      ((Activity)this.a).setResult(-1, paramString);
    }
    for (;;)
    {
      ((Activity)this.a).finish();
      return;
      ((Activity)this.a).getParent().setResult(-1, paramString);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */