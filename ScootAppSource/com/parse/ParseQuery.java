package com.parse;

import a.ac;
import a.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

public class ParseQuery<T extends ParseObject>
{
  private final ParseQuery.State.Builder<T> builder;
  private ac<Void> cts;
  private boolean isRunning = false;
  private final Object lock = new Object();
  private ParseUser user;
  
  ParseQuery(ParseQuery.State.Builder<T> paramBuilder)
  {
    this.builder = paramBuilder;
  }
  
  public ParseQuery(ParseQuery<T> paramParseQuery)
  {
    this(new ParseQuery.State.Builder(paramParseQuery.getBuilder()));
    this.user = paramParseQuery.user;
  }
  
  public ParseQuery(Class<T> paramClass)
  {
    this(getSubclassingController().getClassName(paramClass));
  }
  
  public ParseQuery(String paramString)
  {
    this(new ParseQuery.State.Builder(paramString));
  }
  
  private void checkIfRunning()
  {
    checkIfRunning(false);
  }
  
  private void checkIfRunning(boolean paramBoolean)
  {
    synchronized (this.lock)
    {
      if (this.isRunning) {
        throw new RuntimeException("This query has an outstanding network connection. You have to wait until it's done.");
      }
    }
    if (paramBoolean)
    {
      this.isRunning = true;
      this.cts = o.b();
    }
  }
  
  public static void clearAllCachedResults()
  {
    throwIfLDSEnabled();
    ParseKeyValueCache.clearKeyValueCacheDir();
  }
  
  private o<Integer> countAsync(ParseQuery.State<T> paramState)
  {
    return doWithRunningCheck(new ParseQuery.8(this, paramState));
  }
  
  private o<Integer> countAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    return getQueryController().countAsync(paramState, paramParseUser, paramo);
  }
  
  private <TResult> o<TResult> doCacheThenNetwork(ParseQuery.State<T> paramState, ParseCallback2<TResult, ParseException> paramParseCallback2, ParseQuery.CacheThenNetworkCallable<T, o<TResult>> paramCacheThenNetworkCallable)
  {
    return doWithRunningCheck(new ParseQuery.10(this, paramState, paramCacheThenNetworkCallable, paramParseCallback2));
  }
  
  private <TResult> o<TResult> doWithRunningCheck(Callable<o<TResult>> paramCallable)
  {
    checkIfRunning(true);
    try
    {
      paramCallable = (o)paramCallable.call();
      return paramCallable.b(new ParseQuery.1(this));
    }
    catch (Exception paramCallable)
    {
      for (;;)
      {
        paramCallable = o.a(paramCallable);
      }
    }
  }
  
  private o<List<T>> findAsync(ParseQuery.State<T> paramState)
  {
    return doWithRunningCheck(new ParseQuery.3(this, paramState));
  }
  
  private o<T> getFirstAsync(ParseQuery.State<T> paramState)
  {
    return doWithRunningCheck(new ParseQuery.5(this, paramState));
  }
  
  private o<T> getFirstAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    return getQueryController().getFirstAsync(paramState, paramParseUser, paramo);
  }
  
  public static <T extends ParseObject> ParseQuery<T> getQuery(Class<T> paramClass)
  {
    return new ParseQuery(paramClass);
  }
  
  public static <T extends ParseObject> ParseQuery<T> getQuery(String paramString)
  {
    return new ParseQuery(paramString);
  }
  
  private static ParseQueryController getQueryController()
  {
    return ParseCorePlugins.getInstance().getQueryController();
  }
  
  private static ParseObjectSubclassingController getSubclassingController()
  {
    return ParseCorePlugins.getInstance().getSubclassingController();
  }
  
  @Deprecated
  public static ParseQuery<ParseUser> getUserQuery()
  {
    return ParseUser.getQuery();
  }
  
  public static <T extends ParseObject> ParseQuery<T> or(List<ParseQuery<T>> paramList)
  {
    if (paramList.isEmpty()) {
      throw new IllegalArgumentException("Can't take an or of an empty list of queries");
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((ParseQuery)paramList.next()).getBuilder());
    }
    return new ParseQuery(ParseQuery.State.Builder.or(localArrayList));
  }
  
  private static void throwIfLDSDisabled()
  {
    throwIfLDSEnabled(true);
  }
  
  private static void throwIfLDSEnabled()
  {
    throwIfLDSEnabled(false);
  }
  
  private static void throwIfLDSEnabled(boolean paramBoolean)
  {
    boolean bool = Parse.isLocalDatastoreEnabled();
    if ((paramBoolean) && (!bool)) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    if ((!paramBoolean) && (bool)) {
      throw new IllegalStateException("Unsupported method when Local Datastore is enabled.");
    }
  }
  
  public ParseQuery<T> addAscendingOrder(String paramString)
  {
    checkIfRunning();
    this.builder.addAscendingOrder(paramString);
    return this;
  }
  
  public ParseQuery<T> addDescendingOrder(String paramString)
  {
    checkIfRunning();
    this.builder.addDescendingOrder(paramString);
    return this;
  }
  
  public void cancel()
  {
    synchronized (this.lock)
    {
      if (this.cts != null)
      {
        this.cts.b();
        this.cts = null;
      }
      this.isRunning = false;
      return;
    }
  }
  
  public void clearCachedResult()
  {
    throwIfLDSEnabled();
    ParseQuery.State localState = this.builder.build();
    try
    {
      Object localObject1 = (ParseUser)ParseTaskUtils.wait(getUserAsync(localState));
      if (localObject1 != null)
      {
        localObject1 = ((ParseUser)localObject1).getSessionToken();
        ParseKeyValueCache.clearFromKeyValueCache(ParseRESTQueryCommand.findCommand(localState, (String)localObject1).getCacheKey());
        return;
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        Object localObject2 = null;
        continue;
        localObject2 = null;
      }
    }
  }
  
  public int count()
  {
    return ((Integer)ParseTaskUtils.wait(countInBackground())).intValue();
  }
  
  public o<Integer> countInBackground()
  {
    return countAsync(new ParseQuery.State.Builder(this.builder).setLimit(0).build());
  }
  
  public void countInBackground(CountCallback paramCountCallback)
  {
    Object localObject = new ParseQuery.State.Builder(this.builder).setLimit(0).build();
    if (paramCountCallback != null)
    {
      paramCountCallback = new ParseQuery.6(this, paramCountCallback);
      if ((((ParseQuery.State)localObject).cachePolicy() == ParseQuery.CachePolicy.CACHE_THEN_NETWORK) && (!((ParseQuery.State)localObject).isFromLocalDatastore())) {
        break label68;
      }
    }
    label68:
    for (localObject = countAsync((ParseQuery.State)localObject);; localObject = doCacheThenNetwork((ParseQuery.State)localObject, paramCountCallback, new ParseQuery.7(this)))
    {
      ParseTaskUtils.callbackOnMainThreadAsync((o)localObject, paramCountCallback);
      return;
      paramCountCallback = null;
      break;
    }
  }
  
  public List<T> find()
  {
    return (List)ParseTaskUtils.wait(findInBackground());
  }
  
  o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    return getQueryController().findAsync(paramState, paramParseUser, paramo);
  }
  
  public o<List<T>> findInBackground()
  {
    return findAsync(this.builder.build());
  }
  
  public void findInBackground(FindCallback<T> paramFindCallback)
  {
    Object localObject = this.builder.build();
    if ((((ParseQuery.State)localObject).cachePolicy() != ParseQuery.CachePolicy.CACHE_THEN_NETWORK) || (((ParseQuery.State)localObject).isFromLocalDatastore())) {}
    for (localObject = findAsync((ParseQuery.State)localObject);; localObject = doCacheThenNetwork((ParseQuery.State)localObject, paramFindCallback, new ParseQuery.2(this)))
    {
      ParseTaskUtils.callbackOnMainThreadAsync((o)localObject, paramFindCallback);
      return;
    }
  }
  
  public ParseQuery<T> fromLocalDatastore()
  {
    this.builder.fromLocalDatastore();
    return this;
  }
  
  ParseQuery<T> fromNetwork()
  {
    checkIfRunning();
    this.builder.fromNetwork();
    return this;
  }
  
  public ParseQuery<T> fromPin()
  {
    checkIfRunning();
    this.builder.fromPin();
    return this;
  }
  
  public ParseQuery<T> fromPin(String paramString)
  {
    checkIfRunning();
    this.builder.fromPin(paramString);
    return this;
  }
  
  public T get(String paramString)
  {
    return (ParseObject)ParseTaskUtils.wait(getInBackground(paramString));
  }
  
  ParseQuery.State.Builder<T> getBuilder()
  {
    return this.builder;
  }
  
  public ParseQuery.CachePolicy getCachePolicy()
  {
    return this.builder.getCachePolicy();
  }
  
  public String getClassName()
  {
    return this.builder.getClassName();
  }
  
  public T getFirst()
  {
    return (ParseObject)ParseTaskUtils.wait(getFirstInBackground());
  }
  
  public o<T> getFirstInBackground()
  {
    return getFirstAsync(this.builder.setLimit(1).build());
  }
  
  public void getFirstInBackground(GetCallback<T> paramGetCallback)
  {
    Object localObject = this.builder.setLimit(1).build();
    if ((((ParseQuery.State)localObject).cachePolicy() != ParseQuery.CachePolicy.CACHE_THEN_NETWORK) || (((ParseQuery.State)localObject).isFromLocalDatastore())) {}
    for (localObject = getFirstAsync((ParseQuery.State)localObject);; localObject = doCacheThenNetwork((ParseQuery.State)localObject, paramGetCallback, new ParseQuery.4(this)))
    {
      ParseTaskUtils.callbackOnMainThreadAsync((o)localObject, paramGetCallback);
      return;
    }
  }
  
  public o<T> getInBackground(String paramString)
  {
    return getFirstAsync(this.builder.setSkip(-1).whereObjectIdEquals(paramString).build());
  }
  
  public void getInBackground(String paramString, GetCallback<T> paramGetCallback)
  {
    paramString = this.builder.setSkip(-1).whereObjectIdEquals(paramString).build();
    if ((paramString.cachePolicy() != ParseQuery.CachePolicy.CACHE_THEN_NETWORK) || (paramString.isFromLocalDatastore())) {}
    for (paramString = getFirstAsync(paramString);; paramString = doCacheThenNetwork(paramString, paramGetCallback, new ParseQuery.9(this)))
    {
      ParseTaskUtils.callbackOnMainThreadAsync(paramString, paramGetCallback);
      return;
    }
  }
  
  public int getLimit()
  {
    return this.builder.getLimit();
  }
  
  public long getMaxCacheAge()
  {
    return this.builder.getMaxCacheAge();
  }
  
  public int getSkip()
  {
    return this.builder.getSkip();
  }
  
  o<ParseUser> getUserAsync(ParseQuery.State<T> paramState)
  {
    if (paramState.ignoreACLs()) {
      return o.a(null);
    }
    if (this.user != null) {
      return o.a(this.user);
    }
    return ParseUser.getCurrentUserAsync();
  }
  
  public boolean hasCachedResult()
  {
    throwIfLDSEnabled();
    ParseQuery.State localState = this.builder.build();
    try
    {
      Object localObject1 = (ParseUser)ParseTaskUtils.wait(getUserAsync(localState));
      if (localObject1 != null)
      {
        localObject1 = ((ParseUser)localObject1).getSessionToken();
        if (ParseKeyValueCache.loadFromKeyValueCache(ParseRESTQueryCommand.findCommand(localState, (String)localObject1).getCacheKey(), localState.maxCacheAge()) == null) {
          break label63;
        }
        return true;
      }
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        Object localObject2 = null;
        continue;
        localObject2 = null;
      }
    }
    label63:
    return false;
  }
  
  public ParseQuery<T> ignoreACLs()
  {
    checkIfRunning();
    this.builder.ignoreACLs();
    return this;
  }
  
  public ParseQuery<T> include(String paramString)
  {
    checkIfRunning();
    this.builder.include(paramString);
    return this;
  }
  
  boolean isFromNetwork()
  {
    return this.builder.isFromNetwork();
  }
  
  public ParseQuery<T> orderByAscending(String paramString)
  {
    checkIfRunning();
    this.builder.orderByAscending(paramString);
    return this;
  }
  
  public ParseQuery<T> orderByDescending(String paramString)
  {
    checkIfRunning();
    this.builder.orderByDescending(paramString);
    return this;
  }
  
  public ParseQuery<T> selectKeys(Collection<String> paramCollection)
  {
    checkIfRunning();
    this.builder.selectKeys(paramCollection);
    return this;
  }
  
  public ParseQuery<T> setCachePolicy(ParseQuery.CachePolicy paramCachePolicy)
  {
    checkIfRunning();
    this.builder.setCachePolicy(paramCachePolicy);
    return this;
  }
  
  public ParseQuery<T> setLimit(int paramInt)
  {
    checkIfRunning();
    this.builder.setLimit(paramInt);
    return this;
  }
  
  public ParseQuery<T> setMaxCacheAge(long paramLong)
  {
    checkIfRunning();
    this.builder.setMaxCacheAge(paramLong);
    return this;
  }
  
  public ParseQuery<T> setSkip(int paramInt)
  {
    checkIfRunning();
    this.builder.setSkip(paramInt);
    return this;
  }
  
  public ParseQuery<T> setTrace(boolean paramBoolean)
  {
    checkIfRunning();
    this.builder.setTracingEnabled(paramBoolean);
    return this;
  }
  
  ParseQuery<T> setUser(ParseUser paramParseUser)
  {
    this.user = paramParseUser;
    return this;
  }
  
  public ParseQuery<T> whereContainedIn(String paramString, Collection<? extends Object> paramCollection)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$in", paramCollection);
    return this;
  }
  
  public ParseQuery<T> whereContains(String paramString1, String paramString2)
  {
    whereMatches(paramString1, Pattern.quote(paramString2));
    return this;
  }
  
  public ParseQuery<T> whereContainsAll(String paramString, Collection<?> paramCollection)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$all", paramCollection);
    return this;
  }
  
  public ParseQuery<T> whereDoesNotExist(String paramString)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$exists", Boolean.valueOf(false));
    return this;
  }
  
  public ParseQuery<T> whereDoesNotMatchKeyInQuery(String paramString1, String paramString2, ParseQuery<?> paramParseQuery)
  {
    checkIfRunning();
    this.builder.whereDoesNotMatchKeyInQuery(paramString1, paramString2, paramParseQuery.getBuilder());
    return this;
  }
  
  public ParseQuery<T> whereDoesNotMatchQuery(String paramString, ParseQuery<?> paramParseQuery)
  {
    checkIfRunning();
    this.builder.whereDoesNotMatchQuery(paramString, paramParseQuery.getBuilder());
    return this;
  }
  
  public ParseQuery<T> whereEndsWith(String paramString1, String paramString2)
  {
    whereMatches(paramString1, Pattern.quote(paramString2) + "$");
    return this;
  }
  
  public ParseQuery<T> whereEqualTo(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.whereEqualTo(paramString, paramObject);
    return this;
  }
  
  public ParseQuery<T> whereExists(String paramString)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$exists", Boolean.valueOf(true));
    return this;
  }
  
  public ParseQuery<T> whereGreaterThan(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$gt", paramObject);
    return this;
  }
  
  public ParseQuery<T> whereGreaterThanOrEqualTo(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$gte", paramObject);
    return this;
  }
  
  public ParseQuery<T> whereLessThan(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$lt", paramObject);
    return this;
  }
  
  public ParseQuery<T> whereLessThanOrEqualTo(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$lte", paramObject);
    return this;
  }
  
  public ParseQuery<T> whereMatches(String paramString1, String paramString2)
  {
    checkIfRunning();
    this.builder.addCondition(paramString1, "$regex", paramString2);
    return this;
  }
  
  public ParseQuery<T> whereMatches(String paramString1, String paramString2, String paramString3)
  {
    checkIfRunning();
    this.builder.addCondition(paramString1, "$regex", paramString2);
    if (paramString3.length() != 0) {
      this.builder.addCondition(paramString1, "$options", paramString3);
    }
    return this;
  }
  
  public ParseQuery<T> whereMatchesKeyInQuery(String paramString1, String paramString2, ParseQuery<?> paramParseQuery)
  {
    checkIfRunning();
    this.builder.whereMatchesKeyInQuery(paramString1, paramString2, paramParseQuery.getBuilder());
    return this;
  }
  
  public ParseQuery<T> whereMatchesQuery(String paramString, ParseQuery<?> paramParseQuery)
  {
    checkIfRunning();
    this.builder.whereMatchesQuery(paramString, paramParseQuery.getBuilder());
    return this;
  }
  
  public ParseQuery<T> whereNear(String paramString, ParseGeoPoint paramParseGeoPoint)
  {
    checkIfRunning();
    this.builder.whereNear(paramString, paramParseGeoPoint);
    return this;
  }
  
  public ParseQuery<T> whereNotContainedIn(String paramString, Collection<? extends Object> paramCollection)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$nin", paramCollection);
    return this;
  }
  
  public ParseQuery<T> whereNotEqualTo(String paramString, Object paramObject)
  {
    checkIfRunning();
    this.builder.addCondition(paramString, "$ne", paramObject);
    return this;
  }
  
  public ParseQuery<T> whereStartsWith(String paramString1, String paramString2)
  {
    whereMatches(paramString1, "^" + Pattern.quote(paramString2));
    return this;
  }
  
  public ParseQuery<T> whereWithinGeoBox(String paramString, ParseGeoPoint paramParseGeoPoint1, ParseGeoPoint paramParseGeoPoint2)
  {
    checkIfRunning();
    this.builder.whereWithin(paramString, paramParseGeoPoint1, paramParseGeoPoint2);
    return this;
  }
  
  public ParseQuery<T> whereWithinKilometers(String paramString, ParseGeoPoint paramParseGeoPoint, double paramDouble)
  {
    checkIfRunning();
    return whereWithinRadians(paramString, paramParseGeoPoint, paramDouble / ParseGeoPoint.EARTH_MEAN_RADIUS_KM);
  }
  
  public ParseQuery<T> whereWithinMiles(String paramString, ParseGeoPoint paramParseGeoPoint, double paramDouble)
  {
    checkIfRunning();
    return whereWithinRadians(paramString, paramParseGeoPoint, paramDouble / ParseGeoPoint.EARTH_MEAN_RADIUS_MILE);
  }
  
  public ParseQuery<T> whereWithinRadians(String paramString, ParseGeoPoint paramParseGeoPoint, double paramDouble)
  {
    checkIfRunning();
    this.builder.whereNear(paramString, paramParseGeoPoint).maxDistance(paramString, paramDouble);
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */