package com.parse;

import a.m;
import a.o;
import java.io.IOException;

class ParseRequest$2
  implements m<Response, o<Response>>
{
  ParseRequest$2(ParseRequest paramParseRequest) {}
  
  public o<Response> then(o<Response> paramo)
  {
    Object localObject = paramo;
    if (paramo.e())
    {
      Exception localException = paramo.g();
      localObject = paramo;
      if ((localException instanceof IOException)) {
        localObject = o.a(this.this$0.newTemporaryException("i/o failure", localException));
      }
    }
    return (o<Response>)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */