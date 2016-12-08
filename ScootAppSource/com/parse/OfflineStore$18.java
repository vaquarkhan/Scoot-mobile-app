package com.parse;

import a.m;
import a.o;

class OfflineStore$18
  implements m<String, o<Void>>
{
  OfflineStore$18(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    if (paramo == null) {
      return null;
    }
    return OfflineStore.access$1000(this.this$0, paramo, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */