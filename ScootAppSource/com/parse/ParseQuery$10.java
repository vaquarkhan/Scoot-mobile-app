package com.parse;

import a.o;
import java.util.concurrent.Callable;

class ParseQuery$10
  implements Callable<o<TResult>>
{
  ParseQuery$10(ParseQuery paramParseQuery, ParseQuery.State paramState, ParseQuery.CacheThenNetworkCallable paramCacheThenNetworkCallable, ParseCallback2 paramParseCallback2) {}
  
  public o<TResult> call()
  {
    return this.this$0.getUserAsync(this.val$state).d(new ParseQuery.10.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */