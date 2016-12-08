package com.parse;

import a.o;
import java.util.ArrayList;
import java.util.Iterator;

class OfflineQueryLogic$11
  extends OfflineQueryLogic.ConstraintMatcher<T>
{
  OfflineQueryLogic$11(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, ArrayList paramArrayList)
  {
    super(paramOfflineQueryLogic, paramParseUser);
  }
  
  public o<Boolean> matchesAsync(T paramT, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    o localo = o.a(Boolean.valueOf(false));
    Iterator localIterator = this.val$matchers.iterator();
    while (localIterator.hasNext()) {
      localo = localo.d(new OfflineQueryLogic.11.1(this, (OfflineQueryLogic.ConstraintMatcher)localIterator.next(), paramT, paramParseSQLiteDatabase));
    }
    return localo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */