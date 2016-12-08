package com.parse;

import a.l;
import a.m;
import a.o;
import android.content.ContentValues;

class OfflineStore$13
  implements m<Void, o<Void>>
{
  OfflineStore$13(OfflineStore paramOfflineStore, String paramString, l paraml, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    paramo = new ContentValues();
    paramo.put("key", this.val$key);
    paramo.put("uuid", (String)this.val$uuidCapture.a());
    return this.val$db.insertWithOnConflict("Dependencies", paramo, 4);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */