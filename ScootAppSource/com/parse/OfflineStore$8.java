package com.parse;

import a.l;
import a.m;
import a.o;
import android.database.Cursor;

class OfflineStore$8
  implements m<String, o<Cursor>>
{
  OfflineStore$8(OfflineStore paramOfflineStore, l paraml, ParseSQLiteDatabase paramParseSQLiteDatabase, String[] paramArrayOfString) {}
  
  public o<Cursor> then(o<String> paramo)
  {
    this.val$uuid.a(paramo.f());
    paramo = (String)this.val$uuid.a();
    return this.val$db.queryAsync("ParseObjects", this.val$select, "uuid = ?", new String[] { paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */