package com.google.a.c;

import com.google.a.b.b;
import java.lang.reflect.Type;

public final class a<T>
{
  final Class<? super T> a;
  final Type b;
  final int c;
  
  protected a()
  {
    this.b = a(getClass());
    this.a = b.e(this.b);
    this.c = this.b.hashCode();
  }
  
  a(Type paramType)
  {
    this.b = b.d((Type)com.google.a.b.a.a(paramType));
    this.a = b.e(this.b);
    this.c = this.b.hashCode();
  }
  
  public static a<?> a(Type paramType)
  {
    return new a(paramType);
  }
  
  static Type a(Class<?> paramClass)
  {
    paramClass = paramClass.getGenericSuperclass();
    if ((paramClass instanceof Class)) {
      throw new RuntimeException("Missing type parameter.");
    }
    return b.d(((java.lang.reflect.ParameterizedType)paramClass).getActualTypeArguments()[0]);
  }
  
  public static <T> a<T> b(Class<T> paramClass)
  {
    return new a(paramClass);
  }
  
  public final Class<? super T> a()
  {
    return this.a;
  }
  
  public final Type b()
  {
    return this.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof a)) && (b.a(this.b, ((a)paramObject).b));
  }
  
  public final int hashCode()
  {
    return this.c;
  }
  
  public final String toString()
  {
    return b.f(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */