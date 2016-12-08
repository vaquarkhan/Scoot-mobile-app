package com.parse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class ParseObject$State
{
  private final String className;
  private final long createdAt;
  private final boolean isComplete;
  private final String objectId;
  private final Map<String, Object> serverData;
  private final long updatedAt;
  
  ParseObject$State(ParseObject.State.Init<?> paramInit)
  {
    this.className = ParseObject.State.Init.access$000(paramInit);
    this.objectId = ParseObject.State.Init.access$100(paramInit);
    this.createdAt = ParseObject.State.Init.access$200(paramInit);
    if (ParseObject.State.Init.access$300(paramInit) > 0L) {}
    for (long l = ParseObject.State.Init.access$300(paramInit);; l = this.createdAt)
    {
      this.updatedAt = l;
      this.serverData = Collections.unmodifiableMap(new HashMap(paramInit.serverData));
      this.isComplete = ParseObject.State.Init.access$400(paramInit);
      return;
    }
  }
  
  public static ParseObject.State.Init<?> newBuilder(String paramString)
  {
    if ("_User".equals(paramString)) {
      return new ParseUser.State.Builder();
    }
    return new ParseObject.State.Builder(paramString);
  }
  
  public String className()
  {
    return this.className;
  }
  
  public long createdAt()
  {
    return this.createdAt;
  }
  
  public Object get(String paramString)
  {
    return this.serverData.get(paramString);
  }
  
  public boolean isComplete()
  {
    return this.isComplete;
  }
  
  public Set<String> keySet()
  {
    return this.serverData.keySet();
  }
  
  public <T extends ParseObject.State.Init<?>> T newBuilder()
  {
    return new ParseObject.State.Builder(this);
  }
  
  public String objectId()
  {
    return this.objectId;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "%s@%s[className=%s, objectId=%s, createdAt=%d, updatedAt=%d, isComplete=%s, serverData=%s]", new Object[] { getClass().getName(), Integer.toHexString(hashCode()), this.className, this.objectId, Long.valueOf(this.createdAt), Long.valueOf(this.updatedAt), Boolean.valueOf(this.isComplete), this.serverData });
  }
  
  public long updatedAt()
  {
    return this.updatedAt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */