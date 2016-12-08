package com.parse;

import a.m;
import a.o;

class ParseObject$22
  implements m<Void, o<Void>>
{
  ParseObject$22(ParseObject paramParseObject) {}
  
  public o<Void> then(o<Void> paramo)
  {
    o<Void> localo = paramo;
    if ((paramo.g() instanceof ParseException))
    {
      localo = paramo;
      if (((ParseException)paramo.g()).getCode() == 120) {
        localo = null;
      }
    }
    return localo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */