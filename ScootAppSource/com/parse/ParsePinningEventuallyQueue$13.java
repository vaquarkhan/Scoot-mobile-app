package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class ParsePinningEventuallyQueue$13
  implements m<Void, o<JSONObject>>
{
  ParsePinningEventuallyQueue$13(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue, EventuallyPin paramEventuallyPin, ParseOperationSet paramParseOperationSet) {}
  
  public o<JSONObject> then(o<Void> paramo)
  {
    int i = this.val$eventuallyPin.getType();
    ParseObject localParseObject = this.val$eventuallyPin.getObject();
    paramo = this.val$eventuallyPin.getSessionToken();
    if (i == 1) {
      paramo = localParseObject.saveAsync(ParsePinningEventuallyQueue.access$1300(this.this$0), this.val$operationSet, paramo);
    }
    for (;;)
    {
      return paramo.b(new ParsePinningEventuallyQueue.13.1(this, i, localParseObject));
      if (i == 2)
      {
        paramo = localParseObject.deleteAsync(paramo).j();
      }
      else
      {
        paramo = this.val$eventuallyPin.getCommand();
        if (paramo == null)
        {
          paramo = o.a(null);
          this.this$0.notifyTestHelper(8);
        }
        else
        {
          paramo = paramo.executeAsync(ParsePinningEventuallyQueue.access$1300(this.this$0));
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */