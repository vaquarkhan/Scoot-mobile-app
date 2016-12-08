package com.parse;

import a.m;
import a.o;

class ParseUser$12$1$2
  implements m<Void, o<Void>>
{
  ParseUser$12$1$2(ParseUser.12.1 param1) {}
  
  public o<Void> then(o<Void> paramo)
  {
    synchronized (this.this$1.val$user.mutex)
    {
      ParseUser.access$600(this.this$1.val$user);
      this.this$1.val$user.putAuthData(this.this$1.this$0.val$authType, this.this$1.this$0.val$authData);
      paramo = this.this$1.val$user.resolveLazinessAsync(paramo);
      return paramo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$12$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */