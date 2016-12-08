package com.parse;

import a.m;
import a.o;

class OfflineStore$48
  implements m<ParseSQLiteDatabase, o<Void>>
{
  OfflineStore$48(OfflineStore paramOfflineStore, OfflineStore.SQLiteDatabaseCallable paramSQLiteDatabaseCallable) {}
  
  public o<Void> then(o<ParseSQLiteDatabase> paramo)
  {
    paramo = (ParseSQLiteDatabase)paramo.f();
    return paramo.beginTransactionAsync().d(new OfflineStore.48.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$48.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */