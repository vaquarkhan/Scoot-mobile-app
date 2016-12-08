package com.parse;

import a.o;

class OfflineQueryLogic$15
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$15(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, boolean paramBoolean, OfflineQueryLogic.ConstraintMatcher paramConstraintMatcher)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if ((!this.val$ignoreACLs) && (!OfflineQueryLogic.hasReadAccess(this.user, paramT))) {
      return o.a(Boolean.valueOf(false));
    }
    return this.val$constraintMatcher.matchesAsync(paramT, paramParseSQLiteDatabase);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */