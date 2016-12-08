package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;

public final class c
{
  public static <T, E extends g<T>> ArrayList<T> a(b<E> paramb)
  {
    ArrayList localArrayList = new ArrayList(paramb.c());
    try
    {
      Iterator localIterator = paramb.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(((g)localIterator.next()).a());
      }
    }
    finally
    {
      paramb.d();
    }
    return localArrayList1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */