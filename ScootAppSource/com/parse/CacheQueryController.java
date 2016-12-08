package com.parse;

import a.o;
import java.util.List;

class CacheQueryController
  extends AbstractQueryController
{
  private final NetworkQueryController networkController;
  
  public CacheQueryController(NetworkQueryController paramNetworkQueryController)
  {
    this.networkController = paramNetworkQueryController;
  }
  
  private <T extends ParseObject> o<Integer> countFromCacheAsync(ParseQuery.State<T> paramState, String paramString)
  {
    return o.a(new CacheQueryController.4(this, ParseRESTQueryCommand.countCommand(paramState, paramString).getCacheKey(), paramState), o.a);
  }
  
  private <T extends ParseObject> o<List<T>> findFromCacheAsync(ParseQuery.State<T> paramState, String paramString)
  {
    return o.a(new CacheQueryController.3(this, ParseRESTQueryCommand.findCommand(paramState, paramString).getCacheKey(), paramState), o.a);
  }
  
  private <TResult> o<TResult> runCommandWithPolicyAsync(CacheQueryController.CommandDelegate<TResult> paramCommandDelegate, ParseQuery.CachePolicy paramCachePolicy)
  {
    switch (CacheQueryController.7.$SwitchMap$com$parse$ParseQuery$CachePolicy[paramCachePolicy.ordinal()])
    {
    default: 
      throw new RuntimeException("Unknown cache policy: " + paramCachePolicy);
    case 1: 
    case 2: 
      return paramCommandDelegate.runOnNetworkAsync(true);
    case 3: 
      return paramCommandDelegate.runFromCacheAsync();
    case 4: 
      return paramCommandDelegate.runFromCacheAsync().b(new CacheQueryController.5(this, paramCommandDelegate));
    case 5: 
      return paramCommandDelegate.runOnNetworkAsync(false).b(new CacheQueryController.6(this, paramCommandDelegate));
    }
    throw new RuntimeException("You cannot use the cache policy CACHE_THEN_NETWORK with find()");
  }
  
  public <T extends ParseObject> o<Integer> countAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramParseUser != null) {}
    for (paramParseUser = paramParseUser.getSessionToken();; paramParseUser = null) {
      return runCommandWithPolicyAsync(new CacheQueryController.2(this, paramState, paramParseUser, paramo), paramState.cachePolicy());
    }
  }
  
  public <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramParseUser != null) {}
    for (paramParseUser = paramParseUser.getSessionToken();; paramParseUser = null) {
      return runCommandWithPolicyAsync(new CacheQueryController.1(this, paramState, paramParseUser, paramo), paramState.cachePolicy());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */