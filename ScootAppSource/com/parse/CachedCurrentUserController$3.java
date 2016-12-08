package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$3
  implements m<ParseUser, String>
{
  CachedCurrentUserController$3(CachedCurrentUserController paramCachedCurrentUserController) {}
  
  public String then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    if (paramo != null) {
      return paramo.getSessionToken();
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */