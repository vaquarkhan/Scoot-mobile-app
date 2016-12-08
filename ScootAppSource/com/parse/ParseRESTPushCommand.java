package com.parse;

import com.parse.http.ParseHttpRequest.Method;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ParseRESTPushCommand
  extends ParseRESTCommand
{
  static final String KEY_CHANNELS = "channels";
  static final String KEY_DATA = "data";
  static final String KEY_DEVICE_TYPE = "deviceType";
  static final String KEY_EXPIRATION_INTERVAL = "expiration_interval";
  static final String KEY_EXPIRATION_TIME = "expiration_time";
  static final String KEY_WHERE = "where";
  
  public ParseRESTPushCommand(String paramString1, ParseHttpRequest.Method paramMethod, JSONObject paramJSONObject, String paramString2)
  {
    super(paramString1, paramMethod, paramJSONObject, paramString2);
  }
  
  public static ParseRESTPushCommand sendPushCommand(ParseQuery.State<ParseInstallation> paramState, Set<String> paramSet, String paramString1, Long paramLong1, Long paramLong2, JSONObject paramJSONObject, String paramString2)
  {
    JSONObject localJSONObject = new JSONObject();
    if (paramSet != null) {}
    for (;;)
    {
      try
      {
        localJSONObject.put("channels", new JSONArray(paramSet));
        if (paramLong1 == null) {
          break label152;
        }
        localJSONObject.put("expiration_time", paramLong1);
        if (paramJSONObject != null) {
          localJSONObject.put("data", paramJSONObject);
        }
        return new ParseRESTPushCommand("push", ParseHttpRequest.Method.POST, localJSONObject, paramString2);
      }
      catch (JSONException paramState)
      {
        throw new RuntimeException(paramState);
      }
      paramSet = null;
      if (paramState != null)
      {
        paramState = paramState.constraints();
        paramSet = (JSONObject)PointerEncoder.get().encode(paramState);
      }
      if (paramString1 != null)
      {
        paramSet = new JSONObject();
        paramSet.put("deviceType", paramString1);
      }
      paramState = paramSet;
      if (paramSet == null) {
        paramState = new JSONObject();
      }
      localJSONObject.put("where", paramState);
      continue;
      label152:
      if (paramLong2 != null) {
        localJSONObject.put("expiration_interval", paramLong2);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTPushCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */