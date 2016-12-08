package com.parse;

import a.m;
import a.o;
import java.util.Map;

class ParseObject$26
  implements m<Void, o<ParseObject.State>>
{
  ParseObject$26(ParseObject paramParseObject, String paramString) {}
  
  public o<ParseObject.State> then(o<Void> arg1)
  {
    synchronized (this.this$0.mutex)
    {
      ParseObject.State localState = this.this$0.getState();
      Map localMap = ParseObject.access$700(this.this$0);
      ??? = new KnownParseObjectDecoder(localMap);
      return ParseObject.access$800().fetchAsync(localState, this.val$sessionToken, ???);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$26.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */