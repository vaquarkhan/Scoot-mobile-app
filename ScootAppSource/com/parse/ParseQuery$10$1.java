package com.parse;

import a.ac;
import a.m;
import a.o;

class ParseQuery$10$1
  implements m<ParseUser, o<TResult>>
{
  ParseQuery$10$1(ParseQuery.10 param10) {}
  
  public o<TResult> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    ParseQuery.State localState1 = new ParseQuery.State.Builder(this.this$1.val$state).setCachePolicy(ParseQuery.CachePolicy.CACHE_ONLY).build();
    ParseQuery.State localState2 = new ParseQuery.State.Builder(this.this$1.val$state).setCachePolicy(ParseQuery.CachePolicy.NETWORK_ONLY).build();
    return ParseTaskUtils.callbackOnMainThreadAsync((o)this.this$1.val$delegate.call(localState1, paramo, ParseQuery.access$2000(this.this$1.this$0).a()), this.this$1.val$callback).b(new ParseQuery.10.1.1(this, localState2, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$10$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */