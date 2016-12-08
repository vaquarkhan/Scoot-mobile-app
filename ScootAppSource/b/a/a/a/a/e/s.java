package b.a.a.a.a.e;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

public final class s
{
  public static String a(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    try
    {
      paramString = URLEncoder.encode(paramString, "UTF8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException(paramString.getMessage(), paramString);
    }
  }
  
  public static TreeMap<String, String> a(String paramString, boolean paramBoolean)
  {
    TreeMap localTreeMap = new TreeMap();
    if (paramString == null) {
      return localTreeMap;
    }
    paramString = paramString.split("&");
    int j = paramString.length;
    int i = 0;
    label28:
    String[] arrayOfString;
    if (i < j)
    {
      arrayOfString = paramString[i].split("=");
      if (arrayOfString.length != 2) {
        break label98;
      }
      if (!paramBoolean) {
        break label81;
      }
      localTreeMap.put(b(arrayOfString[0]), b(arrayOfString[1]));
    }
    for (;;)
    {
      i += 1;
      break label28;
      break;
      label81:
      localTreeMap.put(arrayOfString[0], arrayOfString[1]);
      continue;
      label98:
      if (!TextUtils.isEmpty(arrayOfString[0])) {
        if (paramBoolean) {
          localTreeMap.put(b(arrayOfString[0]), "");
        } else {
          localTreeMap.put(arrayOfString[0], "");
        }
      }
    }
  }
  
  public static TreeMap<String, String> a(URI paramURI, boolean paramBoolean)
  {
    return a(paramURI.getRawQuery(), paramBoolean);
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    try
    {
      paramString = URLDecoder.decode(paramString, "UTF8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException(paramString.getMessage(), paramString);
    }
  }
  
  public static String c(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = a(paramString);
    int j = paramString.length();
    int i = 0;
    if (i < j)
    {
      char c = paramString.charAt(i);
      if (c == '*') {
        localStringBuilder.append("%2A");
      }
      for (;;)
      {
        i += 1;
        break;
        if (c == '+')
        {
          localStringBuilder.append("%20");
        }
        else if ((c == '%') && (i + 2 < j) && (paramString.charAt(i + 1) == '7') && (paramString.charAt(i + 2) == 'E'))
        {
          localStringBuilder.append('~');
          i += 2;
        }
        else
        {
          localStringBuilder.append(c);
        }
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */