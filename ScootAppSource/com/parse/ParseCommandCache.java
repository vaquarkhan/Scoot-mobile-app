package com.parse;

import a.ac;
import a.l;
import a.o;
import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

class ParseCommandCache
  extends ParseEventuallyQueue
{
  private static final String TAG = "com.parse.ParseCommandCache";
  private static int filenameCounter = 0;
  private static final Object lock = new Object();
  private File cachePath;
  private final ParseHttpClient httpClient;
  ConnectivityNotifier.ConnectivityListener listener = new ParseCommandCache.1(this);
  private Logger log;
  private int maxCacheSizeBytes = 10485760;
  ConnectivityNotifier notifier;
  private HashMap<File, ac<JSONObject>> pendingTasks = new HashMap();
  private boolean running;
  private final Object runningLock;
  private boolean shouldStop;
  private int timeoutMaxRetries = 5;
  private double timeoutRetryWaitSeconds = 600.0D;
  private boolean unprocessedCommandsExist;
  
  public ParseCommandCache(Context paramContext, ParseHttpClient paramParseHttpClient)
  {
    setConnected(false);
    this.shouldStop = false;
    this.running = false;
    this.runningLock = new Object();
    this.httpClient = paramParseHttpClient;
    this.log = Logger.getLogger("com.parse.ParseCommandCache");
    this.cachePath = getCacheDir();
    if (!Parse.hasPermission("android.permission.ACCESS_NETWORK_STATE")) {
      return;
    }
    setConnected(ConnectivityNotifier.isConnected(paramContext));
    this.notifier = ConnectivityNotifier.getNotifier(paramContext);
    this.notifier.addListener(this.listener);
    resume();
  }
  
  private o<JSONObject> enqueueEventuallyAsync(ParseRESTCommand paramParseRESTCommand, boolean paramBoolean, ParseObject paramParseObject)
  {
    int k = 0;
    Parse.requirePermission("android.permission.ACCESS_NETWORK_STATE");
    ac localac = new ac();
    if (paramParseObject != null) {}
    byte[] arrayOfByte;
    try
    {
      if (paramParseObject.getObjectId() == null) {
        paramParseRESTCommand.setLocalId(paramParseObject.getOrCreateLocalId());
      }
      arrayOfByte = paramParseRESTCommand.toJSONObject().toString().getBytes("UTF-8");
      if (arrayOfByte.length > this.maxCacheSizeBytes)
      {
        if (5 >= Parse.getLogLevel()) {
          this.log.warning("Unable to save command for later because it's too big.");
        }
        notifyTestHelper(4);
        return o.a(null);
      }
    }
    catch (UnsupportedEncodingException paramParseRESTCommand)
    {
      if (5 >= Parse.getLogLevel()) {
        this.log.log(Level.WARNING, "UTF-8 isn't supported.  This shouldn't happen.", paramParseRESTCommand);
      }
      notifyTestHelper(4);
      return o.a(null);
    }
    Object localObject2 = lock;
    for (;;)
    {
      try
      {
        paramParseObject = this.cachePath.list();
        if (paramParseObject != null)
        {
          Arrays.sort(paramParseObject);
          int m = paramParseObject.length;
          i = 0;
          int j = 0;
          if (i < m)
          {
            localObject1 = paramParseObject[i];
            j += (int)new File(this.cachePath, (String)localObject1).length();
            i += 1;
            continue;
          }
          j = arrayOfByte.length + j;
          if (j > this.maxCacheSizeBytes)
          {
            if (paramBoolean)
            {
              if (5 >= Parse.getLogLevel()) {
                this.log.warning("Unable to save command for later because storage is full.");
              }
              paramParseRESTCommand = o.a(null);
              try
              {
                return paramParseRESTCommand;
              }
              finally {}
            }
            if (5 < Parse.getLogLevel()) {
              break label615;
            }
            this.log.warning("Deleting old commands to make room in command cache.");
            break label615;
            if ((j > this.maxCacheSizeBytes) && (i < paramParseObject.length))
            {
              localObject1 = new File(this.cachePath, paramParseObject[i]);
              k = (int)((File)localObject1).length();
              removeFile((File)localObject1);
              j -= k;
              i += 1;
              continue;
            }
          }
        }
        paramParseObject = Long.toHexString(System.currentTimeMillis());
        if (paramParseObject.length() >= 16) {
          break label612;
        }
        Object localObject1 = new char[16 - paramParseObject.length()];
        Arrays.fill((char[])localObject1, '0');
        paramParseObject = new String((char[])localObject1) + paramParseObject;
        i = filenameCounter;
        filenameCounter = i + 1;
        String str = Integer.toHexString(i);
        localObject1 = str;
        if (str.length() < 8)
        {
          localObject1 = new char[8 - str.length()];
          Arrays.fill((char[])localObject1, '0');
          localObject1 = new String((char[])localObject1) + str;
        }
        paramParseObject = File.createTempFile("CachedCommand_" + paramParseObject + "_" + (String)localObject1 + "_", "", this.cachePath);
        this.pendingTasks.put(paramParseObject, localac);
        paramParseRESTCommand.retainLocalIds();
        ParseFileUtils.writeByteArrayToFile(paramParseObject, arrayOfByte);
        notifyTestHelper(3);
        this.unprocessedCommandsExist = true;
      }
      catch (IOException paramParseRESTCommand)
      {
        if (5 < Parse.getLogLevel()) {
          continue;
        }
        this.log.log(Level.WARNING, "Unable to save command for later.", paramParseRESTCommand);
        lock.notifyAll();
        continue;
      }
      finally
      {
        lock.notifyAll();
      }
      return localac.a();
      label612:
      continue;
      label615:
      int i = k;
    }
  }
  
  private static File getCacheDir()
  {
    File localFile = new File(Parse.getParseDir(), "CommandCache");
    localFile.mkdirs();
    return localFile;
  }
  
  public static int getPendingCount()
  {
    synchronized (lock)
    {
      String[] arrayOfString = getCacheDir().list();
      if (arrayOfString == null)
      {
        i = 0;
        return i;
      }
      int i = arrayOfString.length;
    }
  }
  
  private void maybeRunAllCommandsNow(int paramInt)
  {
    String[] arrayOfString;
    synchronized (lock)
    {
      this.unprocessedCommandsExist = false;
      if (!isConnected()) {
        return;
      }
      arrayOfString = this.cachePath.list();
      if ((arrayOfString == null) || (arrayOfString.length == 0)) {
        return;
      }
    }
    Arrays.sort(arrayOfString);
    int j = arrayOfString.length;
    int i = 0;
    Object localObject2;
    File localFile;
    if (i < j)
    {
      localObject2 = arrayOfString[i];
      localFile = new File(this.cachePath, (String)localObject2);
    }
    for (;;)
    {
      Object localObject4;
      try
      {
        localObject4 = ParseFileUtils.readFileToJSONObject(localFile);
        if (!this.pendingTasks.containsKey(localFile)) {
          break label624;
        }
        localObject2 = (ac)this.pendingTasks.get(localFile);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        if (6 < Parse.getLogLevel()) {
          continue;
        }
        this.log.log(Level.SEVERE, "File disappeared from cache while being read.", localFileNotFoundException);
        continue;
      }
      catch (IOException localIOException)
      {
        if (6 >= Parse.getLogLevel()) {
          this.log.log(Level.SEVERE, "Unable to read contents of file in cache.", localIOException);
        }
        removeFile(localFile);
        continue;
      }
      catch (JSONException localJSONException1)
      {
        if (6 >= Parse.getLogLevel()) {
          this.log.log(Level.SEVERE, "Error parsing JSON found in cache.", localJSONException1);
        }
        removeFile(localFile);
        continue;
      }
      try
      {
        localObject4 = commandFromJSON((JSONObject)localObject4);
        if (localObject4 != null) {}
      }
      catch (JSONException localJSONException2)
      {
        if (6 >= Parse.getLogLevel()) {
          this.log.log(Level.SEVERE, "Unable to create ParseCommand from JSON.", localJSONException2);
        }
        removeFile(localFile);
        continue;
        localObject4 = ((ParseRESTCommand)localObject4).executeAsync(this.httpClient).b(new ParseCommandCache.4(this, (ParseRESTCommand)localObject4, localJSONException2));
        continue;
      }
      try
      {
        localObject4 = o.a(null);
        if (localObject2 != null) {
          ((ac)localObject2).b(null);
        }
        notifyTestHelper(8);
        waitForTaskWithoutLock((o)localObject4);
        if (localObject2 != null) {
          waitForTaskWithoutLock(((ac)localObject2).a());
        }
        removeFile(localFile);
        notifyTestHelper(1);
      }
      catch (ParseException localParseException)
      {
        if (localParseException.getCode() != 100) {
          break label581;
        }
        if (paramInt <= 0) {
          break label567;
        }
        if (4 < Parse.getLogLevel()) {
          break label430;
        }
        this.log.info("Network timeout in command cache. Waiting for " + this.timeoutRetryWaitSeconds + " seconds and then retrying " + paramInt + " times.");
        label430:
        long l1 = System.currentTimeMillis();
        long l3 = (this.timeoutRetryWaitSeconds * 1000.0D) + l1;
        for (;;)
        {
          if (l1 < l3)
          {
            if ((!isConnected()) || (this.shouldStop))
            {
              if (4 >= Parse.getLogLevel()) {
                this.log.info("Aborting wait because runEventually thread should stop.");
              }
              return;
            }
            try
            {
              lock.wait(l3 - l1);
              long l2 = System.currentTimeMillis();
              l1 = l2;
              if (l2 < l3 - (this.timeoutRetryWaitSeconds * 1000.0D)) {
                l1 = l3 - (this.timeoutRetryWaitSeconds * 1000.0D);
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              for (;;)
              {
                this.shouldStop = true;
              }
            }
          }
        }
        maybeRunAllCommandsNow(paramInt - 1);
        continue;
        label567:
        setConnected(false);
        notifyTestHelper(7);
        continue;
        label581:
        if (6 < Parse.getLogLevel()) {
          break label604;
        }
        this.log.log(Level.SEVERE, "Failed to run command.", localInterruptedException);
        label604:
        removeFile(localFile);
        notifyTestHelper(2, localInterruptedException);
        continue;
      }
      i += 1;
      break;
      return;
      label624:
      Object localObject3 = null;
    }
  }
  
  private void removeFile(File paramFile)
  {
    synchronized (lock)
    {
      this.pendingTasks.remove(paramFile);
    }
    try
    {
      commandFromJSON(ParseFileUtils.readFileToJSONObject(paramFile)).releaseLocalIds();
      ParseFileUtils.deleteQuietly(paramFile);
      return;
      paramFile = finally;
      throw paramFile;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private void runLoop()
  {
    if (4 >= Parse.getLogLevel()) {
      this.log.info("Parse command cache has started processing queued commands.");
    }
    int i;
    synchronized (this.runningLock)
    {
      if (this.running) {
        return;
      }
      this.running = true;
      this.runningLock.notifyAll();
      synchronized (lock)
      {
        if ((!this.shouldStop) && (!Thread.interrupted()))
        {
          i = 1;
          label71:
          if (i == 0) {
            break label210;
          }
          ??? = lock;
        }
      }
    }
    for (;;)
    {
      try
      {
        maybeRunAllCommandsNow(this.timeoutMaxRetries);
        boolean bool = this.shouldStop;
        if (bool) {}
      }
      catch (Exception localException)
      {
        if (6 < Parse.getLogLevel()) {
          continue;
        }
        this.log.log(Level.SEVERE, "saveEventually thread had an error.", localException);
        if (this.shouldStop) {
          break label262;
        }
        i = 1;
        continue;
      }
      finally
      {
        if (this.shouldStop) {
          continue;
        }
      }
      try
      {
        if (!this.unprocessedCommandsExist) {
          lock.wait();
        }
        try
        {
          if (this.shouldStop) {
            break label257;
          }
          i = 1;
          break label71;
        }
        finally {}
        localObject3 = finally;
        throw ((Throwable)localObject3);
        i = 0;
        break;
        localObject4 = finally;
        throw ((Throwable)localObject4);
      }
      catch (InterruptedException localInterruptedException)
      {
        this.shouldStop = true;
        continue;
      }
      label210:
      synchronized (this.runningLock)
      {
        this.running = false;
        this.runningLock.notifyAll();
        if (4 >= Parse.getLogLevel())
        {
          this.log.info("saveEventually thread has stopped processing commands.");
          return;
        }
      }
      return;
      label257:
      i = 0;
      continue;
      label262:
      i = 0;
    }
  }
  
  private <T> T waitForTaskWithoutLock(o<T> paramo)
  {
    synchronized (lock)
    {
      l locall = new l(Boolean.valueOf(false));
      paramo.a(new ParseCommandCache.3(this, locall), o.a);
      for (;;)
      {
        boolean bool = ((Boolean)locall.a()).booleanValue();
        if (!bool) {
          try
          {
            lock.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            this.shouldStop = true;
          }
        }
      }
    }
    paramo = ParseTaskUtils.wait(paramo);
    return paramo;
  }
  
  public void clear()
  {
    synchronized (lock)
    {
      File[] arrayOfFile = this.cachePath.listFiles();
      if (arrayOfFile == null) {
        return;
      }
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        removeFile(arrayOfFile[i]);
        i += 1;
      }
      this.pendingTasks.clear();
      return;
    }
  }
  
  public o<JSONObject> enqueueEventuallyAsync(ParseRESTCommand paramParseRESTCommand, ParseObject paramParseObject)
  {
    return enqueueEventuallyAsync(paramParseRESTCommand, false, paramParseObject);
  }
  
  void fakeObjectUpdate()
  {
    notifyTestHelper(3);
    notifyTestHelper(1);
    notifyTestHelper(5);
  }
  
  public void onDestroy()
  {
    this.notifier.removeListener(this.listener);
  }
  
  public void pause()
  {
    synchronized (this.runningLock)
    {
      if (this.running) {}
      synchronized (lock)
      {
        this.shouldStop = true;
        lock.notifyAll();
        for (;;)
        {
          boolean bool = this.running;
          if (bool) {
            try
            {
              this.runningLock.wait();
            }
            catch (InterruptedException localInterruptedException) {}
          }
        }
      }
    }
  }
  
  public int pendingCount()
  {
    return getPendingCount();
  }
  
  public void resume()
  {
    synchronized (this.runningLock)
    {
      if (!this.running) {
        new ParseCommandCache.2(this, "ParseCommandCache.runLoop()").start();
      }
      try
      {
        this.runningLock.wait();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        synchronized (lock)
        {
          this.shouldStop = true;
          lock.notifyAll();
        }
      }
    }
  }
  
  public void setConnected(boolean paramBoolean)
  {
    synchronized (lock)
    {
      if ((isConnected() != paramBoolean) && (paramBoolean)) {
        lock.notifyAll();
      }
      super.setConnected(paramBoolean);
      return;
    }
  }
  
  public void setMaxCacheSizeBytes(int paramInt)
  {
    synchronized (lock)
    {
      this.maxCacheSizeBytes = paramInt;
      return;
    }
  }
  
  public void setTimeoutMaxRetries(int paramInt)
  {
    synchronized (lock)
    {
      this.timeoutMaxRetries = paramInt;
      return;
    }
  }
  
  public void setTimeoutRetryWaitSeconds(double paramDouble)
  {
    synchronized (lock)
    {
      this.timeoutRetryWaitSeconds = paramDouble;
      return;
    }
  }
  
  void simulateReboot()
  {
    synchronized (lock)
    {
      this.pendingTasks.clear();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseCommandCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */