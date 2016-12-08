package com.parse;

import a.o;

class OfflineQueryLogic$13
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$13(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, String paramString, Object paramObject)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    try
    {
      paramT = OfflineQueryLogic.access$200(paramT, this.val$key);
      return o.a(Boolean.valueOf(OfflineQueryLogic.access$400(this.val$queryConstraintValue, paramT)));
    }
    catch (ParseException paramT) {}
    return o.a(paramT);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */