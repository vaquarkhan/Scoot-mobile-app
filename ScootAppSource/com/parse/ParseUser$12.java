package com.parse;

import a.m;
import a.o;
import java.util.Map;

final class ParseUser$12
  implements m<ParseUser, o<ParseUser>>
{
  ParseUser$12(String paramString, Map paramMap, m paramm) {}
  
  public o<ParseUser> then(o<ParseUser> arg1)
  {
    Object localObject1 = (ParseUser)???.f();
    if (localObject1 != null) {
      synchronized (((ParseUser)localObject1).mutex)
      {
        if (ParseAnonymousUtils.isLinked((ParseUser)localObject1))
        {
          if (((ParseUser)localObject1).isLazy())
          {
            Map localMap = ParseUser.access$400((ParseUser)localObject1, "anonymous");
            localObject1 = ((ParseUser)localObject1).taskQueue.enqueue(new ParseUser.12.1(this, (ParseUser)localObject1, localMap));
            return (o<ParseUser>)localObject1;
          }
          localObject1 = ((ParseUser)localObject1).linkWithInBackground(this.val$authType, this.val$authData).b(new ParseUser.12.2(this, (ParseUser)localObject1));
          return (o<ParseUser>)localObject1;
        }
      }
    }
    return o.a(null).b(this.val$logInWithTask);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */