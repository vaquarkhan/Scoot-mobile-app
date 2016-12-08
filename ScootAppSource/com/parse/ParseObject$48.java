package com.parse;

import a.m;
import a.o;

final class ParseObject$48
  implements m<Void, o<Void>>
{
  ParseObject$48(ParseObject paramParseObject) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if (!this.val$object.isDataAvailable("ACL")) {
      return o.a(null);
    }
    paramo = ParseObject.access$600(this.val$object, false);
    if (paramo == null) {
      return o.a(null);
    }
    paramo = paramo.getUnresolvedUser();
    if ((paramo == null) || (!paramo.isCurrentUser())) {
      return o.a(null);
    }
    return ParseUser.pinCurrentUserIfNeededAsync(paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$48.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */