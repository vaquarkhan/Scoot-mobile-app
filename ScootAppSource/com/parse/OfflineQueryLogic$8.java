package com.parse;

import java.util.Iterator;
import java.util.List;

class OfflineQueryLogic$8
  extends OfflineQueryLogic.SubQueryMatcher<T>
{
  OfflineQueryLogic$8(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, ParseQuery.State paramState, String paramString1, String paramString2)
  {
    super(paramOfflineQueryLogic, paramParseUser, paramState);
  }
  
  protected boolean matches(T paramT, List<T> paramList)
  {
    paramT = OfflineQueryLogic.access$200(paramT, this.val$key);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (OfflineQueryLogic.access$400(paramT, OfflineQueryLogic.access$200((ParseObject)paramList.next(), this.val$resultKey))) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */