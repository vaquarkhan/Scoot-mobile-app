package com.parse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class ParseQuery$State<T extends ParseObject>
{
  private final ParseQuery.CachePolicy cachePolicy;
  private final String className;
  private final Map<String, Object> extraOptions;
  private final boolean ignoreACLs;
  private final Set<String> include;
  private final boolean isFromLocalDatastore;
  private final int limit;
  private final long maxCacheAge;
  private final List<String> order;
  private final String pinName;
  private final Set<String> selectedKeys;
  private final int skip;
  private final boolean trace;
  private final ParseQuery.QueryConstraints where;
  
  private ParseQuery$State(ParseQuery.State.Builder<T> paramBuilder)
  {
    this.className = ParseQuery.State.Builder.access$400(paramBuilder);
    this.where = new ParseQuery.QueryConstraints(ParseQuery.State.Builder.access$500(paramBuilder));
    this.include = Collections.unmodifiableSet(new HashSet(ParseQuery.State.Builder.access$600(paramBuilder)));
    if (ParseQuery.State.Builder.access$700(paramBuilder) != null) {}
    for (Set localSet = Collections.unmodifiableSet(new HashSet(ParseQuery.State.Builder.access$700(paramBuilder)));; localSet = null)
    {
      this.selectedKeys = localSet;
      this.limit = ParseQuery.State.Builder.access$800(paramBuilder);
      this.skip = ParseQuery.State.Builder.access$900(paramBuilder);
      this.order = Collections.unmodifiableList(new ArrayList(ParseQuery.State.Builder.access$1000(paramBuilder)));
      this.extraOptions = Collections.unmodifiableMap(new HashMap(ParseQuery.State.Builder.access$1100(paramBuilder)));
      this.trace = ParseQuery.State.Builder.access$1200(paramBuilder);
      this.cachePolicy = ParseQuery.State.Builder.access$1300(paramBuilder);
      this.maxCacheAge = ParseQuery.State.Builder.access$1400(paramBuilder);
      this.isFromLocalDatastore = ParseQuery.State.Builder.access$1500(paramBuilder);
      this.pinName = ParseQuery.State.Builder.access$1600(paramBuilder);
      this.ignoreACLs = ParseQuery.State.Builder.access$1700(paramBuilder);
      return;
    }
  }
  
  public ParseQuery.CachePolicy cachePolicy()
  {
    return this.cachePolicy;
  }
  
  public String className()
  {
    return this.className;
  }
  
  public ParseQuery.QueryConstraints constraints()
  {
    return this.where;
  }
  
  public Map<String, Object> extraOptions()
  {
    return this.extraOptions;
  }
  
  public boolean ignoreACLs()
  {
    return this.ignoreACLs;
  }
  
  public Set<String> includes()
  {
    return this.include;
  }
  
  public boolean isFromLocalDatastore()
  {
    return this.isFromLocalDatastore;
  }
  
  public boolean isTracingEnabled()
  {
    return this.trace;
  }
  
  public int limit()
  {
    return this.limit;
  }
  
  public long maxCacheAge()
  {
    return this.maxCacheAge;
  }
  
  public List<String> order()
  {
    return this.order;
  }
  
  public String pinName()
  {
    return this.pinName;
  }
  
  public Set<String> selectedKeys()
  {
    return this.selectedKeys;
  }
  
  public int skip()
  {
    return this.skip;
  }
  
  JSONObject toJSON(ParseEncoder paramParseEncoder)
  {
    localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("className", this.className);
      localJSONObject.put("where", paramParseEncoder.encode(this.where));
      if (this.limit >= 0) {
        localJSONObject.put("limit", this.limit);
      }
      if (this.skip > 0) {
        localJSONObject.put("skip", this.skip);
      }
      if (!this.order.isEmpty()) {
        localJSONObject.put("order", ParseTextUtils.join(",", this.order));
      }
      if (!this.include.isEmpty()) {
        localJSONObject.put("include", ParseTextUtils.join(",", this.include));
      }
      if (this.selectedKeys != null) {
        localJSONObject.put("fields", ParseTextUtils.join(",", this.selectedKeys));
      }
      if (this.trace) {
        localJSONObject.put("trace", 1);
      }
      Iterator localIterator = this.extraOptions.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, paramParseEncoder.encode(this.extraOptions.get(str)));
      }
      return localJSONObject;
    }
    catch (JSONException paramParseEncoder)
    {
      throw new RuntimeException(paramParseEncoder);
    }
  }
  
  public String toString()
  {
    return String.format(Locale.US, "%s[className=%s, where=%s, include=%s, selectedKeys=%s, limit=%s, skip=%s, order=%s, extraOptions=%s, cachePolicy=%s, maxCacheAge=%s, trace=%s]", new Object[] { getClass().getName(), this.className, this.where, this.include, this.selectedKeys, Integer.valueOf(this.limit), Integer.valueOf(this.skip), this.order, this.extraOptions, this.cachePolicy, Long.valueOf(this.maxCacheAge), Boolean.valueOf(this.trace) });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */