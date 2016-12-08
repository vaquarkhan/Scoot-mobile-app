package com.parse;

import a.o;

class OfflineQueryLogic$12
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$12(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, ParseQuery.RelationConstraint paramRelationConstraint)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return o.a(Boolean.valueOf(this.val$relation.getRelation().hasKnownObject(paramT)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */