package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$1$1$1
  implements m<Void, Void>
{
  CachedCurrentUserController$1$1$1(CachedCurrentUserController.1.1 param1) {}
  
  public Void then(o<Void> paramo)
  {
    for (;;)
    {
      synchronized (CachedCurrentUserController.access$000(this.this$2.this$1.this$0))
      {
        CachedCurrentUserController localCachedCurrentUserController = this.this$2.this$1.this$0;
        if (!paramo.e())
        {
          bool = true;
          localCachedCurrentUserController.currentUserMatchesDisk = bool;
          this.this$2.this$1.this$0.currentUser = this.this$2.this$1.val$user;
          return null;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$1$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */