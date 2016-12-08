package com.parse;

import a.l;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import com.parse.http.ParseNetworkInterceptor.Chain;
import com.squareup.okhttp.Interceptor.Chain;

class ParseOkHttpClient$1$1
  implements ParseNetworkInterceptor.Chain
{
  ParseOkHttpClient$1$1(ParseOkHttpClient.1 param1, ParseHttpRequest paramParseHttpRequest, Interceptor.Chain paramChain, l paraml) {}
  
  public ParseHttpRequest getRequest()
  {
    return this.val$parseRequest;
  }
  
  public ParseHttpResponse proceed(ParseHttpRequest paramParseHttpRequest)
  {
    paramParseHttpRequest = this.this$1.this$0.getRequest(paramParseHttpRequest);
    paramParseHttpRequest = this.val$okHttpChain.proceed(paramParseHttpRequest);
    this.val$okHttpResponseCapture.a(paramParseHttpRequest);
    return this.this$1.this$0.getResponse(paramParseHttpRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOkHttpClient$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */