package com.parse;

import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import com.parse.http.ParseNetworkInterceptor;
import com.parse.http.ParseNetworkInterceptor.Chain;
import java.util.List;

class ParseHttpClient$ParseNetworkInterceptorChain
  implements ParseNetworkInterceptor.Chain
{
  private final int externalIndex;
  private final int internalIndex;
  private final ParseHttpRequest request;
  
  ParseHttpClient$ParseNetworkInterceptorChain(ParseHttpClient paramParseHttpClient, int paramInt1, int paramInt2, ParseHttpRequest paramParseHttpRequest)
  {
    this.internalIndex = paramInt1;
    this.externalIndex = paramInt2;
    this.request = paramParseHttpRequest;
  }
  
  public ParseHttpRequest getRequest()
  {
    return this.request;
  }
  
  public ParseHttpResponse proceed(ParseHttpRequest paramParseHttpRequest)
  {
    if ((ParseHttpClient.access$000(this.this$0) != null) && (this.internalIndex < ParseHttpClient.access$000(this.this$0).size()))
    {
      paramParseHttpRequest = new ParseNetworkInterceptorChain(this.this$0, this.internalIndex + 1, this.externalIndex, paramParseHttpRequest);
      return ((ParseNetworkInterceptor)ParseHttpClient.access$000(this.this$0).get(this.internalIndex)).intercept(paramParseHttpRequest);
    }
    if ((ParseHttpClient.access$100(this.this$0) != null) && (this.externalIndex < ParseHttpClient.access$100(this.this$0).size()))
    {
      paramParseHttpRequest = new ParseNetworkInterceptorChain(this.this$0, this.internalIndex, this.externalIndex + 1, paramParseHttpRequest);
      return ((ParseNetworkInterceptor)ParseHttpClient.access$100(this.this$0).get(this.externalIndex)).intercept(paramParseHttpRequest);
    }
    return this.this$0.executeInternal(paramParseHttpRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseHttpClient$ParseNetworkInterceptorChain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */