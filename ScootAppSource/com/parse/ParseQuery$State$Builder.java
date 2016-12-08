package com.parse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ParseQuery$State$Builder<T extends ParseObject>
{
  private ParseQuery.CachePolicy cachePolicy = ParseQuery.CachePolicy.IGNORE_CACHE;
  private final String className;
  private final Map<String, Object> extraOptions = new HashMap();
  private boolean ignoreACLs;
  private final Set<String> includes = new HashSet();
  private boolean isFromLocalDatastore = false;
  private int limit = -1;
  private long maxCacheAge = Long.MAX_VALUE;
  private List<String> order = new ArrayList();
  private String pinName;
  private Set<String> selectedKeys;
  private int skip = 0;
  private boolean trace;
  private final ParseQuery.QueryConstraints where = new ParseQuery.QueryConstraints();
  
  public ParseQuery$State$Builder(Builder<T> paramBuilder)
  {
    this.className = paramBuilder.className;
    this.where.putAll(paramBuilder.where);
    this.includes.addAll(paramBuilder.includes);
    if (paramBuilder.selectedKeys != null) {}
    for (HashSet localHashSet = new HashSet(paramBuilder.selectedKeys);; localHashSet = null)
    {
      this.selectedKeys = localHashSet;
      this.limit = paramBuilder.limit;
      this.skip = paramBuilder.skip;
      this.order.addAll(paramBuilder.order);
      this.extraOptions.putAll(paramBuilder.extraOptions);
      this.trace = paramBuilder.trace;
      this.cachePolicy = paramBuilder.cachePolicy;
      this.maxCacheAge = paramBuilder.maxCacheAge;
      this.isFromLocalDatastore = paramBuilder.isFromLocalDatastore;
      this.pinName = paramBuilder.pinName;
      this.ignoreACLs = paramBuilder.ignoreACLs;
      return;
    }
  }
  
  public ParseQuery$State$Builder(ParseQuery.State paramState)
  {
    this.className = paramState.className();
    this.where.putAll(paramState.constraints());
    this.includes.addAll(paramState.includes());
    if (paramState.selectedKeys() != null) {}
    for (HashSet localHashSet = new HashSet(paramState.selectedKeys());; localHashSet = null)
    {
      this.selectedKeys = localHashSet;
      this.limit = paramState.limit();
      this.skip = paramState.skip();
      this.order.addAll(paramState.order());
      this.extraOptions.putAll(paramState.extraOptions());
      this.trace = paramState.isTracingEnabled();
      this.cachePolicy = paramState.cachePolicy();
      this.maxCacheAge = paramState.maxCacheAge();
      this.isFromLocalDatastore = paramState.isFromLocalDatastore();
      this.pinName = paramState.pinName();
      this.ignoreACLs = paramState.ignoreACLs();
      return;
    }
  }
  
  public ParseQuery$State$Builder(Class<T> paramClass)
  {
    this(ParseQuery.access$000().getClassName(paramClass));
  }
  
  public ParseQuery$State$Builder(String paramString)
  {
    this.className = paramString;
  }
  
  private Builder<T> addConditionInternal(String paramString1, String paramString2, Object paramObject)
  {
    if (this.where.containsKey(paramString1))
    {
      localObject1 = this.where.get(paramString1);
      if (!(localObject1 instanceof ParseQuery.KeyConstraints)) {}
    }
    for (Object localObject1 = (ParseQuery.KeyConstraints)localObject1;; localObject1 = null)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new ParseQuery.KeyConstraints();
      }
      ((ParseQuery.KeyConstraints)localObject2).put(paramString2, paramObject);
      this.where.put(paramString1, localObject2);
      return this;
    }
  }
  
  private Builder<T> addOrder(String paramString)
  {
    this.order.add(paramString);
    return this;
  }
  
  public static <T extends ParseObject> Builder<T> or(List<Builder<T>> paramList)
  {
    if (paramList.isEmpty()) {
      throw new IllegalArgumentException("Can't take an or of an empty list of queries");
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    paramList = null;
    while (localIterator.hasNext())
    {
      Builder localBuilder = (Builder)localIterator.next();
      if ((paramList != null) && (!localBuilder.className.equals(paramList))) {
        throw new IllegalArgumentException("All of the queries in an or query must be on the same class ");
      }
      if (localBuilder.limit >= 0) {
        throw new IllegalArgumentException("Cannot have limits in sub queries of an 'OR' query");
      }
      if (localBuilder.skip > 0) {
        throw new IllegalArgumentException("Cannot have skips in sub queries of an 'OR' query");
      }
      if (!localBuilder.order.isEmpty()) {
        throw new IllegalArgumentException("Cannot have an order in sub queries of an 'OR' query");
      }
      if (!localBuilder.includes.isEmpty()) {
        throw new IllegalArgumentException("Cannot have an include in sub queries of an 'OR' query");
      }
      if (localBuilder.selectedKeys != null) {
        throw new IllegalArgumentException("Cannot have an selectKeys in sub queries of an 'OR' query");
      }
      paramList = localBuilder.className;
      localArrayList.add(localBuilder.where);
    }
    return new Builder(paramList).whereSatifiesAnyOf(localArrayList);
  }
  
  private Builder<T> setOrder(String paramString)
  {
    this.order.clear();
    this.order.add(paramString);
    return this;
  }
  
  private Builder<T> whereSatifiesAnyOf(List<ParseQuery.QueryConstraints> paramList)
  {
    this.where.put("$or", paramList);
    return this;
  }
  
  public Builder<T> addAscendingOrder(String paramString)
  {
    return addOrder(paramString);
  }
  
  public Builder<T> addCondition(String paramString1, String paramString2, Object paramObject)
  {
    return addConditionInternal(paramString1, paramString2, paramObject);
  }
  
  public Builder<T> addCondition(String paramString1, String paramString2, Collection<? extends Object> paramCollection)
  {
    return addConditionInternal(paramString1, paramString2, Collections.unmodifiableCollection(paramCollection));
  }
  
  public Builder<T> addDescendingOrder(String paramString)
  {
    return addOrder(String.format("-%s", new Object[] { paramString }));
  }
  
  public ParseQuery.State<T> build()
  {
    if ((!this.isFromLocalDatastore) && (this.ignoreACLs)) {
      throw new IllegalStateException("`ignoreACLs` cannot be combined with network queries");
    }
    return new ParseQuery.State(this, null);
  }
  
  public Builder<T> fromLocalDatastore()
  {
    return fromPin(null);
  }
  
  public Builder<T> fromNetwork()
  {
    ParseQuery.access$200();
    this.isFromLocalDatastore = false;
    this.pinName = null;
    return this;
  }
  
  public Builder<T> fromPin()
  {
    return fromPin("_default");
  }
  
  public Builder<T> fromPin(String paramString)
  {
    ParseQuery.access$200();
    this.isFromLocalDatastore = true;
    this.pinName = paramString;
    return this;
  }
  
  public ParseQuery.CachePolicy getCachePolicy()
  {
    ParseQuery.access$100();
    return this.cachePolicy;
  }
  
  public String getClassName()
  {
    return this.className;
  }
  
  public int getLimit()
  {
    return this.limit;
  }
  
  public long getMaxCacheAge()
  {
    ParseQuery.access$100();
    return this.maxCacheAge;
  }
  
  public int getSkip()
  {
    return this.skip;
  }
  
  public Builder<T> ignoreACLs()
  {
    ParseQuery.access$200();
    this.ignoreACLs = true;
    return this;
  }
  
  public Builder<T> include(String paramString)
  {
    this.includes.add(paramString);
    return this;
  }
  
  public boolean isFromLocalDatstore()
  {
    return this.isFromLocalDatastore;
  }
  
  public boolean isFromNetwork()
  {
    ParseQuery.access$200();
    return !this.isFromLocalDatastore;
  }
  
  public Builder<T> maxDistance(String paramString, double paramDouble)
  {
    return addCondition(paramString, "$maxDistance", Double.valueOf(paramDouble));
  }
  
  public Builder<T> orderByAscending(String paramString)
  {
    return setOrder(paramString);
  }
  
  public Builder<T> orderByDescending(String paramString)
  {
    return setOrder(String.format("-%s", new Object[] { paramString }));
  }
  
  Builder<T> redirectClassNameForKey(String paramString)
  {
    this.extraOptions.put("redirectClassNameForKey", paramString);
    return this;
  }
  
  public Builder<T> selectKeys(Collection<String> paramCollection)
  {
    if (this.selectedKeys == null) {
      this.selectedKeys = new HashSet();
    }
    this.selectedKeys.addAll(paramCollection);
    return this;
  }
  
  public Builder<T> setCachePolicy(ParseQuery.CachePolicy paramCachePolicy)
  {
    ParseQuery.access$100();
    this.cachePolicy = paramCachePolicy;
    return this;
  }
  
  public Builder<T> setLimit(int paramInt)
  {
    this.limit = paramInt;
    return this;
  }
  
  public Builder<T> setMaxCacheAge(long paramLong)
  {
    ParseQuery.access$100();
    this.maxCacheAge = paramLong;
    return this;
  }
  
  public Builder<T> setSkip(int paramInt)
  {
    this.skip = paramInt;
    return this;
  }
  
  public Builder<T> setTracingEnabled(boolean paramBoolean)
  {
    this.trace = paramBoolean;
    return this;
  }
  
  public Builder<T> whereDoesNotMatchKeyInQuery(String paramString1, String paramString2, Builder<?> paramBuilder)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("key", paramString2);
    localHashMap.put("query", paramBuilder);
    return addConditionInternal(paramString1, "$dontSelect", Collections.unmodifiableMap(localHashMap));
  }
  
  public Builder<T> whereDoesNotMatchQuery(String paramString, Builder<?> paramBuilder)
  {
    return addConditionInternal(paramString, "$notInQuery", paramBuilder);
  }
  
  public Builder<T> whereEqualTo(String paramString, Object paramObject)
  {
    this.where.put(paramString, paramObject);
    return this;
  }
  
  public Builder<T> whereMatchesKeyInQuery(String paramString1, String paramString2, Builder<?> paramBuilder)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("key", paramString2);
    localHashMap.put("query", paramBuilder);
    return addConditionInternal(paramString1, "$select", Collections.unmodifiableMap(new HashMap(localHashMap)));
  }
  
  public Builder<T> whereMatchesQuery(String paramString, Builder<?> paramBuilder)
  {
    return addConditionInternal(paramString, "$inQuery", paramBuilder);
  }
  
  public Builder<T> whereNear(String paramString, ParseGeoPoint paramParseGeoPoint)
  {
    return addCondition(paramString, "$nearSphere", paramParseGeoPoint);
  }
  
  Builder<T> whereObjectIdEquals(String paramString)
  {
    this.where.clear();
    this.where.put("objectId", paramString);
    return this;
  }
  
  Builder<T> whereRelatedTo(ParseObject paramParseObject, String paramString)
  {
    this.where.put("$relatedTo", new ParseQuery.RelationConstraint(paramString, paramParseObject));
    return this;
  }
  
  public Builder<T> whereWithin(String paramString, ParseGeoPoint paramParseGeoPoint1, ParseGeoPoint paramParseGeoPoint2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramParseGeoPoint1);
    localArrayList.add(paramParseGeoPoint2);
    paramParseGeoPoint1 = new HashMap();
    paramParseGeoPoint1.put("$box", localArrayList);
    return addCondition(paramString, "$within", paramParseGeoPoint1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery$State$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */