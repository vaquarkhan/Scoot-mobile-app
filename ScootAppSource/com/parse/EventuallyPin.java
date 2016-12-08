package com.parse;

import a.o;
import com.parse.http.ParseHttpRequest.Method;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

@ParseClassName("_EventuallyPin")
class EventuallyPin
  extends ParseObject
{
  public static final String PIN_NAME = "_eventuallyPin";
  public static final int TYPE_COMMAND = 3;
  public static final int TYPE_DELETE = 2;
  public static final int TYPE_SAVE = 1;
  
  public EventuallyPin()
  {
    super("_EventuallyPin");
  }
  
  public static o<List<EventuallyPin>> findAllPinned()
  {
    return findAllPinned(null);
  }
  
  public static o<List<EventuallyPin>> findAllPinned(Collection<String> paramCollection)
  {
    ParseQuery localParseQuery = new ParseQuery(EventuallyPin.class).fromPin("_eventuallyPin").ignoreACLs().orderByAscending("time");
    if (paramCollection != null) {
      localParseQuery.whereNotContainedIn("uuid", paramCollection);
    }
    return localParseQuery.findInBackground().b(new EventuallyPin.2());
  }
  
  private static o<EventuallyPin> pinEventuallyCommand(int paramInt, ParseObject paramParseObject, String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    EventuallyPin localEventuallyPin = new EventuallyPin();
    localEventuallyPin.put("uuid", UUID.randomUUID().toString());
    localEventuallyPin.put("time", new Date());
    localEventuallyPin.put("type", Integer.valueOf(paramInt));
    if (paramParseObject != null) {
      localEventuallyPin.put("object", paramParseObject);
    }
    if (paramString1 != null) {
      localEventuallyPin.put("operationSetUUID", paramString1);
    }
    if (paramString2 != null) {
      localEventuallyPin.put("sessionToken", paramString2);
    }
    if (paramJSONObject != null) {
      localEventuallyPin.put("command", paramJSONObject);
    }
    return localEventuallyPin.pinInBackground("_eventuallyPin").a(new EventuallyPin.1(localEventuallyPin));
  }
  
  public static o<EventuallyPin> pinEventuallyCommand(ParseObject paramParseObject, ParseRESTCommand paramParseRESTCommand)
  {
    int i = 3;
    Object localObject2 = null;
    Object localObject1;
    if (paramParseRESTCommand.httpPath.startsWith("classes")) {
      if ((paramParseRESTCommand.method == ParseHttpRequest.Method.POST) || (paramParseRESTCommand.method == ParseHttpRequest.Method.PUT))
      {
        i = 1;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      return pinEventuallyCommand(i, paramParseObject, paramParseRESTCommand.getOperationSetUUID(), paramParseRESTCommand.getSessionToken(), (JSONObject)localObject1);
      localObject1 = localObject2;
      if (paramParseRESTCommand.method == ParseHttpRequest.Method.DELETE)
      {
        i = 2;
        localObject1 = localObject2;
        continue;
        localObject1 = paramParseRESTCommand.toJSONObject();
      }
    }
  }
  
  public ParseRESTCommand getCommand()
  {
    JSONObject localJSONObject = getJSONObject("command");
    ParseRESTCommand localParseRESTCommand = null;
    if (ParseRESTCommand.isValidCommandJSONObject(localJSONObject)) {
      localParseRESTCommand = ParseRESTCommand.fromJSONObject(localJSONObject);
    }
    while (ParseRESTCommand.isValidOldFormatCommandJSONObject(localJSONObject)) {
      return localParseRESTCommand;
    }
    throw new JSONException("Failed to load command from JSON.");
  }
  
  public ParseObject getObject()
  {
    return getParseObject("object");
  }
  
  public String getOperationSetUUID()
  {
    return getString("operationSetUUID");
  }
  
  public String getSessionToken()
  {
    return getString("sessionToken");
  }
  
  public int getType()
  {
    return getInt("type");
  }
  
  public String getUUID()
  {
    return getString("uuid");
  }
  
  boolean needsDefaultACL()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\EventuallyPin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */