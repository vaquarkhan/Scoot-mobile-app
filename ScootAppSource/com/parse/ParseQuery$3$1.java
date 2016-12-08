package com.parse;

import a.ac;
import a.m;
import a.o;
import java.util.List;

class ParseQuery$3$1
  implements m<ParseUser, o<List<T>>>
{
  ParseQuery$3$1(ParseQuery.3 param3) {}
  
  public o<List<T>> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    return this.this$1.this$0.findAsync(this.this$1.val$state, paramo, ParseQuery.access$2000(this.this$1.this$0).a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$3$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */