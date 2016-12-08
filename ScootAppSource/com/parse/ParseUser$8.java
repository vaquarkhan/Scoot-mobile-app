package com.parse;

import a.m;
import a.o;

class ParseUser$8
  implements m<Void, o<Void>>
{
  ParseUser$8(ParseUser paramParseUser, ParseOperationSet paramParseOperationSet, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    return ParseUser.getUserController().signUpAsync(this.this$0.getState(), this.val$operations, this.val$sessionToken).b(new ParseUser.8.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */