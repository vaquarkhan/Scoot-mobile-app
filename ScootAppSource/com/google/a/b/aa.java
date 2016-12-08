package com.google.a.b;

import java.util.AbstractSet;
import java.util.Iterator;

final class aa
  extends AbstractSet<K>
{
  aa(w paramw) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public Iterator<K> iterator()
  {
    return new ab(this);
  }
  
  public boolean remove(Object paramObject)
  {
    return this.a.b(paramObject) != null;
  }
  
  public int size()
  {
    return this.a.c;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */