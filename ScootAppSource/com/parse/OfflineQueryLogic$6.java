package com.parse;

import java.util.List;

class OfflineQueryLogic$6
  extends OfflineQueryLogic.SubQueryMatcher<T>
{
  OfflineQueryLogic$6(OfflineQueryLogic paramOfflineQueryLogic, ParseUser paramParseUser, ParseQuery.State paramState, String paramString)
  {
    super(paramOfflineQueryLogic, paramParseUser, paramState);
  }
  
  protected boolean matches(T paramT, List<T> paramList)
  {
    return OfflineQueryLogic.access$300(paramList, OfflineQueryLogic.access$200(paramT, this.val$key));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */