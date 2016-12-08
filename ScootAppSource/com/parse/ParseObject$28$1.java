package com.parse;

import a.m;
import a.o;

class ParseObject$28$1
  implements m<Void, o<T>>
{
  ParseObject$28$1(ParseObject.28 param28, String paramString) {}
  
  public o<T> then(o<Void> paramo)
  {
    if (this.this$1.this$0.isDataAvailable()) {
      return o.a(this.this$1.this$0);
    }
    return this.this$1.this$0.fetchAsync(this.val$sessionToken, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$28$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */