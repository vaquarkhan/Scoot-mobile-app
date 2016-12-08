package com.parse;

import a.o;

class NetworkSessionController
  implements ParseSessionController
{
  private final ParseHttpClient client;
  private final ParseObjectCoder coder;
  
  public NetworkSessionController(ParseHttpClient paramParseHttpClient)
  {
    this.client = paramParseHttpClient;
    this.coder = ParseObjectCoder.get();
  }
  
  public o<ParseObject.State> getSessionAsync(String paramString)
  {
    return ParseRESTSessionCommand.getCurrentSessionCommand(paramString).executeAsync(this.client).c(new NetworkSessionController.1(this));
  }
  
  public o<Void> revokeAsync(String paramString)
  {
    return ParseRESTSessionCommand.revoke(paramString).executeAsync(this.client).k();
  }
  
  public o<ParseObject.State> upgradeToRevocable(String paramString)
  {
    return ParseRESTSessionCommand.upgradeToRevocableSessionCommand(paramString).executeAsync(this.client).c(new NetworkSessionController.2(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkSessionController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */