package com.parse;

import java.util.Map;
import org.json.JSONObject;

class OfflineStore$11$1
  extends ParseTraverser
{
  OfflineStore$11$1(OfflineStore.11 param11, Map paramMap) {}
  
  protected boolean visit(Object paramObject)
  {
    if (((paramObject instanceof JSONObject)) && (((JSONObject)paramObject).optString("__type").equals("OfflineObject")))
    {
      paramObject = ((JSONObject)paramObject).optString("uuid");
      this.val$offlineObjects.put(paramObject, OfflineStore.access$600(this.this$1.this$0, (String)paramObject, this.this$1.val$db));
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$11$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */