package com.parse;

import a.l;
import a.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseObject
{
  private static final String AUTO_CLASS_NAME = "_Automatic";
  public static final String DEFAULT_PIN = "_default";
  private static final String KEY_ACL = "ACL";
  private static final String KEY_CLASS_NAME = "className";
  private static final String KEY_COMPLETE = "__complete";
  private static final String KEY_CREATED_AT = "createdAt";
  static final String KEY_IS_DELETING_EVENTUALLY = "__isDeletingEventually";
  private static final String KEY_IS_DELETING_EVENTUALLY_OLD = "isDeletingEventually";
  private static final String KEY_OBJECT_ID = "objectId";
  private static final String KEY_OPERATIONS = "__operations";
  private static final String KEY_UPDATED_AT = "updatedAt";
  private static final String NEW_OFFLINE_OBJECT_ID_PLACEHOLDER = "*** Offline Object ***";
  static final String VERSION_NAME = "1.13.1";
  private static final ThreadLocal<String> isCreatingPointerForObjectId = new ParseObject.1();
  private final Map<String, Object> estimatedData;
  boolean isDeleted;
  int isDeletingEventually;
  private String localId;
  final Object mutex = new Object();
  final LinkedList<ParseOperationSet> operationSetQueue;
  private final ParseMulticastDelegate<ParseObject> saveEvent = new ParseMulticastDelegate();
  private ParseObject.State state;
  final TaskQueue taskQueue = new TaskQueue();
  
  protected ParseObject()
  {
    this("_Automatic");
  }
  
  public ParseObject(String paramString)
  {
    String str2 = (String)isCreatingPointerForObjectId.get();
    if (paramString == null) {
      throw new IllegalArgumentException("You must specify a Parse class name when creating a new ParseObject.");
    }
    String str1 = paramString;
    if ("_Automatic".equals(paramString)) {
      str1 = getSubclassingController().getClassName(getClass());
    }
    if (!getSubclassingController().isSubclassValid(str1, getClass())) {
      throw new IllegalArgumentException("You must create this type of ParseObject using ParseObject.create() or the proper subclass.");
    }
    this.operationSetQueue = new LinkedList();
    this.operationSetQueue.add(new ParseOperationSet());
    this.estimatedData = new HashMap();
    paramString = newStateBuilder(str1);
    if (str2 == null)
    {
      setDefaultValues();
      paramString.isComplete(true);
    }
    for (;;)
    {
      this.state = paramString.build();
      paramString = Parse.getLocalDatastore();
      if (paramString != null) {
        paramString.registerNewObject(this);
      }
      return;
      if (!str2.equals("*** Offline Object ***")) {
        paramString.objectId(str2);
      }
      paramString.isComplete(false);
    }
  }
  
  private void applyOperations(ParseOperationSet paramParseOperationSet, Map<String, Object> paramMap)
  {
    Iterator localIterator = paramParseOperationSet.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = ((ParseFieldOperation)paramParseOperationSet.get(str)).apply(paramMap.get(str), str);
      if (localObject != null) {
        paramMap.put(str, localObject);
      } else {
        paramMap.remove(str);
      }
    }
  }
  
  private boolean canBeSerialized()
  {
    synchronized (this.mutex)
    {
      l locall = new l(Boolean.valueOf(true));
      new ParseObject.37(this, locall).setYieldRoot(false).setTraverseParseObjects(true).traverse(this);
      boolean bool = ((Boolean)locall.a()).booleanValue();
      return bool;
    }
  }
  
  private void checkGetAccess(String paramString)
  {
    if (!isDataAvailable(paramString)) {
      throw new IllegalStateException("ParseObject has no data for '" + paramString + "'. Call fetchIfNeeded() to get the data.");
    }
  }
  
  private void checkKeyIsMutable(String paramString)
  {
    if (!isKeyMutable(paramString)) {
      throw new IllegalArgumentException("Cannot modify `" + paramString + "` property of an " + getClassName() + " object.");
    }
  }
  
  private static void collectDirtyChildren(Object paramObject, Collection<ParseObject> paramCollection, Collection<ParseFile> paramCollection1)
  {
    collectDirtyChildren(paramObject, paramCollection, paramCollection1, new HashSet(), new HashSet());
  }
  
  private static void collectDirtyChildren(Object paramObject, Collection<ParseObject> paramCollection, Collection<ParseFile> paramCollection1, Set<ParseObject> paramSet1, Set<ParseObject> paramSet2)
  {
    new ParseObject.36(paramCollection1, paramCollection, paramSet1, paramSet2).setYieldRoot(true).traverse(paramObject);
  }
  
  private Map<String, ParseObject> collectFetchedObjects()
  {
    HashMap localHashMap = new HashMap();
    new ParseObject.4(this, localHashMap).traverse(this.estimatedData);
    return localHashMap;
  }
  
  public static <T extends ParseObject> T create(Class<T> paramClass)
  {
    return create(getSubclassingController().getClassName(paramClass));
  }
  
  public static ParseObject create(String paramString)
  {
    return getSubclassingController().newInstance(paramString);
  }
  
  public static <T extends ParseObject> T createWithoutData(Class<T> paramClass, String paramString)
  {
    return createWithoutData(getSubclassingController().getClassName(paramClass), paramString);
  }
  
  /* Error */
  public static ParseObject createWithoutData(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 170	com/parse/Parse:getLocalDatastore	()Lcom/parse/OfflineStore;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull +70 -> 75
    //   8: getstatic 75	com/parse/ParseObject:isCreatingPointerForObjectId	Ljava/lang/ThreadLocal;
    //   11: ldc 41
    //   13: invokevirtual 390	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   16: aload_2
    //   17: ifnull +90 -> 107
    //   20: aload_1
    //   21: ifnull +86 -> 107
    //   24: aload_2
    //   25: aload_0
    //   26: aload_1
    //   27: invokevirtual 393	com/parse/OfflineStore:getObject	(Ljava/lang/String;Ljava/lang/String;)Lcom/parse/ParseObject;
    //   30: astore_1
    //   31: aload_1
    //   32: astore_2
    //   33: aload_1
    //   34: ifnonnull +64 -> 98
    //   37: aload_0
    //   38: invokestatic 373	com/parse/ParseObject:create	(Ljava/lang/String;)Lcom/parse/ParseObject;
    //   41: astore_0
    //   42: aload_0
    //   43: astore_2
    //   44: aload_0
    //   45: invokevirtual 396	com/parse/ParseObject:hasChanges	()Z
    //   48: ifeq +50 -> 98
    //   51: new 322	java/lang/IllegalStateException
    //   54: dup
    //   55: ldc_w 398
    //   58: invokespecial 338	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   61: athrow
    //   62: astore_0
    //   63: aload_0
    //   64: athrow
    //   65: astore_0
    //   66: getstatic 75	com/parse/ParseObject:isCreatingPointerForObjectId	Ljava/lang/ThreadLocal;
    //   69: aconst_null
    //   70: invokevirtual 390	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   73: aload_0
    //   74: athrow
    //   75: getstatic 75	com/parse/ParseObject:isCreatingPointerForObjectId	Ljava/lang/ThreadLocal;
    //   78: aload_1
    //   79: invokevirtual 390	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   82: goto -66 -> 16
    //   85: astore_0
    //   86: new 385	java/lang/RuntimeException
    //   89: dup
    //   90: ldc_w 400
    //   93: aload_0
    //   94: invokespecial 403	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   97: athrow
    //   98: getstatic 75	com/parse/ParseObject:isCreatingPointerForObjectId	Ljava/lang/ThreadLocal;
    //   101: aconst_null
    //   102: invokevirtual 390	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   105: aload_2
    //   106: areturn
    //   107: aconst_null
    //   108: astore_1
    //   109: goto -78 -> 31
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramString1	String
    //   0	112	1	paramString2	String
    //   3	103	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	16	62	java/lang/RuntimeException
    //   24	31	62	java/lang/RuntimeException
    //   37	42	62	java/lang/RuntimeException
    //   44	62	62	java/lang/RuntimeException
    //   75	82	62	java/lang/RuntimeException
    //   8	16	65	finally
    //   24	31	65	finally
    //   37	42	65	finally
    //   44	62	65	finally
    //   63	65	65	finally
    //   75	82	65	finally
    //   86	98	65	finally
    //   8	16	85	java/lang/Exception
    //   24	31	85	java/lang/Exception
    //   37	42	85	java/lang/Exception
    //   44	62	85	java/lang/Exception
    //   75	82	85	java/lang/Exception
  }
  
  private ParseOperationSet currentOperations()
  {
    synchronized (this.mutex)
    {
      ParseOperationSet localParseOperationSet = (ParseOperationSet)this.operationSetQueue.getLast();
      return localParseOperationSet;
    }
  }
  
  private ParseRESTObjectCommand currentSaveEventuallyCommand(ParseOperationSet paramParseOperationSet, ParseEncoder paramParseEncoder, String paramString)
  {
    ParseObject.State localState = getState();
    paramParseOperationSet = ParseRESTObjectCommand.saveObjectCommand(localState, toJSONObjectForSaving(localState, paramParseOperationSet, paramParseEncoder), paramString);
    paramParseOperationSet.enableRetrying();
    return paramParseOperationSet;
  }
  
  private static o<Void> deepSaveAsync(Object paramObject, String paramString)
  {
    Object localObject1 = new HashSet();
    Object localObject3 = new HashSet();
    collectDirtyChildren(paramObject, (Collection)localObject1, (Collection)localObject3);
    Object localObject2 = new HashSet();
    paramObject = ((Set)localObject1).iterator();
    while (((Iterator)paramObject).hasNext())
    {
      localObject4 = (ParseObject)((Iterator)paramObject).next();
      if (((localObject4 instanceof ParseUser)) && (((ParseUser)localObject4).isLazy())) {
        ((Set)localObject2).add((ParseUser)localObject4);
      }
    }
    ((Set)localObject1).removeAll((Collection)localObject2);
    paramObject = new AtomicBoolean(false);
    Object localObject4 = new ArrayList();
    localObject3 = ((Set)localObject3).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((List)localObject4).add(((ParseFile)((Iterator)localObject3).next()).saveAsync(paramString, null, null));
    }
    localObject3 = o.a((Collection)localObject4).a(new ParseObject.38((AtomicBoolean)paramObject));
    localObject4 = new AtomicBoolean(false);
    ArrayList localArrayList = new ArrayList();
    localObject2 = ((Set)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      localArrayList.add(((ParseUser)((Iterator)localObject2).next()).saveAsync(paramString));
    }
    localObject2 = o.a(localArrayList).a(new ParseObject.39((AtomicBoolean)localObject4));
    localObject1 = new l(localObject1);
    return o.a(Arrays.asList(new o[] { localObject3, localObject2, o.a(null).a(new ParseObject.40((l)localObject1), new ParseObject.41((l)localObject1, (AtomicBoolean)paramObject, (AtomicBoolean)localObject4, paramString)) }));
  }
  
  public static <T extends ParseObject> void deleteAll(List<T> paramList)
  {
    ParseTaskUtils.wait(deleteAllInBackground(paramList));
  }
  
  private static <T extends ParseObject> o<Void> deleteAllAsync(List<T> paramList, String paramString)
  {
    if (paramList.size() == 0) {
      return o.a(null);
    }
    int j = paramList.size();
    ArrayList localArrayList = new ArrayList(j);
    HashSet localHashSet = new HashSet();
    int i = 0;
    while (i < j)
    {
      ParseObject localParseObject = (ParseObject)paramList.get(i);
      if (!localHashSet.contains(localParseObject.getObjectId()))
      {
        localHashSet.add(localParseObject.getObjectId());
        localArrayList.add(localParseObject);
      }
      i += 1;
    }
    return enqueueForAll(localArrayList, new ParseObject.33(localArrayList, paramString));
  }
  
  private static <T extends ParseObject> o<Void> deleteAllAsync(List<T> paramList, String paramString, o<Void> paramo)
  {
    return paramo.b(new ParseObject.34(paramList, paramString));
  }
  
  public static <T extends ParseObject> o<Void> deleteAllInBackground(List<T> paramList)
  {
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseObject.35(paramList));
  }
  
  public static <T extends ParseObject> void deleteAllInBackground(List<T> paramList, DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(deleteAllInBackground(paramList), paramDeleteCallback);
  }
  
  private o<Void> deleteAsync(String paramString, o<Void> paramo)
  {
    validateDelete();
    return paramo.d(new ParseObject.30(this, paramString)).d(new ParseObject.29(this));
  }
  
  /* Error */
  static <T> o<T> enqueueForAll(List<? extends ParseObject> paramList, a.m<Void, o<T>> paramm)
  {
    // Byte code:
    //   0: new 577	a/ac
    //   3: dup
    //   4: invokespecial 578	a/ac:<init>	()V
    //   7: astore_3
    //   8: new 445	java/util/ArrayList
    //   11: dup
    //   12: aload_0
    //   13: invokeinterface 514 1 0
    //   18: invokespecial 517	java/util/ArrayList:<init>	(I)V
    //   21: astore_2
    //   22: aload_0
    //   23: invokeinterface 579 1 0
    //   28: astore 4
    //   30: aload 4
    //   32: invokeinterface 257 1 0
    //   37: ifeq +29 -> 66
    //   40: aload_2
    //   41: aload 4
    //   43: invokeinterface 260 1 0
    //   48: checkcast 2	com/parse/ParseObject
    //   51: getfield 87	com/parse/ParseObject:taskQueue	Lcom/parse/TaskQueue;
    //   54: invokevirtual 583	com/parse/TaskQueue:getLock	()Ljava/util/concurrent/locks/Lock;
    //   57: invokeinterface 455 2 0
    //   62: pop
    //   63: goto -33 -> 30
    //   66: new 585	com/parse/LockSet
    //   69: dup
    //   70: aload_2
    //   71: invokespecial 588	com/parse/LockSet:<init>	(Ljava/util/Collection;)V
    //   74: astore_2
    //   75: aload_2
    //   76: invokevirtual 591	com/parse/LockSet:lock	()V
    //   79: aload_1
    //   80: aload_3
    //   81: invokevirtual 593	a/ac:a	()La/o;
    //   84: invokeinterface 598 2 0
    //   89: checkcast 457	a/o
    //   92: astore_1
    //   93: new 445	java/util/ArrayList
    //   96: dup
    //   97: invokespecial 446	java/util/ArrayList:<init>	()V
    //   100: astore 4
    //   102: aload_0
    //   103: invokeinterface 579 1 0
    //   108: astore_0
    //   109: aload_0
    //   110: invokeinterface 257 1 0
    //   115: ifeq +52 -> 167
    //   118: aload_0
    //   119: invokeinterface 260 1 0
    //   124: checkcast 2	com/parse/ParseObject
    //   127: getfield 87	com/parse/ParseObject:taskQueue	Lcom/parse/TaskQueue;
    //   130: new 600	com/parse/ParseObject$2
    //   133: dup
    //   134: aload 4
    //   136: aload_1
    //   137: invokespecial 603	com/parse/ParseObject$2:<init>	(Ljava/util/List;La/o;)V
    //   140: invokevirtual 606	com/parse/TaskQueue:enqueue	(La/m;)La/o;
    //   143: pop
    //   144: goto -35 -> 109
    //   147: astore_0
    //   148: aload_2
    //   149: invokevirtual 609	com/parse/LockSet:unlock	()V
    //   152: aload_0
    //   153: athrow
    //   154: astore_0
    //   155: aload_0
    //   156: athrow
    //   157: astore_0
    //   158: new 385	java/lang/RuntimeException
    //   161: dup
    //   162: aload_0
    //   163: invokespecial 612	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   166: athrow
    //   167: aload 4
    //   169: invokestatic 460	a/o:a	(Ljava/util/Collection;)La/o;
    //   172: new 614	com/parse/ParseObject$3
    //   175: dup
    //   176: aload_3
    //   177: invokespecial 617	com/parse/ParseObject$3:<init>	(La/ac;)V
    //   180: invokevirtual 468	a/o:a	(La/m;)La/o;
    //   183: pop
    //   184: aload_2
    //   185: invokevirtual 609	com/parse/LockSet:unlock	()V
    //   188: aload_1
    //   189: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	paramList	List<? extends ParseObject>
    //   0	190	1	paramm	a.m<Void, o<T>>
    //   21	164	2	localObject1	Object
    //   7	170	3	localac	a.ac
    //   28	140	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   79	93	147	finally
    //   93	109	147	finally
    //   109	144	147	finally
    //   155	157	147	finally
    //   158	167	147	finally
    //   167	184	147	finally
    //   79	93	154	java/lang/RuntimeException
    //   79	93	157	java/lang/Exception
  }
  
  private o<Void> enqueueSaveEventuallyOperationAsync(ParseOperationSet paramParseOperationSet)
  {
    if (!paramParseOperationSet.isSaveEventually()) {
      throw new IllegalStateException("This should only be used to enqueue saveEventually operation sets");
    }
    return this.taskQueue.enqueue(new ParseObject.15(this, paramParseOperationSet));
  }
  
  public static <T extends ParseObject> List<T> fetchAll(List<T> paramList)
  {
    return (List)ParseTaskUtils.wait(fetchAllInBackground(paramList));
  }
  
  private static <T extends ParseObject> o<List<T>> fetchAllAsync(List<T> paramList, ParseUser paramParseUser, boolean paramBoolean, o<Void> paramo)
  {
    if (paramList.size() == 0) {
      return o.a(paramList);
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      ParseObject localParseObject = (ParseObject)localIterator.next();
      if ((!paramBoolean) || (!localParseObject.isDataAvailable()))
      {
        if ((localObject != null) && (!localParseObject.getClassName().equals(localObject))) {
          throw new IllegalArgumentException("All objects should have the same class");
        }
        localObject = localParseObject.getClassName();
        if (localParseObject.getObjectId() != null) {
          localArrayList.add(localParseObject.getObjectId());
        } else if (!paramBoolean) {
          throw new IllegalArgumentException("All objects must exist on the server");
        }
      }
    }
    if (localArrayList.size() == 0) {
      return o.a(paramList);
    }
    return paramo.b(new ParseObject.47(ParseQuery.getQuery((String)localObject).whereContainedIn("objectId", localArrayList), paramParseUser)).c(new ParseObject.46(paramList, paramBoolean));
  }
  
  private static <T extends ParseObject> o<List<T>> fetchAllAsync(List<T> paramList, boolean paramBoolean)
  {
    return ParseUser.getCurrentUserAsync().d(new ParseObject.45(paramList, paramBoolean));
  }
  
  public static <T extends ParseObject> List<T> fetchAllIfNeeded(List<T> paramList)
  {
    return (List)ParseTaskUtils.wait(fetchAllIfNeededInBackground(paramList));
  }
  
  public static <T extends ParseObject> o<List<T>> fetchAllIfNeededInBackground(List<T> paramList)
  {
    return fetchAllAsync(paramList, true);
  }
  
  public static <T extends ParseObject> void fetchAllIfNeededInBackground(List<T> paramList, FindCallback<T> paramFindCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchAllIfNeededInBackground(paramList), paramFindCallback);
  }
  
  public static <T extends ParseObject> o<List<T>> fetchAllInBackground(List<T> paramList)
  {
    return fetchAllAsync(paramList, false);
  }
  
  public static <T extends ParseObject> void fetchAllInBackground(List<T> paramList, FindCallback<T> paramFindCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchAllInBackground(paramList), paramFindCallback);
  }
  
  static <T extends ParseObject> T from(ParseObject.State paramState)
  {
    ParseObject localParseObject = createWithoutData(paramState.className(), paramState.objectId());
    synchronized (localParseObject.mutex)
    {
      if (paramState.isComplete())
      {
        localParseObject.setState(paramState);
        return localParseObject;
      }
      paramState = localParseObject.getState().newBuilder().apply(paramState).build();
    }
  }
  
  static <T extends ParseObject> T fromJSON(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    return fromJSON(paramJSONObject, paramString, paramBoolean, ParseDecoder.get());
  }
  
  static <T extends ParseObject> T fromJSON(JSONObject paramJSONObject, String paramString, boolean paramBoolean, ParseDecoder paramParseDecoder)
  {
    paramString = paramJSONObject.optString("className", paramString);
    if (paramString == null) {
      return null;
    }
    paramString = createWithoutData(paramString, paramJSONObject.optString("objectId", null));
    paramString.setState(paramString.mergeFromServer(paramString.getState(), paramJSONObject, paramParseDecoder, paramBoolean));
    return paramString;
  }
  
  static <T extends ParseObject> T fromJSONPayload(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    Object localObject = paramJSONObject.optString("className");
    if ((localObject == null) || (ParseTextUtils.isEmpty((CharSequence)localObject))) {
      return null;
    }
    localObject = createWithoutData((String)localObject, paramJSONObject.optString("objectId", null));
    ((ParseObject)localObject).build(paramJSONObject, paramParseDecoder);
    return (T)localObject;
  }
  
  private ParseACL getACL(boolean paramBoolean)
  {
    synchronized (this.mutex)
    {
      checkGetAccess("ACL");
      Object localObject2 = this.estimatedData.get("ACL");
      if (localObject2 == null) {
        return null;
      }
      if (!(localObject2 instanceof ParseACL)) {
        throw new RuntimeException("only ACLs can be stored in the ACL key");
      }
    }
    if ((paramBoolean) && (((ParseACL)localObject3).isShared()))
    {
      localParseACL = new ParseACL((ParseACL)localObject3);
      this.estimatedData.put("ACL", localParseACL);
      return localParseACL;
    }
    ParseACL localParseACL = (ParseACL)localParseACL;
    return localParseACL;
  }
  
  private static LocalIdManager getLocalIdManager()
  {
    return ParseCorePlugins.getInstance().getLocalIdManager();
  }
  
  private static ParseObjectController getObjectController()
  {
    return ParseCorePlugins.getInstance().getObjectController();
  }
  
  private static ParseObjectSubclassingController getSubclassingController()
  {
    return ParseCorePlugins.getInstance().getSubclassingController();
  }
  
  private boolean hasDirtyChildren()
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        ArrayList localArrayList = new ArrayList();
        collectDirtyChildren(this.estimatedData, localArrayList, null);
        if (localArrayList.size() > 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  private void notifyObjectIdChanged(String paramString1, String paramString2)
  {
    synchronized (this.mutex)
    {
      OfflineStore localOfflineStore = Parse.getLocalDatastore();
      if (localOfflineStore != null) {
        localOfflineStore.updateObjectId(this, paramString1, paramString2);
      }
      if (this.localId != null)
      {
        getLocalIdManager().setObjectId(this.localId, paramString2);
        this.localId = null;
      }
      return;
    }
  }
  
  public static <T extends ParseObject> void pinAll(String paramString, List<T> paramList)
  {
    ParseTaskUtils.wait(pinAllInBackground(paramString, paramList));
  }
  
  public static <T extends ParseObject> void pinAll(List<T> paramList)
  {
    ParseTaskUtils.wait(pinAllInBackground("_default", paramList));
  }
  
  public static <T extends ParseObject> o<Void> pinAllInBackground(String paramString, List<T> paramList)
  {
    return pinAllInBackground(paramString, paramList, true);
  }
  
  private static <T extends ParseObject> o<Void> pinAllInBackground(String paramString, List<T> paramList, boolean paramBoolean)
  {
    if (!Parse.isLocalDatastoreEnabled()) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    o localo = o.a(null);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localo = localo.d(new ParseObject.48((ParseObject)localIterator.next()));
    }
    return localo.d(new ParseObject.50(paramString, paramList, paramBoolean)).d(new ParseObject.49(paramString, paramList));
  }
  
  public static <T extends ParseObject> o<Void> pinAllInBackground(List<T> paramList)
  {
    return pinAllInBackground("_default", paramList);
  }
  
  public static <T extends ParseObject> void pinAllInBackground(String paramString, List<T> paramList, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(pinAllInBackground(paramString, paramList), paramSaveCallback);
  }
  
  public static <T extends ParseObject> void pinAllInBackground(List<T> paramList, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(pinAllInBackground("_default", paramList), paramSaveCallback);
  }
  
  private void rebuildEstimatedData()
  {
    synchronized (this.mutex)
    {
      this.estimatedData.clear();
      Iterator localIterator1 = this.state.keySet().iterator();
      if (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        this.estimatedData.put(str, this.state.get(str));
      }
    }
    Iterator localIterator2 = this.operationSetQueue.iterator();
    while (localIterator2.hasNext()) {
      applyOperations((ParseOperationSet)localIterator2.next(), this.estimatedData);
    }
  }
  
  static void registerParseSubclasses()
  {
    registerSubclass(ParseUser.class);
    registerSubclass(ParseRole.class);
    registerSubclass(ParseInstallation.class);
    registerSubclass(ParseSession.class);
    registerSubclass(ParsePin.class);
    registerSubclass(EventuallyPin.class);
  }
  
  public static void registerSubclass(Class<? extends ParseObject> paramClass)
  {
    getSubclassingController().registerSubclass(paramClass);
  }
  
  public static <T extends ParseObject> void saveAll(List<T> paramList)
  {
    ParseTaskUtils.wait(saveAllInBackground(paramList));
  }
  
  private static <T extends ParseObject> o<Void> saveAllAsync(List<T> paramList, String paramString, o<Void> paramo)
  {
    return paramo.b(new ParseObject.42(paramList, paramString));
  }
  
  public static <T extends ParseObject> o<Void> saveAllInBackground(List<T> paramList)
  {
    return ParseUser.getCurrentUserAsync().d(new ParseObject.44(paramList)).d(new ParseObject.43(paramList));
  }
  
  public static <T extends ParseObject> void saveAllInBackground(List<T> paramList, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(saveAllInBackground(paramList), paramSaveCallback);
  }
  
  private void setState(ParseObject.State paramState, boolean paramBoolean)
  {
    synchronized (this.mutex)
    {
      String str1 = this.state.objectId();
      String str2 = paramState.objectId();
      this.state = paramState;
      if ((paramBoolean) && (!ParseTextUtils.equals(str1, str2))) {
        notifyObjectIdChanged(str1, str2);
      }
      rebuildEstimatedData();
      return;
    }
  }
  
  public static void unpinAll()
  {
    ParseTaskUtils.wait(unpinAllInBackground());
  }
  
  public static void unpinAll(String paramString)
  {
    ParseTaskUtils.wait(unpinAllInBackground(paramString));
  }
  
  public static <T extends ParseObject> void unpinAll(String paramString, List<T> paramList)
  {
    ParseTaskUtils.wait(unpinAllInBackground(paramString, paramList));
  }
  
  public static <T extends ParseObject> void unpinAll(List<T> paramList)
  {
    ParseTaskUtils.wait(unpinAllInBackground("_default", paramList));
  }
  
  public static o<Void> unpinAllInBackground()
  {
    return unpinAllInBackground("_default");
  }
  
  public static o<Void> unpinAllInBackground(String paramString)
  {
    if (!Parse.isLocalDatastoreEnabled()) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    String str = paramString;
    if (paramString == null) {
      str = "_default";
    }
    return Parse.getLocalDatastore().unpinAllObjectsAsync(str);
  }
  
  public static <T extends ParseObject> o<Void> unpinAllInBackground(String paramString, List<T> paramList)
  {
    if (!Parse.isLocalDatastoreEnabled()) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    String str = paramString;
    if (paramString == null) {
      str = "_default";
    }
    return Parse.getLocalDatastore().unpinAllObjectsAsync(str, paramList);
  }
  
  public static <T extends ParseObject> o<Void> unpinAllInBackground(List<T> paramList)
  {
    return unpinAllInBackground("_default", paramList);
  }
  
  public static void unpinAllInBackground(DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinAllInBackground(), paramDeleteCallback);
  }
  
  public static void unpinAllInBackground(String paramString, DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinAllInBackground(paramString), paramDeleteCallback);
  }
  
  public static <T extends ParseObject> void unpinAllInBackground(String paramString, List<T> paramList, DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinAllInBackground(paramString, paramList), paramDeleteCallback);
  }
  
  public static <T extends ParseObject> void unpinAllInBackground(List<T> paramList, DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinAllInBackground("_default", paramList), paramDeleteCallback);
  }
  
  static void unregisterParseSubclasses()
  {
    unregisterSubclass(ParseUser.class);
    unregisterSubclass(ParseRole.class);
    unregisterSubclass(ParseInstallation.class);
    unregisterSubclass(ParseSession.class);
    unregisterSubclass(ParsePin.class);
    unregisterSubclass(EventuallyPin.class);
  }
  
  static void unregisterSubclass(Class<? extends ParseObject> paramClass)
  {
    getSubclassingController().unregisterSubclass(paramClass);
  }
  
  public void add(String paramString, Object paramObject)
  {
    addAll(paramString, Arrays.asList(new Object[] { paramObject }));
  }
  
  public void addAll(String paramString, Collection<?> paramCollection)
  {
    performOperation(paramString, new ParseAddOperation(paramCollection));
  }
  
  public void addAllUnique(String paramString, Collection<?> paramCollection)
  {
    performOperation(paramString, new ParseAddUniqueOperation(paramCollection));
  }
  
  public void addUnique(String paramString, Object paramObject)
  {
    addAllUnique(paramString, Arrays.asList(new Object[] { paramObject }));
  }
  
  void build(JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    ParseObject.State.Builder localBuilder;
    for (;;)
    {
      String str;
      try
      {
        localBuilder = (ParseObject.State.Builder)new ParseObject.State.Builder(this.state).isComplete(true);
        localBuilder.clear();
        Iterator localIterator = paramJSONObject.keys();
        if (!localIterator.hasNext()) {
          break;
        }
        str = (String)localIterator.next();
        if (str.equals("className")) {
          continue;
        }
        if (str.equals("objectId"))
        {
          localBuilder.objectId(paramJSONObject.getString(str));
          continue;
        }
        if (!str.equals("createdAt")) {
          break label126;
        }
      }
      catch (JSONException paramJSONObject)
      {
        throw new RuntimeException(paramJSONObject);
      }
      localBuilder.createdAt(ParseDateFormat.getInstance().parse(paramJSONObject.getString(str)));
      continue;
      label126:
      if (str.equals("updatedAt"))
      {
        localBuilder.updatedAt(ParseDateFormat.getInstance().parse(paramJSONObject.getString(str)));
      }
      else
      {
        Object localObject = paramParseDecoder.decode(paramJSONObject.get(str));
        if ((localObject instanceof ParseFieldOperation)) {
          performOperation(str, (ParseFieldOperation)localObject);
        } else {
          put(str, localObject);
        }
      }
    }
    setState(localBuilder.build());
  }
  
  public boolean containsKey(String paramString)
  {
    synchronized (this.mutex)
    {
      boolean bool = this.estimatedData.containsKey(paramString);
      return bool;
    }
  }
  
  void copyChangesFrom(ParseObject paramParseObject)
  {
    synchronized (this.mutex)
    {
      paramParseObject = (ParseOperationSet)paramParseObject.operationSetQueue.getFirst();
      Iterator localIterator = paramParseObject.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        performOperation(str, (ParseFieldOperation)paramParseObject.get(str));
      }
    }
  }
  
  public final void delete()
  {
    ParseTaskUtils.wait(deleteInBackground());
  }
  
  o<Void> deleteAsync(String paramString)
  {
    return getObjectController().deleteAsync(getState(), paramString);
  }
  
  public final o<Void> deleteEventually()
  {
    synchronized (this.mutex)
    {
      validateDelete();
      this.isDeletingEventually += 1;
      Object localObject1 = null;
      if (getObjectId() == null) {
        localObject1 = getOrCreateLocalId();
      }
      Object localObject4 = ParseUser.getCurrentSessionToken();
      localObject4 = ParseRESTObjectCommand.deleteObjectCommand(getState(), (String)localObject4);
      ((ParseRESTCommand)localObject4).enableRetrying();
      ((ParseRESTCommand)localObject4).setLocalId((String)localObject1);
      localObject1 = Parse.getEventuallyQueue().enqueueEventuallyAsync((ParseRESTCommand)localObject4, this);
      if (Parse.isLocalDatastoreEnabled()) {
        return ((o)localObject1).k();
      }
    }
    return ((o)localObject2).d(new ParseObject.17(this));
  }
  
  public final void deleteEventually(DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(deleteEventually(), paramDeleteCallback);
  }
  
  public final o<Void> deleteInBackground()
  {
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseObject.32(this));
  }
  
  public final void deleteInBackground(DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(deleteInBackground(), paramDeleteCallback);
  }
  
  public <T extends ParseObject> T fetch()
  {
    return (ParseObject)ParseTaskUtils.wait(fetchInBackground());
  }
  
  <T extends ParseObject> o<T> fetchAsync(String paramString, o<Void> paramo)
  {
    return paramo.d(new ParseObject.26(this, paramString)).d(new ParseObject.25(this)).c(new ParseObject.24(this));
  }
  
  public void fetchFromLocalDatastore()
  {
    ParseTaskUtils.wait(fetchFromLocalDatastoreAsync());
  }
  
  <T extends ParseObject> o<T> fetchFromLocalDatastoreAsync()
  {
    if (!Parse.isLocalDatastoreEnabled()) {
      throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }
    return Parse.getLocalDatastore().fetchLocallyAsync(this);
  }
  
  public <T extends ParseObject> void fetchFromLocalDatastoreInBackground(GetCallback<T> paramGetCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchFromLocalDatastoreAsync(), paramGetCallback);
  }
  
  public <T extends ParseObject> T fetchIfNeeded()
  {
    return (ParseObject)ParseTaskUtils.wait(fetchIfNeededInBackground());
  }
  
  public final <T extends ParseObject> o<T> fetchIfNeededInBackground()
  {
    if (isDataAvailable()) {
      return o.a(this);
    }
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseObject.28(this));
  }
  
  public final <T extends ParseObject> void fetchIfNeededInBackground(GetCallback<T> paramGetCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchIfNeededInBackground(), paramGetCallback);
  }
  
  public final <T extends ParseObject> o<T> fetchInBackground()
  {
    return ParseUser.getCurrentSessionTokenAsync().d(new ParseObject.27(this));
  }
  
  public final <T extends ParseObject> void fetchInBackground(GetCallback<T> paramGetCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchInBackground(), paramGetCallback);
  }
  
  public Object get(String paramString)
  {
    synchronized (this.mutex)
    {
      if (paramString.equals("ACL"))
      {
        paramString = getACL();
        return paramString;
      }
      checkGetAccess(paramString);
      Object localObject2 = this.estimatedData.get(paramString);
      if ((localObject2 instanceof ParseRelation)) {
        ((ParseRelation)localObject2).ensureParentAndKey(this, paramString);
      }
      return localObject2;
    }
  }
  
  public ParseACL getACL()
  {
    return getACL(true);
  }
  
  public boolean getBoolean(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof Boolean)) {
        return false;
      }
      boolean bool = ((Boolean)paramString).booleanValue();
      return bool;
    }
  }
  
  public byte[] getBytes(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof byte[])) {
        return null;
      }
      paramString = (byte[])paramString;
      return paramString;
    }
  }
  
  public String getClassName()
  {
    synchronized (this.mutex)
    {
      String str = this.state.className();
      return str;
    }
  }
  
  public Date getCreatedAt()
  {
    long l = getState().createdAt();
    if (l > 0L) {
      return new Date(l);
    }
    return null;
  }
  
  public Date getDate(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof Date)) {
        return null;
      }
      paramString = (Date)paramString;
      return paramString;
    }
  }
  
  public double getDouble(String paramString)
  {
    paramString = getNumber(paramString);
    if (paramString == null) {
      return 0.0D;
    }
    return paramString.doubleValue();
  }
  
  public int getInt(String paramString)
  {
    paramString = getNumber(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.intValue();
  }
  
  public JSONArray getJSONArray(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      Object localObject1 = this.estimatedData.get(paramString);
      paramString = (String)localObject1;
      if ((localObject1 instanceof List)) {
        paramString = PointerOrLocalIdEncoder.get().encode(localObject1);
      }
      if (!(paramString instanceof JSONArray)) {
        return null;
      }
      paramString = (JSONArray)paramString;
      return paramString;
    }
  }
  
  public JSONObject getJSONObject(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      Object localObject1 = this.estimatedData.get(paramString);
      paramString = (String)localObject1;
      if ((localObject1 instanceof Map)) {
        paramString = PointerOrLocalIdEncoder.get().encode(localObject1);
      }
      if (!(paramString instanceof JSONObject)) {
        return null;
      }
      paramString = (JSONObject)paramString;
      return paramString;
    }
  }
  
  public <T> List<T> getList(String paramString)
  {
    synchronized (this.mutex)
    {
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof List)) {
        return null;
      }
      paramString = (List)paramString;
      return paramString;
    }
  }
  
  public long getLong(String paramString)
  {
    paramString = getNumber(paramString);
    if (paramString == null) {
      return 0L;
    }
    return paramString.longValue();
  }
  
  public <V> Map<String, V> getMap(String paramString)
  {
    synchronized (this.mutex)
    {
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof Map)) {
        return null;
      }
      paramString = (Map)paramString;
      return paramString;
    }
  }
  
  public Number getNumber(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof Number)) {
        return null;
      }
      paramString = (Number)paramString;
      return paramString;
    }
  }
  
  public String getObjectId()
  {
    synchronized (this.mutex)
    {
      String str = this.state.objectId();
      return str;
    }
  }
  
  String getOrCreateLocalId()
  {
    synchronized (this.mutex)
    {
      if (this.localId != null) {
        break label50;
      }
      if (this.state.objectId() != null) {
        throw new IllegalStateException("Attempted to get a localId for an object with an objectId.");
      }
    }
    this.localId = getLocalIdManager().createLocalId();
    label50:
    String str = this.localId;
    return str;
  }
  
  public ParseFile getParseFile(String paramString)
  {
    paramString = get(paramString);
    if (!(paramString instanceof ParseFile)) {
      return null;
    }
    return (ParseFile)paramString;
  }
  
  public ParseGeoPoint getParseGeoPoint(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof ParseGeoPoint)) {
        return null;
      }
      paramString = (ParseGeoPoint)paramString;
      return paramString;
    }
  }
  
  public ParseObject getParseObject(String paramString)
  {
    paramString = get(paramString);
    if (!(paramString instanceof ParseObject)) {
      return null;
    }
    return (ParseObject)paramString;
  }
  
  public ParseUser getParseUser(String paramString)
  {
    paramString = get(paramString);
    if (!(paramString instanceof ParseUser)) {
      return null;
    }
    return (ParseUser)paramString;
  }
  
  public <T extends ParseObject> ParseRelation<T> getRelation(String paramString)
  {
    synchronized (this.mutex)
    {
      Object localObject2 = this.estimatedData.get(paramString);
      if ((localObject2 instanceof ParseRelation))
      {
        localObject2 = (ParseRelation)localObject2;
        ((ParseRelation)localObject2).ensureParentAndKey(this, paramString);
        return (ParseRelation<T>)localObject2;
      }
      localObject2 = new ParseRelation(this, paramString);
      this.estimatedData.put(paramString, localObject2);
      return (ParseRelation<T>)localObject2;
    }
  }
  
  ParseObject.State getState()
  {
    synchronized (this.mutex)
    {
      ParseObject.State localState = this.state;
      return localState;
    }
  }
  
  public String getString(String paramString)
  {
    synchronized (this.mutex)
    {
      checkGetAccess(paramString);
      paramString = this.estimatedData.get(paramString);
      if (!(paramString instanceof String)) {
        return null;
      }
      paramString = (String)paramString;
      return paramString;
    }
  }
  
  public Date getUpdatedAt()
  {
    long l = getState().updatedAt();
    if (l > 0L) {
      return new Date(l);
    }
    return null;
  }
  
  o<Void> handleDeleteEventuallyResultAsync()
  {
    synchronized (this.mutex)
    {
      this.isDeletingEventually -= 1;
      return handleDeleteResultAsync().d(new ParseObject.18(this));
    }
  }
  
  o<Void> handleDeleteResultAsync()
  {
    o localo = o.a(null);
    synchronized (this.mutex)
    {
      this.isDeleted = true;
      OfflineStore localOfflineStore = Parse.getLocalDatastore();
      ??? = localo;
      if (localOfflineStore != null) {
        ??? = localo.b(new ParseObject.31(this, localOfflineStore));
      }
      return (o<Void>)???;
    }
  }
  
  o<Void> handleFetchResultAsync(ParseObject.State paramState)
  {
    o localo2 = o.a((Void)null);
    OfflineStore localOfflineStore = Parse.getLocalDatastore();
    o localo1 = localo2;
    if (localOfflineStore != null) {
      localo1 = localo2.d(new ParseObject.20(this, localOfflineStore)).b(new ParseObject.19(this));
    }
    localo1 = localo1.d(new ParseObject.21(this, paramState));
    paramState = localo1;
    if (localOfflineStore != null) {
      paramState = localo1.d(new ParseObject.23(this, localOfflineStore)).b(new ParseObject.22(this));
    }
    return paramState;
  }
  
  o<Void> handleSaveEventuallyResultAsync(JSONObject paramJSONObject, ParseOperationSet paramParseOperationSet)
  {
    if (paramJSONObject != null) {}
    for (boolean bool = true;; bool = false) {
      return handleSaveResultAsync(paramJSONObject, paramParseOperationSet).d(new ParseObject.16(this, bool));
    }
  }
  
  o<Void> handleSaveResultAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet)
  {
    o localo = o.a((Void)null);
    if (paramState != null) {}
    for (int i = 1;; i = 0) {
      for (;;)
      {
        synchronized (this.mutex)
        {
          ListIterator localListIterator = this.operationSetQueue.listIterator(this.operationSetQueue.indexOf(paramParseOperationSet));
          localListIterator.next();
          localListIterator.remove();
          if (i == 0)
          {
            ((ParseOperationSet)localListIterator.next()).mergeFrom(paramParseOperationSet);
            return localo;
          }
          ??? = Parse.getLocalDatastore();
          if (??? != null)
          {
            localo = localo.d(new ParseObject.5(this, (OfflineStore)???));
            paramParseOperationSet = localo.a(new ParseObject.6(this, paramState, paramParseOperationSet));
            paramState = paramParseOperationSet;
            if (??? != null) {
              paramState = paramParseOperationSet.d(new ParseObject.7(this, (OfflineStore)???));
            }
            return paramState.c(new ParseObject.8(this));
          }
        }
      }
    }
  }
  
  o<Void> handleSaveResultAsync(JSONObject paramJSONObject, ParseOperationSet paramParseOperationSet)
  {
    Object localObject1 = null;
    if (paramJSONObject != null) {}
    synchronized (this.mutex)
    {
      localObject1 = new KnownParseObjectDecoder(collectFetchedObjects());
      localObject1 = ParseObjectCoder.get().decode(getState().newBuilder().clear(), paramJSONObject, (ParseDecoder)localObject1).isComplete(false).build();
      return handleSaveResultAsync((ParseObject.State)localObject1, paramParseOperationSet);
    }
  }
  
  public boolean has(String paramString)
  {
    return containsKey(paramString);
  }
  
  boolean hasChanges()
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if (currentOperations().size() > 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  boolean hasOutstandingOperations()
  {
    for (boolean bool = true;; bool = false) {
      synchronized (this.mutex)
      {
        if (this.operationSetQueue.size() > 1) {
          return bool;
        }
      }
    }
  }
  
  public boolean hasSameId(ParseObject paramParseObject)
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if ((getClassName() != null) && (getObjectId() != null) && (getClassName().equals(paramParseObject.getClassName())) && (getObjectId().equals(paramParseObject.getObjectId())))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void increment(String paramString)
  {
    increment(paramString, Integer.valueOf(1));
  }
  
  public void increment(String paramString, Number paramNumber)
  {
    performOperation(paramString, new ParseIncrementOperation(paramNumber));
  }
  
  public boolean isDataAvailable()
  {
    synchronized (this.mutex)
    {
      boolean bool = this.state.isComplete();
      return bool;
    }
  }
  
  boolean isDataAvailable(String paramString)
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if (!isDataAvailable())
        {
          if (!this.estimatedData.containsKey(paramString)) {
            break label44;
          }
          break label39;
          return bool;
        }
      }
      label39:
      boolean bool = true;
      continue;
      label44:
      bool = false;
    }
  }
  
  public boolean isDirty()
  {
    return isDirty(true);
  }
  
  public boolean isDirty(String paramString)
  {
    synchronized (this.mutex)
    {
      boolean bool = currentOperations().containsKey(paramString);
      return bool;
    }
  }
  
  boolean isDirty(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.mutex)
      {
        if ((!this.isDeleted) && (getObjectId() != null) && (!hasChanges()))
        {
          if ((!paramBoolean) || (!hasDirtyChildren())) {
            break label56;
          }
          break label51;
          return paramBoolean;
        }
      }
      label51:
      paramBoolean = true;
      continue;
      label56:
      paramBoolean = false;
    }
  }
  
  boolean isKeyMutable(String paramString)
  {
    return true;
  }
  
  public Set<String> keySet()
  {
    synchronized (this.mutex)
    {
      Set localSet = Collections.unmodifiableSet(this.estimatedData.keySet());
      return localSet;
    }
  }
  
  /* Error */
  void mergeFromObject(ParseObject paramParseObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 82	com/parse/ParseObject:mutex	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: if_acmpne +6 -> 15
    //   12: aload_2
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 413	com/parse/ParseObject:getState	()Lcom/parse/ParseObject$State;
    //   20: invokevirtual 705	com/parse/ParseObject$State:newBuilder	()Lcom/parse/ParseObject$State$Init;
    //   23: invokevirtual 162	com/parse/ParseObject$State$Init:build	()Lcom/parse/ParseObject$State;
    //   26: iconst_0
    //   27: invokespecial 1269	com/parse/ParseObject:setState	(Lcom/parse/ParseObject$State;Z)V
    //   30: aload_2
    //   31: monitorexit
    //   32: return
    //   33: astore_1
    //   34: aload_2
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	ParseObject
    //   0	38	1	paramParseObject	ParseObject
    //   4	31	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	14	33	finally
    //   15	32	33	finally
    //   34	36	33	finally
  }
  
  ParseObject.State mergeFromServer(ParseObject.State paramState, JSONObject paramJSONObject, ParseDecoder paramParseDecoder, boolean paramBoolean)
  {
    for (;;)
    {
      ParseObject.State.Init localInit;
      try
      {
        localInit = paramState.newBuilder();
        if (paramBoolean) {
          localInit.clear();
        }
        if (paramState.isComplete()) {
          break label249;
        }
        if (!paramBoolean) {
          break label121;
        }
      }
      catch (JSONException paramState)
      {
        throw new RuntimeException(paramState);
      }
      localInit.isComplete(paramBoolean);
      paramState = paramJSONObject.keys();
      if (paramState.hasNext())
      {
        String str = (String)paramState.next();
        if ((!str.equals("__type")) && (!str.equals("className"))) {
          if (str.equals("objectId"))
          {
            localInit.objectId(paramJSONObject.getString(str));
            continue;
            label121:
            paramBoolean = false;
          }
          else if (str.equals("createdAt"))
          {
            localInit.createdAt(ParseDateFormat.getInstance().parse(paramJSONObject.getString(str)));
          }
          else if (str.equals("updatedAt"))
          {
            localInit.updatedAt(ParseDateFormat.getInstance().parse(paramJSONObject.getString(str)));
          }
          else if (str.equals("ACL"))
          {
            localInit.put("ACL", ParseACL.createACLFromJSONObject(paramJSONObject.getJSONObject(str), paramParseDecoder));
          }
          else
          {
            localInit.put(str, paramParseDecoder.decode(paramJSONObject.get(str)));
          }
        }
      }
      else
      {
        paramState = localInit.build();
        return paramState;
        label249:
        paramBoolean = true;
      }
    }
  }
  
  void mergeREST(ParseObject.State paramState, JSONObject paramJSONObject, ParseDecoder paramParseDecoder)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    Object localObject1;
    ParseOperationSet localParseOperationSet1;
    for (;;)
    {
      synchronized (this.mutex)
      {
        try
        {
          boolean bool = paramJSONObject.getBoolean("__complete");
          this.isDeletingEventually = ParseJSONUtils.getInt(paramJSONObject, Arrays.asList(new String[] { "__isDeletingEventually", "isDeletingEventually" }));
          JSONArray localJSONArray = paramJSONObject.getJSONArray("__operations");
          ParseOperationSet localParseOperationSet2 = currentOperations();
          this.operationSetQueue.clear();
          i = 0;
          localObject1 = null;
          if (i < localJSONArray.length())
          {
            localParseOperationSet1 = ParseOperationSet.fromRest(localJSONArray.getJSONObject(i), paramParseDecoder);
            if (localParseOperationSet1.isSaveEventually())
            {
              Object localObject2 = localObject1;
              if (localObject1 != null)
              {
                this.operationSetQueue.add(localObject1);
                localObject2 = null;
              }
              localArrayList.add(localParseOperationSet1);
              this.operationSetQueue.add(localParseOperationSet1);
              localObject1 = localObject2;
              break;
            }
            if (localObject1 == null) {
              break label374;
            }
            localParseOperationSet1.mergeFrom((ParseOperationSet)localObject1);
            break label374;
          }
          if (localObject1 != null) {
            this.operationSetQueue.add(localObject1);
          }
          currentOperations().mergeFrom(localParseOperationSet2);
          if (paramState.updatedAt() < 0L)
          {
            i = 1;
            if (i != 0) {
              setState(mergeFromServer(paramState, ParseJSONUtils.create(paramJSONObject, Arrays.asList(new String[] { "__complete", "__isDeletingEventually", "isDeletingEventually", "__operations" })), paramParseDecoder, bool));
            }
            paramState = localArrayList.iterator();
            if (paramState.hasNext())
            {
              enqueueSaveEventuallyOperationAsync((ParseOperationSet)paramState.next());
              continue;
            }
          }
          else
          {
            if (!paramJSONObject.has("updatedAt")) {
              break label359;
            }
            localObject1 = ParseDateFormat.getInstance().parse(paramJSONObject.getString("updatedAt"));
            i = new Date(paramState.updatedAt()).compareTo((Date)localObject1);
            if (i >= 0) {
              break label359;
            }
            i = 1;
            continue;
            paramState = finally;
          }
        }
        catch (JSONException paramState)
        {
          throw new RuntimeException(paramState);
        }
      }
      return;
      label359:
      i = 0;
    }
    for (;;)
    {
      i += 1;
      break;
      label374:
      localObject1 = localParseOperationSet1;
    }
  }
  
  boolean needsDefaultACL()
  {
    return true;
  }
  
  ParseObject.State.Init<?> newStateBuilder(String paramString)
  {
    return new ParseObject.State.Builder(paramString);
  }
  
  void performOperation(String paramString, ParseFieldOperation paramParseFieldOperation)
  {
    synchronized (this.mutex)
    {
      Object localObject2 = paramParseFieldOperation.apply(this.estimatedData.get(paramString), paramString);
      if (localObject2 != null)
      {
        this.estimatedData.put(paramString, localObject2);
        paramParseFieldOperation = paramParseFieldOperation.mergeWithPrevious((ParseFieldOperation)currentOperations().get(paramString));
        currentOperations().put(paramString, paramParseFieldOperation);
        return;
      }
      this.estimatedData.remove(paramString);
    }
  }
  
  void performPut(String paramString, Object paramObject)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("key may not be null.");
    }
    if (paramObject == null) {
      throw new IllegalArgumentException("value may not be null.");
    }
    Object localObject;
    if ((paramObject instanceof JSONObject)) {
      localObject = ParseDecoder.get().convertJSONObjectToMap((JSONObject)paramObject);
    }
    while (!ParseEncoder.isValidType(localObject))
    {
      throw new IllegalArgumentException("invalid type for value: " + localObject.getClass().toString());
      localObject = paramObject;
      if ((paramObject instanceof JSONArray)) {
        localObject = ParseDecoder.get().convertJSONArrayToList((JSONArray)paramObject);
      }
    }
    performOperation(paramString, new ParseSetOperation(localObject));
  }
  
  void performRemove(String paramString)
  {
    synchronized (this.mutex)
    {
      if (get(paramString) != null) {
        performOperation(paramString, ParseDeleteOperation.getInstance());
      }
      return;
    }
  }
  
  public void pin()
  {
    ParseTaskUtils.wait(pinInBackground());
  }
  
  public void pin(String paramString)
  {
    ParseTaskUtils.wait(pinInBackground(paramString));
  }
  
  public o<Void> pinInBackground()
  {
    return pinAllInBackground("_default", Arrays.asList(new ParseObject[] { this }));
  }
  
  public o<Void> pinInBackground(String paramString)
  {
    return pinAllInBackground(paramString, Collections.singletonList(this));
  }
  
  o<Void> pinInBackground(String paramString, boolean paramBoolean)
  {
    return pinAllInBackground(paramString, Collections.singletonList(this), paramBoolean);
  }
  
  public void pinInBackground(SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(pinInBackground(), paramSaveCallback);
  }
  
  public void pinInBackground(String paramString, SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(pinInBackground(paramString), paramSaveCallback);
  }
  
  public void put(String paramString, Object paramObject)
  {
    checkKeyIsMutable(paramString);
    performPut(paramString, paramObject);
  }
  
  @Deprecated
  public final void refresh()
  {
    fetch();
  }
  
  @Deprecated
  public final void refreshInBackground(RefreshCallback paramRefreshCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(fetchInBackground(), paramRefreshCallback);
  }
  
  void registerSaveListener(GetCallback<ParseObject> paramGetCallback)
  {
    synchronized (this.mutex)
    {
      this.saveEvent.subscribe(paramGetCallback);
      return;
    }
  }
  
  public void remove(String paramString)
  {
    checkKeyIsMutable(paramString);
    performRemove(paramString);
  }
  
  public void removeAll(String paramString, Collection<?> paramCollection)
  {
    checkKeyIsMutable(paramString);
    performOperation(paramString, new ParseRemoveOperation(paramCollection));
  }
  
  public void revert()
  {
    synchronized (this.mutex)
    {
      if (isDirty())
      {
        currentOperations().clear();
        rebuildEstimatedData();
      }
      return;
    }
  }
  
  public void revert(String paramString)
  {
    synchronized (this.mutex)
    {
      if (isDirty(paramString))
      {
        currentOperations().remove(paramString);
        rebuildEstimatedData();
      }
      return;
    }
  }
  
  public final void save()
  {
    ParseTaskUtils.wait(saveInBackground());
  }
  
  o<JSONObject> saveAsync(ParseHttpClient paramParseHttpClient, ParseOperationSet paramParseOperationSet, String paramString)
  {
    return currentSaveEventuallyCommand(paramParseOperationSet, PointerEncoder.get(), paramString).executeAsync(paramParseHttpClient);
  }
  
  o<Void> saveAsync(String paramString)
  {
    return this.taskQueue.enqueue(new ParseObject.11(this, paramString));
  }
  
  o<Void> saveAsync(String paramString, o<Void> paramo)
  {
    if (!isDirty()) {
      return o.a(null);
    }
    ParseOperationSet localParseOperationSet;
    synchronized (this.mutex)
    {
      updateBeforeSave();
      validateSave();
      localParseOperationSet = startSave();
    }
    synchronized (this.mutex)
    {
      o localo = deepSaveAsync(this.estimatedData, paramString);
      return localo.d(TaskQueue.waitFor(paramo)).d(new ParseObject.13(this, localParseOperationSet, paramString)).b(new ParseObject.12(this, localParseOperationSet));
      paramString = finally;
      throw paramString;
    }
  }
  
  public final o<Void> saveEventually()
  {
    Object localObject1 = null;
    if (!isDirty())
    {
      Parse.getEventuallyQueue().fakeObjectUpdate();
      return o.a(null);
    }
    synchronized (this.mutex)
    {
      updateBeforeSave();
    }
    ParseOperationSet localParseOperationSet;
    Object localObject4;
    try
    {
      validateSaveEventually();
      ArrayList localArrayList = new ArrayList();
      collectDirtyChildren(this.estimatedData, localArrayList, null);
      if (getObjectId() == null) {
        localObject1 = getOrCreateLocalId();
      }
      localParseOperationSet = startSave();
      localParseOperationSet.setIsSaveEventually(true);
      localObject4 = ParseUser.getCurrentSessionToken();
      try
      {
        localObject4 = currentSaveEventuallyCommand(localParseOperationSet, PointerOrLocalIdEncoder.get(), (String)localObject4);
        ((ParseRESTCommand)localObject4).setLocalId((String)localObject1);
        ((ParseRESTCommand)localObject4).setOperationSetUUID(localParseOperationSet.getUUID());
        ((ParseRESTCommand)localObject4).retainLocalIds();
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((ParseObject)((Iterator)localObject1).next()).saveEventually();
        }
        localObject2 = finally;
      }
      catch (ParseException localParseException1)
      {
        throw new IllegalStateException("Unable to saveEventually.", localParseException1);
      }
      throw ((Throwable)localObject2);
    }
    catch (ParseException localParseException2)
    {
      localo = o.a(localParseException2);
      return localo;
    }
    o localo = Parse.getEventuallyQueue().enqueueEventuallyAsync((ParseRESTCommand)localObject4, this);
    enqueueSaveEventuallyOperationAsync(localParseOperationSet);
    ((ParseRESTCommand)localObject4).releaseLocalIds();
    if (Parse.isLocalDatastoreEnabled()) {
      return localo.k();
    }
    return localo.d(new ParseObject.14(this, localParseOperationSet));
  }
  
  public final void saveEventually(SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(saveEventually(), paramSaveCallback);
  }
  
  public final o<Void> saveInBackground()
  {
    return ParseUser.getCurrentUserAsync().d(new ParseObject.10(this)).d(new ParseObject.9(this));
  }
  
  public final void saveInBackground(SaveCallback paramSaveCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(saveInBackground(), paramSaveCallback);
  }
  
  public void setACL(ParseACL paramParseACL)
  {
    put("ACL", paramParseACL);
  }
  
  void setDefaultValues()
  {
    if ((needsDefaultACL()) && (ParseACL.getDefaultACL() != null)) {
      setACL(ParseACL.getDefaultACL());
    }
  }
  
  public void setObjectId(String paramString)
  {
    synchronized (this.mutex)
    {
      String str = this.state.objectId();
      if (ParseTextUtils.equals(str, paramString)) {
        return;
      }
      this.state = this.state.newBuilder().objectId(paramString).build();
      notifyObjectIdChanged(str, paramString);
      return;
    }
  }
  
  void setState(ParseObject.State paramState)
  {
    synchronized (this.mutex)
    {
      setState(paramState, true);
      return;
    }
  }
  
  ParseOperationSet startSave()
  {
    synchronized (this.mutex)
    {
      ParseOperationSet localParseOperationSet = currentOperations();
      this.operationSetQueue.addLast(new ParseOperationSet());
      return localParseOperationSet;
    }
  }
  
  <T extends ParseObject.State> JSONObject toJSONObjectForSaving(T paramT, ParseOperationSet paramParseOperationSet, ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Iterator localIterator = paramParseOperationSet.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, paramParseEncoder.encode((ParseFieldOperation)paramParseOperationSet.get(str)));
      }
      if (paramT.objectId() == null) {
        break label97;
      }
    }
    catch (JSONException paramT)
    {
      throw new RuntimeException("could not serialize object to JSON");
    }
    localJSONObject.put("objectId", paramT.objectId());
    label97:
    return localJSONObject;
  }
  
  JSONObject toRest(ParseEncoder paramParseEncoder)
  {
    synchronized (this.mutex)
    {
      ParseObject.State localState = getState();
      int j = this.operationSetQueue.size();
      ArrayList localArrayList = new ArrayList(j);
      int i = 0;
      while (i < j)
      {
        localArrayList.add(new ParseOperationSet((ParseOperationSet)this.operationSetQueue.get(i)));
        i += 1;
      }
      return toRest(localState, localArrayList, paramParseEncoder);
    }
  }
  
  JSONObject toRest(ParseObject.State paramState, List<ParseOperationSet> paramList, ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("className", paramState.className());
      if (paramState.objectId() != null) {
        localJSONObject.put("objectId", paramState.objectId());
      }
      if (paramState.createdAt() > 0L) {
        localJSONObject.put("createdAt", ParseDateFormat.getInstance().format(new Date(paramState.createdAt())));
      }
      if (paramState.updatedAt() > 0L) {
        localJSONObject.put("updatedAt", ParseDateFormat.getInstance().format(new Date(paramState.updatedAt())));
      }
      Iterator localIterator = paramState.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, paramParseEncoder.encode(paramState.get(str)));
      }
      localJSONObject.put("__complete", paramState.isComplete());
    }
    catch (JSONException paramState)
    {
      throw new RuntimeException("could not serialize object to JSON");
    }
    localJSONObject.put("__isDeletingEventually", this.isDeletingEventually);
    paramState = new JSONArray();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      paramState.put(((ParseOperationSet)paramList.next()).toRest(paramParseEncoder));
    }
    localJSONObject.put("__operations", paramState);
    return localJSONObject;
  }
  
  public void unpin()
  {
    ParseTaskUtils.wait(unpinInBackground());
  }
  
  public void unpin(String paramString)
  {
    ParseTaskUtils.wait(unpinInBackground(paramString));
  }
  
  public o<Void> unpinInBackground()
  {
    return unpinAllInBackground("_default", Arrays.asList(new ParseObject[] { this }));
  }
  
  public o<Void> unpinInBackground(String paramString)
  {
    return unpinAllInBackground(paramString, Arrays.asList(new ParseObject[] { this }));
  }
  
  public void unpinInBackground(DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinInBackground(), paramDeleteCallback);
  }
  
  public void unpinInBackground(String paramString, DeleteCallback paramDeleteCallback)
  {
    ParseTaskUtils.callbackOnMainThreadAsync(unpinInBackground(paramString), paramDeleteCallback);
  }
  
  void unregisterSaveListener(GetCallback<ParseObject> paramGetCallback)
  {
    synchronized (this.mutex)
    {
      this.saveEvent.unsubscribe(paramGetCallback);
      return;
    }
  }
  
  void updateBeforeSave() {}
  
  void validateDelete() {}
  
  void validateSave() {}
  
  void validateSaveEventually() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */