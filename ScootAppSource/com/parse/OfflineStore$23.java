package com.parse;

import a.m;
import a.o;
import android.database.Cursor;
import java.util.List;

class OfflineStore$23
  implements m<Cursor, o<Void>>
{
  OfflineStore$23(OfflineStore paramOfflineStore, List paramList, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Cursor> paramo)
  {
    paramo = (Cursor)paramo.f();
    while (paramo.moveToNext()) {
      this.val$uuidsToDelete.add(paramo.getString(0));
    }
    paramo.close();
    return OfflineStore.access$1100(this.this$0, this.val$uuidsToDelete, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$23.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */