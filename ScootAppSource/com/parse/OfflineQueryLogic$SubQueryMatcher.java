package com.parse;

import a.o;
import java.util.List;

abstract class OfflineQueryLogic$SubQueryMatcher<T extends ParseObject>
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  private final ParseQuery.State<T> subQuery;
  private o<List<T>> subQueryResults = null;
  
  public OfflineQueryLogic$SubQueryMatcher(ParseUser paramParseUser, ParseQuery.State<T> paramState)
  {
    super(paramParseUser, paramState);
    ParseQuery.State localState;
    this.subQuery = localState;
  }
  
  protected abstract boolean matches(T paramT, List<T> paramList);
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if (this.subQueryResults == null) {
      this.subQueryResults = OfflineQueryLogic.access$100(this.this$0).findAsync(this.subQuery, this.user, null, paramParseSQLiteDatabase);
    }
    return this.subQueryResults.c(new OfflineQueryLogic.SubQueryMatcher.1(this, paramT));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$SubQueryMatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */