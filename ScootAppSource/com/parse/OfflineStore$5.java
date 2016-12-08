package com.parse;

import a.m;
import a.o;
import java.util.Iterator;
import java.util.List;

class OfflineStore$5
  implements m<Void, o<List<T>>>
{
  OfflineStore$5(OfflineStore paramOfflineStore, List paramList, ParseQuery.State paramState, boolean paramBoolean, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<List<T>> then(o<Void> paramo)
  {
    OfflineQueryLogic.sort(this.val$results, this.val$query);
    Object localObject = this.val$results;
    int i = this.val$query.skip();
    paramo = (o<Void>)localObject;
    if (!this.val$isCount)
    {
      paramo = (o<Void>)localObject;
      if (i >= 0) {
        paramo = ((List)localObject).subList(Math.min(this.val$query.skip(), ((List)localObject).size()), ((List)localObject).size());
      }
    }
    i = this.val$query.limit();
    if ((!this.val$isCount) && (i >= 0) && (paramo.size() > i)) {
      paramo = paramo.subList(0, i);
    }
    for (;;)
    {
      localObject = o.a(null);
      Iterator localIterator = paramo.iterator();
      while (localIterator.hasNext()) {
        localObject = ((o)localObject).d(new OfflineStore.5.1(this, (ParseObject)localIterator.next()));
      }
      return ((o)localObject).c(new OfflineStore.5.2(this, paramo));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */