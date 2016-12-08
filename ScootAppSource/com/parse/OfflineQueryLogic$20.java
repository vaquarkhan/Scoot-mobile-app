package com.parse;

import a.m;
import a.o;
import java.util.Map;
import org.json.JSONObject;

final class OfflineQueryLogic$20
  implements m<Void, o<Object>>
{
  OfflineQueryLogic$20(Object paramObject, OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase, String paramString) {}
  
  public o<Object> then(o<Void> paramo)
  {
    paramo = null;
    if ((this.val$container instanceof ParseObject)) {
      paramo = OfflineQueryLogic.access$600(this.val$store, this.val$container, null, this.val$db).c(new OfflineQueryLogic.20.1(this));
    }
    do
    {
      return paramo;
      if ((this.val$container instanceof Map)) {
        return o.a(((Map)this.val$container).get(this.val$key));
      }
      if ((this.val$container instanceof JSONObject)) {
        return o.a(((JSONObject)this.val$container).opt(this.val$key));
      }
    } while (JSONObject.NULL.equals(this.val$container));
    return o.a(new IllegalStateException("include is invalid"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */