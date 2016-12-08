package com.parse;

import a.m;
import a.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class OfflineStore$11
  implements m<String, o<Void>>
{
  OfflineStore$11(OfflineStore paramOfflineStore, ParseSQLiteDatabase paramParseSQLiteDatabase, ParseObject paramParseObject) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    if (paramo == null) {
      return o.a(new ParseException(120, "Attempted to fetch an object offline which was never saved to the offline cache."));
    }
    try
    {
      paramo = new JSONObject(paramo);
      HashMap localHashMap = new HashMap();
      new OfflineStore.11.1(this, localHashMap).setTraverseParseObjects(false).setYieldRoot(false).traverse(paramo);
      return o.a(localHashMap.values()).c(new OfflineStore.11.2(this, paramo, localHashMap));
    }
    catch (JSONException paramo) {}
    return o.a(paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */