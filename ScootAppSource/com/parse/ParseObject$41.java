package com.parse;

import a.l;
import a.m;
import a.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class ParseObject$41
  implements m<Void, o<Void>>
{
  ParseObject$41(l paraml, AtomicBoolean paramAtomicBoolean1, AtomicBoolean paramAtomicBoolean2, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    paramo = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = ((Set)this.val$remaining.a()).iterator();
    while (localIterator.hasNext())
    {
      ParseObject localParseObject = (ParseObject)localIterator.next();
      if (ParseObject.access$1500(localParseObject)) {
        paramo.add(localParseObject);
      } else {
        localHashSet.add(localParseObject);
      }
    }
    this.val$remaining.a(localHashSet);
    if ((paramo.size() == 0) && (this.val$filesComplete.get()) && (this.val$usersComplete.get())) {
      throw new RuntimeException("Unable to save a ParseObject with a relation to a cycle.");
    }
    if (paramo.size() == 0) {
      return o.a(null);
    }
    return ParseObject.enqueueForAll(paramo, new ParseObject.41.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */