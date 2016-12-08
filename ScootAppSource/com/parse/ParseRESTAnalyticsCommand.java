package com.parse;

import android.net.Uri;
import com.parse.http.ParseHttpRequest.Method;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class ParseRESTAnalyticsCommand
  extends ParseRESTCommand
{
  static final String EVENT_APP_OPENED = "AppOpened";
  private static final String KEY_AT = "at";
  private static final String KEY_DIMENSIONS = "dimensions";
  private static final String KEY_PUSH_HASH = "push_hash";
  private static final String PATH = "events/%s";
  
  public ParseRESTAnalyticsCommand(String paramString1, ParseHttpRequest.Method paramMethod, JSONObject paramJSONObject, String paramString2)
  {
    super(paramString1, paramMethod, paramJSONObject, paramString2);
  }
  
  public static ParseRESTAnalyticsCommand trackAppOpenedCommand(String paramString1, String paramString2)
  {
    return trackEventCommand("AppOpened", paramString1, null, paramString2);
  }
  
  static ParseRESTAnalyticsCommand trackEventCommand(String paramString1, String paramString2, Map<String, String> paramMap, String paramString3)
  {
    paramString1 = String.format("events/%s", new Object[] { Uri.encode(paramString1) });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("at", NoObjectsEncoder.get().encode(new Date()));
      if (paramString2 != null) {
        localJSONObject.put("push_hash", paramString2);
      }
      if (paramMap != null) {
        localJSONObject.put("dimensions", NoObjectsEncoder.get().encode(paramMap));
      }
      return new ParseRESTAnalyticsCommand(paramString1, ParseHttpRequest.Method.POST, localJSONObject, paramString3);
    }
    catch (JSONException paramString1)
    {
      throw new RuntimeException(paramString1);
    }
  }
  
  public static ParseRESTAnalyticsCommand trackEventCommand(String paramString1, Map<String, String> paramMap, String paramString2)
  {
    return trackEventCommand(paramString1, null, paramMap, paramString2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRESTAnalyticsCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */