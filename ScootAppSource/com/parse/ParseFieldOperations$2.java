package com.parse;

import org.json.JSONObject;

final class ParseFieldOperations$2
  implements ParseFieldOperations.ParseFieldOperationFactory
{
  public ParseFieldOperation decode(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    return ParseDeleteOperation.getInstance();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFieldOperations$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */