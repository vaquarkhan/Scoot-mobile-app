package com.parse;

import java.util.Iterator;
import org.json.JSONObject;

final class ParseJSONUtils$1
  implements Iterable<String>
{
  ParseJSONUtils$1(JSONObject paramJSONObject) {}
  
  public Iterator<String> iterator()
  {
    return this.val$finalObject.keys();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseJSONUtils$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */