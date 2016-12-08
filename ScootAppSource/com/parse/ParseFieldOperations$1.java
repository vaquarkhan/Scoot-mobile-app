package com.parse;

import org.json.JSONArray;
import org.json.JSONObject;

final class ParseFieldOperations$1
  implements ParseFieldOperations.ParseFieldOperationFactory
{
  public ParseFieldOperation decode(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    Object localObject = null;
    JSONArray localJSONArray = paramJSONObject.getJSONArray("ops");
    int i = 0;
    paramJSONObject = (JSONObject)localObject;
    while (i < localJSONArray.length())
    {
      paramJSONObject = ParseFieldOperations.decode(localJSONArray.getJSONObject(i), paramParseDecoder).mergeWithPrevious(paramJSONObject);
      i += 1;
    }
    return paramJSONObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFieldOperations$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */