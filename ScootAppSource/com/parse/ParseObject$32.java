package com.parse;

import a.m;
import a.o;

class ParseObject$32
  implements m<String, o<Void>>
{
  ParseObject$32(ParseObject paramParseObject) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return this.this$0.taskQueue.enqueue(new ParseObject.32.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */