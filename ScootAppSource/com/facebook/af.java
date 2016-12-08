package com.facebook;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class af
  implements Runnable
{
  af(ArrayList paramArrayList, ap paramap) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      ((ai)localPair.first).a((as)localPair.second);
    }
    localIterator = this.b.e().iterator();
    while (localIterator.hasNext()) {
      ((aq)localIterator.next()).a(this.b);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */