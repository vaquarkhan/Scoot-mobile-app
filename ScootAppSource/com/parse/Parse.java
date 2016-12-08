package com.parse;

import a.o;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.parse.http.ParseNetworkInterceptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Parse
{
  public static final int LOG_LEVEL_DEBUG = 3;
  public static final int LOG_LEVEL_ERROR = 6;
  public static final int LOG_LEVEL_INFO = 4;
  public static final int LOG_LEVEL_NONE = Integer.MAX_VALUE;
  public static final int LOG_LEVEL_VERBOSE = 2;
  public static final int LOG_LEVEL_WARNING = 5;
  private static final Object MUTEX = new Object();
  private static final Object MUTEX_CALLBACKS = new Object();
  private static final String PARSE_APPLICATION_ID = "com.parse.APPLICATION_ID";
  private static final String PARSE_CLIENT_KEY = "com.parse.CLIENT_KEY";
  private static Set<Parse.ParseCallbacks> callbacks = new HashSet();
  static ParseEventuallyQueue eventuallyQueue = null;
  private static List<ParseNetworkInterceptor> interceptors;
  private static boolean isLocalDatastoreEnabled;
  private static OfflineStore offlineStore;
  
  private Parse()
  {
    throw new AssertionError();
  }
  
  public static void addParseNetworkInterceptor(ParseNetworkInterceptor paramParseNetworkInterceptor)
  {
    if (isInitialized()) {
      throw new IllegalStateException("`Parse#addParseNetworkInterceptor(ParseNetworkInterceptor)` must be invoked before `Parse#initialize(Context)`");
    }
    if (interceptors == null) {
      interceptors = new ArrayList();
    }
    interceptors.add(paramParseNetworkInterceptor);
  }
  
  private static boolean allParsePushIntentReceiversInternal()
  {
    Iterator localIterator = ManifestInfo.getIntentReceivers(new String[] { "com.parse.push.intent.RECEIVE", "com.parse.push.intent.DELETE", "com.parse.push.intent.OPEN" }).iterator();
    while (localIterator.hasNext()) {
      if (((ResolveInfo)localIterator.next()).activityInfo.exported) {
        return false;
      }
    }
    return true;
  }
  
  static void checkCacheApplicationId()
  {
    String str;
    Object localObject3;
    synchronized (MUTEX)
    {
      str = ParsePlugins.get().applicationId();
      Object localObject4;
      boolean bool1;
      if (str != null)
      {
        localObject3 = getParseCacheDir();
        localObject4 = new File((File)localObject3, "applicationId");
        bool1 = ((File)localObject4).exists();
        if (bool1) {
          bool1 = false;
        }
      }
      try
      {
        localObject4 = new RandomAccessFile((File)localObject4, "r");
        byte[] arrayOfByte = new byte[(int)((RandomAccessFile)localObject4).length()];
        ((RandomAccessFile)localObject4).readFully(arrayOfByte);
        ((RandomAccessFile)localObject4).close();
        boolean bool2 = new String(arrayOfByte, "UTF-8").equals(str);
        bool1 = bool2;
      }
      catch (IOException localIOException3)
      {
        for (;;) {}
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        for (;;) {}
      }
      if (bool1) {}
    }
    try
    {
      ParseFileUtils.deleteDirectory((File)localObject3);
      localObject3 = new File((File)localObject3, "applicationId");
    }
    catch (IOException localIOException2)
    {
      try
      {
        localObject3 = new FileOutputStream((File)localObject3);
        ((FileOutputStream)localObject3).write(str.getBytes("UTF-8"));
        ((FileOutputStream)localObject3).close();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        localIOException2 = localIOException2;
      }
      catch (IOException localIOException1)
      {
        for (;;) {}
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;) {}
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        for (;;) {}
      }
    }
  }
  
  static void checkContext()
  {
    if (ParsePlugins.Android.get().applicationContext() == null) {
      throw new RuntimeException("applicationContext is null. You must call Parse.initialize(Context) before using the Parse library.");
    }
  }
  
  static void checkInit()
  {
    if (ParsePlugins.get() == null) {
      throw new RuntimeException("You must call Parse.initialize(Context) before using the Parse library.");
    }
    if (ParsePlugins.get().applicationId() == null) {
      throw new RuntimeException("applicationId is null. You must call Parse.initialize(Context) before using the Parse library.");
    }
    if (ParsePlugins.get().clientKey() == null) {
      throw new RuntimeException("clientKey is null. You must call Parse.initialize(Context) before using the Parse library.");
    }
  }
  
  private static Parse.ParseCallbacks[] collectParseCallbacks()
  {
    synchronized (MUTEX_CALLBACKS)
    {
      if (callbacks == null) {
        return null;
      }
      Parse.ParseCallbacks[] arrayOfParseCallbacks2 = new Parse.ParseCallbacks[callbacks.size()];
      Parse.ParseCallbacks[] arrayOfParseCallbacks1 = arrayOfParseCallbacks2;
      if (callbacks.size() > 0) {
        arrayOfParseCallbacks1 = (Parse.ParseCallbacks[])callbacks.toArray(arrayOfParseCallbacks2);
      }
      return arrayOfParseCallbacks1;
    }
  }
  
  static void destroy()
  {
    synchronized (MUTEX)
    {
      ParseEventuallyQueue localParseEventuallyQueue = eventuallyQueue;
      eventuallyQueue = null;
      if (localParseEventuallyQueue != null) {
        localParseEventuallyQueue.onDestroy();
      }
      ParseCorePlugins.getInstance().reset();
      ParsePlugins.reset();
      return;
    }
  }
  
  static void disableLocalDatastore()
  {
    setLocalDatastore(null);
    ParseCorePlugins.getInstance().reset();
  }
  
  private static void dispatchOnParseInitialized()
  {
    Parse.ParseCallbacks[] arrayOfParseCallbacks = collectParseCallbacks();
    if (arrayOfParseCallbacks != null)
    {
      int j = arrayOfParseCallbacks.length;
      int i = 0;
      while (i < j)
      {
        arrayOfParseCallbacks[i].onParseInitialized();
        i += 1;
      }
    }
  }
  
  public static void enableLocalDatastore(Context paramContext)
  {
    if (isInitialized()) {
      throw new IllegalStateException("`Parse#enableLocalDatastore(Context)` must be invoked before `Parse#initialize(Context)`");
    }
    isLocalDatastoreEnabled = true;
  }
  
  static String externalVersionName()
  {
    return "a1.13.1";
  }
  
  static Context getApplicationContext()
  {
    checkContext();
    return ParsePlugins.Android.get().applicationContext();
  }
  
  static ParseEventuallyQueue getEventuallyQueue()
  {
    return getEventuallyQueue(ParsePlugins.Android.get().applicationContext());
  }
  
  private static ParseEventuallyQueue getEventuallyQueue(Context paramContext)
  {
    synchronized (MUTEX)
    {
      boolean bool = isLocalDatastoreEnabled();
      ParseHttpClient localParseHttpClient;
      if ((eventuallyQueue == null) || ((bool) && ((eventuallyQueue instanceof ParseCommandCache))) || ((!bool) && ((eventuallyQueue instanceof ParsePinningEventuallyQueue))))
      {
        checkContext();
        localParseHttpClient = ParsePlugins.get().restClient();
        if (!bool) {
          break label101;
        }
        localObject1 = new ParsePinningEventuallyQueue(paramContext, localParseHttpClient);
        eventuallyQueue = (ParseEventuallyQueue)localObject1;
        if ((bool) && (ParseCommandCache.getPendingCount() > 0)) {
          new ParseCommandCache(paramContext, localParseHttpClient);
        }
      }
      paramContext = eventuallyQueue;
      return paramContext;
      label101:
      Object localObject1 = new ParseCommandCache(paramContext, localParseHttpClient);
    }
  }
  
  static OfflineStore getLocalDatastore()
  {
    return offlineStore;
  }
  
  public static int getLogLevel()
  {
    return PLog.getLogLevel();
  }
  
  static File getParseCacheDir()
  {
    return ParsePlugins.get().getCacheDir();
  }
  
  static File getParseCacheDir(String paramString)
  {
    synchronized (MUTEX)
    {
      paramString = new File(getParseCacheDir(), paramString);
      if (!paramString.exists()) {
        paramString.mkdirs();
      }
      return paramString;
    }
  }
  
  @Deprecated
  static File getParseDir()
  {
    return ParsePlugins.get().getParseDir();
  }
  
  static File getParseFilesDir()
  {
    return ParsePlugins.get().getFilesDir();
  }
  
  static File getParseFilesDir(String paramString)
  {
    synchronized (MUTEX)
    {
      paramString = new File(getParseFilesDir(), paramString);
      if (!paramString.exists()) {
        paramString.mkdirs();
      }
      return paramString;
    }
  }
  
  static boolean hasPermission(String paramString)
  {
    return getApplicationContext().checkCallingOrSelfPermission(paramString) == 0;
  }
  
  public static void initialize(Context paramContext)
  {
    paramContext = new Parse.Configuration.Builder(paramContext);
    if (Parse.Configuration.Builder.access$200(paramContext) == null) {
      throw new RuntimeException("ApplicationId not defined. You must provide ApplicationId in AndroidManifest.xml.\n<meta-data\n    android:name=\"com.parse.APPLICATION_ID\"\n    android:value=\"<Your Application Id>\" />");
    }
    if (Parse.Configuration.Builder.access$300(paramContext) == null) {
      throw new RuntimeException("ClientKey not defined. You must provide ClientKey in AndroidManifest.xml.\n<meta-data\n    android:name=\"com.parse.CLIENT_KEY\"\n    android:value=\"<Your Client Key>\" />");
    }
    initialize(Parse.Configuration.Builder.access$700(paramContext.setNetworkInterceptors(interceptors), isLocalDatastoreEnabled).build());
  }
  
  public static void initialize(Context paramContext, String paramString1, String paramString2)
  {
    initialize(Parse.Configuration.Builder.access$700(new Parse.Configuration.Builder(paramContext).applicationId(paramString1).clientKey(paramString2).setNetworkInterceptors(interceptors), isLocalDatastoreEnabled).build());
  }
  
  public static void initialize(Parse.Configuration arg0)
  {
    isLocalDatastoreEnabled = ???.localDataStoreEnabled;
    ParsePlugins.Android.initialize(???.context, ???.applicationId, ???.clientKey);
    Context localContext;
    for (;;)
    {
      try
      {
        ParseRESTCommand.server = new URL(???.server);
        localContext = ???.context.getApplicationContext();
        ParseHttpClient.setKeepAlive(true);
        ParseHttpClient.setMaxConnections(20);
        if ((???.interceptors != null) && (???.interceptors.size() > 0)) {
          initializeParseHttpClientsWithParseNetworkInterceptors(???.interceptors);
        }
        ParseObject.registerParseSubclasses();
        if (???.localDataStoreEnabled)
        {
          offlineStore = new OfflineStore(???.context);
          checkCacheApplicationId();
          o.a(new Parse.1(???.context));
          ParseFieldOperations.registerDefaultDecoders();
          if (allParsePushIntentReceiversInternal()) {
            break;
          }
          throw new SecurityException("To prevent external tampering to your app's notifications, all receivers registered to handle the following actions must have their exported attributes set to false: com.parse.push.intent.RECEIVE, com.parse.push.intent.OPEN, com.parse.push.intent.DELETE");
        }
      }
      catch (MalformedURLException ???)
      {
        throw new RuntimeException(???);
      }
      ParseKeyValueCache.initialize(???.context);
    }
    GcmRegistrar.getInstance().registerAsync().b(new Parse.3()).a(new Parse.2(), o.a);
    if (ManifestInfo.getPushType() == PushType.PPNS) {
      PushService.startServiceIfRequired(localContext);
    }
    dispatchOnParseInitialized();
    synchronized (MUTEX_CALLBACKS)
    {
      callbacks = null;
      return;
    }
  }
  
  private static void initializeParseHttpClientsWithParseNetworkInterceptors(List<ParseNetworkInterceptor> paramList)
  {
    if (paramList == null) {
      return;
    }
    Object localObject = new ArrayList();
    ((List)localObject).add(ParsePlugins.get().restClient());
    ((List)localObject).add(ParseCorePlugins.getInstance().getFileController().awsClient());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ParseHttpClient localParseHttpClient = (ParseHttpClient)((Iterator)localObject).next();
      localParseHttpClient.addInternalInterceptor(new ParseDecompressInterceptor());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        localParseHttpClient.addExternalInterceptor((ParseNetworkInterceptor)localIterator.next());
      }
    }
  }
  
  static boolean isInitialized()
  {
    return ParsePlugins.get() != null;
  }
  
  static boolean isLocalDatastoreEnabled()
  {
    return isLocalDatastoreEnabled;
  }
  
  static void registerParseCallbacks(Parse.ParseCallbacks paramParseCallbacks)
  {
    if (isInitialized()) {
      throw new IllegalStateException("You must register callbacks before Parse.initialize(Context)");
    }
    synchronized (MUTEX_CALLBACKS)
    {
      if (callbacks == null) {
        return;
      }
      callbacks.add(paramParseCallbacks);
      return;
    }
  }
  
  public static void removeParseNetworkInterceptor(ParseNetworkInterceptor paramParseNetworkInterceptor)
  {
    if (isInitialized()) {
      throw new IllegalStateException("`Parse#addParseNetworkInterceptor(ParseNetworkInterceptor)` must be invoked before `Parse#initialize(Context)`");
    }
    if (interceptors == null) {
      return;
    }
    interceptors.remove(paramParseNetworkInterceptor);
  }
  
  static void requirePermission(String paramString)
  {
    if (!hasPermission(paramString)) {
      throw new IllegalStateException("To use this functionality, add this to your AndroidManifest.xml:\n<uses-permission android:name=\"" + paramString + "\" />");
    }
  }
  
  static void setLocalDatastore(OfflineStore paramOfflineStore)
  {
    if (paramOfflineStore != null) {}
    for (boolean bool = true;; bool = false)
    {
      isLocalDatastoreEnabled = bool;
      offlineStore = paramOfflineStore;
      return;
    }
  }
  
  public static void setLogLevel(int paramInt)
  {
    PLog.setLogLevel(paramInt);
  }
  
  static void unregisterParseCallbacks(Parse.ParseCallbacks paramParseCallbacks)
  {
    synchronized (MUTEX_CALLBACKS)
    {
      if (callbacks == null) {
        return;
      }
      callbacks.remove(paramParseCallbacks);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\Parse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */