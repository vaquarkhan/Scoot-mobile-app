package com.parse;

import a.m;
import a.o;
import java.util.List;

final class ParseObject$47
  implements m<Void, o<List<T>>>
{
  ParseObject$47(ParseQuery paramParseQuery, ParseUser paramParseUser) {}
  
  public o<List<T>> then(o<Void> paramo)
  {
    return this.val$query.findAsync(this.val$query.getBuilder().build(), this.val$user, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$47.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */