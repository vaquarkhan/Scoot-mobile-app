package com.parse;

import org.json.JSONException;
import org.json.JSONObject;

class ParseQuery$RelationConstraint
{
  private String key;
  private ParseObject object;
  
  public ParseQuery$RelationConstraint(String paramString, ParseObject paramParseObject)
  {
    if ((paramString == null) || (paramParseObject == null)) {
      throw new IllegalArgumentException("Arguments must not be null.");
    }
    this.key = paramString;
    this.object = paramParseObject;
  }
  
  public JSONObject encode(ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("key", this.key);
      localJSONObject.put("object", paramParseEncoder.encodeRelatedObject(this.object));
      return localJSONObject;
    }
    catch (JSONException paramParseEncoder)
    {
      throw new RuntimeException(paramParseEncoder);
    }
  }
  
  public String getKey()
  {
    return this.key;
  }
  
  public ParseObject getObject()
  {
    return this.object;
  }
  
  public ParseRelation<ParseObject> getRelation()
  {
    return this.object.getRelation(this.key);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$RelationConstraint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */