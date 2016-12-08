package com.parse;

import a.ac;
import a.m;
import a.o;

class ParseRequest$4$1$1
  implements m<Response, o<Void>>
{
  ParseRequest$4$1$1(ParseRequest.4.1 param1) {}
  
  public o<Void> then(o<Response> paramo)
  {
    if (paramo.d()) {
      this.this$2.val$retryTask.c();
    }
    for (;;)
    {
      return null;
      if (paramo.e()) {
        this.this$2.val$retryTask.b(paramo.g());
      } else {
        this.this$2.val$retryTask.b(paramo.f());
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$4$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */