package com.parse;

import a.o;
import java.util.List;

class OfflineStore$43
  implements OfflineStore.SQLiteDatabaseCallable<o<List<T>>>
{
  OfflineStore$43(OfflineStore paramOfflineStore, String paramString, ParseQuery.State paramState, ParseUser paramParseUser) {}
  
  public o<List<T>> call(ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return OfflineStore.access$2200(this.this$0, this.val$name, this.val$state, this.val$user, paramParseSQLiteDatabase);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$43.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */