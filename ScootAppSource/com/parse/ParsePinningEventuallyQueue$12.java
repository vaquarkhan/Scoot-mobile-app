package com.parse;

import a.ac;
import a.m;
import a.o;
import java.util.HashMap;
import org.json.JSONObject;

class ParsePinningEventuallyQueue$12
  implements m<JSONObject, o<JSONObject>>
{
  ParsePinningEventuallyQueue$12(ParsePinningEventuallyQueue paramParsePinningEventuallyQueue, String paramString, ac paramac) {}
  
  public o<JSONObject> then(o<JSONObject> paramo)
  {
    for (;;)
    {
      synchronized (ParsePinningEventuallyQueue.access$900(this.this$0))
      {
        ParsePinningEventuallyQueue.access$1000(this.this$0).remove(this.val$uuid);
        ParsePinningEventuallyQueue.access$1100(this.this$0).remove(this.val$uuid);
        ParsePinningEventuallyQueue.access$1200(this.this$0).remove(this.val$uuid);
        ??? = paramo.g();
        if (??? != null)
        {
          this.val$tcs.a((Exception)???);
          return this.val$tcs.a();
        }
      }
      if (paramo.d()) {
        this.val$tcs.b();
      } else {
        this.val$tcs.a(paramo.f());
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePinningEventuallyQueue$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */