package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ParsePinningEventuallyQueue$14$1$1
  implements m<List<EventuallyPin>, o<Void>>
{
  ParsePinningEventuallyQueue$14$1$1(ParsePinningEventuallyQueue.14.1 param1) {}
  
  public o<Void> then(o<List<EventuallyPin>> paramo)
  {
    Object localObject = (List)paramo.f();
    paramo = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramo.add(((EventuallyPin)((Iterator)localObject).next()).unpinInBackground("_eventuallyPin"));
    }
    return o.a(paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$14$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */