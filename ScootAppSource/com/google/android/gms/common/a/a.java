package com.google.android.gms.common.a;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class a<E>
  extends AbstractSet<E>
{
  private final android.support.v4.g.a<E, E> a;
  
  public a()
  {
    this.a = new android.support.v4.g.a();
  }
  
  public a(int paramInt)
  {
    this.a = new android.support.v4.g.a(paramInt);
  }
  
  public boolean a(a<? extends E> parama)
  {
    int i = size();
    this.a.a(parama.a);
    return size() > i;
  }
  
  public boolean add(E paramE)
  {
    if (this.a.containsKey(paramE)) {
      return false;
    }
    this.a.put(paramE, paramE);
    return true;
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof a)) {
      return a((a)paramCollection);
    }
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public Iterator<E> iterator()
  {
    return this.a.keySet().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    if (!this.a.containsKey(paramObject)) {
      return false;
    }
    this.a.remove(paramObject);
    return true;
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */