package com.parse;

import a.m;
import a.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ParseObject$46
  implements m<List<T>, List<T>>
{
  ParseObject$46(List paramList, boolean paramBoolean) {}
  
  public List<T> then(o<List<T>> paramo)
  {
    HashMap localHashMap = new HashMap();
    paramo = ((List)paramo.f()).iterator();
    ParseObject localParseObject1;
    while (paramo.hasNext())
    {
      localParseObject1 = (ParseObject)paramo.next();
      localHashMap.put(localParseObject1.getObjectId(), localParseObject1);
    }
    paramo = this.val$objects.iterator();
    while (paramo.hasNext())
    {
      localParseObject1 = (ParseObject)paramo.next();
      if ((!this.val$onlyIfNeeded) || (!localParseObject1.isDataAvailable()))
      {
        ParseObject localParseObject2 = (ParseObject)localHashMap.get(localParseObject1.getObjectId());
        if (localParseObject2 == null) {
          throw new ParseException(101, "Object id " + localParseObject1.getObjectId() + " does not exist");
        }
        if (!Parse.isLocalDatastoreEnabled()) {
          localParseObject1.mergeFromObject(localParseObject2);
        }
      }
    }
    return this.val$objects;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$46.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */