package com.parse;

import a.l;
import a.m;
import a.o;

class OfflineStore$35
  implements m<Void, o<Void>>
{
  OfflineStore$35(OfflineStore paramOfflineStore, l paraml, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    paramo = (String)this.val$uuid.a();
    return this.val$db.deleteAsync("Dependencies", "uuid=?", new String[] { paramo });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$35.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */