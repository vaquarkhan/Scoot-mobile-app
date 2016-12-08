package com.parse;

import a.ac;
import a.m;
import a.o;

class ParseQuery$10$1$1
  implements m<TResult, o<TResult>>
{
  ParseQuery$10$1$1(ParseQuery.10.1 param1, ParseQuery.State paramState, ParseUser paramParseUser) {}
  
  public o<TResult> then(o<TResult> paramo)
  {
    if (paramo.d()) {
      return paramo;
    }
    return (o)this.this$2.this$1.val$delegate.call(this.val$networkState, this.val$user, ParseQuery.access$2000(this.this$2.this$1.this$0).a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$10$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */