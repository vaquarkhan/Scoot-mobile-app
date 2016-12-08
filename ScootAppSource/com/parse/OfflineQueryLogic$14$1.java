package com.parse;

import a.m;
import a.o;

class OfflineQueryLogic$14$1
  implements m<Boolean, o<Boolean>>
{
  OfflineQueryLogic$14$1(OfflineQueryLogic.14 param14, OfflineQueryLogic.ConstraintMatcher paramConstraintMatcher, ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Boolean> then(o<Boolean> paramo)
  {
    if (!((Boolean)paramo.f()).booleanValue()) {
      return paramo;
    }
    return this.val$matcher.matchesAsync(this.val$object, this.val$db);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$14$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */