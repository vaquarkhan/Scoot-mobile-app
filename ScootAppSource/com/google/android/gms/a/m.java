package com.google.android.gms.a;

import java.lang.reflect.Field;

public final class m<T>
  extends k
{
  private final T a;
  
  private m(T paramT)
  {
    this.a = paramT;
  }
  
  public static <T> j a(T paramT)
  {
    return new m(paramT);
  }
  
  public static <T> T a(j paramj)
  {
    if ((paramj instanceof m)) {
      return (T)((m)paramj).a;
    }
    paramj = paramj.asBinder();
    Object localObject = paramj.getClass().getDeclaredFields();
    if (localObject.length == 1)
    {
      localObject = localObject[0];
      if (!((Field)localObject).isAccessible())
      {
        ((Field)localObject).setAccessible(true);
        try
        {
          paramj = ((Field)localObject).get(paramj);
          return paramj;
        }
        catch (NullPointerException paramj)
        {
          throw new IllegalArgumentException("Binder object is null.", paramj);
        }
        catch (IllegalArgumentException paramj)
        {
          throw new IllegalArgumentException("remoteBinder is the wrong class.", paramj);
        }
        catch (IllegalAccessException paramj)
        {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", paramj);
        }
      }
      throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */