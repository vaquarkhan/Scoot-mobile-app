package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.b.ag;
import com.facebook.b.as;
import com.facebook.b.az;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class au
{
  private static final String a = au.class.getSimpleName();
  private String b;
  private SharedPreferences c;
  
  public au(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public au(Context paramContext, String paramString)
  {
    az.a(paramContext, "context");
    String str = paramString;
    if (as.a(paramString)) {
      str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    }
    this.b = str;
    paramString = paramContext.getApplicationContext();
    if (paramString != null) {
      paramContext = paramString;
    }
    this.c = paramContext.getSharedPreferences(this.b, 0);
  }
  
  static Date a(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {}
    long l;
    do
    {
      return null;
      l = paramBundle.getLong(paramString, Long.MIN_VALUE);
    } while (l == Long.MIN_VALUE);
    return new Date(l);
  }
  
  private void a(String paramString, Bundle paramBundle)
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i = 0;
    Object localObject1 = new JSONObject(this.c.getString(paramString, "{}"));
    Object localObject2 = ((JSONObject)localObject1).getString("valueType");
    if (((String)localObject2).equals("bool")) {
      paramBundle.putBoolean(paramString, ((JSONObject)localObject1).getBoolean("value"));
    }
    do
    {
      do
      {
        return;
        if (((String)localObject2).equals("bool[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new boolean[((JSONArray)localObject1).length()];
          while (i < localObject2.length)
          {
            localObject2[i] = ((JSONArray)localObject1).getBoolean(i);
            i += 1;
          }
          paramBundle.putBooleanArray(paramString, (boolean[])localObject2);
          return;
        }
        if (((String)localObject2).equals("byte"))
        {
          paramBundle.putByte(paramString, (byte)((JSONObject)localObject1).getInt("value"));
          return;
        }
        if (((String)localObject2).equals("byte[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new byte[((JSONArray)localObject1).length()];
          i = j;
          while (i < localObject2.length)
          {
            localObject2[i] = ((byte)((JSONArray)localObject1).getInt(i));
            i += 1;
          }
          paramBundle.putByteArray(paramString, (byte[])localObject2);
          return;
        }
        if (((String)localObject2).equals("short"))
        {
          paramBundle.putShort(paramString, (short)((JSONObject)localObject1).getInt("value"));
          return;
        }
        if (((String)localObject2).equals("short[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new short[((JSONArray)localObject1).length()];
          i = k;
          while (i < localObject2.length)
          {
            localObject2[i] = ((short)((JSONArray)localObject1).getInt(i));
            i += 1;
          }
          paramBundle.putShortArray(paramString, (short[])localObject2);
          return;
        }
        if (((String)localObject2).equals("int"))
        {
          paramBundle.putInt(paramString, ((JSONObject)localObject1).getInt("value"));
          return;
        }
        if (((String)localObject2).equals("int[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new int[((JSONArray)localObject1).length()];
          i = m;
          while (i < localObject2.length)
          {
            localObject2[i] = ((JSONArray)localObject1).getInt(i);
            i += 1;
          }
          paramBundle.putIntArray(paramString, (int[])localObject2);
          return;
        }
        if (((String)localObject2).equals("long"))
        {
          paramBundle.putLong(paramString, ((JSONObject)localObject1).getLong("value"));
          return;
        }
        if (((String)localObject2).equals("long[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new long[((JSONArray)localObject1).length()];
          i = n;
          while (i < localObject2.length)
          {
            localObject2[i] = ((JSONArray)localObject1).getLong(i);
            i += 1;
          }
          paramBundle.putLongArray(paramString, (long[])localObject2);
          return;
        }
        if (((String)localObject2).equals("float"))
        {
          paramBundle.putFloat(paramString, (float)((JSONObject)localObject1).getDouble("value"));
          return;
        }
        if (((String)localObject2).equals("float[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new float[((JSONArray)localObject1).length()];
          i = i1;
          while (i < localObject2.length)
          {
            localObject2[i] = ((float)((JSONArray)localObject1).getDouble(i));
            i += 1;
          }
          paramBundle.putFloatArray(paramString, (float[])localObject2);
          return;
        }
        if (((String)localObject2).equals("double"))
        {
          paramBundle.putDouble(paramString, ((JSONObject)localObject1).getDouble("value"));
          return;
        }
        if (((String)localObject2).equals("double[]"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          localObject2 = new double[((JSONArray)localObject1).length()];
          i = i2;
          while (i < localObject2.length)
          {
            localObject2[i] = ((JSONArray)localObject1).getDouble(i);
            i += 1;
          }
          paramBundle.putDoubleArray(paramString, (double[])localObject2);
          return;
        }
        if (!((String)localObject2).equals("char")) {
          break;
        }
        localObject1 = ((JSONObject)localObject1).getString("value");
      } while ((localObject1 == null) || (((String)localObject1).length() != 1));
      paramBundle.putChar(paramString, ((String)localObject1).charAt(0));
      return;
      Object localObject3;
      if (((String)localObject2).equals("char[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        localObject2 = new char[((JSONArray)localObject1).length()];
        i = 0;
        while (i < localObject2.length)
        {
          localObject3 = ((JSONArray)localObject1).getString(i);
          if ((localObject3 != null) && (((String)localObject3).length() == 1)) {
            localObject2[i] = ((String)localObject3).charAt(0);
          }
          i += 1;
        }
        paramBundle.putCharArray(paramString, (char[])localObject2);
        return;
      }
      if (((String)localObject2).equals("string"))
      {
        paramBundle.putString(paramString, ((JSONObject)localObject1).getString("value"));
        return;
      }
      if (((String)localObject2).equals("stringList"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        j = ((JSONArray)localObject2).length();
        localObject3 = new ArrayList(j);
        i = 0;
        if (i < j)
        {
          localObject1 = ((JSONArray)localObject2).get(i);
          if (localObject1 == JSONObject.NULL) {}
          for (localObject1 = null;; localObject1 = (String)localObject1)
          {
            ((ArrayList)localObject3).add(i, localObject1);
            i += 1;
            break;
          }
        }
        paramBundle.putStringArrayList(paramString, (ArrayList)localObject3);
        return;
      }
    } while (!((String)localObject2).equals("enum"));
    try
    {
      paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(((JSONObject)localObject1).getString("enumType")), ((JSONObject)localObject1).getString("value")));
      return;
    }
    catch (ClassNotFoundException paramString) {}catch (IllegalArgumentException paramString) {}
  }
  
  public static boolean a(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    String str;
    do
    {
      return false;
      str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
    } while ((str == null) || (str.length() == 0) || (paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0L));
    return true;
  }
  
  public static String b(Bundle paramBundle)
  {
    az.a(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
  }
  
  public static j c(Bundle paramBundle)
  {
    az.a(paramBundle, "bundle");
    if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
      return (j)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
    }
    if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
      return j.b;
    }
    return j.e;
  }
  
  public static String d(Bundle paramBundle)
  {
    az.a(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = this.c.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      try
      {
        a(str, localBundle);
      }
      catch (JSONException localJSONException)
      {
        ag.a(av.d, 5, a, "Error reading cached value for key: '" + str + "' -- " + localJSONException);
        return null;
      }
    }
    return localJSONException;
  }
  
  public void b()
  {
    this.c.edit().clear().apply();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */