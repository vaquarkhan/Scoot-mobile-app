package com.parse;

import a.o;

class OfflineQueryLogic$9
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$9(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, OfflineQueryLogic.ConstraintMatcher paramConstraintMatcher)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return this.val$selectMatcher.matchesAsync(paramT, paramParseSQLiteDatabase).c(new OfflineQueryLogic.9.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */