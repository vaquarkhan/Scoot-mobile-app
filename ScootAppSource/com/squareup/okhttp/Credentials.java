package com.squareup.okhttp;

import d.k;
import java.io.UnsupportedEncodingException;

public final class Credentials
{
  public static String basic(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = k.a((paramString1 + ":" + paramString2).getBytes("ISO-8859-1")).b();
      paramString1 = "Basic " + paramString1;
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new AssertionError();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Credentials.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */