package com.appsee;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

class gb
{
  private static final String A = "Appsee_IsOptOut";
  private static final String B = "Appsee_OfflineSessions";
  private static final String D = "Appsee_MetadataErrors";
  private static final String G = "Appsee_ClientId";
  private static final Object M = new Object();
  private static final String l = "Appsee";
  
  public static Object C()
  {
    synchronized (M)
    {
      Object localObject2 = C().getString("Appsee_OfflineSessions", null);
      if (localObject2 != null)
      {
        localObject2 = new JSONArray((String)localObject2);
        return localObject2;
      }
      return null;
    }
  }
  
  public static ArrayList<HashMap<String, Object>> C()
  {
    JSONArray localJSONArray = C();
    if (localJSONArray == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = 0;
    while (i < localJSONArray.length())
    {
      Object localObject = localJSONArray.get(j);
      j += 1;
      localArrayList.add(C((JSONObject)localObject));
      i = j;
    }
    return localArrayList;
  }
  
  public static HashMap<String, tb> C(String paramString)
  {
    
    HashMap localHashMap;
    synchronized (M)
    {
      Map localMap = C().getAll();
      localHashMap = new HashMap();
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith(paramString))
        {
          tb localtb = fb.C(str);
          localtb.C(localMap.get(str).toString());
          localHashMap.put(str, localtb);
        }
      }
    }
    return localHashMap;
  }
  
  public static HashMap<String, Object> C(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramJSONObject.get(str));
    }
    return localHashMap;
  }
  
  public static JSONArray C()
  {
    synchronized (M)
    {
      Object localObject2 = C();
      if (!((SharedPreferences)localObject2).contains("Appsee_MetadataErrors")) {
        return null;
      }
      localObject2 = new JSONArray(((SharedPreferences)localObject2).getString("Appsee_MetadataErrors", qi.C("\025)")));
      return (JSONArray)localObject2;
    }
  }
  
  public static void C()
  {
    if (ye.C().K() != null) {
      return;
    }
    synchronized (M)
    {
      SharedPreferences localSharedPreferences = C();
      ye.C().C(localSharedPreferences.getString("Appsee_ClientId", zb.C(",")));
      return;
    }
  }
  
  public static void C(String paramString1, String paramString2)
  {
    
    synchronized (M)
    {
      SharedPreferences.Editor localEditor = C().edit();
      if (bb.C(paramString2))
      {
        localEditor.remove(paramString1);
        localEditor.commit();
        return;
      }
      localEditor.putString(paramString1, paramString2);
    }
  }
  
  public static void C(HashMap<String, Object> arg0)
  {
    Object localObject3 = C();
    Object localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = new ArrayList();
    }
    ((ArrayList)localObject1).add(???);
    synchronized (M)
    {
      localObject3 = C();
      vd.H(1, qi.C("\001\0360\017 \007:\tt\0030N1\034&\001&\035z@z"));
      ((SharedPreferences)localObject3).edit().remove("Appsee_MetadataErrors").putString("Appsee_MetadataErrors", new JSONArray((Collection)localObject1).toString()).commit();
      return;
    }
  }
  
  public static boolean C()
  {
    
    synchronized (M)
    {
      boolean bool = C().getBoolean("Appsee_IsOptOut", false);
      return bool;
    }
  }
  
  public static boolean C(boolean paramBoolean)
  {
    
    synchronized (M)
    {
      paramBoolean = C().edit().putBoolean("Appsee_IsOptOut", paramBoolean).commit();
      return paramBoolean;
    }
  }
  
  public static void H()
  {
    synchronized (M)
    {
      C().edit().putString("Appsee_ClientId", ye.C().K()).commit();
      return;
    }
  }
  
  public static void J()
  {
    SharedPreferences localSharedPreferences = C();
    vd.H(1, qi.C("-8\0135\034=\0003N9\nt\013&\034;\034'N2\034;\003t=<\017&\0130>&\0132\013&\013:\r1\035z@z"));
    localSharedPreferences.edit().remove("Appsee_MetadataErrors").commit();
  }
  
  public static void K()
  {
    synchronized (M)
    {
      SharedPreferences localSharedPreferences = C();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(qi.C("-;\000:\0137\032=\030=\032-"), wn.C().ordinal());
      localJSONObject.put(zb.C("O[}]h{uBy"), bb.C(new Date()));
      Object localObject1 = localSharedPreferences.getString("Appsee_OfflineSessions", null);
      if (localObject1 == null)
      {
        localObject1 = new JSONArray();
        Object localObject3 = localObject1;
        ((JSONArray)localObject1).put(localJSONObject);
        localSharedPreferences.edit().putString("Appsee_OfflineSessions", ((JSONArray)localObject3).toString()).commit();
        vd.C(1, qi.C("\007\017\"\0130N;\b2\002=\0001N0\017 \017tStK'"), new Object[] { ((JSONArray)localObject3).toString() });
        return;
      }
      localObject1 = new JSONArray((String)localObject1);
    }
  }
  
  public static void a()
  {
    synchronized (M)
    {
      SharedPreferences localSharedPreferences = C();
      if (localSharedPreferences.contains("Appsee_OfflineSessions"))
      {
        localSharedPreferences.edit().remove("Appsee_OfflineSessions").commit();
        vd.H(1, zb.C("NJq@jJx\017sIzCuAy\017oJo\\u@r\\<K}[}"));
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */