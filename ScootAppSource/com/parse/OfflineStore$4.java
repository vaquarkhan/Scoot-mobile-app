package com.parse;

import a.m;
import a.o;
import android.database.Cursor;

class OfflineStore$4
  implements m<String, o<Cursor>>
{
  OfflineStore$4(OfflineStore paramOfflineStore, ParseQuery.State paramState, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Cursor> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    String str1 = "className=? AND key=?" + " AND isDeletingEventually=0";
    String str2 = this.val$query.className();
    return this.val$db.queryAsync("ParseObjects A  INNER JOIN Dependencies B  ON A.uuid=B.uuid", new String[] { "A.uuid" }, str1, new String[] { str2, paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */