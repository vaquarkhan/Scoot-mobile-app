package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkObjectController$2
  implements m<JSONObject, ParseObject.State>
{
  NetworkObjectController$2(NetworkObjectController paramNetworkObjectController, ParseObject.State paramState, ParseDecoder paramParseDecoder) {}
  
  public ParseObject.State then(o<JSONObject> paramo)
  {
    paramo = (JSONObject)paramo.f();
    ParseObject.State.Init localInit = this.val$state.newBuilder().clear();
    return NetworkObjectController.access$000(this.this$0).decode(localInit, paramo, this.val$decoder).isComplete(false).build();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkObjectController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */