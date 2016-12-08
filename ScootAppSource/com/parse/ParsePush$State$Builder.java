package com.parse;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class ParsePush$State$Builder
{
  private Set<String> channelSet;
  private JSONObject data;
  private Long expirationTime;
  private Long expirationTimeInterval;
  private Boolean pushToAndroid;
  private Boolean pushToIOS;
  private ParseQuery<ParseInstallation> query;
  
  public ParsePush$State$Builder() {}
  
  public ParsePush$State$Builder(ParsePush.State paramState)
  {
    Object localObject1;
    if (paramState.channelSet() == null) {
      localObject1 = null;
    }
    for (;;)
    {
      this.channelSet = ((Set)localObject1);
      if (paramState.queryState() == null)
      {
        localObject1 = null;
        this.query = ((ParseQuery)localObject1);
        this.expirationTime = paramState.expirationTime();
        this.expirationTimeInterval = paramState.expirationTimeInterval();
        this.pushToIOS = paramState.pushToIOS();
        this.pushToAndroid = paramState.pushToAndroid();
      }
      try
      {
        paramState = new JSONObject(paramState.data().toString());
        this.data = paramState;
        return;
        localObject1 = Collections.unmodifiableSet(new HashSet(paramState.channelSet()));
        continue;
        localObject1 = new ParseQuery(new ParseQuery.State.Builder(paramState.queryState()));
      }
      catch (JSONException paramState)
      {
        for (;;)
        {
          paramState = (ParsePush.State)localObject2;
        }
      }
    }
  }
  
  public ParsePush.State build()
  {
    if (this.data == null) {
      throw new IllegalArgumentException("Cannot send a push without calling either setMessage or setData");
    }
    return new ParsePush.State(this, null);
  }
  
  public Builder channelSet(Collection<String> paramCollection)
  {
    if (paramCollection != null)
    {
      bool = true;
      ParsePush.access$000(bool, "channels collection cannot be null");
      Iterator localIterator = paramCollection.iterator();
      label19:
      if (!localIterator.hasNext()) {
        break label61;
      }
      if ((String)localIterator.next() == null) {
        break label56;
      }
    }
    label56:
    for (boolean bool = true;; bool = false)
    {
      ParsePush.access$000(bool, "channel cannot be null");
      break label19;
      bool = false;
      break;
    }
    label61:
    this.channelSet = new HashSet(paramCollection);
    this.query = null;
    return this;
  }
  
  public Builder data(JSONObject paramJSONObject)
  {
    this.data = paramJSONObject;
    return this;
  }
  
  public Builder expirationTime(Long paramLong)
  {
    this.expirationTime = paramLong;
    this.expirationTimeInterval = null;
    return this;
  }
  
  public Builder expirationTimeInterval(Long paramLong)
  {
    this.expirationTimeInterval = paramLong;
    this.expirationTime = null;
    return this;
  }
  
  public Builder pushToAndroid(Boolean paramBoolean)
  {
    if (this.query == null) {}
    for (boolean bool = true;; bool = false)
    {
      ParsePush.access$000(bool, "Cannot set push targets (i.e. setPushToAndroid or setPushToIOS) when pushing to a query");
      this.pushToAndroid = paramBoolean;
      return this;
    }
  }
  
  public Builder pushToIOS(Boolean paramBoolean)
  {
    if (this.query == null) {}
    for (boolean bool = true;; bool = false)
    {
      ParsePush.access$000(bool, "Cannot set push targets (i.e. setPushToAndroid or setPushToIOS) when pushing to a query");
      this.pushToIOS = paramBoolean;
      return this;
    }
  }
  
  public Builder query(ParseQuery<ParseInstallation> paramParseQuery)
  {
    boolean bool2 = true;
    if (paramParseQuery != null)
    {
      bool1 = true;
      ParsePush.access$000(bool1, "Cannot target a null query");
      if ((this.pushToIOS != null) || (this.pushToAndroid != null)) {
        break label73;
      }
    }
    label73:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ParsePush.access$000(bool1, "Cannot set push targets (i.e. setPushToAndroid or setPushToIOS) when pushing to a query");
      ParsePush.access$000(paramParseQuery.getClassName().equals(ParsePush.access$100().getClassName(ParseInstallation.class)), "Can only push to a query for Installations");
      this.channelSet = null;
      this.query = paramParseQuery;
      return this;
      bool1 = false;
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePush$State$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */