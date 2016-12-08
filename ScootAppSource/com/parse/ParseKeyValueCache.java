package com.parse;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

class ParseKeyValueCache
{
  static final int DEFAULT_MAX_KEY_VALUE_CACHE_BYTES = 2097152;
  static final int DEFAULT_MAX_KEY_VALUE_CACHE_FILES = 1000;
  private static final String DIR_NAME = "ParseKeyValueCache";
  private static final Object MUTEX_IO = new Object();
  private static final String TAG = "ParseKeyValueCache";
  private static File directory;
  static int maxKeyValueCacheBytes = 2097152;
  static int maxKeyValueCacheFiles = 1000;
  
  static void clearFromKeyValueCache(String paramString)
  {
    synchronized (MUTEX_IO)
    {
      paramString = getKeyValueCacheFile(paramString);
      if (paramString != null) {
        paramString.delete();
      }
      return;
    }
  }
  
  static void clearKeyValueCacheDir()
  {
    synchronized (MUTEX_IO)
    {
      Object localObject2 = getKeyValueCacheDir();
      if (localObject2 == null) {
        return;
      }
      localObject2 = ((File)localObject2).listFiles();
      if (localObject2 == null) {
        return;
      }
    }
    int j = localObject3.length;
    int i = 0;
    while (i < j)
    {
      localObject3[i].delete();
      i += 1;
    }
  }
  
  private static File createKeyValueCacheFile(String paramString)
  {
    paramString = String.valueOf(new Date().getTime()) + '.' + paramString;
    return new File(getKeyValueCacheDir(), paramString);
  }
  
  private static long getKeyValueCacheAge(File paramFile)
  {
    paramFile = paramFile.getName();
    try
    {
      long l = Long.parseLong(paramFile.substring(0, paramFile.indexOf('.')));
      return l;
    }
    catch (NumberFormatException paramFile) {}
    return 0L;
  }
  
  private static File getKeyValueCacheDir()
  {
    if ((directory != null) && (!directory.exists())) {
      directory.mkdir();
    }
    return directory;
  }
  
  private static File getKeyValueCacheFile(String paramString)
  {
    paramString = '.' + paramString;
    paramString = getKeyValueCacheDir().listFiles(new ParseKeyValueCache.1(paramString));
    if ((paramString == null) || (paramString.length == 0)) {
      return null;
    }
    return paramString[0];
  }
  
  static void initialize(Context paramContext)
  {
    initialize(new File(paramContext.getCacheDir(), "ParseKeyValueCache"));
  }
  
  static void initialize(File paramFile)
  {
    if ((!paramFile.isDirectory()) && (!paramFile.mkdir())) {
      throw new RuntimeException("Could not create ParseKeyValueCache directory");
    }
    directory = paramFile;
  }
  
  static JSONObject jsonFromKeyValueCache(String paramString, long paramLong)
  {
    Object localObject = loadFromKeyValueCache(paramString, paramLong);
    if (localObject == null) {
      return null;
    }
    try
    {
      localObject = new JSONObject((String)localObject);
      return (JSONObject)localObject;
    }
    catch (JSONException localJSONException)
    {
      PLog.e("ParseKeyValueCache", "corrupted cache for " + paramString, localJSONException);
      clearFromKeyValueCache(paramString);
    }
    return null;
  }
  
  static String loadFromKeyValueCache(String paramString, long paramLong)
  {
    Object localObject2;
    synchronized (MUTEX_IO)
    {
      paramString = getKeyValueCacheFile(paramString);
      if (paramString == null) {
        return null;
      }
      localObject2 = new Date();
      paramLong = Math.max(0L, ((Date)localObject2).getTime() - paramLong);
      if (getKeyValueCacheAge(paramString) < paramLong) {
        return null;
      }
    }
    paramString.setLastModified(((Date)localObject2).getTime());
    try
    {
      paramString = new RandomAccessFile(paramString, "r");
      localObject2 = new byte[(int)paramString.length()];
      paramString.readFully((byte[])localObject2);
      paramString.close();
      paramString = new String((byte[])localObject2, "UTF-8");
      return paramString;
    }
    catch (IOException paramString)
    {
      PLog.e("ParseKeyValueCache", "error reading from cache", paramString);
    }
    return null;
  }
  
  static void saveToKeyValueCache(String paramString1, String paramString2)
  {
    int m = 0;
    synchronized (MUTEX_IO)
    {
      File localFile = getKeyValueCacheFile(paramString1);
      if (localFile != null) {
        localFile.delete();
      }
      paramString1 = createKeyValueCacheFile(paramString1);
    }
    try
    {
      ParseFileUtils.writeByteArrayToFile(paramString1, paramString2.getBytes("UTF-8"));
      paramString1 = getKeyValueCacheDir().listFiles();
      if ((paramString1 == null) || (paramString1.length == 0)) {
        return;
      }
      int k = paramString1.length;
      int n = paramString1.length;
      int j = 0;
      int i = 0;
      while (j < n)
      {
        paramString2 = paramString1[j];
        i = (int)(i + paramString2.length());
        j += 1;
      }
      if ((k <= maxKeyValueCacheFiles) && (i <= maxKeyValueCacheBytes))
      {
        return;
        paramString1 = finally;
        throw paramString1;
      }
      Arrays.sort(paramString1, new ParseKeyValueCache.2());
      n = paramString1.length;
      j = i;
      i = m;
      for (;;)
      {
        if (i < n)
        {
          paramString2 = paramString1[i];
          k -= 1;
          j = (int)(j - paramString2.length());
          paramString2.delete();
          if ((k > maxKeyValueCacheFiles) || (j > maxKeyValueCacheBytes)) {}
        }
        else
        {
          return;
        }
        i += 1;
      }
    }
    catch (IOException paramString1)
    {
      for (;;) {}
    }
    catch (UnsupportedEncodingException paramString1)
    {
      for (;;) {}
    }
  }
  
  static int size()
  {
    File[] arrayOfFile = getKeyValueCacheDir().listFiles();
    if (arrayOfFile == null) {
      return 0;
    }
    return arrayOfFile.length;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseKeyValueCache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */