package com.parse;

import a.m;
import a.o;

class ParseObject$30
  implements m<Void, o<Void>>
{
  ParseObject$30(ParseObject paramParseObject, String paramString) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if (ParseObject.access$900(this.this$0).objectId() == null) {
      return paramo.j();
    }
    return this.this$0.deleteAsync(this.val$sessionToken);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */