package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkSessionController$1
  implements m<JSONObject, ParseObject.State>
{
  NetworkSessionController$1(NetworkSessionController paramNetworkSessionController) {}
  
  public ParseObject.State then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    return ((ParseObject.State.Builder)((ParseObject.State.Builder)NetworkSessionController.access$000(this.this$0).decode(new ParseObject.State.Builder("_Session"), paramo, ParseDecoder.get())).isComplete(true)).build();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkSessionController$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */