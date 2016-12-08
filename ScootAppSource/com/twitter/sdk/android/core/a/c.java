package com.twitter.sdk.android.core.a;

import com.google.a.am;
import com.google.a.d.d;
import java.util.Collections;
import java.util.List;

final class c
  extends am<T>
{
  c(b paramb, am paramam, com.google.a.c.a parama) {}
  
  public void a(d paramd, T paramT)
  {
    this.a.a(paramd, paramT);
  }
  
  public T b(com.google.a.d.a parama)
  {
    Object localObject = this.a.b(parama);
    parama = (com.google.a.d.a)localObject;
    if (List.class.isAssignableFrom(this.b.a()))
    {
      if (localObject == null) {
        parama = Collections.EMPTY_LIST;
      }
    }
    else {
      return parama;
    }
    return Collections.unmodifiableList((List)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */