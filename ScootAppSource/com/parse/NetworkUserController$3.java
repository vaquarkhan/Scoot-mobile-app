package com.parse;

import a.m;
import a.o;
import org.json.JSONObject;

class NetworkUserController$3
  implements m<JSONObject, ParseUser.State>
{
  NetworkUserController$3(NetworkUserController paramNetworkUserController, ParseRESTUserCommand paramParseRESTUserCommand) {}
  
  public ParseUser.State then(o<JSONObject> paramo)
  {
    boolean bool2 = true;
    paramo = (JSONObject)paramo.f();
    boolean bool1;
    if (this.val$command.getStatusCode() == 201)
    {
      bool1 = true;
      if (bool1) {
        break label73;
      }
    }
    for (;;)
    {
      return ((ParseUser.State.Builder)((ParseUser.State.Builder)NetworkUserController.access$000(this.this$0).decode(new ParseUser.State.Builder(), paramo, ParseDecoder.get())).isComplete(bool2)).isNew(bool1).build();
      bool1 = false;
      break;
      label73:
      bool2 = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkUserController$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */