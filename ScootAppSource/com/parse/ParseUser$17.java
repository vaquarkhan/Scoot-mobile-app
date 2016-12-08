package com.parse;

import a.m;
import a.o;

final class ParseUser$17
  implements m<ParseUser, o<Void>>
{
  public o<Void> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    if (paramo == null) {
      return o.a(null);
    }
    return paramo.upgradeToRevocableSessionAsync();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$17.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */