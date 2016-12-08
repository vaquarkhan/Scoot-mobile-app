package com.parse;

import a.m;
import a.o;
import java.util.List;

final class ParseObject$45
  implements m<ParseUser, o<List<T>>>
{
  ParseObject$45(List paramList, boolean paramBoolean) {}
  
  public o<List<T>> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    return ParseObject.enqueueForAll(this.val$objects, new ParseObject.45.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$45.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */