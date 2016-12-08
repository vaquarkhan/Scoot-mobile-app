package com.parse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class ParseRemoveOperation
  implements ParseFieldOperation
{
  protected final HashSet<Object> objects = new HashSet();
  
  public ParseRemoveOperation(Collection<?> paramCollection)
  {
    this.objects.addAll(paramCollection);
  }
  
  public Object apply(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return new ArrayList();
    }
    if ((paramObject instanceof JSONArray)) {
      return new JSONArray((ArrayList)apply(ParseFieldOperations.jsonArrayAsArrayList((JSONArray)paramObject), paramString));
    }
    if ((paramObject instanceof List))
    {
      paramObject = new ArrayList((List)paramObject);
      ((ArrayList)paramObject).removeAll(this.objects);
      Object localObject1 = new ArrayList(this.objects);
      ((ArrayList)localObject1).removeAll((Collection)paramObject);
      paramString = new HashSet();
      localObject1 = ((ArrayList)localObject1).iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if ((localObject2 instanceof ParseObject)) {
          paramString.add(((ParseObject)localObject2).getObjectId());
        }
      }
      localObject1 = ((ArrayList)paramObject).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if (((localObject2 instanceof ParseObject)) && (paramString.contains(((ParseObject)localObject2).getObjectId()))) {
          ((Iterator)localObject1).remove();
        }
      }
      return paramObject;
    }
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
  }
  
  public JSONObject encode(ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("__op", "Remove");
    localJSONObject.put("objects", paramParseEncoder.encode(new ArrayList(this.objects)));
    return localJSONObject;
  }
  
  public ParseFieldOperation mergeWithPrevious(ParseFieldOperation paramParseFieldOperation)
  {
    if (paramParseFieldOperation == null) {
      return this;
    }
    if ((paramParseFieldOperation instanceof ParseDeleteOperation)) {
      return new ParseSetOperation(this.objects);
    }
    if ((paramParseFieldOperation instanceof ParseSetOperation))
    {
      paramParseFieldOperation = ((ParseSetOperation)paramParseFieldOperation).getValue();
      if (((paramParseFieldOperation instanceof JSONArray)) || ((paramParseFieldOperation instanceof List))) {
        return new ParseSetOperation(apply(paramParseFieldOperation, null));
      }
      throw new IllegalArgumentException("You can only add an item to a List or JSONArray.");
    }
    if ((paramParseFieldOperation instanceof ParseRemoveOperation))
    {
      paramParseFieldOperation = new HashSet(((ParseRemoveOperation)paramParseFieldOperation).objects);
      paramParseFieldOperation.addAll(this.objects);
      return new ParseRemoveOperation(paramParseFieldOperation);
    }
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRemoveOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */