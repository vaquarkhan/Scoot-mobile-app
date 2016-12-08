package com.parse;

import android.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

abstract class ParseEncoder
{
  static boolean isValidType(Object paramObject)
  {
    return ((paramObject instanceof String)) || ((paramObject instanceof Number)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Date)) || ((paramObject instanceof List)) || ((paramObject instanceof Map)) || ((paramObject instanceof byte[])) || (paramObject == JSONObject.NULL) || ((paramObject instanceof ParseObject)) || ((paramObject instanceof ParseACL)) || ((paramObject instanceof ParseFile)) || ((paramObject instanceof ParseGeoPoint)) || ((paramObject instanceof ParseRelation));
  }
  
  public Object encode(Object paramObject)
  {
    Object localObject;
    try
    {
      if ((paramObject instanceof ParseObject)) {
        return encodeRelatedObject((ParseObject)paramObject);
      }
      if ((paramObject instanceof ParseQuery.State.Builder)) {
        return encode(((ParseQuery.State.Builder)paramObject).build());
      }
      if ((paramObject instanceof ParseQuery.State)) {
        return ((ParseQuery.State)paramObject).toJSON(this);
      }
      if ((paramObject instanceof Date)) {
        return encodeDate((Date)paramObject);
      }
      if ((paramObject instanceof byte[]))
      {
        localObject = new JSONObject();
        ((JSONObject)localObject).put("__type", "Bytes");
        ((JSONObject)localObject).put("base64", Base64.encodeToString((byte[])paramObject, 2));
        return localObject;
      }
      if ((paramObject instanceof ParseFile)) {
        return ((ParseFile)paramObject).encode();
      }
      if ((paramObject instanceof ParseGeoPoint))
      {
        paramObject = (ParseGeoPoint)paramObject;
        localObject = new JSONObject();
        ((JSONObject)localObject).put("__type", "GeoPoint");
        ((JSONObject)localObject).put("latitude", ((ParseGeoPoint)paramObject).getLatitude());
        ((JSONObject)localObject).put("longitude", ((ParseGeoPoint)paramObject).getLongitude());
        return localObject;
      }
      if ((paramObject instanceof ParseACL)) {
        return ((ParseACL)paramObject).toJSONObject(this);
      }
      if ((paramObject instanceof Map))
      {
        localObject = (Map)paramObject;
        paramObject = new JSONObject();
        localObject = ((Map)localObject).entrySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
          ((JSONObject)paramObject).put((String)localEntry.getKey(), encode(localEntry.getValue()));
        }
        return paramObject;
      }
    }
    catch (JSONException paramObject)
    {
      throw new RuntimeException((Throwable)paramObject);
    }
    if ((paramObject instanceof Collection))
    {
      localObject = new JSONArray();
      paramObject = ((Collection)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        ((JSONArray)localObject).put(encode(((Iterator)paramObject).next()));
      }
    }
    if ((paramObject instanceof ParseRelation)) {
      return ((ParseRelation)paramObject).encodeToJSON(this);
    }
    if ((paramObject instanceof ParseFieldOperation)) {
      return ((ParseFieldOperation)paramObject).encode(this);
    }
    if ((paramObject instanceof ParseQuery.RelationConstraint)) {
      return ((ParseQuery.RelationConstraint)paramObject).encode(this);
    }
    if (paramObject == null)
    {
      paramObject = JSONObject.NULL;
      return paramObject;
    }
    if (!isValidType(paramObject)) {
      throw new IllegalArgumentException("invalid type for ParseObject: " + paramObject.getClass().toString());
    }
    return paramObject;
    return localObject;
  }
  
  protected JSONObject encodeDate(Date paramDate)
  {
    JSONObject localJSONObject = new JSONObject();
    paramDate = ParseDateFormat.getInstance().format(paramDate);
    try
    {
      localJSONObject.put("__type", "Date");
      localJSONObject.put("iso", paramDate);
      return localJSONObject;
    }
    catch (JSONException paramDate)
    {
      throw new RuntimeException(paramDate);
    }
  }
  
  protected abstract JSONObject encodeRelatedObject(ParseObject paramParseObject);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseEncoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */