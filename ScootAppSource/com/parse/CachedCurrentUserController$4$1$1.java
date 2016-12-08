package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$4$1$1
  implements m<ParseUser, o<Void>>
{
  CachedCurrentUserController$4$1$1(CachedCurrentUserController.4.1 param1) {}
  
  public o<Void> then(o<ParseUser> paramo)
  {
    ParseUser localParseUser = (ParseUser)paramo.f();
    if (localParseUser == null) {
      return paramo.j();
    }
    return localParseUser.logOutAsync();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$4$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */