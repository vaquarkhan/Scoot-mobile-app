package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OfflineStore$38
  implements m<ParsePin, o<Void>>
{
  OfflineStore$38(OfflineStore paramOfflineStore, List paramList, boolean paramBoolean, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<ParsePin> paramo)
  {
    ParsePin localParsePin = (ParsePin)paramo.f();
    paramo = localParsePin.getObjects();
    if (paramo == null) {
      paramo = new ArrayList(this.val$objects);
    }
    for (;;)
    {
      localParsePin.setObjects(paramo);
      if (this.val$includeChildren)
      {
        return OfflineStore.access$1500(this.this$0, localParsePin, true, this.val$db);
        Iterator localIterator = this.val$objects.iterator();
        while (localIterator.hasNext())
        {
          ParseObject localParseObject = (ParseObject)localIterator.next();
          if (!paramo.contains(localParseObject)) {
            paramo.add(localParseObject);
          }
        }
      }
      return OfflineStore.access$1800(this.this$0, localParsePin, localParsePin.getObjects(), this.val$db);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$38.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */