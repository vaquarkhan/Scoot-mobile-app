package com.parse;

import a.m;
import a.o;

class ParseUser$8$1
  implements m<ParseUser.State, o<Void>>
{
  ParseUser$8$1(ParseUser.8 param8) {}
  
  public o<Void> then(o<ParseUser.State> paramo)
  {
    ParseUser.State localState = (ParseUser.State)paramo.f();
    return this.this$1.this$0.handleSaveResultAsync(localState, this.this$1.val$operations).b(new ParseUser.8.1.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$8$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */