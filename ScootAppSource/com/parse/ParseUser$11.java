package com.parse;

import a.m;
import a.o;
import java.util.Map;

final class ParseUser$11
  implements m<Void, o<ParseUser>>
{
  ParseUser$11(String paramString, Map paramMap) {}
  
  public o<ParseUser> then(o<Void> paramo)
  {
    return ParseUser.getUserController().logInAsync(this.val$authType, this.val$authData).d(new ParseUser.11.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */