package com.parse;

import a.m;
import a.o;

class ParsePinningEventuallyQueue$3
  implements m<Void, o<Integer>>
{
  ParsePinningEventuallyQueue$3(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue) {}
  
  public o<Integer> then(o<Void> paramo)
  {
    return EventuallyPin.findAllPinned().b(new ParsePinningEventuallyQueue.3.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */