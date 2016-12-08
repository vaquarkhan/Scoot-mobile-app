package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$1$3
  implements m<Void, o<Void>>
{
  CachedCurrentUserController$1$3(CachedCurrentUserController.1 param1) {}
  
  public o<Void> then(o<Void> paramo)
  {
    synchronized (CachedCurrentUserController.access$000(this.this$1.this$0))
    {
      ParseUser localParseUser = this.this$1.this$0.currentUser;
      ??? = paramo;
      if (localParseUser != null)
      {
        ??? = paramo;
        if (localParseUser != this.this$1.val$user) {
          ??? = localParseUser.logOutAsync(false).a(new CachedCurrentUserController.1.3.1(this));
        }
      }
      return (o<Void>)???;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$1$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */