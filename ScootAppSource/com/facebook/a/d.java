package com.facebook.a;

import com.facebook.b.as;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class d
  implements Runnable
{
  public void run()
  {
    HashSet localHashSet = new HashSet();
    synchronized (a.b())
    {
      Iterator localIterator = a.c().keySet().iterator();
      if (localIterator.hasNext()) {
        localHashSet.add(((h)localIterator.next()).b());
      }
    }
    ??? = ((Set)localObject2).iterator();
    while (((Iterator)???).hasNext()) {
      as.a((String)((Iterator)???).next(), true);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */