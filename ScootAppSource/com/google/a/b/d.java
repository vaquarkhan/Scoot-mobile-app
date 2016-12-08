package com.google.a.b;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class d
  implements Serializable, ParameterizedType
{
  private final Type a;
  private final Type b;
  private final Type[] c;
  
  public d(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    int i;
    boolean bool;
    if ((paramType2 instanceof Class))
    {
      Class localClass = (Class)paramType2;
      if ((Modifier.isStatic(localClass.getModifiers())) || (localClass.getEnclosingClass() == null))
      {
        i = 1;
        if ((paramType1 == null) && (i == 0)) {
          break label156;
        }
        bool = true;
        label54:
        a.a(bool);
      }
    }
    else
    {
      if (paramType1 != null) {
        break label162;
      }
    }
    label156:
    label162:
    for (paramType1 = null;; paramType1 = b.d(paramType1))
    {
      this.a = paramType1;
      this.b = b.d(paramType2);
      this.c = ((Type[])paramVarArgs.clone());
      i = j;
      while (i < this.c.length)
      {
        a.a(this.c[i]);
        b.h(this.c[i]);
        this.c[i] = b.d(this.c[i]);
        i += 1;
      }
      i = 0;
      break;
      bool = false;
      break label54;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ParameterizedType)) && (b.a(this, (ParameterizedType)paramObject));
  }
  
  public Type[] getActualTypeArguments()
  {
    return (Type[])this.c.clone();
  }
  
  public Type getOwnerType()
  {
    return this.a;
  }
  
  public Type getRawType()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(this.c) ^ this.b.hashCode() ^ b.a(this.a);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder((this.c.length + 1) * 30);
    localStringBuilder.append(b.f(this.b));
    if (this.c.length == 0) {
      return localStringBuilder.toString();
    }
    localStringBuilder.append("<").append(b.f(this.c[0]));
    int i = 1;
    while (i < this.c.length)
    {
      localStringBuilder.append(", ").append(b.f(this.c[i]));
      i += 1;
    }
    return ">";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */