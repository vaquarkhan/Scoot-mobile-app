package com.parse;

import java.util.Map;

class ParseObject$4
  extends ParseTraverser
{
  ParseObject$4(ParseObject paramParseObject, Map paramMap) {}
  
  protected boolean visit(Object paramObject)
  {
    if ((paramObject instanceof ParseObject))
    {
      paramObject = (ParseObject)paramObject;
      ParseObject.State localState = ((ParseObject)paramObject).getState();
      if ((localState.objectId() != null) && (localState.isComplete())) {
        this.val$fetchedObjects.put(localState.objectId(), paramObject);
      }
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */