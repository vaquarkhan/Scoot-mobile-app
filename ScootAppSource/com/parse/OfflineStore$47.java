package com.parse;

import a.m;
import a.o;

class OfflineStore$47
  implements m<ParseSQLiteDatabase, o<T>>
{
  OfflineStore$47(OfflineStore paramOfflineStore, OfflineStore.SQLiteDatabaseCallable paramSQLiteDatabaseCallable) {}
  
  public o<T> then(o<ParseSQLiteDatabase> paramo)
  {
    paramo = (ParseSQLiteDatabase)paramo.f();
    return ((o)this.val$callable.call(paramo)).b(new OfflineStore.47.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$47.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */