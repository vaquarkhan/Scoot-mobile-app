package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$5$1
  implements m<Void, o<ParseUser>>
{
  CachedCurrentUserController$5$1(CachedCurrentUserController.5 param5) {}
  
  public o<ParseUser> then(o<Void> arg1)
  {
    boolean bool;
    synchronized (CachedCurrentUserController.access$000(this.this$1.this$0))
    {
      ParseUser localParseUser = this.this$1.this$0.currentUser;
      bool = this.this$1.this$0.currentUserMatchesDisk;
      if (localParseUser != null) {
        return o.a(localParseUser);
      }
    }
    if (bool)
    {
      if (this.this$1.val$shouldAutoCreateUser) {
        return o.a(CachedCurrentUserController.access$200(this.this$1.this$0));
      }
      return null;
    }
    return CachedCurrentUserController.access$100(this.this$1.this$0).getAsync().a(new CachedCurrentUserController.5.1.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$5$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */