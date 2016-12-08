package com.c.a.c;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

final class bc
{
  private static final Charset a = Charset.forName("UTF-8");
  private final File b;
  
  public bc(File paramFile)
  {
    this.b = paramFile;
  }
  
  private static String a(JSONObject paramJSONObject, String paramString)
  {
    String str = null;
    if (!paramJSONObject.isNull(paramString)) {
      str = paramJSONObject.optString(paramString, null);
    }
    return str;
  }
  
  private File c(String paramString)
  {
    return new File(this.b, paramString + "user" + ".meta");
  }
  
  private File d(String paramString)
  {
    return new File(this.b, paramString + "keys" + ".meta");
  }
  
  private static cb e(String paramString)
  {
    paramString = new JSONObject(paramString);
    return new cb(a(paramString, "userId"), a(paramString, "userName"), a(paramString, "userEmail"));
  }
  
  private static Map<String, String> f(String paramString)
  {
    paramString = new JSONObject(paramString);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramString.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, a(paramString, str));
    }
    return localHashMap;
  }
  
  /* Error */
  public cb a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 113	com/c/a/c/bc:c	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_1
    //   6: aload_1
    //   7: invokevirtual 116	java/io/File:exists	()Z
    //   10: ifne +7 -> 17
    //   13: getstatic 119	com/c/a/c/cb:a	Lcom/c/a/c/cb;
    //   16: areturn
    //   17: new 121	java/io/FileInputStream
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 123	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_2
    //   26: aload_2
    //   27: astore_1
    //   28: aload_2
    //   29: invokestatic 128	b/a/a/a/a/b/m:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   32: invokestatic 130	com/c/a/c/bc:e	(Ljava/lang/String;)Lcom/c/a/c/cb;
    //   35: astore_3
    //   36: aload_2
    //   37: ldc -124
    //   39: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   42: aload_3
    //   43: areturn
    //   44: astore_3
    //   45: aconst_null
    //   46: astore_2
    //   47: aload_2
    //   48: astore_1
    //   49: invokestatic 141	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   52: ldc -113
    //   54: ldc -111
    //   56: aload_3
    //   57: invokeinterface 150 4 0
    //   62: aload_2
    //   63: ldc -124
    //   65: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   68: getstatic 119	com/c/a/c/cb:a	Lcom/c/a/c/cb;
    //   71: areturn
    //   72: astore_2
    //   73: aconst_null
    //   74: astore_1
    //   75: aload_1
    //   76: ldc -124
    //   78: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   81: aload_2
    //   82: athrow
    //   83: astore_2
    //   84: goto -9 -> 75
    //   87: astore_3
    //   88: goto -41 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	bc
    //   0	91	1	paramString	String
    //   25	38	2	localFileInputStream	java.io.FileInputStream
    //   72	10	2	localObject1	Object
    //   83	1	2	localObject2	Object
    //   35	8	3	localcb	cb
    //   44	13	3	localException1	Exception
    //   87	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   17	26	44	java/lang/Exception
    //   17	26	72	finally
    //   28	36	83	finally
    //   49	62	83	finally
    //   28	36	87	java/lang/Exception
  }
  
  /* Error */
  public Map<String, String> b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 152	com/c/a/c/bc:d	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_1
    //   6: aload_1
    //   7: invokevirtual 116	java/io/File:exists	()Z
    //   10: ifne +7 -> 17
    //   13: invokestatic 158	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   16: areturn
    //   17: new 121	java/io/FileInputStream
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 123	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: astore_2
    //   26: aload_2
    //   27: astore_1
    //   28: aload_2
    //   29: invokestatic 128	b/a/a/a/a/b/m:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   32: invokestatic 160	com/c/a/c/bc:f	(Ljava/lang/String;)Ljava/util/Map;
    //   35: astore_3
    //   36: aload_2
    //   37: ldc -124
    //   39: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   42: aload_3
    //   43: areturn
    //   44: astore_3
    //   45: aconst_null
    //   46: astore_2
    //   47: aload_2
    //   48: astore_1
    //   49: invokestatic 141	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   52: ldc -113
    //   54: ldc -111
    //   56: aload_3
    //   57: invokeinterface 150 4 0
    //   62: aload_2
    //   63: ldc -124
    //   65: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   68: invokestatic 158	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   71: areturn
    //   72: astore_2
    //   73: aconst_null
    //   74: astore_1
    //   75: aload_1
    //   76: ldc -124
    //   78: invokestatic 135	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   81: aload_2
    //   82: athrow
    //   83: astore_2
    //   84: goto -9 -> 75
    //   87: astore_3
    //   88: goto -41 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	bc
    //   0	91	1	paramString	String
    //   25	38	2	localFileInputStream	java.io.FileInputStream
    //   72	10	2	localObject1	Object
    //   83	1	2	localObject2	Object
    //   35	8	3	localMap	Map
    //   44	13	3	localException1	Exception
    //   87	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   17	26	44	java/lang/Exception
    //   17	26	72	finally
    //   28	36	83	finally
    //   49	62	83	finally
    //   28	36	87	java/lang/Exception
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */