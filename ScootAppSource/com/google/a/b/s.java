package com.google.a.b;

import com.google.a.a.d;
import com.google.a.a.e;
import com.google.a.am;
import com.google.a.an;
import com.google.a.b;
import com.google.a.c;
import com.google.a.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class s
  implements an, Cloneable
{
  public static final s a = new s();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private boolean e;
  private List<b> f = Collections.emptyList();
  private List<b> g = Collections.emptyList();
  
  private boolean a(d paramd)
  {
    return (paramd == null) || (paramd.a() <= this.b);
  }
  
  private boolean a(d paramd, e parame)
  {
    return (a(paramd)) && (a(parame));
  }
  
  private boolean a(e parame)
  {
    return (parame == null) || (parame.a() > this.b);
  }
  
  private boolean a(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }
  
  private boolean b(Class<?> paramClass)
  {
    return (paramClass.isMemberClass()) && (!c(paramClass));
  }
  
  private boolean c(Class<?> paramClass)
  {
    return (paramClass.getModifiers() & 0x8) != 0;
  }
  
  public <T> am<T> a(k paramk, com.google.a.c.a<T> parama)
  {
    Class localClass = parama.a();
    boolean bool1 = a(localClass, true);
    boolean bool2 = a(localClass, false);
    if ((!bool1) && (!bool2)) {
      return null;
    }
    return new t(this, bool2, bool1, paramk, parama);
  }
  
  protected s a()
  {
    try
    {
      s locals = (s)super.clone();
      return locals;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    if ((this.b != -1.0D) && (!a((d)paramClass.getAnnotation(d.class), (e)paramClass.getAnnotation(e.class)))) {
      return true;
    }
    if ((!this.d) && (b(paramClass))) {
      return true;
    }
    if (a(paramClass)) {
      return true;
    }
    if (paramBoolean) {}
    for (Object localObject = this.f;; localObject = this.g)
    {
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((b)((Iterator)localObject).next()).a(paramClass));
      return true;
    }
    return false;
  }
  
  public boolean a(Field paramField, boolean paramBoolean)
  {
    if ((this.c & paramField.getModifiers()) != 0) {
      return true;
    }
    if ((this.b != -1.0D) && (!a((d)paramField.getAnnotation(d.class), (e)paramField.getAnnotation(e.class)))) {
      return true;
    }
    if (paramField.isSynthetic()) {
      return true;
    }
    if (this.e)
    {
      localObject = (com.google.a.a.a)paramField.getAnnotation(com.google.a.a.a.class);
      if (localObject != null)
      {
        if (!paramBoolean) {
          break label97;
        }
        if (((com.google.a.a.a)localObject).a()) {
          break label106;
        }
      }
      label97:
      while (!((com.google.a.a.a)localObject).b()) {
        return true;
      }
    }
    label106:
    if ((!this.d) && (b(paramField.getType()))) {
      return true;
    }
    if (a(paramField.getType())) {
      return true;
    }
    if (paramBoolean) {}
    for (Object localObject = this.f; !((List)localObject).isEmpty(); localObject = this.g)
    {
      paramField = new c(paramField);
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((b)((Iterator)localObject).next()).a(paramField));
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */