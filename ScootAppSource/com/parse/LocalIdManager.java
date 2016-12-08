package com.parse;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

class LocalIdManager
{
  private final File diskPath;
  private final Random random;
  
  LocalIdManager(File paramFile)
  {
    this.diskPath = new File(paramFile, "LocalId");
    this.random = new Random();
  }
  
  private LocalIdManager.MapEntry getMapEntry(String paramString)
  {
    try
    {
      if (!isLocalId(paramString)) {
        throw new IllegalStateException("Tried to get invalid local id: \"" + paramString + "\".");
      }
    }
    finally {}
    try
    {
      JSONObject localJSONObject = ParseFileUtils.readFileToJSONObject(new File(this.diskPath, paramString));
      paramString = new LocalIdManager.MapEntry(null);
      paramString.retainCount = localJSONObject.optInt("retainCount", 0);
      paramString.objectId = localJSONObject.optString("objectId", null);
      return paramString;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString = new LocalIdManager.MapEntry(null);
      }
    }
    catch (IOException paramString)
    {
      for (;;) {}
    }
  }
  
  private boolean isLocalId(String paramString)
  {
    if (!paramString.startsWith("local_")) {
      return false;
    }
    int i = 6;
    while (i < paramString.length())
    {
      int j = paramString.charAt(i);
      if (((j < 48) || (j > 57)) && ((j < 97) || (j > 102))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  /* Error */
  private void putMapEntry(String paramString, LocalIdManager.MapEntry paramMapEntry)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 38	com/parse/LocalIdManager:isLocalId	(Ljava/lang/String;)Z
    //   7: ifne +40 -> 47
    //   10: new 40	java/lang/IllegalStateException
    //   13: dup
    //   14: new 42	java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial 43	java/lang/StringBuilder:<init>	()V
    //   21: ldc 45
    //   23: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_1
    //   27: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: ldc 51
    //   32: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokespecial 58	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   41: athrow
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    //   47: new 73	org/json/JSONObject
    //   50: dup
    //   51: invokespecial 107	org/json/JSONObject:<init>	()V
    //   54: astore_3
    //   55: aload_3
    //   56: ldc 71
    //   58: aload_2
    //   59: getfield 80	com/parse/LocalIdManager$MapEntry:retainCount	I
    //   62: invokevirtual 111	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   65: pop
    //   66: aload_2
    //   67: getfield 89	com/parse/LocalIdManager$MapEntry:objectId	Ljava/lang/String;
    //   70: ifnull +14 -> 84
    //   73: aload_3
    //   74: ldc 82
    //   76: aload_2
    //   77: getfield 89	com/parse/LocalIdManager$MapEntry:objectId	Ljava/lang/String;
    //   80: invokevirtual 114	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   83: pop
    //   84: new 15	java/io/File
    //   87: dup
    //   88: aload_0
    //   89: getfield 22	com/parse/LocalIdManager:diskPath	Ljava/io/File;
    //   92: aload_1
    //   93: invokespecial 20	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   96: astore_1
    //   97: aload_0
    //   98: getfield 22	com/parse/LocalIdManager:diskPath	Ljava/io/File;
    //   101: invokevirtual 118	java/io/File:exists	()Z
    //   104: ifne +11 -> 115
    //   107: aload_0
    //   108: getfield 22	com/parse/LocalIdManager:diskPath	Ljava/io/File;
    //   111: invokevirtual 121	java/io/File:mkdirs	()Z
    //   114: pop
    //   115: aload_1
    //   116: aload_3
    //   117: invokestatic 125	com/parse/ParseFileUtils:writeJSONObjectToFile	(Ljava/io/File;Lorg/json/JSONObject;)V
    //   120: aload_0
    //   121: monitorexit
    //   122: return
    //   123: astore_1
    //   124: new 40	java/lang/IllegalStateException
    //   127: dup
    //   128: ldc 127
    //   130: aload_1
    //   131: invokespecial 130	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: astore_1
    //   136: goto -16 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	LocalIdManager
    //   0	139	1	paramString	String
    //   0	139	2	paramMapEntry	LocalIdManager.MapEntry
    //   54	63	3	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   2	42	42	finally
    //   47	55	42	finally
    //   55	84	42	finally
    //   84	115	42	finally
    //   115	120	42	finally
    //   124	135	42	finally
    //   55	84	123	org/json/JSONException
    //   115	120	135	java/io/IOException
  }
  
  private void removeMapEntry(String paramString)
  {
    try
    {
      if (!isLocalId(paramString)) {
        throw new IllegalStateException("Tried to get invalid local id: \"" + paramString + "\".");
      }
    }
    finally {}
    ParseFileUtils.deleteQuietly(new File(this.diskPath, paramString));
  }
  
  boolean clear()
  {
    int i = 0;
    boolean bool = false;
    for (;;)
    {
      try
      {
        String[] arrayOfString = this.diskPath.list();
        if (arrayOfString == null) {
          return bool;
        }
        if (arrayOfString.length == 0) {
          continue;
        }
        int j = arrayOfString.length;
        if (i >= j) {
          break label111;
        }
        String str = arrayOfString[i];
        if (!new File(this.diskPath, str).delete()) {
          throw new IOException("Unable to delete file " + str + " in localId cache.");
        }
      }
      finally {}
      i += 1;
      continue;
      label111:
      bool = true;
    }
  }
  
  String createLocalId()
  {
    try
    {
      long l = this.random.nextLong();
      String str1 = "local_" + Long.toHexString(l);
      if (!isLocalId(str1)) {
        throw new IllegalStateException("Generated an invalid local id: \"" + str1 + "\". This should never happen. Contact us at https://parse.com/help");
      }
    }
    finally {}
    return str2;
  }
  
  String getObjectId(String paramString)
  {
    try
    {
      paramString = getMapEntry(paramString).objectId;
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  void releaseLocalIdOnDisk(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 167	com/parse/LocalIdManager:getMapEntry	(Ljava/lang/String;)Lcom/parse/LocalIdManager$MapEntry;
    //   7: astore_2
    //   8: aload_2
    //   9: aload_2
    //   10: getfield 80	com/parse/LocalIdManager$MapEntry:retainCount	I
    //   13: iconst_1
    //   14: isub
    //   15: putfield 80	com/parse/LocalIdManager$MapEntry:retainCount	I
    //   18: aload_2
    //   19: getfield 80	com/parse/LocalIdManager$MapEntry:retainCount	I
    //   22: ifle +12 -> 34
    //   25: aload_0
    //   26: aload_1
    //   27: aload_2
    //   28: invokespecial 170	com/parse/LocalIdManager:putMapEntry	(Ljava/lang/String;Lcom/parse/LocalIdManager$MapEntry;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: aload_0
    //   35: aload_1
    //   36: invokespecial 172	com/parse/LocalIdManager:removeMapEntry	(Ljava/lang/String;)V
    //   39: goto -8 -> 31
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	LocalIdManager
    //   0	47	1	paramString	String
    //   7	21	2	localMapEntry	LocalIdManager.MapEntry
    // Exception table:
    //   from	to	target	type
    //   2	31	42	finally
    //   34	39	42	finally
  }
  
  void retainLocalIdOnDisk(String paramString)
  {
    try
    {
      LocalIdManager.MapEntry localMapEntry = getMapEntry(paramString);
      localMapEntry.retainCount += 1;
      putMapEntry(paramString, localMapEntry);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  void setObjectId(String paramString1, String paramString2)
  {
    LocalIdManager.MapEntry localMapEntry;
    try
    {
      localMapEntry = getMapEntry(paramString1);
      if (localMapEntry.retainCount <= 0) {
        break label48;
      }
      if (localMapEntry.objectId != null) {
        throw new IllegalStateException("Tried to set an objectId for a localId that already has one.");
      }
    }
    finally {}
    localMapEntry.objectId = paramString2;
    putMapEntry(paramString1, localMapEntry);
    label48:
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\LocalIdManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */