package com.parse;

import a.o;
import java.util.List;

class ParseQuery$2
  implements ParseQuery.CacheThenNetworkCallable<T, o<List<T>>>
{
  ParseQuery$2(ParseQuery paramParseQuery) {}
  
  public o<List<T>> call(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    return this.this$0.findAsync(paramState, paramParseUser, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */