package com.parse.http;

public abstract interface ParseNetworkInterceptor$Chain
{
  public abstract ParseHttpRequest getRequest();
  
  public abstract ParseHttpResponse proceed(ParseHttpRequest paramParseHttpRequest);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\http\ParseNetworkInterceptor$Chain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */