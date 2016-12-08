package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class ParsePinningEventuallyQueue$13$1
  implements m<JSONObject, o<JSONObject>>
{
  ParsePinningEventuallyQueue$13$1(ParsePinningEventuallyQueue.13 param13, int paramInt, ParseObject paramParseObject) {}
  
  public o<JSONObject> then(o<JSONObject> paramo)
  {
    Exception localException = paramo.g();
    if ((localException != null) && ((localException instanceof ParseException)) && (((ParseException)localException).getCode() == 100))
    {
      this.this$1.this$0.setConnected(false);
      this.this$1.this$0.notifyTestHelper(7);
      return ParsePinningEventuallyQueue.access$1400(this.this$1.this$0, this.this$1.val$eventuallyPin, this.this$1.val$operationSet);
    }
    return this.this$1.val$eventuallyPin.unpinInBackground("_eventuallyPin").b(new ParsePinningEventuallyQueue.13.1.2(this, paramo)).b(new ParsePinningEventuallyQueue.13.1.1(this, paramo));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$13$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */