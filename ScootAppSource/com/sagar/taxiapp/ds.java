package com.sagar.taxiapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import java.util.Hashtable;

public final class ds
{
  private static final Hashtable<String, Typeface> a = new Hashtable();
  
  public static Typeface a(Context paramContext, String paramString)
  {
    synchronized (a)
    {
      boolean bool = a.containsKey(paramString);
      if (!bool) {}
      try
      {
        paramContext = Typeface.createFromAsset(paramContext.getAssets(), paramString);
        a.put(paramString, paramContext);
        paramContext = (Typeface)a.get(paramString);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("Typefaces", "Could not get typeface '" + paramString + "' because " + paramContext.getMessage());
        return null;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */