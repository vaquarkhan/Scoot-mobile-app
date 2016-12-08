package com.parse;

import a.m;
import a.o;
import java.util.List;

class OfflineStore$40
  implements m<ParsePin, o<Void>>
{
  OfflineStore$40(OfflineStore paramOfflineStore, List paramList, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<ParsePin> paramo)
  {
    paramo = (ParsePin)paramo.f();
    List localList = paramo.getObjects();
    if (localList == null) {
      return o.a(null);
    }
    localList.removeAll(this.val$objects);
    if (localList.size() == 0) {
      return OfflineStore.access$2000(this.this$0, paramo, this.val$db);
    }
    paramo.setObjects(localList);
    return OfflineStore.access$1500(this.this$0, paramo, true, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */