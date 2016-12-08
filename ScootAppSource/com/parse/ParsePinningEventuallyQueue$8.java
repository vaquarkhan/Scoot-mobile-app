package com.parse;

import a.m;
import a.o;
import java.util.List;

class ParsePinningEventuallyQueue$8
  implements m<Void, o<List<EventuallyPin>>>
{
  ParsePinningEventuallyQueue$8(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue) {}
  
  public o<List<EventuallyPin>> then(o<Void> paramo)
  {
    return EventuallyPin.findAllPinned(ParsePinningEventuallyQueue.access$600(this.this$0));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */