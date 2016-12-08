package com.mixpanel.android.c;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.b.d;
import com.mixpanel.android.b.e;
import com.mixpanel.android.b.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class g
{
  private static final Class<?>[] d = new Class[0];
  private static final List<aa> e = Collections.emptyList();
  private final com.mixpanel.android.mpmetrics.ax a;
  private final d b;
  private final bg c;
  
  public g(com.mixpanel.android.mpmetrics.ax paramax, d paramd, bg parambg)
  {
    this.a = paramax;
    this.b = paramd;
    this.c = parambg;
  }
  
  private Drawable a(JSONObject paramJSONObject, List<String> paramList)
  {
    int i = 0;
    try
    {
      if (paramJSONObject.isNull("url")) {
        throw new i("Can't construct a BitmapDrawable with a null url");
      }
    }
    catch (JSONException paramJSONObject)
    {
      throw new i("Couldn't read drawable description", paramJSONObject);
    }
    String str = paramJSONObject.getString("url");
    boolean bool = paramJSONObject.isNull("dimensions");
    int j;
    int k;
    int m;
    if (bool)
    {
      j = 0;
      k = 0;
      m = 0;
    }
    for (int n = 0;; n = 1)
    {
      try
      {
        paramJSONObject = this.b.a(str);
        paramList.add(str);
        paramJSONObject = new BitmapDrawable(Resources.getSystem(), paramJSONObject);
        if (n == 0) {
          break;
        }
        paramJSONObject.setBounds(m, j, k, i);
        return paramJSONObject;
      }
      catch (e paramJSONObject)
      {
        throw new j(paramJSONObject.getMessage(), paramJSONObject.getCause());
      }
      paramJSONObject = paramJSONObject.getJSONObject("dimensions");
      m = paramJSONObject.getInt("left");
      k = paramJSONObject.getInt("right");
      j = paramJSONObject.getInt("top");
      i = paramJSONObject.getInt("bottom");
    }
    return paramJSONObject;
  }
  
  private ab a(Class<?> paramClass, JSONObject paramJSONObject)
  {
    String str1 = null;
    for (;;)
    {
      try
      {
        String str2 = paramJSONObject.getString("name");
        if (paramJSONObject.has("get"))
        {
          Object localObject2 = paramJSONObject.getJSONObject("get");
          localObject1 = ((JSONObject)localObject2).getString("selector");
          localObject2 = Class.forName(((JSONObject)localObject2).getJSONObject("result").getString("type"));
          localObject1 = new a(paramClass, (String)localObject1, d, (Class)localObject2);
          if (paramJSONObject.has("set")) {
            str1 = paramJSONObject.getJSONObject("set").getString("selector");
          }
          paramClass = new ab(str2, paramClass, (a)localObject1, str1);
          return paramClass;
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new i("Can't create property reader", paramClass);
      }
      catch (JSONException paramClass)
      {
        throw new i("Can't read property JSON", paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new i("Can't read property JSON, relevant arg/return class not found", paramClass);
      }
      Object localObject1 = null;
    }
  }
  
  private Integer a(int paramInt, String paramString, com.mixpanel.android.mpmetrics.ax paramax)
  {
    if (paramString != null) {
      if (!paramax.a(paramString)) {}
    }
    for (int i = paramax.b(paramString); (-1 != i) && (-1 != paramInt) && (i != paramInt); i = -1)
    {
      Log.e("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
      return null;
      Log.w("MixpanelAPI.EProtocol", "Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"" + paramString + "\"");
      return null;
    }
    if (-1 != i) {
      return Integer.valueOf(i);
    }
    return Integer.valueOf(paramInt);
  }
  
  private Object a(Object paramObject, String paramString, List<String> paramList)
  {
    try
    {
      if ("java.lang.CharSequence".equals(paramString)) {
        return paramObject;
      }
      if ((!"boolean".equals(paramString)) && (!"java.lang.Boolean".equals(paramString)))
      {
        if (("int".equals(paramString)) || ("java.lang.Integer".equals(paramString))) {
          return Integer.valueOf(((Number)paramObject).intValue());
        }
        if (("float".equals(paramString)) || ("java.lang.Float".equals(paramString))) {
          return Float.valueOf(((Number)paramObject).floatValue());
        }
        if ("android.graphics.drawable.Drawable".equals(paramString)) {
          return a((JSONObject)paramObject, paramList);
        }
        if ("android.graphics.drawable.BitmapDrawable".equals(paramString)) {
          return a((JSONObject)paramObject, paramList);
        }
        if ("android.graphics.drawable.ColorDrawable".equals(paramString)) {
          return new ColorDrawable(((Number)paramObject).intValue());
        }
        throw new i("Don't know how to interpret type " + paramString + " (arg was " + paramObject + ")");
      }
    }
    catch (ClassCastException paramList)
    {
      throw new i("Couldn't interpret <" + paramObject + "> as " + paramString);
    }
    return paramObject;
  }
  
  public at a(JSONObject paramJSONObject, bf parambf)
  {
    String str1;
    String str2;
    try
    {
      str1 = paramJSONObject.getString("event_name");
      str2 = paramJSONObject.getString("event_type");
      paramJSONObject = a(paramJSONObject.getJSONArray("path"), this.a);
      if (paramJSONObject.size() == 0) {
        throw new l("event '" + str1 + "' will not be bound to any element in the UI.");
      }
    }
    catch (JSONException paramJSONObject)
    {
      throw new i("Can't interpret instructions due to JSONException", paramJSONObject);
    }
    if ("click".equals(str2)) {
      return new av(paramJSONObject, 1, str1, parambf);
    }
    if ("selected".equals(str2)) {
      return new av(paramJSONObject, 4, str1, parambf);
    }
    if ("text_changed".equals(str2)) {
      return new ax(paramJSONObject, str1, parambf);
    }
    if ("detected".equals(str2)) {
      return new bi(paramJSONObject, str1, parambf);
    }
    throw new i("Mixpanel can't track event type \"" + str2 + "\"");
  }
  
  public k a(JSONObject paramJSONObject)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    List localList;
    Object localObject1;
    try
    {
      localList = a(paramJSONObject.getJSONArray("path"), this.a);
      if (localList.size() == 0) {
        throw new l("Edit will not be bound to any element in the UI.");
      }
    }
    catch (NoSuchMethodException paramJSONObject)
    {
      throw new i("Can't create property mutator", paramJSONObject);
      if (!paramJSONObject.getString("change_type").equals("property")) {
        break label314;
      }
      localObject1 = paramJSONObject.getJSONObject("property").getString("classname");
      if (localObject1 == null) {
        throw new i("Can't bind an edit property without a target class");
      }
    }
    catch (JSONException paramJSONObject)
    {
      throw new i("Can't interpret instructions due to JSONException", paramJSONObject);
    }
    Object localObject2;
    Object localObject3;
    try
    {
      localObject2 = Class.forName((String)localObject1);
      localObject1 = a((Class)localObject2, paramJSONObject.getJSONObject("property"));
      paramJSONObject = paramJSONObject.getJSONArray("args");
      localObject2 = new Object[paramJSONObject.length()];
      while (i < paramJSONObject.length())
      {
        localObject3 = paramJSONObject.getJSONArray(i);
        localObject2[i] = a(((JSONArray)localObject3).get(0), ((JSONArray)localObject3).getString(1), localArrayList);
        i += 1;
      }
      paramJSONObject = ((ab)localObject1).a((Object[])localObject2);
    }
    catch (ClassNotFoundException paramJSONObject)
    {
      throw new i("Can't find class for visit path: " + (String)localObject1, paramJSONObject);
    }
    if (paramJSONObject == null) {
      throw new i("Can't update a read-only property " + ((ab)localObject1).a + " (add a mutator to make this work)");
    }
    paramJSONObject = new bh(localList, paramJSONObject, ((ab)localObject1).c);
    return new k(paramJSONObject, localArrayList, null);
    label314:
    int j;
    if (paramJSONObject.getString("change_type").equals("layout"))
    {
      localObject2 = paramJSONObject.getJSONArray("args");
      localObject3 = new ArrayList();
      j = ((JSONArray)localObject2).length();
      i = 0;
    }
    for (;;)
    {
      JSONObject localJSONObject;
      String str1;
      String str2;
      Integer localInteger;
      if (i < j)
      {
        localJSONObject = ((JSONArray)localObject2).optJSONObject(i);
        str1 = localJSONObject.getString("view_id_name");
        str2 = localJSONObject.getString("anchor_id_name");
        localInteger = a(-1, str1, this.a);
        if (str2.equals("0"))
        {
          localObject1 = Integer.valueOf(0);
          break label575;
        }
      }
      for (;;)
      {
        label422:
        Log.w("MixpanelAPI.EProtocol", "View (" + str1 + ") or anchor (" + str2 + ") not found.");
        break label588;
        if (str2.equals("-1")) {
          localObject1 = Integer.valueOf(-1);
        } else {
          localObject1 = a(-1, str2, this.a);
        }
        label575:
        do
        {
          ((ArrayList)localObject3).add(new bc(localInteger.intValue(), localJSONObject.getInt("verb"), ((Integer)localObject1).intValue()));
          break label588;
          paramJSONObject = new bd(localList, (List)localObject3, paramJSONObject.getString("name"), this.c);
          break;
          throw new i("Can't figure out the edit type");
          if (localInteger == null) {
            break label422;
          }
        } while (localObject1 != null);
      }
      label588:
      i += 1;
    }
  }
  
  List<aa> a(JSONArray paramJSONArray, com.mixpanel.android.mpmetrics.ax paramax)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      Object localObject2 = paramJSONArray.getJSONObject(i);
      Object localObject1 = f.a((JSONObject)localObject2, "prefix");
      String str1 = f.a((JSONObject)localObject2, "view_class");
      int k = ((JSONObject)localObject2).optInt("index", -1);
      String str2 = f.a((JSONObject)localObject2, "contentDescription");
      int m = ((JSONObject)localObject2).optInt("id", -1);
      String str3 = f.a((JSONObject)localObject2, "mp_id_name");
      localObject2 = f.a((JSONObject)localObject2, "tag");
      if ("shortest".equals(localObject1)) {}
      for (int j = 1;; j = 0)
      {
        localObject1 = a(m, str3, paramax);
        if (localObject1 != null) {
          break label180;
        }
        return e;
        if (localObject1 != null) {
          break;
        }
      }
      Log.w("MixpanelAPI.EProtocol", "Unrecognized prefix type \"" + (String)localObject1 + "\". No views will be matched");
      return e;
      label180:
      localArrayList.add(new aa(j, str1, k, ((Integer)localObject1).intValue(), str2, (String)localObject2));
      i += 1;
    }
    return localArrayList;
  }
  
  public ao b(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONObject("config").getJSONArray("classes");
        i = 0;
        if (i < paramJSONObject.length())
        {
          Object localObject = paramJSONObject.getJSONObject(i);
          Class localClass = Class.forName(((JSONObject)localObject).getString("name"));
          localObject = ((JSONObject)localObject).getJSONArray("properties");
          int j = 0;
          if (j < ((JSONArray)localObject).length())
          {
            localArrayList.add(a(localClass, ((JSONArray)localObject).getJSONObject(j)));
            j += 1;
            continue;
          }
        }
        else
        {
          paramJSONObject = new ao(localArrayList, this.a);
          return paramJSONObject;
        }
      }
      catch (JSONException paramJSONObject)
      {
        throw new i("Can't read snapshot configuration", paramJSONObject);
      }
      catch (ClassNotFoundException paramJSONObject)
      {
        throw new i("Can't resolve types for snapshot configuration", paramJSONObject);
      }
      i += 1;
    }
  }
  
  public Pair<String, Object> c(JSONObject paramJSONObject)
  {
    String str2;
    for (;;)
    {
      try
      {
        String str1 = paramJSONObject.getString("name");
        str2 = paramJSONObject.getString("type");
        if ("number".equals(str2))
        {
          str2 = paramJSONObject.getString("encoding");
          if ("d".equals(str2))
          {
            paramJSONObject = Double.valueOf(paramJSONObject.getDouble("value"));
            return new Pair(str1, paramJSONObject);
          }
          if ("l".equals(str2))
          {
            paramJSONObject = Long.valueOf(paramJSONObject.getLong("value"));
            continue;
          }
          throw new i("number must have encoding of type \"l\" for long or \"d\" for double in: " + paramJSONObject);
        }
      }
      catch (JSONException paramJSONObject)
      {
        throw new i("Can't read tweak update", paramJSONObject);
      }
      if ("boolean".equals(str2))
      {
        paramJSONObject = Boolean.valueOf(paramJSONObject.getBoolean("value"));
      }
      else
      {
        if (!"string".equals(str2)) {
          break;
        }
        paramJSONObject = paramJSONObject.getString("value");
      }
    }
    throw new i("Unrecognized tweak type " + str2 + " in: " + paramJSONObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */