package com.mixpanel.android.c;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class a
{
  private final String a;
  private final Object[] b;
  private final Class<?> c;
  private final Class<?> d;
  private final Method e;
  
  public a(Class<?> paramClass1, String paramString, Object[] paramArrayOfObject, Class<?> paramClass2)
  {
    this.a = paramString;
    this.b = paramArrayOfObject;
    this.c = paramClass2;
    this.e = b(paramClass1);
    if (this.e == null) {
      throw new NoSuchMethodException("Method " + paramClass1.getName() + "." + this.a + " doesn't exit");
    }
    this.d = this.e.getDeclaringClass();
  }
  
  private static Class<?> a(Class<?> paramClass)
  {
    Object localObject;
    if (paramClass == Byte.class) {
      localObject = Byte.TYPE;
    }
    do
    {
      return (Class<?>)localObject;
      if (paramClass == Short.class) {
        return Short.TYPE;
      }
      if (paramClass == Integer.class) {
        return Integer.TYPE;
      }
      if (paramClass == Long.class) {
        return Long.TYPE;
      }
      if (paramClass == Float.class) {
        return Float.TYPE;
      }
      if (paramClass == Double.class) {
        return Double.TYPE;
      }
      if (paramClass == Boolean.class) {
        return Boolean.TYPE;
      }
      localObject = paramClass;
    } while (paramClass != Character.class);
    return Character.TYPE;
  }
  
  private Method b(Class<?> paramClass)
  {
    Class[] arrayOfClass1 = new Class[this.b.length];
    int i = 0;
    while (i < this.b.length)
    {
      arrayOfClass1[i] = this.b[i].getClass();
      i += 1;
    }
    paramClass = paramClass.getMethods();
    int k = paramClass.length;
    i = 0;
    if (i < k)
    {
      Method localMethod = paramClass[i];
      Object localObject = localMethod.getName();
      Class[] arrayOfClass2 = localMethod.getParameterTypes();
      if ((!((String)localObject).equals(this.a)) || (arrayOfClass2.length != this.b.length)) {}
      boolean bool;
      do
      {
        do
        {
          i += 1;
          break;
        } while (!a(this.c).isAssignableFrom(a(localMethod.getReturnType())));
        bool = true;
        int j = 0;
        while ((j < arrayOfClass2.length) && (bool))
        {
          localObject = a(arrayOfClass1[j]);
          bool = a(arrayOfClass2[j]).isAssignableFrom((Class)localObject);
          j += 1;
        }
      } while (!bool);
      return localMethod;
    }
    return null;
  }
  
  public Object a(View paramView)
  {
    return a(paramView, this.b);
  }
  
  public Object a(View paramView, Object[] paramArrayOfObject)
  {
    Class localClass = paramView.getClass();
    if (this.d.isAssignableFrom(localClass)) {}
    try
    {
      paramView = this.e.invoke(paramView, paramArrayOfObject);
      return paramView;
    }
    catch (IllegalAccessException paramView)
    {
      Log.e("MixpanelABTest.Caller", "Method " + this.e.getName() + " appears not to be public", paramView);
      return null;
    }
    catch (IllegalArgumentException paramView)
    {
      for (;;)
      {
        Log.e("MixpanelABTest.Caller", "Method " + this.e.getName() + " called with arguments of the wrong type", paramView);
      }
    }
    catch (InvocationTargetException paramView)
    {
      for (;;)
      {
        Log.e("MixpanelABTest.Caller", "Method " + this.e.getName() + " threw an exception", paramView);
      }
    }
  }
  
  public boolean a(Object[] paramArrayOfObject)
  {
    Class[] arrayOfClass = this.e.getParameterTypes();
    if (paramArrayOfObject.length != arrayOfClass.length) {}
    int i;
    Class localClass;
    do
    {
      return false;
      i = 0;
      if (i >= paramArrayOfObject.length) {
        break label129;
      }
      localClass = a(arrayOfClass[i]);
      if (paramArrayOfObject[i] != null) {
        break;
      }
    } while ((localClass == Byte.TYPE) || (localClass == Short.TYPE) || (localClass == Integer.TYPE) || (localClass == Long.TYPE) || (localClass == Float.TYPE) || (localClass == Double.TYPE) || (localClass == Boolean.TYPE) || (localClass == Character.TYPE));
    while (localClass.isAssignableFrom(a(paramArrayOfObject[i].getClass())))
    {
      i += 1;
      break;
    }
    return false;
    label129:
    return true;
  }
  
  public Object[] a()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "[Caller " + this.a + "(" + this.b + ")" + "]";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */