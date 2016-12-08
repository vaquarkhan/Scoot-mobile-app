package com.parse;

import a.o;

class ParseConfigController
{
  private ParseCurrentConfigController currentConfigController;
  private final ParseHttpClient restClient;
  
  public ParseConfigController(ParseHttpClient paramParseHttpClient, ParseCurrentConfigController paramParseCurrentConfigController)
  {
    this.restClient = paramParseHttpClient;
    this.currentConfigController = paramParseCurrentConfigController;
  }
  
  public o<ParseConfig> getAsync(String paramString)
  {
    paramString = ParseRESTConfigCommand.fetchConfigCommand(paramString);
    paramString.enableRetrying();
    return paramString.executeAsync(this.restClient).d(new ParseConfigController.1(this));
  }
  
  ParseCurrentConfigController getCurrentConfigController()
  {
    return this.currentConfigController;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseConfigController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */