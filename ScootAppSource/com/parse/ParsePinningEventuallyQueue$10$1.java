package com.parse;

import a.ac;
import a.m;
import a.o;
import java.util.HashMap;
import org.json.JSONObject;

class ParsePinningEventuallyQueue$10$1
  implements m<JSONObject, o<Void>>
{
  ParsePinningEventuallyQueue$10$1(ParsePinningEventuallyQueue.10 param10) {}
  
  public o<Void> then(o<JSONObject> paramo)
  {
    Exception localException = paramo.g();
    ac localac;
    if (localException != null)
    {
      if ((localException instanceof ParsePinningEventuallyQueue.PauseException)) {
        return paramo.k();
      }
      if (6 >= Parse.getLogLevel()) {
        PLog.e("ParsePinningEventuallyQueue", "Failed to run command.", localException);
      }
      this.this$1.this$0.notifyTestHelper(2, localException);
      localac = (ac)ParsePinningEventuallyQueue.access$200(this.this$1.this$0).remove(this.this$1.val$eventuallyPin.getUUID());
      if (localac != null)
      {
        if (localException == null) {
          break label108;
        }
        localac.b(localException);
      }
    }
    for (;;)
    {
      return paramo.k();
      this.this$1.this$0.notifyTestHelper(1);
      break;
      label108:
      localac.b(paramo.f());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$10$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */