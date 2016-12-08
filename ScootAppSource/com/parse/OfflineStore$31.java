package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OfflineStore$31
  implements m<Cursor, o<Void>>
{
  OfflineStore$31(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase, ParseObject paramParseObject) {}
  
  public o<Void> then(o<Cursor> paramo)
  {
    paramo = (Cursor)paramo.f();
    Object localObject = new ArrayList();
    paramo.moveToFirst();
    while (!paramo.isAfterLast())
    {
      ((List)localObject).add(paramo.getString(0));
      paramo.moveToNext();
    }
    paramo.close();
    paramo = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      paramo.add(OfflineStore.access$600(this.this$0, str, this.val$db).d(new OfflineStore.31.2(this)).b(new OfflineStore.31.1(this, str)));
    }
    return o.a(paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */