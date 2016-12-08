package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.List;

final class ParseObject$42
  implements m<Void, o<Void>>
{
  ParseObject$42(List paramList, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    int j = this.val$uniqueObjects.size();
    Object localObject = new ArrayList(j);
    paramo = new ArrayList(j);
    ArrayList localArrayList = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      ParseObject localParseObject = (ParseObject)this.val$uniqueObjects.get(i);
      localParseObject.updateBeforeSave();
      localParseObject.validateSave();
      ((List)localObject).add(localParseObject.getState());
      paramo.add(localParseObject.startSave());
      localArrayList.add(new KnownParseObjectDecoder(ParseObject.access$700(localParseObject)));
      i += 1;
    }
    localObject = ParseObject.access$800().saveAllAsync((List)localObject, paramo, this.val$sessionToken, localArrayList);
    localArrayList = new ArrayList(j);
    i = 0;
    while (i < j)
    {
      localArrayList.add(((o)((List)localObject).get(i)).b(new ParseObject.42.1(this, (ParseObject)this.val$uniqueObjects.get(i), (ParseOperationSet)paramo.get(i))));
      i += 1;
    }
    return o.a(localArrayList);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */