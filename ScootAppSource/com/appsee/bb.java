package com.appsee;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

class bb
{
  private static final Charset l = Charset.forName(zb.C("I{Z\002$"));
  
  public static String C(Iterable paramIterable, String paramString)
  {
    if ((paramIterable == null) || (!paramIterable.iterator().hasNext())) {
      return null;
    }
    return TextUtils.join(paramString, paramIterable);
  }
  
  public static String C(String paramString)
  {
    if (C(paramString)) {}
    int i;
    do
    {
      return null;
      i = paramString.lastIndexOf(zb.C("2"));
    } while (i < 0);
    return paramString.substring(i + 1).toLowerCase();
  }
  
  public static String C(Date paramDate)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(zb.C("xK3bQ\000eVeV<gT\025qB&\\o"), Locale.ENGLISH);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone(qi.C("\001:\027")));
    return localSimpleDateFormat.format(paramDate);
  }
  
  public static final String C(byte[] paramArrayOfByte)
  {
    Object localObject = MessageDigest.getInstance(qi.C("\031*a"));
    ((MessageDigest)localObject).update(paramArrayOfByte);
    byte[] arrayOfByte = ((MessageDigest)localObject).digest();
    StringBuffer localStringBuffer = new StringBuffer(arrayOfByte.length * 4);
    int i = 0;
    for (int j = 0; i < arrayOfByte.length; j = i)
    {
      paramArrayOfByte = Integer.toHexString(arrayOfByte[j] & 0xFF);
      for (localObject = paramArrayOfByte; paramArrayOfByte.length() < 2; localObject = paramArrayOfByte) {
        paramArrayOfByte = (String)localObject;
      }
      i = j + 1;
      localStringBuffer.append((String)localObject);
    }
    return localStringBuffer.toString();
  }
  
  public static boolean C(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return true;
    }
    return C(paramCharSequence.toString());
  }
  
  public static boolean C(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0);
  }
  
  public static boolean C(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return true;
    }
    if ((paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    return paramString1.trim().toLowerCase().equals(paramString2.trim().toLowerCase());
  }
  
  @TargetApi(9)
  public static byte[] C(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 9) {
      return paramString.getBytes(l);
    }
    return paramString.getBytes();
  }
  
  public static String H(String paramString)
  {
    if (C(paramString)) {}
    int i;
    do
    {
      return null;
      i = paramString.indexOf(qi.C("z"));
    } while (i < 1);
    return paramString.substring(0, i);
  }
  
  public static final String a(String paramString)
  {
    return C(C(paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */