package com.facebook.b;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aw
{
  private String a;
  private String b;
  private Uri c;
  private int[] d;
  
  private aw(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramUri;
    this.d = paramArrayOfInt;
  }
  
  private static int[] a(JSONArray paramJSONArray)
  {
    int[] arrayOfInt = null;
    if (paramJSONArray != null)
    {
      int m = paramJSONArray.length();
      arrayOfInt = new int[m];
      int j = 0;
      for (;;)
      {
        if (j < m)
        {
          int k = paramJSONArray.optInt(j, -1);
          int i = k;
          String str;
          if (k == -1)
          {
            str = paramJSONArray.optString(j);
            i = k;
            if (as.a(str)) {}
          }
          try
          {
            i = Integer.parseInt(str);
            arrayOfInt[j] = i;
            j += 1;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            for (;;)
            {
              as.a("FacebookSDK", localNumberFormatException);
              i = -1;
            }
          }
        }
      }
    }
    return arrayOfInt;
  }
  
  private static aw b(JSONObject paramJSONObject)
  {
    Uri localUri = null;
    String str1 = paramJSONObject.optString("name");
    if (as.a(str1)) {}
    Object localObject;
    do
    {
      do
      {
        return null;
        localObject = str1.split("\\|");
      } while (localObject.length != 2);
      str1 = localObject[0];
      localObject = localObject[1];
    } while ((as.a(str1)) || (as.a((String)localObject)));
    String str2 = paramJSONObject.optString("url");
    if (!as.a(str2)) {
      localUri = Uri.parse(str2);
    }
    return new aw(str1, (String)localObject, localUri, a(paramJSONObject.optJSONArray("versions")));
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */