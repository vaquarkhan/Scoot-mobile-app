package com.parse;

import a.m;
import a.o;

class ParseObject$12
  implements m<ParseObject.State, o<Void>>
{
  ParseObject$12(ParseObject paramParseObject, ParseOperationSet paramParseOperationSet) {}
  
  public o<Void> then(o<ParseObject.State> paramo)
  {
    ParseObject.State localState = (ParseObject.State)paramo.f();
    return this.this$0.handleSaveResultAsync(localState, this.val$operations).b(new ParseObject.12.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */