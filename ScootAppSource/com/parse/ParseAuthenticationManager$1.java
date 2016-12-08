package com.parse;

import a.m;
import a.o;

class ParseAuthenticationManager$1
  implements m<ParseUser, o<Void>>
{
  ParseAuthenticationManager$1(ParseAuthenticationManager paramParseAuthenticationManager, String paramString) {}
  
  public o<Void> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    if (paramo != null) {
      return paramo.synchronizeAuthDataAsync(this.val$authType);
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAuthenticationManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */