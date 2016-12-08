package com.parse;

import a.m;
import a.o;

class ParseObject$10$1
  implements m<Void, String>
{
  ParseObject$10$1(ParseObject.10 param10, ParseACL paramParseACL, ParseUser paramParseUser) {}
  
  public String then(o<Void> paramo)
  {
    if (this.val$acl.hasUnresolvedUser()) {
      throw new IllegalStateException("ACL has an unresolved ParseUser. Save or sign up before attempting to serialize the ACL.");
    }
    return this.val$user.getSessionToken();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$10$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */