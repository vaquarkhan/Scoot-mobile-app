package com.parse;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class ParseObject$State$Init<T extends Init>
{
  private final String className;
  private long createdAt = -1L;
  private boolean isComplete;
  private String objectId;
  Map<String, Object> serverData = new HashMap();
  private long updatedAt = -1L;
  
  ParseObject$State$Init(ParseObject.State paramState)
  {
    this.className = paramState.className();
    this.objectId = paramState.objectId();
    this.createdAt = paramState.createdAt();
    this.updatedAt = paramState.updatedAt();
    Iterator localIterator = paramState.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.serverData.put(str, paramState.get(str));
    }
    this.isComplete = paramState.isComplete();
  }
  
  public ParseObject$State$Init(String paramString)
  {
    this.className = paramString;
  }
  
  public T apply(ParseObject.State paramState)
  {
    if (paramState.objectId() != null) {
      objectId(paramState.objectId());
    }
    if (paramState.createdAt() > 0L) {
      createdAt(paramState.createdAt());
    }
    if (paramState.updatedAt() > 0L) {
      updatedAt(paramState.updatedAt());
    }
    if ((this.isComplete) || (paramState.isComplete())) {}
    for (boolean bool = true;; bool = false)
    {
      isComplete(bool);
      Iterator localIterator = paramState.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        put(str, paramState.get(str));
      }
    }
    return self();
  }
  
  public T apply(ParseOperationSet paramParseOperationSet)
  {
    Iterator localIterator = paramParseOperationSet.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = ((ParseFieldOperation)paramParseOperationSet.get(str)).apply(this.serverData.get(str), str);
      if (localObject != null) {
        put(str, localObject);
      } else {
        remove(str);
      }
    }
    return self();
  }
  
  abstract <S extends ParseObject.State> S build();
  
  public T clear()
  {
    this.objectId = null;
    this.createdAt = -1L;
    this.updatedAt = -1L;
    this.isComplete = false;
    this.serverData.clear();
    return self();
  }
  
  public T createdAt(long paramLong)
  {
    this.createdAt = paramLong;
    return self();
  }
  
  public T createdAt(Date paramDate)
  {
    this.createdAt = paramDate.getTime();
    return self();
  }
  
  public T isComplete(boolean paramBoolean)
  {
    this.isComplete = paramBoolean;
    return self();
  }
  
  public T objectId(String paramString)
  {
    this.objectId = paramString;
    return self();
  }
  
  public T put(String paramString, Object paramObject)
  {
    this.serverData.put(paramString, paramObject);
    return self();
  }
  
  public T remove(String paramString)
  {
    this.serverData.remove(paramString);
    return self();
  }
  
  abstract T self();
  
  public T updatedAt(long paramLong)
  {
    this.updatedAt = paramLong;
    return self();
  }
  
  public T updatedAt(Date paramDate)
  {
    this.updatedAt = paramDate.getTime();
    return self();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$State$Init.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */