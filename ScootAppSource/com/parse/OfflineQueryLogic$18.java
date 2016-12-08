package com.parse;

import a.m;
import a.o;
import org.json.JSONArray;

final class OfflineQueryLogic$18
  implements m<Void, o<Void>>
{
  OfflineQueryLogic$18(OfflineStore paramOfflineStore, JSONArray paramJSONArray, int paramInt, String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    return OfflineQueryLogic.access$600(this.val$store, this.val$array.get(this.val$index), this.val$path, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */