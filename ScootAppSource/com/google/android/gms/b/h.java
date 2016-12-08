package com.google.android.gms.b;

import java.io.IOException;
import java.lang.reflect.Array;

public final class h<M extends g<M>, T>
{
  protected final int a;
  protected final Class<T> b;
  public final int c;
  protected final boolean d;
  
  int a(Object paramObject)
  {
    if (this.d) {
      return b(paramObject);
    }
    return c(paramObject);
  }
  
  void a(Object paramObject, e parame)
  {
    if (this.d)
    {
      c(paramObject, parame);
      return;
    }
    b(paramObject, parame);
  }
  
  protected int b(Object paramObject)
  {
    int j = 0;
    int m = Array.getLength(paramObject);
    int i = 0;
    while (i < m)
    {
      int k = j;
      if (Array.get(paramObject, i) != null) {
        k = j + c(Array.get(paramObject, i));
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  protected void b(Object paramObject, e parame)
  {
    for (;;)
    {
      try
      {
        parame.e(this.c);
        switch (this.a)
        {
        case 10: 
          i = this.a;
          throw new IllegalArgumentException(24 + "Unknown type " + i);
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
      paramObject = (m)paramObject;
      int i = p.b(this.c);
      parame.a((m)paramObject);
      parame.b(i, 4);
      return;
      parame.b((m)paramObject);
      return;
    }
  }
  
  protected int c(Object paramObject)
  {
    int i = p.b(this.c);
    switch (this.a)
    {
    default: 
      i = this.a;
      throw new IllegalArgumentException(24 + "Unknown type " + i);
    case 10: 
      return e.a(i, (m)paramObject);
    }
    return e.b(i, (m)paramObject);
  }
  
  protected void c(Object paramObject, e parame)
  {
    int j = Array.getLength(paramObject);
    int i = 0;
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      if (localObject != null) {
        b(localObject, parame);
      }
      i += 1;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof h)) {
        return false;
      }
      paramObject = (h)paramObject;
    } while ((this.a == ((h)paramObject).a) && (this.b == ((h)paramObject).b) && (this.c == ((h)paramObject).c) && (this.d == ((h)paramObject).d));
    return false;
  }
  
  public int hashCode()
  {
    int j = this.a;
    int k = this.b.hashCode();
    int m = this.c;
    if (this.d) {}
    for (int i = 1;; i = 0) {
      return i + (((j + 1147) * 31 + k) * 31 + m) * 31;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */