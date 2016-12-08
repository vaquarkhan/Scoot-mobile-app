package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OfflineStore$16
  implements m<String, o<Void>>
{
  OfflineStore$16(OfflineStore paramOfflineStore, List paramList, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.val$objects.iterator();
    while (localIterator.hasNext())
    {
      ParseObject localParseObject = (ParseObject)localIterator.next();
      localArrayList.add(OfflineStore.access$900(this.this$0, paramo, localParseObject, this.val$db));
    }
    return o.a(localArrayList);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */