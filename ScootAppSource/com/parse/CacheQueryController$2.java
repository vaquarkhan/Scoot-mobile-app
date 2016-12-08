package com.parse;

import a.o;

class CacheQueryController$2
  implements CacheQueryController.CommandDelegate<Integer>
{
  CacheQueryController$2(CacheQueryController paramCacheQueryController, ParseQuery.State paramState, String paramString, o paramo) {}
  
  public o<Integer> runFromCacheAsync()
  {
    return CacheQueryController.access$200(this.this$0, this.val$state, this.val$sessionToken);
  }
  
  public o<Integer> runOnNetworkAsync(boolean paramBoolean)
  {
    return CacheQueryController.access$000(this.this$0).countAsync(this.val$state, this.val$sessionToken, paramBoolean, this.val$cancellationToken);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */