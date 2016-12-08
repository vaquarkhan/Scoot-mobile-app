package com.parse;

import a.m;
import a.o;

class ParseUser$12$2
  implements m<Void, o<ParseUser>>
{
  ParseUser$12$2(ParseUser.12 param12, ParseUser paramParseUser) {}
  
  public o<ParseUser> then(o<Void> paramo)
  {
    if (paramo.e())
    {
      Exception localException = paramo.g();
      if (((localException instanceof ParseException)) && (((ParseException)localException).getCode() == 208)) {
        return o.a(null).b(this.this$0.val$logInWithTask);
      }
    }
    if (paramo.d()) {
      return o.i();
    }
    return o.a(this.val$user);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$12$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */