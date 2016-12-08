package com.parse;

import a.o;
import java.util.Map;

class NetworkUserController
  implements ParseUserController
{
  private static final int STATUS_CODE_CREATED = 201;
  private final ParseHttpClient client;
  private final ParseObjectCoder coder;
  private final boolean revocableSession;
  
  public NetworkUserController(ParseHttpClient paramParseHttpClient)
  {
    this(paramParseHttpClient, false);
  }
  
  public NetworkUserController(ParseHttpClient paramParseHttpClient, boolean paramBoolean)
  {
    this.client = paramParseHttpClient;
    this.coder = ParseObjectCoder.get();
    this.revocableSession = paramBoolean;
  }
  
  public o<ParseUser.State> getUserAsync(String paramString)
  {
    return ParseRESTUserCommand.getCurrentUserCommand(paramString).executeAsync(this.client).c(new NetworkUserController.5(this));
  }
  
  public o<ParseUser.State> logInAsync(ParseUser.State paramState, ParseOperationSet paramParseOperationSet)
  {
    paramState = ParseRESTUserCommand.serviceLogInUserCommand(this.coder.encode(paramState, paramParseOperationSet, PointerEncoder.get()), paramState.sessionToken(), this.revocableSession);
    return paramState.executeAsync(this.client).c(new NetworkUserController.3(this, paramState));
  }
  
  public o<ParseUser.State> logInAsync(String paramString1, String paramString2)
  {
    return ParseRESTUserCommand.logInUserCommand(paramString1, paramString2, this.revocableSession).executeAsync(this.client).c(new NetworkUserController.2(this));
  }
  
  public o<ParseUser.State> logInAsync(String paramString, Map<String, String> paramMap)
  {
    ParseRESTUserCommand localParseRESTUserCommand = ParseRESTUserCommand.serviceLogInUserCommand(paramString, paramMap, this.revocableSession);
    return localParseRESTUserCommand.executeAsync(this.client).c(new NetworkUserController.4(this, localParseRESTUserCommand, paramString, paramMap));
  }
  
  public o<Void> requestPasswordResetAsync(String paramString)
  {
    return ParseRESTUserCommand.resetPasswordResetCommand(paramString).executeAsync(this.client).k();
  }
  
  public o<ParseUser.State> signUpAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet, String paramString)
  {
    return ParseRESTUserCommand.signUpUserCommand(this.coder.encode(paramState, paramParseOperationSet, PointerEncoder.get()), paramString, this.revocableSession).executeAsync(this.client).c(new NetworkUserController.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkUserController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */