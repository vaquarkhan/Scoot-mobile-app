package com.parse;

import a.m;
import a.o;

class CachedCurrentUserController$5$1$1
  implements m<ParseUser, ParseUser>
{
  CachedCurrentUserController$5$1$1(CachedCurrentUserController.5.1 param1) {}
  
  public ParseUser then(o<ParseUser> arg1)
  {
    boolean bool = true;
    ParseUser localParseUser = (ParseUser)???.f();
    if (!???.e()) {}
    for (;;)
    {
      synchronized (CachedCurrentUserController.access$000(this.this$2.this$1.this$0))
      {
        this.this$2.this$1.this$0.currentUser = localParseUser;
        this.this$2.this$1.this$0.currentUserMatchesDisk = bool;
        if (localParseUser == null) {
          break;
        }
      }
      synchronized (localParseUser.mutex)
      {
        localParseUser.setIsCurrentUser(true);
        return localParseUser;
        bool = false;
        continue;
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
    }
    if (this.this$2.this$1.val$shouldAutoCreateUser) {
      return CachedCurrentUserController.access$200(this.this$2.this$1.this$0);
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentUserController$5$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */