package com.parse;

import a.m;
import a.o;
import java.util.WeakHashMap;

class OfflineStore$33
  implements m<Void, o<Void>>
{
  OfflineStore$33(OfflineStore paramOfflineStore, ParseObject paramParseObject) {}
  
  public o<Void> then(o<Void> paramo)
  {
    synchronized (OfflineStore.access$300(this.this$0))
    {
      OfflineStore.access$1600(this.this$0).remove(this.val$object);
      return paramo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$33.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */