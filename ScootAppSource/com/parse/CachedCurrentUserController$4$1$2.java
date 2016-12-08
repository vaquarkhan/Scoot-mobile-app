package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$4$1$2
  implements m<Void, Void>
{
  CachedCurrentUserController$4$1$2(CachedCurrentUserController.4.1 param1) {}
  
  public Void then(o<Void> arg1)
  {
    if (!???.e()) {}
    for (boolean bool = true;; bool = false) {
      synchronized (CachedCurrentUserController.access$000(this.this$2.this$1.this$0))
      {
        this.this$2.this$1.this$0.currentUserMatchesDisk = bool;
        this.this$2.this$1.this$0.currentUser = null;
        return null;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$4$1$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */