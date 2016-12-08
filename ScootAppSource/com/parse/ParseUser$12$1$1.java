package com.parse;

import a.m;
import a.o;

class ParseUser$12$1$1
  implements m<Void, o<ParseUser>>
{
  ParseUser$12$1$1(ParseUser.12.1 param1) {}
  
  public o<ParseUser> then(o<Void> paramo)
  {
    synchronized (this.this$1.val$user.mutex)
    {
      if (paramo.e())
      {
        ParseUser.access$500(this.this$1.val$user, this.this$1.this$0.val$authType);
        ParseUser.access$300(this.this$1.val$user, this.this$1.val$oldAnonymousData);
        paramo = o.a(paramo.g());
        return paramo;
      }
      if (paramo.d())
      {
        paramo = o.i();
        return paramo;
      }
    }
    paramo = o.a(this.this$1.val$user);
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$12$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */