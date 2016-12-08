package com.parse;

import a.o;

class OfflineStore$12
  implements OfflineStore.SQLiteDatabaseCallable<o<T>>
{
  OfflineStore$12(OfflineStore paramOfflineStore, ParseObject paramParseObject) {}
  
  public o<T> call(ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return this.this$0.fetchLocallyAsync(this.val$object, paramParseSQLiteDatabase);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */