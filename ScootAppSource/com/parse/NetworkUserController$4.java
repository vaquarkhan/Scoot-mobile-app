package com.parse;

import a.m;
import a.o;
import java.util.Map;
import org.json.JSONObject;

class NetworkUserController$4
  implements m<JSONObject, ParseUser.State>
{
  NetworkUserController$4(NetworkUserController paramNetworkUserController, ParseRESTUserCommand paramParseRESTUserCommand, String paramString, Map paramMap) {}
  
  public ParseUser.State then(o<JSONObject> paramo)
  {
    boolean bool = true;
    paramo = (JSONObject)paramo.f();
    paramo = (ParseUser.State.Builder)((ParseUser.State.Builder)NetworkUserController.access$000(this.this$0).decode(new ParseUser.State.Builder(), paramo, ParseDecoder.get())).isComplete(true);
    if (this.val$command.getStatusCode() == 201) {}
    for (;;)
    {
      return paramo.isNew(bool).putAuthData(this.val$authType, this.val$authData).build();
      bool = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkUserController$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */