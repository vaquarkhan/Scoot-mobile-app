package com.parse;

import a.o;

abstract class OfflineQueryLogic$ConstraintMatcher<T extends ParseObject>
{
  final ParseUser user;
  
  public OfflineQueryLogic$ConstraintMatcher(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser)
  {
    this.user = paramParseUser;
  }
  
  abstract o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$ConstraintMatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */