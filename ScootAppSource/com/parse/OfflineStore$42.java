package com.parse;

import a.m;
import a.o;

class OfflineStore$42
  implements m<ParsePin, o<Void>>
{
  OfflineStore$42(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<ParsePin> paramo)
  {
    if (paramo.e()) {
      return paramo.k();
    }
    paramo = (ParsePin)paramo.f();
    return OfflineStore.access$2000(this.this$0, paramo, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */