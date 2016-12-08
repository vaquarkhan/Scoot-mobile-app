package com.parse;

import a.ac;
import a.m;
import a.o;

class ParseFile$4
  implements m<String, o<Void>>
{
  ParseFile$4(ParseFile paramParseFile, ProgressCallback paramProgressCallback, ac paramac) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return this.this$0.saveAsync(paramo, this.val$uploadProgressCallback, this.val$cts.a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */