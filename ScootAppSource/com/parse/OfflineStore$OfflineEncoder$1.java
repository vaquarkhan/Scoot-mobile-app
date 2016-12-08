package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Iterator;

class OfflineStore$OfflineEncoder$1
  implements m<Void, o<Void>>
{
  OfflineStore$OfflineEncoder$1(OfflineStore.OfflineEncoder paramOfflineEncoder) {}
  
  public o<Void> then(o<Void> arg1)
  {
    synchronized (OfflineStore.OfflineEncoder.access$000(this.this$1))
    {
      Object localObject1 = OfflineStore.OfflineEncoder.access$100(this.this$1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        o localo = (o)((Iterator)localObject1).next();
        if ((localo.e()) || (localo.d())) {
          return localo;
        }
      }
      OfflineStore.OfflineEncoder.access$100(this.this$1).clear();
      localObject1 = o.a((Void)null);
      return (o<Void>)localObject1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$OfflineEncoder$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */