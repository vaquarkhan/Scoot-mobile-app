package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.d;
import com.google.a.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class y<T>
  extends am<T>
{
  private final k a;
  private final am<T> b;
  private final Type c;
  
  y(k paramk, am<T> paramam, Type paramType)
  {
    this.a = paramk;
    this.b = paramam;
    this.c = paramType;
  }
  
  private Type a(Type paramType, Object paramObject)
  {
    Object localObject = paramType;
    if (paramObject != null) {
      if ((paramType != Object.class) && (!(paramType instanceof TypeVariable)))
      {
        localObject = paramType;
        if (!(paramType instanceof Class)) {}
      }
      else
      {
        localObject = paramObject.getClass();
      }
    }
    return (Type)localObject;
  }
  
  public void a(d paramd, T paramT)
  {
    am localam = this.b;
    Type localType = a(this.c, paramT);
    if (localType != this.c)
    {
      localam = this.a.a(com.google.a.c.a.a(localType));
      if ((localam instanceof s)) {
        break label52;
      }
    }
    for (;;)
    {
      localam.a(paramd, paramT);
      return;
      label52:
      if (!(this.b instanceof s)) {
        localam = this.b;
      }
    }
  }
  
  public T b(com.google.a.d.a parama)
  {
    return (T)this.b.b(parama);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */