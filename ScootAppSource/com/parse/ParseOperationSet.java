package com.parse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

class ParseOperationSet
  extends HashMap<String, ParseFieldOperation>
{
  private static final String REST_KEY_IS_SAVE_EVENTUALLY = "__isSaveEventually";
  private static final String REST_KEY_UUID = "__uuid";
  private static final long serialVersionUID = 1L;
  private boolean isSaveEventually = false;
  private final String uuid;
  
  public ParseOperationSet()
  {
    this(UUID.randomUUID().toString());
  }
  
  public ParseOperationSet(ParseOperationSet paramParseOperationSet)
  {
    super(paramParseOperationSet);
    this.uuid = paramParseOperationSet.getUUID();
    this.isSaveEventually = paramParseOperationSet.isSaveEventually;
  }
  
  private ParseOperationSet(String paramString)
  {
    this.uuid = paramString;
  }
  
  public static ParseOperationSet fromRest(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    Object localObject1 = paramJSONObject.keys();
    Object localObject2 = new String[paramJSONObject.length()];
    int i = 0;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2[i] = ((String)((Iterator)localObject1).next());
      i += 1;
    }
    localObject2 = new JSONObject(paramJSONObject, (String[])localObject2);
    paramJSONObject = (String)((JSONObject)localObject2).remove("__uuid");
    label111:
    String str;
    if (paramJSONObject == null)
    {
      paramJSONObject = new ParseOperationSet();
      boolean bool = ((JSONObject)localObject2).optBoolean("__isSaveEventually");
      ((JSONObject)localObject2).remove("__isSaveEventually");
      paramJSONObject.setIsSaveEventually(bool);
      Iterator localIterator = ((JSONObject)localObject2).keys();
      if (!localIterator.hasNext()) {
        return paramJSONObject;
      }
      str = (String)localIterator.next();
      localObject1 = paramParseDecoder.decode(((JSONObject)localObject2).get(str));
      if (str.equals("ACL")) {
        localObject1 = ParseACL.createACLFromJSONObject(((JSONObject)localObject2).getJSONObject(str), paramParseDecoder);
      }
      if (!(localObject1 instanceof ParseFieldOperation)) {
        break label208;
      }
    }
    label208:
    for (localObject1 = (ParseFieldOperation)localObject1;; localObject1 = new ParseSetOperation(localObject1))
    {
      paramJSONObject.put(str, localObject1);
      break label111;
      paramJSONObject = new ParseOperationSet(paramJSONObject);
      break;
    }
    return paramJSONObject;
  }
  
  public String getUUID()
  {
    return this.uuid;
  }
  
  public boolean isSaveEventually()
  {
    return this.isSaveEventually;
  }
  
  public void mergeFrom(ParseOperationSet paramParseOperationSet)
  {
    Iterator localIterator = paramParseOperationSet.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ParseFieldOperation localParseFieldOperation2 = (ParseFieldOperation)paramParseOperationSet.get(str);
      ParseFieldOperation localParseFieldOperation3 = (ParseFieldOperation)get(str);
      ParseFieldOperation localParseFieldOperation1 = localParseFieldOperation2;
      if (localParseFieldOperation3 != null) {
        localParseFieldOperation1 = localParseFieldOperation3.mergeWithPrevious(localParseFieldOperation2);
      }
      put(str, localParseFieldOperation1);
    }
  }
  
  public void setIsSaveEventually(boolean paramBoolean)
  {
    this.isSaveEventually = paramBoolean;
  }
  
  public JSONObject toRest(ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject.put(str, ((ParseFieldOperation)get(str)).encode(paramParseEncoder));
    }
    localJSONObject.put("__uuid", this.uuid);
    if (this.isSaveEventually) {
      localJSONObject.put("__isSaveEventually", true);
    }
    return localJSONObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOperationSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */