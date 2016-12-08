package com.appsee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

class bc
{
  private static bc A;
  private HashMap<String, qi> l;
  
  public static bc C()
  {
    try
    {
      if (A == null) {
        A = new bc();
      }
      bc localbc = A;
      return localbc;
    }
    finally {}
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
      arrayOfChar[i] = ((char)(j ^ 0x5C));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x74));
    }
    return new String(arrayOfChar);
  }
  
  public qi C(String paramString)
  {
    try
    {
      qi localqi2 = (qi)this.l.get(paramString);
      qi localqi1 = localqi2;
      if (localqi2 == null)
      {
        localqi1 = new qi(paramString);
        this.l.put(paramString, localqi1);
      }
      return localqi1;
    }
    finally {}
  }
  
  public JSONObject C()
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      Iterator localIterator = this.l.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        int i = ((qi)localEntry.getValue()).C();
        if (i >= 0) {
          localJSONObject1.put((String)localEntry.getKey(), i);
        }
      }
    }
    finally {}
    return localJSONObject2;
  }
  
  public void C()
  {
    try
    {
      this.l.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */