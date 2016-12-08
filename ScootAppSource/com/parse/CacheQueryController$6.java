package com.parse;

import a.m;
import a.o;

class CacheQueryController$6
  implements m<TResult, o<TResult>>
{
  CacheQueryController$6(CacheQueryController paramCacheQueryController, CacheQueryController.CommandDelegate paramCommandDelegate) {}
  
  public o<TResult> then(o<TResult> paramo)
  {
    Exception localException = paramo.g();
    Object localObject = paramo;
    if ((localException instanceof ParseException))
    {
      localObject = paramo;
      if (((ParseException)localException).getCode() == 100) {
        localObject = this.val$c.runFromCacheAsync();
      }
    }
    return (o<TResult>)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CacheQueryController$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */