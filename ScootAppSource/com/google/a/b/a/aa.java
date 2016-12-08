package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class aa
  extends am<Class>
{
  public Class a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
  }
  
  public void a(d paramd, Class paramClass)
  {
    if (paramClass == null)
    {
      paramd.f();
      return;
    }
    throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + paramClass.getName() + ". Forgot to register a type adapter?");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */