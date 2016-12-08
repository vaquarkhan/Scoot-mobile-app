package com.twitter.sdk.android.core.a;

import com.google.a.am;
import java.util.Collections;
import java.util.Map;

final class e
  extends am<T>
{
  e(d paramd, am paramam, com.google.a.c.a parama) {}
  
  public void a(com.google.a.d.d paramd, T paramT)
  {
    this.a.a(paramd, paramT);
  }
  
  public T b(com.google.a.d.a parama)
  {
    Object localObject = this.a.b(parama);
    parama = (com.google.a.d.a)localObject;
    if (Map.class.isAssignableFrom(this.b.a()))
    {
      if (localObject == null) {
        parama = Collections.EMPTY_MAP;
      }
    }
    else {
      return parama;
    }
    return Collections.unmodifiableMap((Map)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */