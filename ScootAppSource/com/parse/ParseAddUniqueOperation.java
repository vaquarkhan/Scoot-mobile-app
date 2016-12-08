package com.parse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class ParseAddUniqueOperation
  implements ParseFieldOperation
{
  protected final LinkedHashSet<Object> objects = new LinkedHashSet();
  
  public ParseAddUniqueOperation(Collection<?> paramCollection)
  {
    this.objects.addAll(paramCollection);
  }
  
  public Object apply(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return new ArrayList(this.objects);
    }
    if ((paramObject instanceof JSONArray)) {
      return new JSONArray((ArrayList)apply(ParseFieldOperations.jsonArrayAsArrayList((JSONArray)paramObject), paramString));
    }
    if ((paramObject instanceof List))
    {
      paramObject = new ArrayList((List)paramObject);
      paramString = new HashMap();
      int i = 0;
      while (i < ((ArrayList)paramObject).size())
      {
        if ((((ArrayList)paramObject).get(i) instanceof ParseObject)) {
          paramString.put(((ParseObject)((ArrayList)paramObject).get(i)).getObjectId(), Integer.valueOf(i));
        }
        i += 1;
      }
      Iterator localIterator = this.objects.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject instanceof ParseObject))
        {
          String str = ((ParseObject)localObject).getObjectId();
          if ((str != null) && (paramString.containsKey(str))) {
            ((ArrayList)paramObject).set(((Integer)paramString.get(str)).intValue(), localObject);
          } else if (!((ArrayList)paramObject).contains(localObject)) {
            ((ArrayList)paramObject).add(localObject);
          }
        }
        else if (!((ArrayList)paramObject).contains(localObject))
        {
          ((ArrayList)paramObject).add(localObject);
        }
      }
      return paramObject;
    }
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
  }
  
  public JSONObject encode(ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("__op", "AddUnique");
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
    if ((paramParseFieldOperation instanceof ParseAddUniqueOperation)) {
      return new ParseAddUniqueOperation((List)apply(new ArrayList(((ParseAddUniqueOperation)paramParseFieldOperation).objects), null));
    }
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAddUniqueOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */