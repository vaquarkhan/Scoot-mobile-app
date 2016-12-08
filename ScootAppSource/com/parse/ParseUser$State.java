package com.parse;

import java.util.HashMap;
import java.util.Map;

class ParseUser$State
  extends ParseObject.State
{
  private final boolean isNew;
  
  private ParseUser$State(ParseUser.State.Builder paramBuilder)
  {
    super(paramBuilder);
    this.isNew = ParseUser.State.Builder.access$100(paramBuilder);
  }
  
  public Map<String, Map<String, String>> authData()
  {
    Map localMap = (Map)get("authData");
    Object localObject = localMap;
    if (localMap == null) {
      localObject = new HashMap();
    }
    return (Map<String, Map<String, String>>)localObject;
  }
  
  public boolean isNew()
  {
    return this.isNew;
  }
  
  public ParseUser.State.Builder newBuilder()
  {
    return new ParseUser.State.Builder(this);
  }
  
  public String sessionToken()
  {
    return (String)get("sessionToken");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */