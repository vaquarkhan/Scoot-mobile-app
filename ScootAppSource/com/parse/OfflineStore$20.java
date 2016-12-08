package com.parse;

import a.m;
import a.o;

class OfflineStore$20
  implements m<String, o<Void>>
{
  OfflineStore$20(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    if (paramo == null) {
      return o.a(null);
    }
    return OfflineStore.access$1000(this.this$0, paramo, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */