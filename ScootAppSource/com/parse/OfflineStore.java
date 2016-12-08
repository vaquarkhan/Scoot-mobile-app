package com.parse;

import a.ac;
import a.l;
import a.o;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import org.json.JSONObject;

class OfflineStore
{
  private static final int MAX_SQL_VARIABLES = 999;
  private final WeakValueHashMap<Pair<String, String>, ParseObject> classNameAndObjectIdToObjectMap = new WeakValueHashMap();
  private final WeakHashMap<ParseObject, o<ParseObject>> fetchedObjects = new WeakHashMap();
  private final OfflineSQLiteOpenHelper helper;
  private final Object lock = new Object();
  private final WeakHashMap<ParseObject, o<String>> objectToUuidMap = new WeakHashMap();
  private final WeakValueHashMap<String, ParseObject> uuidToObjectMap = new WeakValueHashMap();
  
  OfflineStore(Context paramContext)
  {
    this(new OfflineSQLiteOpenHelper(paramContext));
  }
  
  OfflineStore(OfflineSQLiteOpenHelper paramOfflineSQLiteOpenHelper)
  {
    this.helper = paramOfflineSQLiteOpenHelper;
  }
  
  private <T extends ParseObject> o<Integer> countFromPinAsync(String paramString, ParseQuery.State<T> paramState, ParseUser paramParseUser, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if (paramString != null) {}
    for (paramString = getParsePin(paramString, paramParseSQLiteDatabase);; paramString = o.a(null)) {
      return paramString.d(new OfflineStore.46(this, paramState, paramParseUser, paramParseSQLiteDatabase));
    }
  }
  
  private o<Void> deleteDataForObjectAsync(ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    l locall = new l();
    synchronized (this.lock)
    {
      o localo = (o)this.objectToUuidMap.get(paramParseObject);
      if (localo == null)
      {
        paramParseObject = o.a(null);
        return paramParseObject;
      }
      return localo.d(new OfflineStore.30(this, locall)).d(new OfflineStore.32(this, locall, paramParseSQLiteDatabase)).d(new OfflineStore.31(this, paramParseSQLiteDatabase, paramParseObject)).d(new OfflineStore.35(this, locall, paramParseSQLiteDatabase)).d(new OfflineStore.34(this, locall, paramParseSQLiteDatabase)).d(new OfflineStore.33(this, paramParseObject));
    }
  }
  
  private o<Void> deleteObjects(List<String> paramList, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    int i = 0;
    if (paramList.size() <= 0) {
      return o.a(null);
    }
    if (paramList.size() > 999) {
      return deleteObjects(paramList.subList(0, 999), paramParseSQLiteDatabase).d(new OfflineStore.25(this, paramList, paramParseSQLiteDatabase));
    }
    String[] arrayOfString = new String[paramList.size()];
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = "?";
      i += 1;
    }
    return paramParseSQLiteDatabase.deleteAsync("ParseObjects", "uuid IN (" + TextUtils.join(",", arrayOfString) + ")", (String[])paramList.toArray(new String[paramList.size()]));
  }
  
  private <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, ParsePin paramParsePin, boolean paramBoolean, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    OfflineQueryLogic localOfflineQueryLogic = new OfflineQueryLogic(this);
    ArrayList localArrayList = new ArrayList();
    String str;
    if (paramParsePin == null)
    {
      paramParsePin = "className=?" + " AND isDeletingEventually=0";
      str = paramState.className();
    }
    for (paramParsePin = paramParseSQLiteDatabase.queryAsync("ParseObjects", new String[] { "uuid" }, paramParsePin, new String[] { str });; paramParsePin = paramParsePin.d(new OfflineStore.4(this, paramState, paramParseSQLiteDatabase)))
    {
      return paramParsePin.d(new OfflineStore.6(this, localOfflineQueryLogic, paramState, paramParseUser, paramParseSQLiteDatabase, localArrayList)).d(new OfflineStore.5(this, localArrayList, paramState, paramBoolean, paramParseSQLiteDatabase));
      paramParsePin = (o)this.objectToUuidMap.get(paramParsePin);
      if (paramParsePin == null) {
        return o.a(localArrayList);
      }
    }
  }
  
  private <T extends ParseObject> o<List<T>> findFromPinAsync(String paramString, ParseQuery.State<T> paramState, ParseUser paramParseUser, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if (paramString != null) {}
    for (paramString = getParsePin(paramString, paramParseSQLiteDatabase);; paramString = o.a(null)) {
      return paramString.d(new OfflineStore.44(this, paramState, paramParseUser, paramParseSQLiteDatabase));
    }
  }
  
  private o<String> getOrCreateUUIDAsync(ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    String str = UUID.randomUUID().toString();
    ac localac = new ac();
    synchronized (this.lock)
    {
      o localo = (o)this.objectToUuidMap.get(paramParseObject);
      if (localo != null) {
        return localo;
      }
      this.objectToUuidMap.put(paramParseObject, localac.a());
      this.uuidToObjectMap.put(str, paramParseObject);
      this.fetchedObjects.put(paramParseObject, localac.a().c(new OfflineStore.1(this, paramParseObject)));
      ??? = new ContentValues();
      ((ContentValues)???).put("uuid", str);
      ((ContentValues)???).put("className", paramParseObject.getClassName());
      paramParseSQLiteDatabase.insertOrThrowAsync("ParseObjects", (ContentValues)???).a(new OfflineStore.2(this, localac, str));
      return localac.a();
    }
  }
  
  private o<ParsePin> getParsePin(String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return findAsync(new ParseQuery.State.Builder(ParsePin.class).whereEqualTo("_name", paramString).build(), null, null, paramParseSQLiteDatabase).c(new OfflineStore.36(this, paramString));
  }
  
  private <T extends ParseObject> o<T> getPointerAsync(String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    synchronized (this.lock)
    {
      ParseObject localParseObject = (ParseObject)this.uuidToObjectMap.get(paramString);
      if (localParseObject != null)
      {
        paramString = o.a(localParseObject);
        return paramString;
      }
      return paramParseSQLiteDatabase.queryAsync("ParseObjects", new String[] { "className", "objectId" }, "uuid = ?", new String[] { paramString }).c(new OfflineStore.3(this, paramString));
    }
  }
  
  private <T extends ParseObject> o<Void> pinAllObjectsAsync(String paramString, List<T> paramList, boolean paramBoolean, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return o.a(null);
    }
    return getParsePin(paramString, paramParseSQLiteDatabase).d(new OfflineStore.38(this, paramList, paramBoolean, paramParseSQLiteDatabase));
  }
  
  private <T> o<T> runWithManagedConnection(OfflineStore.SQLiteDatabaseCallable<o<T>> paramSQLiteDatabaseCallable)
  {
    return this.helper.getWritableDatabaseAsync().d(new OfflineStore.47(this, paramSQLiteDatabaseCallable));
  }
  
  private o<Void> runWithManagedTransaction(OfflineStore.SQLiteDatabaseCallable<o<Void>> paramSQLiteDatabaseCallable)
  {
    return this.helper.getWritableDatabaseAsync().d(new OfflineStore.48(this, paramSQLiteDatabaseCallable));
  }
  
  private o<Void> saveLocallyAsync(ParseObject paramParseObject, List<ParseObject> paramList, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if (paramList != null) {}
    ArrayList localArrayList;
    for (paramList = new ArrayList(paramList);; paramList = new ArrayList())
    {
      if (!paramList.contains(paramParseObject)) {
        paramList.add(paramParseObject);
      }
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(fetchLocallyAsync((ParseObject)localIterator.next(), paramParseSQLiteDatabase).k());
      }
    }
    return o.a(localArrayList).b(new OfflineStore.19(this, paramParseObject)).d(new OfflineStore.18(this, paramParseSQLiteDatabase)).d(new OfflineStore.17(this, paramParseObject, paramParseSQLiteDatabase)).d(new OfflineStore.16(this, paramList, paramParseSQLiteDatabase));
  }
  
  private o<Void> saveLocallyAsync(ParseObject paramParseObject, boolean paramBoolean, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    ArrayList localArrayList = new ArrayList();
    if (!paramBoolean) {
      localArrayList.add(paramParseObject);
    }
    for (;;)
    {
      return saveLocallyAsync(paramParseObject, localArrayList, paramParseSQLiteDatabase);
      new OfflineStore.15(this, localArrayList).setYieldRoot(true).setTraverseParseObjects(true).traverse(paramParseObject);
    }
  }
  
  private o<Void> saveLocallyAsync(String paramString, ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if ((paramParseObject.getObjectId() != null) && (!paramParseObject.isDataAvailable()) && (!paramParseObject.hasChanges()) && (!paramParseObject.hasOutstandingOperations())) {
      return o.a(null);
    }
    l locall = new l();
    return getOrCreateUUIDAsync(paramParseObject, paramParseSQLiteDatabase).d(new OfflineStore.14(this, locall, paramParseObject, paramParseSQLiteDatabase)).d(new OfflineStore.13(this, paramString, locall, paramParseSQLiteDatabase));
  }
  
  private o<Void> unpinAllObjectsAsync(String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return getParsePin(paramString, paramParseSQLiteDatabase).b(new OfflineStore.42(this, paramParseSQLiteDatabase));
  }
  
  private <T extends ParseObject> o<Void> unpinAllObjectsAsync(String paramString, List<T> paramList, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return o.a(null);
    }
    return getParsePin(paramString, paramParseSQLiteDatabase).d(new OfflineStore.40(this, paramList, paramParseSQLiteDatabase));
  }
  
  private o<Void> unpinAsync(ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    paramParseObject = (o)this.objectToUuidMap.get(paramParseObject);
    if (paramParseObject == null) {
      return o.a(null);
    }
    return paramParseObject.b(new OfflineStore.20(this, paramParseSQLiteDatabase));
  }
  
  private o<Void> unpinAsync(String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    LinkedList localLinkedList = new LinkedList();
    return o.a((Void)null).b(new OfflineStore.24(this, paramString, paramParseSQLiteDatabase)).d(new OfflineStore.23(this, localLinkedList, paramParseSQLiteDatabase)).d(new OfflineStore.22(this, paramString, paramParseSQLiteDatabase)).c(new OfflineStore.21(this, localLinkedList));
  }
  
  private o<Void> updateDataForObjectAsync(ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    synchronized (this.lock)
    {
      o localo = (o)this.objectToUuidMap.get(paramParseObject);
      if (localo == null)
      {
        paramParseObject = o.a(null);
        return paramParseObject;
      }
      return localo.d(new OfflineStore.27(this, paramParseObject, paramParseSQLiteDatabase));
    }
  }
  
  private o<Void> updateDataForObjectAsync(String paramString, ParseObject paramParseObject, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    OfflineStore.OfflineEncoder localOfflineEncoder = new OfflineStore.OfflineEncoder(this, paramParseSQLiteDatabase);
    JSONObject localJSONObject = paramParseObject.toRest(localOfflineEncoder);
    return localOfflineEncoder.whenFinished().d(new OfflineStore.28(this, paramParseObject, localJSONObject, paramString, paramParseSQLiteDatabase));
  }
  
  void clearDatabase(Context paramContext)
  {
    this.helper.clearDatabase(paramContext);
  }
  
  <T extends ParseObject> o<Integer> countFromPinAsync(String paramString, ParseQuery.State<T> paramState, ParseUser paramParseUser)
  {
    return runWithManagedConnection(new OfflineStore.45(this, paramString, paramState, paramParseUser));
  }
  
  o<Void> deleteDataForObjectAsync(ParseObject paramParseObject)
  {
    return this.helper.getWritableDatabaseAsync().b(new OfflineStore.29(this, paramParseObject));
  }
  
  <T extends ParseObject> o<T> fetchLocallyAsync(T paramT)
  {
    return runWithManagedConnection(new OfflineStore.12(this, paramT));
  }
  
  <T extends ParseObject> o<T> fetchLocallyAsync(T paramT, ParseSQLiteDatabase arg2)
  {
    ac localac = new ac();
    for (;;)
    {
      o localo;
      String str1;
      String str2;
      synchronized (this.lock)
      {
        if (this.fetchedObjects.containsKey(paramT))
        {
          paramT = (o)this.fetchedObjects.get(paramT);
          return paramT;
        }
        this.fetchedObjects.put(paramT, localac.a());
        localo = (o)this.objectToUuidMap.get(paramT);
        str1 = paramT.getClassName();
        str2 = paramT.getObjectId();
        ??? = o.a(null);
        if (str2 != null) {
          break label182;
        }
        if (localo == null) {
          return ((o)???).d(new OfflineStore.11(this, ???, paramT)).b(new OfflineStore.10(this, localac, paramT));
        }
      }
      ??? = new l();
      ??? = localo.d(new OfflineStore.8(this, (l)???, ???, new String[] { "json" })).c(new OfflineStore.7(this, (l)???));
      continue;
      label182:
      if (localo != null)
      {
        localac.b(new IllegalStateException("This object must have already been fetched from the local datastore, but isn't marked as fetched."));
        synchronized (this.lock)
        {
          this.fetchedObjects.remove(paramT);
          return localac.a();
        }
      }
      ??? = String.format("%s = ? AND %s = ?", new Object[] { "className", "objectId" });
      ??? = ???.queryAsync("ParseObjects", new String[] { "json", "uuid" }, (String)???, new String[] { str1, str2 }).c(new OfflineStore.9(this, paramT));
    }
  }
  
  <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, ParsePin paramParsePin, ParseSQLiteDatabase paramParseSQLiteDatabase)
  {
    return findAsync(paramState, paramParseUser, paramParsePin, false, paramParseSQLiteDatabase);
  }
  
  <T extends ParseObject> o<List<T>> findFromPinAsync(String paramString, ParseQuery.State<T> paramState, ParseUser paramParseUser)
  {
    return runWithManagedConnection(new OfflineStore.43(this, paramString, paramState, paramParseUser));
  }
  
  ParseObject getObject(String arg1, String paramString2)
  {
    if (paramString2 == null) {
      throw new IllegalStateException("objectId cannot be null.");
    }
    paramString2 = Pair.create(???, paramString2);
    synchronized (this.lock)
    {
      paramString2 = (ParseObject)this.classNameAndObjectIdToObjectMap.get(paramString2);
      return paramString2;
    }
  }
  
  <T extends ParseObject> o<Void> pinAllObjectsAsync(String paramString, List<T> paramList, boolean paramBoolean)
  {
    return runWithManagedTransaction(new OfflineStore.37(this, paramString, paramList, paramBoolean));
  }
  
  void registerNewObject(ParseObject paramParseObject)
  {
    synchronized (this.lock)
    {
      Object localObject2 = paramParseObject.getObjectId();
      if (localObject2 != null)
      {
        localObject2 = Pair.create(paramParseObject.getClassName(), localObject2);
        this.classNameAndObjectIdToObjectMap.put(localObject2, paramParseObject);
      }
      return;
    }
  }
  
  void simulateReboot()
  {
    synchronized (this.lock)
    {
      this.uuidToObjectMap.clear();
      this.objectToUuidMap.clear();
      this.classNameAndObjectIdToObjectMap.clear();
      this.fetchedObjects.clear();
      return;
    }
  }
  
  o<Void> unpinAllObjectsAsync(String paramString)
  {
    return runWithManagedTransaction(new OfflineStore.41(this, paramString));
  }
  
  <T extends ParseObject> o<Void> unpinAllObjectsAsync(String paramString, List<T> paramList)
  {
    return runWithManagedTransaction(new OfflineStore.39(this, paramString, paramList));
  }
  
  void unregisterObject(ParseObject paramParseObject)
  {
    synchronized (this.lock)
    {
      String str = paramParseObject.getObjectId();
      if (str != null) {
        this.classNameAndObjectIdToObjectMap.remove(Pair.create(paramParseObject.getClassName(), str));
      }
      return;
    }
  }
  
  o<Void> updateDataForObjectAsync(ParseObject paramParseObject)
  {
    synchronized (this.lock)
    {
      o localo = (o)this.fetchedObjects.get(paramParseObject);
      if (localo == null)
      {
        paramParseObject = o.a(new IllegalStateException("An object cannot be updated if it wasn't fetched."));
        return paramParseObject;
      }
      return localo.b(new OfflineStore.26(this, paramParseObject));
    }
  }
  
  void updateObjectId(ParseObject paramParseObject, String arg2, String paramString2)
  {
    if (??? != null)
    {
      if (???.equals(paramString2)) {
        return;
      }
      throw new RuntimeException("objectIds cannot be changed in offline mode.");
    }
    paramString2 = Pair.create(paramParseObject.getClassName(), paramString2);
    synchronized (this.lock)
    {
      ParseObject localParseObject = (ParseObject)this.classNameAndObjectIdToObjectMap.get(paramString2);
      if ((localParseObject != null) && (localParseObject != paramParseObject)) {
        throw new RuntimeException("Attempted to change an objectId to one that's already known to the Offline Store.");
      }
    }
    this.classNameAndObjectIdToObjectMap.put(paramString2, paramParseObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */