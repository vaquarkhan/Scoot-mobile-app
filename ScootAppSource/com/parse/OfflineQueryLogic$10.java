package com.parse;

import a.o;

class OfflineQueryLogic$10
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$10(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, String paramString1, String paramString2, Object paramObject, ParseQuery.KeyConstraints paramKeyConstraints)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    try
    {
      paramT = OfflineQueryLogic.access$200(paramT, this.val$key);
      paramT = o.a(Boolean.valueOf(OfflineQueryLogic.access$500(this.val$operator, this.val$constraint, paramT, this.val$allKeyConstraints)));
      return paramT;
    }
    catch (ParseException paramT) {}
    return o.a(paramT);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */