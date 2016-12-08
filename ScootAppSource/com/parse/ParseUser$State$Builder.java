package com.parse;

import java.util.HashMap;
import java.util.Map;

class ParseUser$State$Builder
  extends ParseObject.State.Init<Builder>
{
  private boolean isNew;
  
  public ParseUser$State$Builder()
  {
    super("_User");
  }
  
  ParseUser$State$Builder(ParseUser.State paramState)
  {
    super(paramState);
    this.isNew = paramState.isNew();
  }
  
  public Builder apply(ParseObject.State paramState)
  {
    isNew(((ParseUser.State)paramState).isNew());
    return (Builder)super.apply(paramState);
  }
  
  public Builder authData(Map<String, Map<String, String>> paramMap)
  {
    return (Builder)put("authData", paramMap);
  }
  
  public ParseUser.State build()
  {
    return new ParseUser.State(this, null);
  }
  
  public Builder isNew(boolean paramBoolean)
  {
    this.isNew = paramBoolean;
    return this;
  }
  
  public Builder putAuthData(String paramString, Map<String, String> paramMap)
  {
    Map localMap = (Map)this.serverData.get("authData");
    Object localObject = localMap;
    if (localMap == null) {
      localObject = new HashMap();
    }
    ((Map)localObject).put(paramString, paramMap);
    this.serverData.put("authData", localObject);
    return this;
  }
  
  Builder self()
  {
    return this;
  }
  
  public Builder sessionToken(String paramString)
  {
    return (Builder)put("sessionToken", paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$State$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */