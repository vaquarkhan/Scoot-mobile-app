package com.parse;

import org.json.JSONObject;

final class ParseFieldOperations$3
  implements ParseFieldOperations.ParseFieldOperationFactory
{
  public ParseFieldOperation decode(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    return new ParseIncrementOperation((Number)paramParseDecoder.decode(paramJSONObject.opt("amount")));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFieldOperations$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */