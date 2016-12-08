package com.parse;

import a.m;
import a.o;

class OfflineStore$29
  implements m<ParseSQLiteDatabase, o<Void>>
{
  OfflineStore$29(OfflineStore paramOfflineStore, ParseObject paramParseObject) {}
  
  public o<Void> then(o<ParseSQLiteDatabase> paramo)
  {
    paramo = (ParseSQLiteDatabase)paramo.f();
    return paramo.beginTransactionAsync().d(new OfflineStore.29.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$29.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */