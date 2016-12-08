package com.parse;

import a.m;
import a.o;

class CacheQueryController$5
  implements m<TResult, o<TResult>>
{
  CacheQueryController$5(CacheQueryController paramCacheQueryController, CacheQueryController.CommandDelegate paramCommandDelegate) {}
  
  public o<TResult> then(o<TResult> paramo)
  {
    Object localObject = paramo;
    if ((paramo.g() instanceof ParseException)) {
      localObject = this.val$c.runOnNetworkAsync(true);
    }
    return (o<TResult>)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */