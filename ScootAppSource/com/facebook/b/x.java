package com.facebook.b;

import com.facebook.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x
{
  private static x g;
  private final Map<Integer, Set<Integer>> a;
  private final Map<Integer, Set<Integer>> b;
  private final Map<Integer, Set<Integer>> c;
  private final String d;
  private final String e;
  private final String f;
  
  x(Map<Integer, Set<Integer>> paramMap1, Map<Integer, Set<Integer>> paramMap2, Map<Integer, Set<Integer>> paramMap3, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramMap1;
    this.b = paramMap2;
    this.c = paramMap3;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
  }
  
  public static x a()
  {
    try
    {
      if (g == null) {
        g = b();
      }
      x localx = g;
      return localx;
    }
    finally {}
  }
  
  public static x a(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject7 = null;
    if (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      Object localObject12;
      Object localObject11;
      Object localObject10;
      Object localObject9;
      Object localObject8;
      Object localObject6;
      if (localJSONObject == null)
      {
        localObject12 = localObject1;
        localObject11 = localObject2;
        localObject10 = localObject3;
        localObject9 = localObject4;
        localObject8 = localObject5;
        localObject6 = localObject7;
      }
      for (;;)
      {
        i += 1;
        localObject7 = localObject6;
        localObject5 = localObject8;
        localObject4 = localObject9;
        localObject3 = localObject10;
        localObject2 = localObject11;
        localObject1 = localObject12;
        break;
        String str = localJSONObject.optString("name");
        localObject6 = localObject7;
        localObject8 = localObject5;
        localObject9 = localObject4;
        localObject10 = localObject3;
        localObject11 = localObject2;
        localObject12 = localObject1;
        if (str != null) {
          if (str.equalsIgnoreCase("other"))
          {
            localObject10 = localJSONObject.optString("recovery_message", null);
            localObject6 = a(localJSONObject);
            localObject8 = localObject5;
            localObject9 = localObject4;
            localObject11 = localObject2;
            localObject12 = localObject1;
          }
          else if (str.equalsIgnoreCase("transient"))
          {
            localObject11 = localJSONObject.optString("recovery_message", null);
            localObject8 = a(localJSONObject);
            localObject6 = localObject7;
            localObject9 = localObject4;
            localObject10 = localObject3;
            localObject12 = localObject1;
          }
          else
          {
            localObject6 = localObject7;
            localObject8 = localObject5;
            localObject9 = localObject4;
            localObject10 = localObject3;
            localObject11 = localObject2;
            localObject12 = localObject1;
            if (str.equalsIgnoreCase("login_recoverable"))
            {
              localObject12 = localJSONObject.optString("recovery_message", null);
              localObject9 = a(localJSONObject);
              localObject6 = localObject7;
              localObject8 = localObject5;
              localObject10 = localObject3;
              localObject11 = localObject2;
            }
          }
        }
      }
    }
    return new x((Map)localObject7, (Map)localObject5, (Map)localObject4, (String)localObject3, (String)localObject2, (String)localObject1);
  }
  
  private static Map<Integer, Set<Integer>> a(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
    if (localJSONArray1.length() == 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    int k;
    if (i < localJSONArray1.length())
    {
      paramJSONObject = localJSONArray1.optJSONObject(i);
      if (paramJSONObject == null) {}
      do
      {
        i += 1;
        break;
        k = paramJSONObject.optInt("code");
      } while (k == 0);
      JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
      if ((localJSONArray2 == null) || (localJSONArray2.length() <= 0)) {
        break label158;
      }
      paramJSONObject = new HashSet();
      int j = 0;
      while (j < localJSONArray2.length())
      {
        int m = localJSONArray2.optInt(j);
        if (m != 0) {
          paramJSONObject.add(Integer.valueOf(m));
        }
        j += 1;
      }
    }
    for (;;)
    {
      localHashMap.put(Integer.valueOf(k), paramJSONObject);
      break;
      return localHashMap;
      label158:
      paramJSONObject = null;
    }
  }
  
  private static x b()
  {
    return new x(null, new y(), new z(), null, null, null);
  }
  
  public int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return u.c;
    }
    Set localSet;
    if ((this.a != null) && (this.a.containsKey(Integer.valueOf(paramInt1))))
    {
      localSet = (Set)this.a.get(Integer.valueOf(paramInt1));
      if ((localSet == null) || (localSet.contains(Integer.valueOf(paramInt2)))) {
        return u.b;
      }
    }
    if ((this.c != null) && (this.c.containsKey(Integer.valueOf(paramInt1))))
    {
      localSet = (Set)this.c.get(Integer.valueOf(paramInt1));
      if ((localSet == null) || (localSet.contains(Integer.valueOf(paramInt2)))) {
        return u.a;
      }
    }
    if ((this.b != null) && (this.b.containsKey(Integer.valueOf(paramInt1))))
    {
      localSet = (Set)this.b.get(Integer.valueOf(paramInt1));
      if ((localSet == null) || (localSet.contains(Integer.valueOf(paramInt2)))) {
        return u.c;
      }
    }
    return u.b;
  }
  
  public String a(int paramInt)
  {
    switch (aa.a[(paramInt - 1)])
    {
    default: 
      return null;
    case 1: 
      return this.d;
    case 2: 
      return this.f;
    }
    return this.e;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */