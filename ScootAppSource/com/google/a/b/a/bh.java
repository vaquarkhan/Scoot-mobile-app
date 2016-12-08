package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bh<T extends Enum<T>>
  extends am<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();
  
  public bh(Class<T> paramClass)
  {
    for (;;)
    {
      try
      {
        Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
        int j = arrayOfEnum.length;
        int i = 0;
        if (i < j)
        {
          Enum localEnum = arrayOfEnum[i];
          String str = localEnum.name();
          com.google.a.a.c localc = (com.google.a.a.c)paramClass.getField(str).getAnnotation(com.google.a.a.c.class);
          if (localc != null)
          {
            str = localc.a();
            this.a.put(str, localEnum);
            this.b.put(localEnum, str);
            i += 1;
          }
        }
        else
        {
          return;
        }
      }
      catch (NoSuchFieldException paramClass)
      {
        throw new AssertionError();
      }
    }
  }
  
  public T a(a parama)
  {
    if (parama.f() == com.google.a.d.c.i)
    {
      parama.j();
      return null;
    }
    return (Enum)this.a.get(parama.h());
  }
  
  public void a(d paramd, T paramT)
  {
    if (paramT == null) {}
    for (paramT = null;; paramT = (String)this.b.get(paramT))
    {
      paramd.b(paramT);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */