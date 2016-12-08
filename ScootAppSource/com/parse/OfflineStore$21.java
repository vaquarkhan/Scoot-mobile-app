package com.parse;

import a.m;
import a.o;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

class OfflineStore$21
  implements m<Void, Void>
{
  OfflineStore$21(OfflineStore paramOfflineStore, List paramList) {}
  
  public Void then(o<Void> arg1)
  {
    synchronized (OfflineStore.access$300(this.this$0))
    {
      Iterator localIterator = this.val$uuidsToDelete.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ParseObject localParseObject = (ParseObject)OfflineStore.access$400(this.this$0).get(str);
        if (localParseObject != null)
        {
          OfflineStore.access$500(this.this$0).remove(localParseObject);
          OfflineStore.access$400(this.this$0).remove(str);
        }
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */