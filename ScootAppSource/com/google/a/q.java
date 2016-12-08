package com.google.a;

import com.google.a.d.a;
import com.google.a.d.d;

final class q<T>
  extends am<T>
{
  private am<T> a;
  
  public void a(am<T> paramam)
  {
    if (this.a != null) {
      throw new AssertionError();
    }
    this.a = paramam;
  }
  
  public void a(d paramd, T paramT)
  {
    if (this.a == null) {
      throw new IllegalStateException();
    }
    this.a.a(paramd, paramT);
  }
  
  public T b(a parama)
  {
    if (this.a == null) {
      throw new IllegalStateException();
    }
    return (T)this.a.b(parama);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */