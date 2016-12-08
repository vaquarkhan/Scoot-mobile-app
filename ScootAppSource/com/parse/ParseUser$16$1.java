package com.parse;

import a.m;
import a.o;

class ParseUser$16$1
  implements m<ParseUser.State, o<Void>>
{
  ParseUser$16$1(ParseUser.16 param16) {}
  
  public o<Void> then(o<ParseUser.State> paramo)
  {
    paramo = (ParseUser.State)paramo.f();
    if ((Parse.isLocalDatastoreEnabled()) && (!paramo.isNew())) {}
    for (paramo = o.a(paramo);; paramo = this.this$1.this$0.handleSaveResultAsync(paramo, this.this$1.val$operations).c(new ParseUser.16.1.1(this, paramo))) {
      return paramo.d(new ParseUser.16.1.2(this));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$16$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */