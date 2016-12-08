package com.parse;

import a.m;
import a.o;
import java.util.Iterator;
import java.util.List;

final class ParseObject$44
  implements m<ParseUser, o<String>>
{
  ParseObject$44(List paramList) {}
  
  public o<String> then(o<ParseUser> paramo)
  {
    paramo = (ParseUser)paramo.f();
    if (paramo == null) {
      return o.a(null);
    }
    if (!paramo.isLazy()) {
      return o.a(paramo.getSessionToken());
    }
    paramo = this.val$objects.iterator();
    while (paramo.hasNext())
    {
      Object localObject = (ParseObject)paramo.next();
      if (((ParseObject)localObject).isDataAvailable("ACL"))
      {
        localObject = ParseObject.access$600((ParseObject)localObject, false);
        if (localObject != null)
        {
          ParseUser localParseUser = ((ParseACL)localObject).getUnresolvedUser();
          if ((localParseUser != null) && (localParseUser.isCurrentUser())) {
            return localParseUser.saveAsync(null).c(new ParseObject.44.1(this, (ParseACL)localObject, localParseUser));
          }
        }
      }
    }
    return o.a(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$44.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */