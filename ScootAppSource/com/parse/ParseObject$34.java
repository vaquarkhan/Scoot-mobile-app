package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ParseObject$34
  implements m<Void, o<Void>>
{
  ParseObject$34(List paramList, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    int j = this.val$uniqueObjects.size();
    paramo = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      localObject = (ParseObject)this.val$uniqueObjects.get(i);
      ((ParseObject)localObject).validateDelete();
      paramo.add(((ParseObject)localObject).getState());
      i += 1;
    }
    paramo = ParseObject.access$800().deleteAllAsync(paramo, this.val$sessionToken);
    Object localObject = new ArrayList(j);
    i = 0;
    while (i < j)
    {
      ((List)localObject).add(((o)paramo.get(i)).d(new ParseObject.34.1(this, (ParseObject)this.val$uniqueObjects.get(i))));
      i += 1;
    }
    return o.a((Collection)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$34.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */