package com.parse;

import a.o;
import java.util.Map;
import org.json.JSONObject;

class OfflineStore$OfflineDecoder
  extends ParseDecoder
{
  private Map<String, o<ParseObject>> offlineObjects;
  
  private OfflineStore$OfflineDecoder(Map<String, o<ParseObject>> paramMap)
  {
    Map localMap;
    this.offlineObjects = localMap;
  }
  
  public Object decode(Object paramObject)
  {
    if (((paramObject instanceof JSONObject)) && (((JSONObject)paramObject).optString("__type").equals("OfflineObject")))
    {
      paramObject = ((JSONObject)paramObject).optString("uuid");
      return ((o)this.offlineObjects.get(paramObject)).f();
    }
    return super.decode(paramObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$OfflineDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */