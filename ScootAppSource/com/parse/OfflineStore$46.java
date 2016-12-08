package com.parse;

import a.m;
import a.o;

class OfflineStore$46
  implements m<ParsePin, o<Integer>>
{
  OfflineStore$46(OfflineStore paramOfflineStore, ParseQuery.State paramState, ParseUser paramParseUser, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Integer> then(o<ParsePin> paramo)
  {
    paramo = (ParsePin)paramo.f();
    return OfflineStore.access$2300(this.this$0, this.val$state, this.val$user, paramo, true, this.val$db).c(new OfflineStore.46.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$46.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */