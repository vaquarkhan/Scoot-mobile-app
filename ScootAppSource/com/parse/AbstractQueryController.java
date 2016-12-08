package com.parse;

import a.o;

abstract class AbstractQueryController
  implements ParseQueryController
{
  public <T extends ParseObject> o<T> getFirstAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    return findAsync(paramState, paramParseUser, paramo).a(new AbstractQueryController.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\AbstractQueryController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */