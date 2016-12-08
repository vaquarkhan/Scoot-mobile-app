package com.appsee;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

class nc
{
  private List<String> A;
  private String G;
  private String l;
  
  public nc(String paramString1, String paramString2, JSONArray paramJSONArray)
  {
    this.l = paramString1;
    this.G = paramString2;
    this.A = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int j = 0;
      for (int i = 0; j < paramJSONArray.length(); i = j)
      {
        paramString1 = this.A;
        j = i + 1;
        paramString1.add(paramJSONArray.optString(i));
      }
    }
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = i - 1;
    for (i = j; j >= 0; i = j)
    {
      j = paramString.charAt(i);
      int k = i - 1;
      arrayOfChar[i] = ((char)(j ^ 0x44));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x5F));
    }
    return new String(arrayOfChar);
  }
  
  public String C()
  {
    return this.G;
  }
  
  public List<String> C()
  {
    return this.A;
  }
  
  public String H()
  {
    return this.l;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */