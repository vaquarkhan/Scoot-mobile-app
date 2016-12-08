package com.parse;

import a.m;
import a.o;
import java.util.List;

class OfflineStore$44
  implements m<ParsePin, o<List<T>>>
{
  OfflineStore$44(OfflineStore paramOfflineStore, ParseQuery.State paramState, ParseUser paramParseUser, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<List<T>> then(o<ParsePin> paramo)
  {
    paramo = (ParsePin)paramo.f();
    return OfflineStore.access$2300(this.this$0, this.val$state, this.val$user, paramo, false, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$44.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */