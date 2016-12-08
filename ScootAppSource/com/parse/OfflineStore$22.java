package com.parse;

import a.m;
import a.o;

class OfflineStore$22
  implements m<Void, o<Void>>
{
  OfflineStore$22(OfflineStore paramOfflineStore, String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    paramo = this.val$key;
    return this.val$db.deleteAsync("Dependencies", "key=?", new String[] { paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */