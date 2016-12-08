package com.google.a.b.a;

import com.google.a.a.c;
import com.google.a.am;
import com.google.a.an;
import com.google.a.b.af;
import com.google.a.b.f;
import com.google.a.c.a;
import com.google.a.j;
import com.google.a.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

public final class q
  implements an
{
  private final f a;
  private final j b;
  private final com.google.a.b.s c;
  
  public q(f paramf, j paramj, com.google.a.b.s params)
  {
    this.a = paramf;
    this.b = paramj;
    this.c = params;
  }
  
  private am<?> a(k paramk, Field paramField, a<?> parama)
  {
    paramField = (com.google.a.a.b)paramField.getAnnotation(com.google.a.a.b.class);
    if (paramField != null)
    {
      paramField = g.a(this.a, paramk, parama, paramField);
      if (paramField != null) {
        return paramField;
      }
    }
    return paramk.a(parama);
  }
  
  private t a(k paramk, Field paramField, String paramString, a<?> parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new r(this, paramString, paramBoolean1, paramBoolean2, paramk, paramField, parama, af.a(parama.a()));
  }
  
  private String a(Field paramField)
  {
    c localc = (c)paramField.getAnnotation(c.class);
    if (localc == null) {
      return this.b.a(paramField);
    }
    return localc.a();
  }
  
  private Map<String, t> a(k paramk, a<?> parama, Class<?> paramClass)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramClass.isInterface()) {
      return localLinkedHashMap;
    }
    Type localType1 = parama.b();
    while (paramClass != Object.class)
    {
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      if (i < j)
      {
        Object localObject = arrayOfField[i];
        boolean bool1 = a((Field)localObject, true);
        boolean bool2 = a((Field)localObject, false);
        if ((!bool1) && (!bool2)) {}
        do
        {
          i += 1;
          break;
          ((Field)localObject).setAccessible(true);
          Type localType2 = com.google.a.b.b.a(parama.b(), paramClass, ((Field)localObject).getGenericType());
          localObject = a(paramk, (Field)localObject, a((Field)localObject), a.a(localType2), bool1, bool2);
          localObject = (t)localLinkedHashMap.put(((t)localObject).g, localObject);
        } while (localObject == null);
        throw new IllegalArgumentException(localType1 + " declares multiple JSON fields named " + ((t)localObject).g);
      }
      parama = a.a(com.google.a.b.b.a(parama.b(), paramClass, paramClass.getGenericSuperclass()));
      paramClass = parama.a();
    }
    return localLinkedHashMap;
  }
  
  public <T> am<T> a(k paramk, a<T> parama)
  {
    Class localClass = parama.a();
    if (!Object.class.isAssignableFrom(localClass)) {
      return null;
    }
    return new s(this.a.a(parama), a(paramk, parama, localClass), null);
  }
  
  public boolean a(Field paramField, boolean paramBoolean)
  {
    return (!this.c.a(paramField.getType(), paramBoolean)) && (!this.c.a(paramField, paramBoolean));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */