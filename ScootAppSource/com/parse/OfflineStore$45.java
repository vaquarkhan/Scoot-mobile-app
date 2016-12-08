package com.parse;

import a.o;

class OfflineStore$45
  implements OfflineStore.SQLiteDatabaseCallable<o<Integer>>
{
  OfflineStore$45(OfflineStore paramOfflineStore, String paramString, ParseQuery.State paramState, ParseUser paramParseUser) {}
  
  public o<Integer> call(ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return OfflineStore.access$2400(this.this$0, this.val$name, this.val$state, this.val$user, paramParseSQLiteDatabase);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$45.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */