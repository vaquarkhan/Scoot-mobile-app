package com.parse;

import a.m;
import a.o;
import android.database.Cursor;

class OfflineStore$24
  implements m<Void, o<Cursor>>
{
  OfflineStore$24(OfflineStore paramOfflineStore, String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Cursor> then(o<Void> paramo)
  {
    paramo = this.val$key;
    return this.val$db.rawQueryAsync("SELECT uuid FROM Dependencies WHERE key=? AND uuid IN ( SELECT uuid FROM Dependencies GROUP BY uuid HAVING COUNT(uuid)=1)", new String[] { paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$24.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */