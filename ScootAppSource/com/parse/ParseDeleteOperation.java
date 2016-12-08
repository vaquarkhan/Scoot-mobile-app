package com.parse;

import org.json.JSONObject;

class ParseDeleteOperation
  implements ParseFieldOperation
{
  private static final ParseDeleteOperation defaultInstance = new ParseDeleteOperation();
  
  public static ParseDeleteOperation getInstance()
  {
    return defaultInstance;
  }
  
  public Object apply(Object paramObject, String paramString)
  {
    return null;
  }
  
  public JSONObject encode(ParseEncoder paramParseEncoder)
  {
    paramParseEncoder = new JSONObject();
    paramParseEncoder.put("__op", "Delete");
    return paramParseEncoder;
  }
  
  public ParseFieldOperation mergeWithPrevious(ParseFieldOperation paramParseFieldOperation)
  {
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseDeleteOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */