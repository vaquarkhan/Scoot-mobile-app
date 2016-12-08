package com.parse;

import a.ac;
import a.m;
import a.o;
import org.json.JSONObject;

class ParseCommandCache$4
  implements m<JSONObject, o<JSONObject>>
{
  ParseCommandCache$4(ParseCommandCache paramParseCommandCache, ParseRESTCommand paramParseRESTCommand, ac paramac) {}
  
  public o<JSONObject> then(o<JSONObject> paramo)
  {
    String str = this.val$command.getLocalId();
    Object localObject = paramo.g();
    if (localObject != null) {
      if ((!(localObject instanceof ParseException)) || (((ParseException)localObject).getCode() != 100)) {}
    }
    do
    {
      do
      {
        do
        {
          return paramo;
        } while (this.val$tcs == null);
        this.val$tcs.b((Exception)localObject);
        return paramo;
        localObject = (JSONObject)paramo.f();
        if (this.val$tcs != null)
        {
          this.val$tcs.b(localObject);
          return paramo;
        }
      } while (str == null);
      localObject = ((JSONObject)localObject).optString("objectId", null);
    } while (localObject == null);
    ParseCorePlugins.getInstance().getLocalIdManager().setObjectId(str, (String)localObject);
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCommandCache$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */