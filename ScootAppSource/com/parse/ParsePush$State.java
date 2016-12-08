package com.parse;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class ParsePush$State
{
  private final Set<String> channelSet;
  private final JSONObject data;
  private final Long expirationTime;
  private final Long expirationTimeInterval;
  private final Boolean pushToAndroid;
  private final Boolean pushToIOS;
  private final ParseQuery.State<ParseInstallation> queryState;
  
  private ParsePush$State(ParsePush.State.Builder paramBuilder)
  {
    Object localObject1;
    if (ParsePush.State.Builder.access$300(paramBuilder) == null) {
      localObject1 = null;
    }
    for (;;)
    {
      this.channelSet = ((Set)localObject1);
      if (ParsePush.State.Builder.access$400(paramBuilder) == null)
      {
        localObject1 = null;
        this.queryState = ((ParseQuery.State)localObject1);
        this.expirationTime = ParsePush.State.Builder.access$500(paramBuilder);
        this.expirationTimeInterval = ParsePush.State.Builder.access$600(paramBuilder);
        this.pushToIOS = ParsePush.State.Builder.access$700(paramBuilder);
        this.pushToAndroid = ParsePush.State.Builder.access$800(paramBuilder);
      }
      try
      {
        paramBuilder = new JSONObject(ParsePush.State.Builder.access$900(paramBuilder).toString());
        this.data = paramBuilder;
        return;
        localObject1 = Collections.unmodifiableSet(new HashSet(ParsePush.State.Builder.access$300(paramBuilder)));
        continue;
        localObject1 = ParsePush.State.Builder.access$400(paramBuilder).getBuilder().build();
      }
      catch (JSONException paramBuilder)
      {
        for (;;)
        {
          paramBuilder = (ParsePush.State.Builder)localObject2;
        }
      }
    }
  }
  
  public Set<String> channelSet()
  {
    return this.channelSet;
  }
  
  public JSONObject data()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(this.data.toString());
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public Long expirationTime()
  {
    return this.expirationTime;
  }
  
  public Long expirationTimeInterval()
  {
    return this.expirationTimeInterval;
  }
  
  public Boolean pushToAndroid()
  {
    return this.pushToAndroid;
  }
  
  public Boolean pushToIOS()
  {
    return this.pushToIOS;
  }
  
  public ParseQuery.State<ParseInstallation> queryState()
  {
    return this.queryState;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePush$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */