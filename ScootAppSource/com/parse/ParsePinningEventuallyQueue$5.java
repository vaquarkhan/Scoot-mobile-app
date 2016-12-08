package com.parse;

import a.ac;
import a.m;
import a.o;

class ParsePinningEventuallyQueue$5
  implements m<Void, o<Void>>
{
  ParsePinningEventuallyQueue$5(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue, ParseObject paramParseObject, ParseRESTCommand paramParseRESTCommand, ac paramac) {}
  
  public o<Void> then(o<Void> paramo)
  {
    return EventuallyPin.pinEventuallyCommand(this.val$object, this.val$command).b(new ParsePinningEventuallyQueue.5.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */