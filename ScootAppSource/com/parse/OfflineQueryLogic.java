package com.parse;

import a.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OfflineQueryLogic
{
  private final OfflineStore store;
  
  OfflineQueryLogic(OfflineStore paramOfflineStore)
  {
    this.store = paramOfflineStore;
  }
  
  private static boolean compare(Object paramObject1, Object paramObject2, OfflineQueryLogic.Decider paramDecider)
  {
    if ((paramObject2 instanceof List)) {
      return compareList(paramObject1, (List)paramObject2, paramDecider);
    }
    if ((paramObject2 instanceof JSONArray)) {
      return compareArray(paramObject1, (JSONArray)paramObject2, paramDecider);
    }
    return paramDecider.decide(paramObject1, paramObject2);
  }
  
  private static boolean compareArray(Object paramObject, JSONArray paramJSONArray, OfflineQueryLogic.Decider paramDecider)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < paramJSONArray.length()) {}
      try
      {
        bool1 = paramDecider.decide(paramObject, paramJSONArray.get(i));
        if (bool1)
        {
          bool1 = true;
          return bool1;
        }
      }
      catch (JSONException paramObject)
      {
        throw new RuntimeException((Throwable)paramObject);
      }
      i += 1;
    }
  }
  
  private static boolean compareList(Object paramObject, List<?> paramList, OfflineQueryLogic.Decider paramDecider)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (paramDecider.decide(paramObject, paramList.next())) {
        return true;
      }
    }
    return false;
  }
  
  private static int compareTo(Object paramObject1, Object paramObject2)
  {
    int i;
    int j;
    if ((paramObject1 == JSONObject.NULL) || (paramObject1 == null))
    {
      i = 1;
      if ((paramObject2 != JSONObject.NULL) && (paramObject2 != null)) {
        break label45;
      }
      j = 1;
    }
    for (;;)
    {
      if ((i != 0) || (j != 0))
      {
        if (i == 0)
        {
          return 1;
          i = 0;
          break;
          label45:
          j = 0;
          continue;
        }
        if (j == 0) {
          return -1;
        }
        return 0;
      }
    }
    if (((paramObject1 instanceof Date)) && ((paramObject2 instanceof Date))) {
      return ((Date)paramObject1).compareTo((Date)paramObject2);
    }
    if (((paramObject1 instanceof String)) && ((paramObject2 instanceof String))) {
      return ((String)paramObject1).compareTo((String)paramObject2);
    }
    if (((paramObject1 instanceof Number)) && ((paramObject2 instanceof Number))) {
      return Numbers.compare((Number)paramObject1, (Number)paramObject2);
    }
    throw new IllegalArgumentException(String.format("Cannot compare %s against %s", new Object[] { paramObject1, paramObject2 }));
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createDontSelectMatcher(ParseUser paramParseUser, Object paramObject, String paramString)
  {
    return new OfflineQueryLogic.9(this, paramParseUser, createSelectMatcher(paramParseUser, paramObject, paramString));
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createInQueryMatcher(ParseUser paramParseUser, Object paramObject, String paramString)
  {
    return new OfflineQueryLogic.6(this, paramParseUser, ((ParseQuery.State.Builder)paramObject).build(), paramString);
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createMatcher(ParseUser paramParseUser, ParseQuery.QueryConstraints paramQueryConstraints)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramQueryConstraints.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str1 = (String)localIterator1.next();
      Object localObject = paramQueryConstraints.get(str1);
      if (str1.equals("$or"))
      {
        localArrayList.add(createOrMatcher(paramParseUser, (ArrayList)localObject));
      }
      else if ((localObject instanceof ParseQuery.KeyConstraints))
      {
        localObject = (ParseQuery.KeyConstraints)localObject;
        Iterator localIterator2 = ((ParseQuery.KeyConstraints)localObject).keySet().iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          localArrayList.add(createMatcher(paramParseUser, str2, ((ParseQuery.KeyConstraints)localObject).get(str2), str1, (ParseQuery.KeyConstraints)localObject));
        }
      }
      else if ((localObject instanceof ParseQuery.RelationConstraint))
      {
        localArrayList.add(new OfflineQueryLogic.12(this, paramParseUser, (ParseQuery.RelationConstraint)localObject));
      }
      else
      {
        localArrayList.add(new OfflineQueryLogic.13(this, paramParseUser, str1, localObject));
      }
    }
    return new OfflineQueryLogic.14(this, paramParseUser, localArrayList);
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createMatcher(ParseUser paramParseUser, String paramString1, Object paramObject, String paramString2, ParseQuery.KeyConstraints paramKeyConstraints)
  {
    int i = -1;
    switch (paramString1.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return new OfflineQueryLogic.10(this, paramParseUser, paramString2, paramString1, paramObject, paramKeyConstraints);
        if (paramString1.equals("$inQuery"))
        {
          i = 0;
          continue;
          if (paramString1.equals("$notInQuery"))
          {
            i = 1;
            continue;
            if (paramString1.equals("$select"))
            {
              i = 2;
              continue;
              if (paramString1.equals("$dontSelect")) {
                i = 3;
              }
            }
          }
        }
        break;
      }
    }
    return createInQueryMatcher(paramParseUser, paramObject, paramString2);
    return createNotInQueryMatcher(paramParseUser, paramObject, paramString2);
    return createSelectMatcher(paramParseUser, paramObject, paramString2);
    return createDontSelectMatcher(paramParseUser, paramObject, paramString2);
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createNotInQueryMatcher(ParseUser paramParseUser, Object paramObject, String paramString)
  {
    return new OfflineQueryLogic.7(this, paramParseUser, createInQueryMatcher(paramParseUser, paramObject, paramString));
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createOrMatcher(ParseUser paramParseUser, ArrayList<ParseQuery.QueryConstraints> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      localArrayList.add(createMatcher(paramParseUser, (ParseQuery.QueryConstraints)paramArrayList.next()));
    }
    return new OfflineQueryLogic.11(this, paramParseUser, localArrayList);
  }
  
  private <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createSelectMatcher(ParseUser paramParseUser, Object paramObject, String paramString)
  {
    paramObject = (Map)paramObject;
    return new OfflineQueryLogic.8(this, paramParseUser, ((ParseQuery.State.Builder)((Map)paramObject).get("query")).build(), paramString, (String)((Map)paramObject).get("key"));
  }
  
  private static o<Void> fetchIncludeAsync(OfflineStore paramOfflineStore, Object paramObject, String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    int i = 0;
    if (paramObject == null)
    {
      localObject = o.a(null);
      return (o<Void>)localObject;
    }
    if ((paramObject instanceof Collection))
    {
      localObject = (Collection)paramObject;
      paramObject = o.a(null);
      Iterator localIterator = ((Collection)localObject).iterator();
      for (;;)
      {
        localObject = paramObject;
        if (!localIterator.hasNext()) {
          break;
        }
        paramObject = ((o)paramObject).d(new OfflineQueryLogic.17(paramOfflineStore, localIterator.next(), paramString, paramParseSQLiteDatabase));
      }
    }
    if ((paramObject instanceof JSONArray))
    {
      localObject = (JSONArray)paramObject;
      paramObject = o.a(null);
      while (i < ((JSONArray)localObject).length())
      {
        paramObject = ((o)paramObject).d(new OfflineQueryLogic.18(paramOfflineStore, (JSONArray)localObject, i, paramString, paramParseSQLiteDatabase));
        i += 1;
      }
      return (o<Void>)paramObject;
    }
    if (paramString == null)
    {
      if (JSONObject.NULL.equals(paramObject)) {
        return o.a(null);
      }
      if ((paramObject instanceof ParseObject)) {
        return paramOfflineStore.fetchLocallyAsync((ParseObject)paramObject, paramParseSQLiteDatabase).k();
      }
      return o.a(new ParseException(121, "include is invalid for non-ParseObjects"));
    }
    paramString = paramString.split("\\.", 2);
    Object localObject = paramString[0];
    if (paramString.length > 1) {}
    for (paramString = paramString[1];; paramString = null) {
      return o.a(null).b(new OfflineQueryLogic.20(paramObject, paramOfflineStore, paramParseSQLiteDatabase, (String)localObject)).d(new OfflineQueryLogic.19(paramOfflineStore, paramString, paramParseSQLiteDatabase));
    }
  }
  
  static <T extends ParseObject> o<Void> fetchIncludesAsync(OfflineStore paramOfflineStore, T paramT, ParseQuery.State<T> paramState, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    Object localObject = paramState.includes();
    paramState = o.a(null);
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramState = paramState.d(new OfflineQueryLogic.21(paramOfflineStore, paramT, (String)((Iterator)localObject).next(), paramParseSQLiteDatabase));
    }
    return paramState;
  }
  
  private static Object getValue(Object paramObject, String paramString)
  {
    return getValue(paramObject, paramString, 0);
  }
  
  private static Object getValue(Object paramObject, String paramString, int paramInt)
  {
    String[] arrayOfString = null;
    Object localObject = null;
    if (paramString.contains("."))
    {
      arrayOfString = paramString.split("\\.", 2);
      paramObject = getValue(paramObject, arrayOfString[0], paramInt + 1);
      if ((paramObject != null) && (paramObject != JSONObject.NULL) && (!(paramObject instanceof Map)) && (!(paramObject instanceof JSONObject)) && (paramInt <= 0)) {}
    }
    try
    {
      paramObject = PointerEncoder.get().encode(paramObject);
      if ((paramObject instanceof JSONObject)) {
        localObject = getValue(paramObject, arrayOfString[1], paramInt + 1);
      }
      do
      {
        do
        {
          return localObject;
          throw new ParseException(102, String.format("Key %s is invalid.", new Object[] { paramString }));
          return getValue(paramObject, arrayOfString[1], paramInt + 1);
          if ((paramObject instanceof ParseObject))
          {
            paramObject = (ParseObject)paramObject;
            if (!((ParseObject)paramObject).isDataAvailable()) {
              throw new ParseException(121, String.format("Bad key: %s", new Object[] { paramString }));
            }
            paramInt = -1;
            switch (paramString.hashCode())
            {
            }
            for (;;)
            {
              switch (paramInt)
              {
              default: 
                return ((ParseObject)paramObject).get(paramString);
                if (paramString.equals("objectId"))
                {
                  paramInt = 0;
                  continue;
                  if (paramString.equals("createdAt"))
                  {
                    paramInt = 1;
                    continue;
                    if (paramString.equals("_created_at"))
                    {
                      paramInt = 2;
                      continue;
                      if (paramString.equals("updatedAt"))
                      {
                        paramInt = 3;
                        continue;
                        if (paramString.equals("_updated_at")) {
                          paramInt = 4;
                        }
                      }
                    }
                  }
                }
                break;
              }
            }
            return ((ParseObject)paramObject).getObjectId();
            return ((ParseObject)paramObject).getCreatedAt();
            return ((ParseObject)paramObject).getUpdatedAt();
          }
          if ((paramObject instanceof JSONObject)) {
            return ((JSONObject)paramObject).opt(paramString);
          }
          if ((paramObject instanceof Map)) {
            return ((Map)paramObject).get(paramString);
          }
          localObject = arrayOfString;
        } while (paramObject == JSONObject.NULL);
        localObject = arrayOfString;
      } while (paramObject == null);
      throw new ParseException(121, String.format("Bad key: %s", new Object[] { paramString }));
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        paramObject = localObject;
      }
    }
  }
  
  static <T extends ParseObject> boolean hasReadAccess(ParseUser paramParseUser, T paramT)
  {
    if (paramParseUser == paramT) {}
    do
    {
      return true;
      paramT = paramT.getACL();
    } while ((paramT == null) || (paramT.getPublicReadAccess()) || ((paramParseUser != null) && (paramT.getReadAccess(paramParseUser))));
    return false;
  }
  
  static <T extends ParseObject> boolean hasWriteAccess(ParseUser paramParseUser, T paramT)
  {
    if (paramParseUser == paramT) {}
    do
    {
      return true;
      paramT = paramT.getACL();
    } while ((paramT == null) || (paramT.getPublicWriteAccess()) || ((paramParseUser != null) && (paramT.getWriteAccess(paramParseUser))));
    return false;
  }
  
  private static boolean matchesAllConstraint(Object paramObject1, Object paramObject2)
  {
    if ((paramObject2 == null) || (paramObject2 == JSONObject.NULL)) {
      return false;
    }
    if (!(paramObject2 instanceof Collection)) {
      throw new IllegalArgumentException("Value type not supported for $all queries.");
    }
    if ((paramObject1 instanceof Collection))
    {
      paramObject1 = ((Collection)paramObject1).iterator();
      while (((Iterator)paramObject1).hasNext()) {
        if (!matchesEqualConstraint(((Iterator)paramObject1).next(), paramObject2)) {
          return false;
        }
      }
      return true;
    }
    throw new IllegalArgumentException("Constraint type not supported for $all queries.");
  }
  
  private static boolean matchesEqualConstraint(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      if (paramObject1 != paramObject2) {}
    }
    do
    {
      do
      {
        return true;
        return false;
        if ((!(paramObject1 instanceof Number)) || (!(paramObject2 instanceof Number))) {
          break;
        }
      } while (compareTo(paramObject1, paramObject2) == 0);
      return false;
      if ((!(paramObject1 instanceof ParseGeoPoint)) || (!(paramObject2 instanceof ParseGeoPoint))) {
        break;
      }
      paramObject1 = (ParseGeoPoint)paramObject1;
      paramObject2 = (ParseGeoPoint)paramObject2;
    } while ((((ParseGeoPoint)paramObject1).getLatitude() == ((ParseGeoPoint)paramObject2).getLatitude()) && (((ParseGeoPoint)paramObject1).getLongitude() == ((ParseGeoPoint)paramObject2).getLongitude()));
    return false;
    return compare(paramObject1, paramObject2, new OfflineQueryLogic.1());
  }
  
  private static boolean matchesExistsConstraint(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if ((paramObject1 != null) && (((Boolean)paramObject1).booleanValue())) {
      return (paramObject2 != null) && (paramObject2 != JSONObject.NULL);
    }
    if ((paramObject2 == null) || (paramObject2 == JSONObject.NULL)) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean matchesGreaterThanConstraint(Object paramObject1, Object paramObject2)
  {
    return compare(paramObject1, paramObject2, new OfflineQueryLogic.4());
  }
  
  private static boolean matchesGreaterThanOrEqualToConstraint(Object paramObject1, Object paramObject2)
  {
    return compare(paramObject1, paramObject2, new OfflineQueryLogic.5());
  }
  
  private static boolean matchesInConstraint(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof Collection))
    {
      paramObject1 = ((Collection)paramObject1).iterator();
      while (((Iterator)paramObject1).hasNext()) {
        if (matchesEqualConstraint(((Iterator)paramObject1).next(), paramObject2)) {
          return true;
        }
      }
      return false;
    }
    throw new IllegalArgumentException("Constraint type not supported for $in queries.");
  }
  
  private static boolean matchesLessThanConstraint(Object paramObject1, Object paramObject2)
  {
    return compare(paramObject1, paramObject2, new OfflineQueryLogic.2());
  }
  
  private static boolean matchesLessThanOrEqualToConstraint(Object paramObject1, Object paramObject2)
  {
    return compare(paramObject1, paramObject2, new OfflineQueryLogic.3());
  }
  
  private static boolean matchesNearSphereConstraint(Object paramObject1, Object paramObject2, Double paramDouble)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramObject2 == null) || (paramObject2 == JSONObject.NULL)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramDouble == null);
      bool1 = bool2;
    } while (((ParseGeoPoint)paramObject1).distanceInRadiansTo((ParseGeoPoint)paramObject2) <= paramDouble.doubleValue());
    return false;
  }
  
  private static boolean matchesNotEqualConstraint(Object paramObject1, Object paramObject2)
  {
    return !matchesEqualConstraint(paramObject1, paramObject2);
  }
  
  private static boolean matchesNotInConstraint(Object paramObject1, Object paramObject2)
  {
    return !matchesInConstraint(paramObject1, paramObject2);
  }
  
  private static boolean matchesRegexConstraint(Object paramObject1, Object paramObject2, String paramString)
  {
    int j = 0;
    if ((paramObject2 == null) || (paramObject2 == JSONObject.NULL)) {
      return false;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (!str.matches("^[imxs]*$")) {
      throw new ParseException(102, String.format("Invalid regex options: %s", new Object[] { str }));
    }
    if (str.contains("i")) {
      j = 2;
    }
    int i = j;
    if (str.contains("m")) {
      i = j | 0x8;
    }
    j = i;
    if (str.contains("x")) {
      j = i | 0x4;
    }
    i = j;
    if (str.contains("s")) {
      i = j | 0x20;
    }
    return Pattern.compile((String)paramObject1, i).matcher((String)paramObject2).find();
  }
  
  private static boolean matchesStatelessConstraint(String paramString, Object paramObject1, Object paramObject2, ParseQuery.KeyConstraints paramKeyConstraints)
  {
    boolean bool = true;
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        throw new UnsupportedOperationException(String.format("The offline store does not yet support the %s operator.", new Object[] { paramString }));
        if (paramString.equals("$ne"))
        {
          i = 0;
          continue;
          if (paramString.equals("$lt"))
          {
            i = 1;
            continue;
            if (paramString.equals("$lte"))
            {
              i = 2;
              continue;
              if (paramString.equals("$gt"))
              {
                i = 3;
                continue;
                if (paramString.equals("$gte"))
                {
                  i = 4;
                  continue;
                  if (paramString.equals("$in"))
                  {
                    i = 5;
                    continue;
                    if (paramString.equals("$nin"))
                    {
                      i = 6;
                      continue;
                      if (paramString.equals("$all"))
                      {
                        i = 7;
                        continue;
                        if (paramString.equals("$regex"))
                        {
                          i = 8;
                          continue;
                          if (paramString.equals("$options"))
                          {
                            i = 9;
                            continue;
                            if (paramString.equals("$exists"))
                            {
                              i = 10;
                              continue;
                              if (paramString.equals("$nearSphere"))
                              {
                                i = 11;
                                continue;
                                if (paramString.equals("$maxDistance"))
                                {
                                  i = 12;
                                  continue;
                                  if (paramString.equals("$within")) {
                                    i = 13;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      }
    }
    bool = matchesNotEqualConstraint(paramObject1, paramObject2);
    return bool;
    return matchesLessThanConstraint(paramObject1, paramObject2);
    return matchesLessThanOrEqualToConstraint(paramObject1, paramObject2);
    return matchesGreaterThanConstraint(paramObject1, paramObject2);
    return matchesGreaterThanOrEqualToConstraint(paramObject1, paramObject2);
    return matchesInConstraint(paramObject1, paramObject2);
    return matchesNotInConstraint(paramObject1, paramObject2);
    return matchesAllConstraint(paramObject1, paramObject2);
    return matchesRegexConstraint(paramObject1, paramObject2, (String)paramKeyConstraints.get("$options"));
    return matchesExistsConstraint(paramObject1, paramObject2);
    return matchesNearSphereConstraint(paramObject1, paramObject2, (Double)paramKeyConstraints.get("$maxDistance"));
    return matchesWithinConstraint(paramObject1, paramObject2);
  }
  
  private static boolean matchesWithinConstraint(Object paramObject1, Object paramObject2)
  {
    if ((paramObject2 == null) || (paramObject2 == JSONObject.NULL)) {
      return false;
    }
    Object localObject = (ArrayList)((HashMap)paramObject1).get("$box");
    paramObject1 = (ParseGeoPoint)((ArrayList)localObject).get(0);
    localObject = (ParseGeoPoint)((ArrayList)localObject).get(1);
    paramObject2 = (ParseGeoPoint)paramObject2;
    if (((ParseGeoPoint)localObject).getLongitude() < ((ParseGeoPoint)paramObject1).getLongitude()) {
      throw new ParseException(102, "whereWithinGeoBox queries cannot cross the International Date Line.");
    }
    if (((ParseGeoPoint)localObject).getLatitude() < ((ParseGeoPoint)paramObject1).getLatitude()) {
      throw new ParseException(102, "The southwest corner of a geo box must be south of the northeast corner.");
    }
    if (((ParseGeoPoint)localObject).getLongitude() - ((ParseGeoPoint)paramObject1).getLongitude() > 180.0D) {
      throw new ParseException(102, "Geo box queries larger than 180 degrees in longitude are not supported. Please check point order.");
    }
    return (((ParseGeoPoint)paramObject2).getLatitude() >= ((ParseGeoPoint)paramObject1).getLatitude()) && (((ParseGeoPoint)paramObject2).getLatitude() <= ((ParseGeoPoint)localObject).getLatitude()) && (((ParseGeoPoint)paramObject2).getLongitude() >= ((ParseGeoPoint)paramObject1).getLongitude()) && (((ParseGeoPoint)paramObject2).getLongitude() <= ((ParseGeoPoint)localObject).getLongitude());
  }
  
  static <T extends ParseObject> void sort(List<T> paramList, ParseQuery.State<T> paramState)
  {
    ParseGeoPoint localParseGeoPoint = null;
    List localList = paramState.order();
    Object localObject1 = paramState.order().iterator();
    String str;
    while (((Iterator)localObject1).hasNext())
    {
      str = (String)((Iterator)localObject1).next();
      if ((!str.matches("^-?[A-Za-z][A-Za-z0-9_]*$")) && (!"_created_at".equals(str)) && (!"_updated_at".equals(str))) {
        throw new ParseException(105, String.format("Invalid key name: \"%s\".", new Object[] { str }));
      }
    }
    Iterator localIterator = paramState.constraints().keySet().iterator();
    localObject1 = null;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      Object localObject2 = paramState.constraints().get(str);
      if (!(localObject2 instanceof ParseQuery.KeyConstraints)) {
        break label220;
      }
      localObject2 = (ParseQuery.KeyConstraints)localObject2;
      if (!((ParseQuery.KeyConstraints)localObject2).containsKey("$nearSphere")) {
        break label220;
      }
      localParseGeoPoint = (ParseGeoPoint)((ParseQuery.KeyConstraints)localObject2).get("$nearSphere");
      localObject1 = str;
    }
    label220:
    for (;;)
    {
      break;
      if ((localList.size() == 0) && (localObject1 == null)) {
        return;
      }
      Collections.sort(paramList, new OfflineQueryLogic.16((String)localObject1, localParseGeoPoint, localList));
      return;
    }
  }
  
  <T extends ParseObject> OfflineQueryLogic.ConstraintMatcher<T> createMatcher(ParseQuery.State<T> paramState, ParseUser paramParseUser)
  {
    return new OfflineQueryLogic.15(this, paramParseUser, paramState.ignoreACLs(), createMatcher(paramParseUser, paramState.constraints()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */