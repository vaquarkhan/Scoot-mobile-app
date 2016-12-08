package com.parse;

import a.m;
import a.o;

class ParseObject$10
  implements m<ParseUser, o<String>>
{
  ParseObject$10(ParseObject paramParseObject) {}
  
  public o<String> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    if (paramo == null) {
      return o.a(null);
    }
    if (!paramo.isLazy()) {
      return o.a(paramo.getSessionToken());
    }
    if (!this.this$0.isDataAvailable("ACL")) {
      return o.a(null);
    }
    paramo = ParseObject.access$600(this.this$0, false);
    if (paramo == null) {
      return o.a(null);
    }
    ParseUser localParseUser = paramo.getUnresolvedUser();
    if ((localParseUser == null) || (!localParseUser.isCurrentUser())) {
      return o.a(null);
    }
    return localParseUser.saveAsync(null).c(new ParseObject.10.1(this, paramo, localParseUser));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */