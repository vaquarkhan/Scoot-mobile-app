package net.danlew.android.joda;

import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static Map<Class<?>, Map<String, Integer>> a = new ConcurrentHashMap();
  
  public static int a(Class<?> paramClass, String paramString)
  {
    Object localObject;
    if (!a.containsKey(paramClass))
    {
      localObject = new ConcurrentHashMap();
      a.put(paramClass, localObject);
    }
    while (((Map)localObject).containsKey(paramString))
    {
      return ((Integer)((Map)localObject).get(paramString)).intValue();
      localObject = (Map)a.get(paramClass);
    }
    try
    {
      int i = paramClass.getField(paramString).getInt(null);
      if (i != 0) {
        ((Map)localObject).put(paramString, Integer.valueOf(i));
      }
      return i;
    }
    catch (Exception localException)
    {
      Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + paramClass + " name=" + paramString, localException);
    }
    return 0;
  }
  
  public static String a(String paramString)
  {
    return "joda_" + b(paramString);
  }
  
  private static String b(String paramString)
  {
    paramString = new File(paramString);
    ArrayList localArrayList = new ArrayList();
    File localFile;
    do
    {
      localArrayList.add(paramString.getName());
      localFile = paramString.getParentFile();
      paramString = localFile;
    } while (localFile != null);
    paramString = new StringBuffer();
    int i = localArrayList.size() - 1;
    while (i >= 0)
    {
      if (paramString.length() > 0) {
        paramString.append("_");
      }
      paramString.append((String)localArrayList.get(i));
      i -= 1;
    }
    return paramString.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\net\danlew\android\joda\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */