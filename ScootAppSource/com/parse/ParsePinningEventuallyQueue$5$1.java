package com.parse;

import a.m;
import a.o;
import java.util.HashMap;

class ParsePinningEventuallyQueue$5$1
  implements m<EventuallyPin, o<Void>>
{
  ParsePinningEventuallyQueue$5$1(ParsePinningEventuallyQueue.5 param5) {}
  
  public o<Void> then(o<EventuallyPin> paramo)
  {
    EventuallyPin localEventuallyPin = (EventuallyPin)paramo.f();
    Exception localException = paramo.g();
    if (localException != null)
    {
      if (5 >= Parse.getLogLevel()) {
        PLog.w("ParsePinningEventuallyQueue", "Unable to save command for later.", localException);
      }
      this.this$1.this$0.notifyTestHelper(4);
      return o.a(null);
    }
    ParsePinningEventuallyQueue.access$200(this.this$1.this$0).put(localEventuallyPin.getUUID(), this.this$1.val$tcs);
    ParsePinningEventuallyQueue.access$300(this.this$1.this$0).b(new ParsePinningEventuallyQueue.5.1.1(this));
    return paramo.k();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$5$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */