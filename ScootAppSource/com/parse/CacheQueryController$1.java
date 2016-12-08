package com.parse;

import a.o;
import java.util.List;

class CacheQueryController$1
  implements CacheQueryController.CommandDelegate<List<T>>
{
  CacheQueryController$1(CacheQueryController paramCacheQueryController, ParseQuery.State paramState, String paramString, o paramo) {}
  
  public o<List<T>> runFromCacheAsync()
  {
    return CacheQueryController.access$100(this.this$0, this.val$state, this.val$sessionToken);
  }
  
  public o<List<T>> runOnNetworkAsync(boolean paramBoolean)
  {
    return CacheQueryController.access$000(this.this$0).findAsync(this.val$state, this.val$sessionToken, paramBoolean, this.val$cancellationToken);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */