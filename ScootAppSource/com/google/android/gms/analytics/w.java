package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.i;

public final class w
{
  public static String a(int paramInt)
  {
    return a("cd", paramInt);
  }
  
  private static String a(String paramString, int paramInt)
  {
    if (paramInt < 1)
    {
      i.a("index out of range for prefix", paramString);
      return "";
    }
    return String.valueOf(paramString).length() + 11 + paramString + paramInt;
  }
  
  public static String b(int paramInt)
  {
    return a("cm", paramInt);
  }
  
  public static String c(int paramInt)
  {
    return a("&pr", paramInt);
  }
  
  public static String d(int paramInt)
  {
    return a("pr", paramInt);
  }
  
  public static String e(int paramInt)
  {
    return a("&promo", paramInt);
  }
  
  public static String f(int paramInt)
  {
    return a("promo", paramInt);
  }
  
  public static String g(int paramInt)
  {
    return a("pi", paramInt);
  }
  
  public static String h(int paramInt)
  {
    return a("&il", paramInt);
  }
  
  public static String i(int paramInt)
  {
    return a("il", paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */