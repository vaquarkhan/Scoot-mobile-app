package com.parse;

import a.m;
import a.o;
import java.util.Collections;
import java.util.List;

class ParsePushChannelsController$2
  implements m<ParseInstallation, o<Void>>
{
  ParsePushChannelsController$2(ParsePushChannelsController paramParsePushChannelsController, String paramString) {}
  
  public o<Void> then(o<ParseInstallation> paramo)
  {
    paramo = (ParseInstallation)paramo.f();
    List localList = paramo.getList("channels");
    if ((localList != null) && (localList.contains(this.val$channel)))
    {
      paramo.removeAll("channels", Collections.singletonList(this.val$channel));
      return paramo.saveInBackground();
    }
    return o.a(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePushChannelsController$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */