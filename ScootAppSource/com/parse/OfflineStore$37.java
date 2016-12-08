package com.parse;

import a.o;
import java.util.List;

class OfflineStore$37
  implements OfflineStore.SQLiteDatabaseCallable<o<Void>>
{
  OfflineStore$37(OfflineStore paramOfflineStore, String paramString, List paramList, boolean paramBoolean) {}
  
  public o<Void> call(ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return OfflineStore.access$1700(this.this$0, this.val$name, this.val$objects, this.val$includeChildren, paramParseSQLiteDatabase);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$37.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */