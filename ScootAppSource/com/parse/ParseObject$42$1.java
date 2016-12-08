package com.parse;

import a.m;
import a.o;

class ParseObject$42$1
  implements m<ParseObject.State, o<Void>>
{
  ParseObject$42$1(ParseObject.42 param42, ParseObject paramParseObject, ParseOperationSet paramParseOperationSet) {}
  
  public o<Void> then(o<ParseObject.State> paramo)
  {
    ParseObject.State localState = (ParseObject.State)paramo.f();
    return this.val$object.handleSaveResultAsync(localState, this.val$operations).b(new ParseObject.42.1.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$42$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */