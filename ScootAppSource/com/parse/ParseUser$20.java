package com.parse;

import a.m;
import a.o;

class ParseUser$20
  implements m<Void, o<String>>
{
  ParseUser$20(ParseUser paramParseUser, String paramString) {}
  
  public o<String> then(o<Void> paramo)
  {
    return ParseSession.upgradeToRevocableSessionAsync(this.val$sessionToken);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */