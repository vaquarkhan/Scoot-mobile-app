package com.parse;

import java.util.Collection;
import org.json.JSONObject;

final class ParseFieldOperations$5
  implements ParseFieldOperations.ParseFieldOperationFactory
{
  public ParseFieldOperation decode(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    return new ParseAddUniqueOperation((Collection)paramParseDecoder.decode(paramJSONObject.opt("objects")));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFieldOperations$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */