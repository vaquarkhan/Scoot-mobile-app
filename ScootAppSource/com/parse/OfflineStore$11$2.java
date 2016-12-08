package com.parse;

import a.m;
import a.o;
import java.util.Map;
import org.json.JSONObject;

class OfflineStore$11$2
  implements m<Void, Void>
{
  OfflineStore$11$2(OfflineStore.11 param11, JSONObject paramJSONObject, Map paramMap) {}
  
  public Void then(o<Void> paramo)
  {
    this.this$1.val$object.mergeREST(this.this$1.val$object.getState(), this.val$json, new OfflineStore.OfflineDecoder(this.this$1.this$0, this.val$offlineObjects, null));
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$11$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */