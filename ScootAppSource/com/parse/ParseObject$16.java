package com.parse;

import a.m;
import a.o;

class ParseObject$16
  implements m<Void, o<Void>>
{
  ParseObject$16(ParseObject paramParseObject, boolean paramBoolean) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if (this.val$success) {
      Parse.getEventuallyQueue().notifyTestHelper(5);
    }
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */