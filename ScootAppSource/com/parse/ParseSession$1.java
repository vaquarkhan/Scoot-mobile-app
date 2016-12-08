package com.parse;

import a.m;
import a.o;

final class ParseSession$1
  implements m<String, o<ParseSession>>
{
  public o<ParseSession> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    if (paramo == null) {
      return o.a(null);
    }
    return ParseSession.access$000().getSessionAsync(paramo).c(new ParseSession.1.1(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseSession$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */