package com.google.android.gms.a;

import java.util.Iterator;
import java.util.LinkedList;

final class c
  implements n<T>
{
  c(b paramb) {}
  
  public void a(T paramT)
  {
    b.a(this.a, paramT);
    paramT = b.a(this.a).iterator();
    while (paramT.hasNext()) {
      ((i)paramT.next()).a(b.b(this.a));
    }
    b.a(this.a).clear();
    b.a(this.a, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */