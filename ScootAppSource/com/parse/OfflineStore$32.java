package com.parse;

import a.l;
import a.m;
import a.o;
import android.database.Cursor;

class OfflineStore$32
  implements m<String, o<Cursor>>
{
  OfflineStore$32(OfflineStore paramOfflineStore, l paraml, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Cursor> then(o<String> paramo)
  {
    paramo = (String)this.val$uuid.a();
    return this.val$db.queryAsync("Dependencies", new String[] { "key" }, "uuid=?", new String[] { paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */