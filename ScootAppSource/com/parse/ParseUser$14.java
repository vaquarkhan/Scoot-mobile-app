package com.parse;

import a.m;
import a.o;
import java.util.Map;

class ParseUser$14
  implements m<Void, o<Void>>
{
  ParseUser$14(ParseUser paramParseUser, Map paramMap, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    synchronized (this.this$0.mutex)
    {
      if ((paramo.e()) || (paramo.d()))
      {
        ParseUser.access$300(this.this$0, this.val$oldAnonymousData);
        return paramo;
      }
      paramo = this.this$0.synchronizeAuthDataAsync(this.val$authType);
      return paramo;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */