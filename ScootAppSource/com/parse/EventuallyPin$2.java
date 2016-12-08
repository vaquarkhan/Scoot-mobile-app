package com.parse;

import a.m;
import a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class EventuallyPin$2
  implements m<List<EventuallyPin>, o<List<EventuallyPin>>>
{
  public o<List<EventuallyPin>> then(o<List<EventuallyPin>> paramo)
  {
    paramo = (List)paramo.f();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramo.iterator();
    while (localIterator.hasNext())
    {
      ParseObject localParseObject = ((EventuallyPin)localIterator.next()).getObject();
      if (localParseObject != null) {
        localArrayList.add(localParseObject.fetchFromLocalDatastoreAsync().k());
      }
    }
    return o.a(localArrayList).b(new EventuallyPin.2.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\EventuallyPin$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */