package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkUserController$2
  implements m<JSONObject, ParseUser.State>
{
  NetworkUserController$2(NetworkUserController paramNetworkUserController) {}
  
  public ParseUser.State then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    return ((ParseUser.State.Builder)((ParseUser.State.Builder)NetworkUserController.access$000(this.this$0).decode(new ParseUser.State.Builder(), paramo, ParseDecoder.get())).isComplete(true)).build();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkUserController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */