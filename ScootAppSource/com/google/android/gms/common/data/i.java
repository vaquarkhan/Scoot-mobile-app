package com.google.android.gms.common.data;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i<T>
  implements Iterator<T>
{
  protected final b<T> a;
  protected int b;
  
  public i(b<T> paramb)
  {
    this.a = ((b)com.google.android.gms.common.internal.b.a(paramb));
    this.b = -1;
  }
  
  public boolean hasNext()
  {
    return this.b < this.a.c() - 1;
  }
  
  public T next()
  {
    if (!hasNext())
    {
      i = this.b;
      throw new NoSuchElementException(46 + "Cannot advance the iterator beyond " + i);
    }
    b localb = this.a;
    int i = this.b + 1;
    this.b = i;
    return (T)localb.a(i);
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */