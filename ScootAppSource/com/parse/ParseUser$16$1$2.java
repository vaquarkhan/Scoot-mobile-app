package com.parse;

import a.m;
import a.o;

class ParseUser$16$1$2
  implements m<ParseUser.State, o<Void>>
{
  ParseUser$16$1$2(ParseUser.16.1 param1) {}
  
  public o<Void> then(o<ParseUser.State> paramo)
  {
    ParseUser.State localState = (ParseUser.State)paramo.f();
    if (!localState.isNew()) {
      return ParseUser.access$200((ParseUser)ParseObject.from(localState));
    }
    return paramo.k();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$16$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */