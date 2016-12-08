package com.parse;

import a.m;
import a.o;
import java.util.Iterator;
import java.util.List;

final class ParseObject$49
  implements m<Void, o<Void>>
{
  ParseObject$49(String paramString, List paramList) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if ("_currentUser".equals(this.val$name)) {}
    Object localObject;
    do
    {
      do
      {
        Iterator localIterator;
        while (!localIterator.hasNext())
        {
          return paramo;
          localIterator = this.val$objects.iterator();
        }
        localObject = (ParseObject)localIterator.next();
      } while (!(localObject instanceof ParseUser));
      localObject = (ParseUser)localObject;
    } while (!((ParseUser)localObject).isCurrentUser());
    return ParseUser.pinCurrentUserIfNeededAsync((ParseUser)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$49.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */