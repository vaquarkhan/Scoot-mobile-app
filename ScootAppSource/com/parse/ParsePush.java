package com.parse;

import a.o;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

public class ParsePush
{
  static String KEY_DATA_MESSAGE = "alert";
  private static final String TAG = "com.parse.ParsePush";
  final ParsePush.State.Builder builder;
  
  public ParsePush()
  {
    this(new ParsePush.State.Builder());
  }
  
  private ParsePush(ParsePush.State.Builder paramBuilder)
  {
    this.builder = paramBuilder;
  }
  
  public ParsePush(ParsePush paramParsePush)
  {
    this(new ParsePush.State.Builder(paramParsePush.builder.build()));
  }
  
  private static void checkArgument(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
  }
  
  static ParsePushChannelsController getPushChannelsController()
  {
    return ParseCorePlugins.getInstance().getPushChannelsController();
  }
  
  static ParsePushController getPushController()
  {
    return ParseCorePlugins.getInstance().getPushController();
  }
  
  private static ParseObjectSubclassingController getSubclassingController()
  {
    return ParseCorePlugins.getInstance().getSubclassingController();
  }
  
  public static o<Void> sendDataInBackground(JSONObject paramJSONObject, ParseQuery<ParseInstallation> paramParseQuery)
  {
    ParsePush localParsePush = new ParsePush();
    localParsePush.setQuery(paramParseQuery);
    localParsePush.setData(paramJSONObject);
    return localParsePush.sendInBackground();
  }
  
  public static void sendDataInBackground(JSONObject paramJSONObject, ParseQuery<ParseInstallation> paramParseQuery, SendCallback paramSendCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(sendDataInBackground(paramJSONObject, paramParseQuery), paramSendCallback);
  }
  
  public static o<Void> sendMessageInBackground(String paramString, ParseQuery<ParseInstallation> paramParseQuery)
  {
    ParsePush localParsePush = new ParsePush();
    localParsePush.setQuery(paramParseQuery);
    localParsePush.setMessage(paramString);
    return localParsePush.sendInBackground();
  }
  
  public static void sendMessageInBackground(String paramString, ParseQuery<ParseInstallation> paramParseQuery, SendCallback paramSendCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(sendMessageInBackground(paramString, paramParseQuery), paramSendCallback);
  }
  
  public static o<Void> subscribeInBackground(String paramString)
  {
    return getPushChannelsController().subscribeInBackground(paramString);
  }
  
  public static void subscribeInBackground(String paramString, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(subscribeInBackground(paramString), paramSaveCallback);
  }
  
  public static o<Void> unsubscribeInBackground(String paramString)
  {
    return getPushChannelsController().unsubscribeInBackground(paramString);
  }
  
  public static void unsubscribeInBackground(String paramString, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unsubscribeInBackground(paramString), paramSaveCallback);
  }
  
  public void clearExpiration()
  {
    this.builder.expirationTime(null);
    this.builder.expirationTimeInterval(null);
  }
  
  public void send()
  {
    ParseTaskUtils.wait(sendInBackground());
  }
  
  public o<Void> sendInBackground()
  {
    ParsePush.State localState = this.builder.build();
    return ParseUser.getCurrentSessionTokenAsync().d(new ParsePush.1(this, localState));
  }
  
  public void sendInBackground(SendCallback paramSendCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(sendInBackground(), paramSendCallback);
  }
  
  public void setChannel(String paramString)
  {
    this.builder.channelSet(Collections.singletonList(paramString));
  }
  
  public void setChannels(Collection<String> paramCollection)
  {
    this.builder.channelSet(paramCollection);
  }
  
  public void setData(JSONObject paramJSONObject)
  {
    this.builder.data(paramJSONObject);
  }
  
  public void setExpirationTime(long paramLong)
  {
    this.builder.expirationTime(Long.valueOf(paramLong));
  }
  
  public void setExpirationTimeInterval(long paramLong)
  {
    this.builder.expirationTimeInterval(Long.valueOf(paramLong));
  }
  
  public void setMessage(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(KEY_DATA_MESSAGE, paramString);
      setData(localJSONObject);
      return;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        PLog.e("com.parse.ParsePush", "JSONException in setMessage", paramString);
      }
    }
  }
  
  @Deprecated
  public void setPushToAndroid(boolean paramBoolean)
  {
    this.builder.pushToAndroid(Boolean.valueOf(paramBoolean));
  }
  
  @Deprecated
  public void setPushToIOS(boolean paramBoolean)
  {
    this.builder.pushToIOS(Boolean.valueOf(paramBoolean));
  }
  
  public void setQuery(ParseQuery<ParseInstallation> paramParseQuery)
  {
    this.builder.query(paramParseQuery);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePush.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */