package com.parse;

import a.m;
import a.o;
import com.parse.http.ParseHttpRequest;

class ParseRequest$3
  implements m<Void, o<Response>>
{
  ParseRequest$3(ParseRequest paramParseRequest, ParseHttpClient paramParseHttpClient, ParseHttpRequest paramParseHttpRequest, ProgressCallback paramProgressCallback) {}
  
  public o<Response> then(o<Void> paramo)
  {
    paramo = this.val$client.execute(this.val$request);
    return this.this$0.onResponseAsync(paramo, this.val$downloadProgressCallback);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */