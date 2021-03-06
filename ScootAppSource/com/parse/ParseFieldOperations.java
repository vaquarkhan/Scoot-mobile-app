package com.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ParseFieldOperations
{
  private static Map<String, ParseFieldOperations.ParseFieldOperationFactory> opDecoderMap = new HashMap();
  
  static ParseFieldOperation decode(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    String str = paramJSONObject.optString("__op");
    ParseFieldOperations.ParseFieldOperationFactory localParseFieldOperationFactory = (ParseFieldOperations.ParseFieldOperationFactory)opDecoderMap.get(str);
    if (localParseFieldOperationFactory == null) {
      throw new RuntimeException("Unable to decode operation of type " + str);
    }
    return localParseFieldOperationFactory.decode(paramJSONObject, paramParseDecoder);
  }
  
  static ArrayList<Object> jsonArrayAsArrayList(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList(paramJSONArray.length());
    int i = 0;
    while (i < paramJSONArray.length()) {
      try
      {
        localArrayList.add(paramJSONArray.get(i));
        i += 1;
      }
      catch (JSONException paramJSONArray)
      {
        throw new RuntimeException(paramJSONArray);
      }
    }
    return localArrayList;
  }
  
  private static void registerDecoder(String paramString, ParseFieldOperations.ParseFieldOperationFactory paramParseFieldOperationFactory)
  {
    opDecoderMap.put(paramString, paramParseFieldOperationFactory);
  }
  
  static void registerDefaultDecoders()
  {
    registerDecoder("Batch", new ParseFieldOperations.1());
    registerDecoder("Delete", new ParseFieldOperations.2());
    registerDecoder("Increment", new ParseFieldOperations.3());
    registerDecoder("Add", new ParseFieldOperations.4());
    registerDecoder("AddUnique", new ParseFieldOperations.5());
    registerDecoder("Remove", new ParseFieldOperations.6());
    registerDecoder("AddRelation", new ParseFieldOperations.7());
    registerDecoder("RemoveRelation", new ParseFieldOperations.8());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFieldOperations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */