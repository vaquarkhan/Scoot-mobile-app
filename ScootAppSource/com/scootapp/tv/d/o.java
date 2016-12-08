package com.scootapp.tv.d;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class o
{
  public static int a(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
    String str = localSimpleDateFormat.format(new Date());
    try
    {
      int i = localSimpleDateFormat.parse(str).compareTo(localSimpleDateFormat.parse(paramString));
      return i;
    }
    catch (Exception paramString)
    {
      Log.v("Scoot", "DATE_CONVERSION_ERROR_MSG " + paramString);
    }
    return -1;
  }
  
  public static String a()
  {
    return new SimpleDateFormat("dd-MMM-yyyy KK:mm a", Locale.getDefault()).format(new Date());
  }
  
  public static float b(String paramString)
  {
    Object localObject = new SimpleDateFormat("dd/MM/yyyy KK:mma", Locale.ENGLISH);
    String str = ((SimpleDateFormat)localObject).format(new Date());
    try
    {
      paramString = ((SimpleDateFormat)localObject).parse(paramString);
      localObject = ((SimpleDateFormat)localObject).parse(str);
      long l = (paramString.getTime() - ((Date)localObject).getTime()) / 3600000L;
      return (float)l;
    }
    catch (Exception paramString)
    {
      Log.v("Scoot", "DATE_CONVERSION_ERROR_MSG " + paramString);
    }
    return -1.0F;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */