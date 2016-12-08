package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$1$2
  implements m<Void, o<Void>>
{
  CachedCurrentUserController$1$2(CachedCurrentUserController.1 param1) {}
  
  public o<Void> then(o<Void> paramo)
  {
    this.this$1.val$user.setIsCurrentUser(true);
    return this.this$1.val$user.synchronizeAllAuthDataAsync();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */