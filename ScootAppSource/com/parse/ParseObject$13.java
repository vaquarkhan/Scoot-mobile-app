package com.parse;

import a.m;
import a.o;

class ParseObject$13
  implements m<Void, o<ParseObject.State>>
{
  ParseObject$13(ParseObject paramParseObject, ParseOperationSet paramParseOperationSet, String paramString) {}
  
  public o<ParseObject.State> then(o<Void> paramo)
  {
    paramo = new KnownParseObjectDecoder(ParseObject.access$700(this.this$0));
    return ParseObject.access$800().saveAsync(this.this$0.getState(), this.val$operations, this.val$sessionToken, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */