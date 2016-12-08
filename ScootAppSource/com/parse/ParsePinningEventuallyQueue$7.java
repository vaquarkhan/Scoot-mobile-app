package com.parse;

import a.m;
import a.o;
import java.util.Iterator;
import java.util.List;

class ParsePinningEventuallyQueue$7
  implements m<List<EventuallyPin>, o<Void>>
{
  ParsePinningEventuallyQueue$7(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue) {}
  
  public o<Void> then(o<List<EventuallyPin>> paramo)
  {
    Iterator localIterator = ((List)paramo.f()).iterator();
    while (localIterator.hasNext())
    {
      EventuallyPin localEventuallyPin = (EventuallyPin)localIterator.next();
      ParsePinningEventuallyQueue.access$500(this.this$0, localEventuallyPin);
    }
    return paramo.k();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */