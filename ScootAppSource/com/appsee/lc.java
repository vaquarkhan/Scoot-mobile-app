package com.appsee;

import android.app.Activity;
import android.app.Application;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class lc
{
  public static <T> T C(Object paramObject, String paramString)
  {
    paramString = C(paramObject.getClass(), paramString);
    if (paramString != null)
    {
      paramString.setAccessible(true);
      return (T)paramString.get(paramObject);
    }
    return null;
  }
  
  public static Object C(Object paramObject, String paramString, int paramInt, Object... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[paramInt];
    Class[] arrayOfClass = new Class[paramInt];
    int i = 0;
    int j = 0;
    if (i < paramInt)
    {
      arrayOfObject[j] = paramVarArgs[j];
      if (paramVarArgs[j] == null) {}
      for (Class localClass = Object.class;; localClass = C(paramVarArgs[j].getClass()))
      {
        arrayOfClass[j] = localClass;
        i = j + 1;
        j = i;
        break;
      }
    }
    return C(paramObject.getClass(), paramObject, paramString, arrayOfClass, paramVarArgs);
  }
  
  public static Object C(Object paramObject, String paramString, Class<?>[] paramArrayOfClass, Object... paramVarArgs)
  {
    return C(paramObject.getClass(), paramObject, paramString, paramArrayOfClass, paramVarArgs);
  }
  
  public static String C(Class<?> paramClass)
  {
    Method[] arrayOfMethod = paramClass.getMethods();
    StringBuilder localStringBuilder = new StringBuilder();
    int m = arrayOfMethod.length;
    int j = 0;
    for (int i = 0; j < m; i = j)
    {
      Method localMethod = arrayOfMethod[i];
      Class[] arrayOfClass = localMethod.getParameterTypes();
      paramClass = "";
      int k = 0;
      for (j = 0; k < arrayOfClass.length; j = k)
      {
        localObject = paramClass;
        if (j > 0) {
          localObject = qi.C("Bt");
        }
        paramClass = new StringBuilder().insert(0, (String)localObject).append(arrayOfClass[j].getName()).append(qi.C("N5\0343"));
        k = j + 1;
        paramClass = j;
      }
      paramClass = new StringBuilder().insert(0, localMethod.getReturnType().getName()).append(qi.C("t")).append(localMethod.getName()).append(qi.C("N|")).append(paramClass);
      Object localObject = qi.C("G^");
      j = i + 1;
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public static void C(Object paramObject1, String paramString, Object paramObject2)
  {
    paramString = C(paramObject1.getClass(), paramString);
    if (paramString != null)
    {
      paramString.setAccessible(true);
      paramString.set(paramObject1, paramObject2);
    }
  }
  
  public static boolean C()
  {
    try
    {
      boolean bool = Application.class.isAssignableFrom(Class.forName(C().getClassName()));
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public static boolean C(String paramString)
  {
    if (bb.C(paramString)) {}
    for (;;)
    {
      return false;
      StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
      int k = arrayOfStackTraceElement.length;
      int i = 0;
      for (int j = 0; i < k; j = i)
      {
        if (arrayOfStackTraceElement[j].getMethodName().equalsIgnoreCase(paramString)) {
          return true;
        }
        i = j + 1;
      }
    }
  }
  
  public static StackTraceElement H()
  {
    return C(Thread.class, qi.C("3\013 = \0177\005\000\0345\r1"), 3);
  }
  
  public static boolean H()
  {
    if (C(Activity.class, qi.C("\001:-&\0135\0321"), 0) != null) {}
    while (C(Activity.class, qi.C("\001:<1\035!\0031"), 0) != null) {
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */