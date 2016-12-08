package com.c.a.c;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.y;
import b.a.a.a.a.f.a;
import b.a.a.a.a.g.p;
import b.a.a.a.t;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ac
  implements Thread.UncaughtExceptionHandler
{
  static final FilenameFilter a = new ad();
  static final Comparator<File> b = new ai();
  static final Comparator<File> c = new aj();
  static final FilenameFilter d = new ak();
  private static final Pattern e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
  private static final Map<String, String> f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
  private static final String[] g = { "SessionUser", "SessionApp", "SessionOS", "SessionDevice" };
  private final AtomicInteger h = new AtomicInteger(0);
  private final Thread.UncaughtExceptionHandler i;
  private final a j;
  private final AtomicBoolean k;
  private final v l;
  private final y m;
  private final h n;
  private final ay o;
  private final at p;
  private final String q;
  
  ac(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, v paramv, y paramy, ca paramca, a parama, h paramh)
  {
    this.i = paramUncaughtExceptionHandler;
    this.l = paramv;
    this.m = paramy;
    this.n = paramh;
    this.q = paramca.a();
    this.j = parama;
    this.k = new AtomicBoolean(false);
    paramUncaughtExceptionHandler = paramh.E();
    this.o = new ay(paramUncaughtExceptionHandler, parama);
    this.p = new at(paramUncaughtExceptionHandler);
  }
  
  private String a(File paramFile)
  {
    return paramFile.getName().substring(0, 35);
  }
  
  private void a(int paramInt)
  {
    int i1 = 0;
    HashSet localHashSet = new HashSet();
    File[] arrayOfFile = n();
    int i2 = Math.min(paramInt, arrayOfFile.length);
    paramInt = 0;
    while (paramInt < i2)
    {
      localHashSet.add(a(arrayOfFile[paramInt]));
      paramInt += 1;
    }
    this.o.a(localHashSet);
    arrayOfFile = a(new am(null));
    i2 = arrayOfFile.length;
    paramInt = i1;
    while (paramInt < i2)
    {
      File localFile = arrayOfFile[paramInt];
      String str = localFile.getName();
      Matcher localMatcher = e.matcher(str);
      localMatcher.matches();
      if (!localHashSet.contains(localMatcher.group(1)))
      {
        b.a.a.a.f.h().a("CrashlyticsCore", "Trimming open session file: " + str);
        localFile.delete();
      }
      paramInt += 1;
    }
  }
  
  /* Error */
  private void a(com.c.a.c.a.a.d paramd)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 6
    //   7: aconst_null
    //   8: astore 4
    //   10: aload_0
    //   11: invokespecial 243	com/c/a/c/ac:k	()Ljava/lang/String;
    //   14: astore 7
    //   16: aload 7
    //   18: ifnonnull +30 -> 48
    //   21: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   24: ldc -38
    //   26: ldc -11
    //   28: aconst_null
    //   29: invokeinterface 248 4 0
    //   34: aconst_null
    //   35: ldc -6
    //   37: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   40: aconst_null
    //   41: ldc_w 257
    //   44: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   47: return
    //   48: aload 7
    //   50: getstatic 266	java/util/Locale:US	Ljava/util/Locale;
    //   53: ldc_w 268
    //   56: iconst_2
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_1
    //   63: getfield 273	com/c/a/c/a/a/d:b	Lcom/c/a/c/a/a/e;
    //   66: getfield 277	com/c/a/c/a/a/e:b	Ljava/lang/String;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_1
    //   73: getfield 273	com/c/a/c/a/a/d:b	Lcom/c/a/c/a/a/e;
    //   76: getfield 279	com/c/a/c/a/a/e:a	Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 283	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   83: invokestatic 284	com/c/a/c/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   86: new 286	com/c/a/c/d
    //   89: dup
    //   90: aload_0
    //   91: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   94: new 220	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   101: aload 7
    //   103: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc_w 291
    //   109: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   118: astore 5
    //   120: aload_3
    //   121: astore_2
    //   122: aload 5
    //   124: astore_3
    //   125: aload 6
    //   127: astore 4
    //   129: aload 5
    //   131: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   134: astore 6
    //   136: aload 6
    //   138: astore_2
    //   139: aload 5
    //   141: astore_3
    //   142: aload 6
    //   144: astore 4
    //   146: new 301	com/c/a/c/bc
    //   149: dup
    //   150: aload_0
    //   151: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   154: invokespecial 304	com/c/a/c/bc:<init>	(Ljava/io/File;)V
    //   157: aload 7
    //   159: invokevirtual 307	com/c/a/c/bc:b	(Ljava/lang/String;)Ljava/util/Map;
    //   162: astore 8
    //   164: aload 6
    //   166: astore_2
    //   167: aload 5
    //   169: astore_3
    //   170: aload 6
    //   172: astore 4
    //   174: aload_1
    //   175: new 140	com/c/a/c/ay
    //   178: dup
    //   179: aload_0
    //   180: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   183: invokevirtual 138	com/c/a/c/h:E	()Landroid/content/Context;
    //   186: aload_0
    //   187: getfield 125	com/c/a/c/ac:j	Lb/a/a/a/a/f/a;
    //   190: aload 7
    //   192: invokespecial 310	com/c/a/c/ay:<init>	(Landroid/content/Context;Lb/a/a/a/a/f/a;Ljava/lang/String;)V
    //   195: aload 8
    //   197: aload 6
    //   199: invokestatic 315	com/c/a/c/bd:a	(Lcom/c/a/c/a/a/d;Lcom/c/a/c/ay;Ljava/util/Map;Lcom/c/a/c/f;)V
    //   202: aload 6
    //   204: ldc -6
    //   206: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   209: aload 5
    //   211: ldc_w 257
    //   214: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   217: return
    //   218: astore 6
    //   220: aconst_null
    //   221: astore_1
    //   222: aload 4
    //   224: astore_2
    //   225: aload_1
    //   226: astore_3
    //   227: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   230: ldc -38
    //   232: ldc_w 317
    //   235: aload 6
    //   237: invokeinterface 248 4 0
    //   242: aload 4
    //   244: ldc -6
    //   246: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   249: aload_1
    //   250: ldc_w 257
    //   253: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   256: return
    //   257: astore_1
    //   258: aconst_null
    //   259: astore_3
    //   260: aload_2
    //   261: ldc -6
    //   263: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   266: aload_3
    //   267: ldc_w 257
    //   270: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   273: aload_1
    //   274: athrow
    //   275: astore_1
    //   276: goto -16 -> 260
    //   279: astore 6
    //   281: aload 5
    //   283: astore_1
    //   284: goto -62 -> 222
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	this	ac
    //   0	287	1	paramd	com.c.a.c.a.a.d
    //   1	260	2	localObject1	Object
    //   3	264	3	localObject2	Object
    //   8	235	4	localf1	f
    //   118	164	5	locald	d
    //   5	198	6	localf2	f
    //   218	18	6	localException1	Exception
    //   279	1	6	localException2	Exception
    //   14	177	7	str	String
    //   162	34	8	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   10	16	218	java/lang/Exception
    //   21	34	218	java/lang/Exception
    //   48	120	218	java/lang/Exception
    //   10	16	257	finally
    //   21	34	257	finally
    //   48	120	257	finally
    //   129	136	275	finally
    //   146	164	275	finally
    //   174	202	275	finally
    //   227	242	275	finally
    //   129	136	279	java/lang/Exception
    //   146	164	279	java/lang/Exception
    //   174	202	279	java/lang/Exception
  }
  
  private void a(d paramd)
  {
    if (paramd == null) {
      return;
    }
    try
    {
      paramd.a();
      return;
    }
    catch (IOException paramd)
    {
      b.a.a.a.f.h().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", paramd);
    }
  }
  
  /* Error */
  private static void a(f paramf, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 338	java/io/File:exists	()Z
    //   4: ifne +38 -> 42
    //   7: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   10: ldc -38
    //   12: new 220	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   19: ldc_w 340
    //   22: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_1
    //   26: invokevirtual 158	java/io/File:getName	()Ljava/lang/String;
    //   29: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: aconst_null
    //   36: invokeinterface 248 4 0
    //   41: return
    //   42: new 342	java/io/FileInputStream
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 343	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: astore_2
    //   51: aload_2
    //   52: aload_0
    //   53: aload_1
    //   54: invokevirtual 347	java/io/File:length	()J
    //   57: l2i
    //   58: invokestatic 350	com/c/a/c/ac:a	(Ljava/io/InputStream;Lcom/c/a/c/f;I)V
    //   61: aload_2
    //   62: ldc_w 352
    //   65: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   68: return
    //   69: astore_0
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_1
    //   73: ldc_w 352
    //   76: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   79: aload_0
    //   80: athrow
    //   81: astore_0
    //   82: aload_2
    //   83: astore_1
    //   84: goto -12 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	paramf	f
    //   0	87	1	paramFile	File
    //   50	33	2	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   42	51	69	finally
    //   51	61	81	finally
  }
  
  private void a(f paramf, String paramString)
  {
    String[] arrayOfString = g;
    int i2 = arrayOfString.length;
    int i1 = 0;
    if (i1 < i2)
    {
      String str = arrayOfString[i1];
      File[] arrayOfFile = a(new an(paramString + str));
      if (arrayOfFile.length == 0) {
        b.a.a.a.f.h().e("CrashlyticsCore", "Can't find " + str + " data for session ID " + paramString, null);
      }
      for (;;)
      {
        i1 += 1;
        break;
        b.a.a.a.f.h().a("CrashlyticsCore", "Collecting " + str + " data for session ID " + paramString);
        a(paramf, arrayOfFile[0]);
      }
    }
  }
  
  private void a(f paramf, Date paramDate, Thread paramThread, Throwable paramThrowable, String paramString, boolean paramBoolean)
  {
    Context localContext = this.n.E();
    long l1 = paramDate.getTime() / 1000L;
    float f1 = m.c(localContext);
    int i2 = m.a(localContext, this.p.a());
    boolean bool = m.d(localContext);
    int i3 = localContext.getResources().getConfiguration().orientation;
    long l2 = m.b();
    long l3 = m.b(localContext);
    long l4 = m.b(Environment.getDataDirectory().getPath());
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = m.a(localContext.getPackageName(), localContext);
    LinkedList localLinkedList = new LinkedList();
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    String str1 = this.n.n();
    String str2 = this.m.c();
    if (paramBoolean)
    {
      localObject = Thread.getAllStackTraces();
      paramDate = new Thread[((Map)localObject).size()];
      Iterator localIterator = ((Map)localObject).entrySet().iterator();
      int i1 = 0;
      for (;;)
      {
        localObject = paramDate;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        paramDate[i1] = ((Thread)((Map.Entry)localObject).getKey());
        localLinkedList.add(((Map.Entry)localObject).getValue());
        i1 += 1;
      }
    }
    Object localObject = new Thread[0];
    if (!m.a(localContext, "com.crashlytics.CollectCustomKeys", true)) {
      paramDate = new TreeMap();
    }
    for (;;)
    {
      by.a(paramf, l1, paramString, paramThrowable, paramThread, arrayOfStackTraceElement, (Thread[])localObject, localLinkedList, paramDate, this.o, localRunningAppProcessInfo, i3, str2, str1, f1, i2, bool, l2 - l3, l4);
      return;
      paramDate = this.n.g();
      if ((paramDate != null) && (paramDate.size() > 1)) {
        paramDate = new TreeMap(paramDate);
      }
    }
  }
  
  private static void a(f paramf, File[] paramArrayOfFile, String paramString)
  {
    Arrays.sort(paramArrayOfFile, m.a);
    int i2 = paramArrayOfFile.length;
    int i1 = 0;
    for (;;)
    {
      if (i1 < i2)
      {
        File localFile = paramArrayOfFile[i1];
        try
        {
          b.a.a.a.f.h().a("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] { paramString, localFile.getName() }));
          a(paramf, localFile);
          i1 += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            b.a.a.a.f.h().e("CrashlyticsCore", "Error writting non-fatal to session.", localException);
          }
        }
      }
    }
  }
  
  private void a(File paramFile, String paramString, int paramInt)
  {
    b.a.a.a.f.h().a("CrashlyticsCore", "Collecting session parts for ID " + paramString);
    Object localObject = a(new an(paramString + "SessionCrash"));
    boolean bool1;
    boolean bool2;
    if ((localObject != null) && (localObject.length > 0))
    {
      bool1 = true;
      b.a.a.a.f.h().a("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] { paramString, Boolean.valueOf(bool1) }));
      File[] arrayOfFile = a(new an(paramString + "SessionEvent"));
      if ((arrayOfFile == null) || (arrayOfFile.length <= 0)) {
        break label277;
      }
      bool2 = true;
      label159:
      b.a.a.a.f.h().a("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] { paramString, Boolean.valueOf(bool2) }));
      if ((!bool1) && (!bool2)) {
        break label289;
      }
      arrayOfFile = a(paramString, arrayOfFile, paramInt);
      if (!bool1) {
        break label283;
      }
      localObject = localObject[0];
      label225:
      a(paramFile, paramString, arrayOfFile, (File)localObject);
    }
    for (;;)
    {
      b.a.a.a.f.h().a("CrashlyticsCore", "Removing session part files for ID " + paramString);
      a(paramString);
      return;
      bool1 = false;
      break;
      label277:
      bool2 = false;
      break label159;
      label283:
      localObject = null;
      break label225;
      label289:
      b.a.a.a.f.h().a("CrashlyticsCore", "No events present for session ID " + paramString);
    }
  }
  
  /* Error */
  private void a(File paramFile1, String paramString, File[] paramArrayOfFile, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 10
    //   9: aconst_null
    //   10: astore 8
    //   12: iconst_1
    //   13: istore 5
    //   15: aload 4
    //   17: ifnull +267 -> 284
    //   20: new 286	com/c/a/c/d
    //   23: dup
    //   24: aload_0
    //   25: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   28: aload_2
    //   29: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   32: astore 9
    //   34: aload 7
    //   36: astore 6
    //   38: aload 9
    //   40: astore 7
    //   42: aload 10
    //   44: astore 8
    //   46: aload 9
    //   48: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   51: astore 10
    //   53: aload 10
    //   55: astore 6
    //   57: aload 9
    //   59: astore 7
    //   61: aload 10
    //   63: astore 8
    //   65: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   68: ldc -38
    //   70: new 220	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   77: ldc_w 540
    //   80: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_2
    //   84: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokeinterface 235 3 0
    //   95: aload 10
    //   97: astore 6
    //   99: aload 9
    //   101: astore 7
    //   103: aload 10
    //   105: astore 8
    //   107: aload 10
    //   109: aload_1
    //   110: invokestatic 366	com/c/a/c/ac:a	(Lcom/c/a/c/f;Ljava/io/File;)V
    //   113: aload 10
    //   115: astore 6
    //   117: aload 9
    //   119: astore 7
    //   121: aload 10
    //   123: astore 8
    //   125: aload 10
    //   127: iconst_4
    //   128: new 369	java/util/Date
    //   131: dup
    //   132: invokespecial 541	java/util/Date:<init>	()V
    //   135: invokevirtual 372	java/util/Date:getTime	()J
    //   138: ldc2_w 373
    //   141: ldiv
    //   142: invokevirtual 544	com/c/a/c/f:a	(IJ)V
    //   145: aload 10
    //   147: astore 6
    //   149: aload 9
    //   151: astore 7
    //   153: aload 10
    //   155: astore 8
    //   157: aload 10
    //   159: iconst_5
    //   160: iload 5
    //   162: invokevirtual 547	com/c/a/c/f:a	(IZ)V
    //   165: aload 10
    //   167: astore 6
    //   169: aload 9
    //   171: astore 7
    //   173: aload 10
    //   175: astore 8
    //   177: aload 10
    //   179: bipush 11
    //   181: iconst_1
    //   182: invokevirtual 550	com/c/a/c/f:a	(II)V
    //   185: aload 10
    //   187: astore 6
    //   189: aload 9
    //   191: astore 7
    //   193: aload 10
    //   195: astore 8
    //   197: aload 10
    //   199: bipush 12
    //   201: iconst_3
    //   202: invokevirtual 552	com/c/a/c/f:b	(II)V
    //   205: aload 10
    //   207: astore 6
    //   209: aload 9
    //   211: astore 7
    //   213: aload 10
    //   215: astore 8
    //   217: aload_0
    //   218: aload 10
    //   220: aload_2
    //   221: invokespecial 554	com/c/a/c/ac:a	(Lcom/c/a/c/f;Ljava/lang/String;)V
    //   224: aload 10
    //   226: astore 6
    //   228: aload 9
    //   230: astore 7
    //   232: aload 10
    //   234: astore 8
    //   236: aload 10
    //   238: aload_3
    //   239: aload_2
    //   240: invokestatic 556	com/c/a/c/ac:a	(Lcom/c/a/c/f;[Ljava/io/File;Ljava/lang/String;)V
    //   243: iload 5
    //   245: ifeq +22 -> 267
    //   248: aload 10
    //   250: astore 6
    //   252: aload 9
    //   254: astore 7
    //   256: aload 10
    //   258: astore 8
    //   260: aload 10
    //   262: aload 4
    //   264: invokestatic 366	com/c/a/c/ac:a	(Lcom/c/a/c/f;Ljava/io/File;)V
    //   267: aload 10
    //   269: ldc_w 558
    //   272: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   275: aload 9
    //   277: ldc_w 560
    //   280: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   283: return
    //   284: iconst_0
    //   285: istore 5
    //   287: goto -267 -> 20
    //   290: astore_3
    //   291: aconst_null
    //   292: astore_1
    //   293: aload 8
    //   295: astore 6
    //   297: aload_1
    //   298: astore 7
    //   300: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   303: ldc -38
    //   305: new 220	java/lang/StringBuilder
    //   308: dup
    //   309: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   312: ldc_w 562
    //   315: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: aload_2
    //   319: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: aload_3
    //   326: invokeinterface 248 4 0
    //   331: aload 8
    //   333: ldc_w 558
    //   336: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   339: aload_0
    //   340: aload_1
    //   341: invokespecial 564	com/c/a/c/ac:a	(Lcom/c/a/c/d;)V
    //   344: return
    //   345: astore_1
    //   346: aconst_null
    //   347: astore 7
    //   349: aload 6
    //   351: ldc_w 558
    //   354: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   357: aload 7
    //   359: ldc_w 560
    //   362: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   365: aload_1
    //   366: athrow
    //   367: astore_1
    //   368: goto -19 -> 349
    //   371: astore_3
    //   372: aload 9
    //   374: astore_1
    //   375: goto -82 -> 293
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	this	ac
    //   0	378	1	paramFile1	File
    //   0	378	2	paramString	String
    //   0	378	3	paramArrayOfFile	File[]
    //   0	378	4	paramFile2	File
    //   13	273	5	bool	boolean
    //   1	349	6	localObject1	Object
    //   4	354	7	localObject2	Object
    //   10	322	8	localf1	f
    //   32	341	9	locald	d
    //   7	261	10	localf2	f
    // Exception table:
    //   from	to	target	type
    //   20	34	290	java/lang/Exception
    //   20	34	345	finally
    //   46	53	367	finally
    //   65	95	367	finally
    //   107	113	367	finally
    //   125	145	367	finally
    //   157	165	367	finally
    //   177	185	367	finally
    //   197	205	367	finally
    //   217	224	367	finally
    //   236	243	367	finally
    //   260	267	367	finally
    //   300	331	367	finally
    //   46	53	371	java/lang/Exception
    //   65	95	371	java/lang/Exception
    //   107	113	371	java/lang/Exception
    //   125	145	371	java/lang/Exception
    //   157	165	371	java/lang/Exception
    //   177	185	371	java/lang/Exception
    //   197	205	371	java/lang/Exception
    //   217	224	371	java/lang/Exception
    //   236	243	371	java/lang/Exception
    //   260	267	371	java/lang/Exception
  }
  
  private static void a(InputStream paramInputStream, f paramf, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramInt = 0;
    while (paramInt < arrayOfByte.length)
    {
      int i1 = paramInputStream.read(arrayOfByte, paramInt, arrayOfByte.length - paramInt);
      if (i1 < 0) {
        break;
      }
      paramInt += i1;
    }
    paramf.a(arrayOfByte);
  }
  
  private void a(String paramString)
  {
    paramString = b(paramString);
    int i2 = paramString.length;
    int i1 = 0;
    while (i1 < i2)
    {
      paramString[i1].delete();
      i1 += 1;
    }
  }
  
  private void a(String paramString, int paramInt)
  {
    cc.a(q(), new an(paramString + "SessionEvent"), paramInt, c);
  }
  
  /* Error */
  private void a(String paramString, Date paramDate)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: new 286	com/c/a/c/d
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   13: new 220	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   20: aload_1
    //   21: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: ldc_w 585
    //   27: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   36: astore 4
    //   38: aload 5
    //   40: astore_3
    //   41: aload 4
    //   43: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   46: astore 5
    //   48: aload 5
    //   50: astore_3
    //   51: aload 5
    //   53: aload_1
    //   54: getstatic 266	java/util/Locale:US	Ljava/util/Locale;
    //   57: ldc_w 587
    //   60: iconst_1
    //   61: anewarray 4	java/lang/Object
    //   64: dup
    //   65: iconst_0
    //   66: aload_0
    //   67: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   70: invokevirtual 588	com/c/a/c/h:a	()Ljava/lang/String;
    //   73: aastore
    //   74: invokestatic 283	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   77: aload_2
    //   78: invokevirtual 372	java/util/Date:getTime	()J
    //   81: ldc2_w 373
    //   84: ldiv
    //   85: invokestatic 591	com/c/a/c/by:a	(Lcom/c/a/c/f;Ljava/lang/String;Ljava/lang/String;J)V
    //   88: aload 5
    //   90: ldc -6
    //   92: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   95: aload 4
    //   97: ldc_w 593
    //   100: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   103: return
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_2
    //   107: aload_3
    //   108: ldc -6
    //   110: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   113: aload_2
    //   114: ldc_w 593
    //   117: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   120: aload_1
    //   121: athrow
    //   122: astore_1
    //   123: aload 4
    //   125: astore_2
    //   126: goto -19 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	ac
    //   0	129	1	paramString	String
    //   0	129	2	paramDate	Date
    //   4	104	3	localf1	f
    //   36	88	4	locald	d
    //   1	88	5	localf2	f
    // Exception table:
    //   from	to	target	type
    //   5	38	104	finally
    //   41	48	122	finally
    //   51	88	122	finally
  }
  
  private void a(Date paramDate, Thread paramThread, Throwable paramThrowable)
  {
    this.n.A();
    b(paramDate, paramThread, paramThrowable);
    d();
    l();
    f();
    if (!this.n.x()) {
      p();
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    File[] arrayOfFile;
    for (int i1 = 1;; i1 = 0)
    {
      a(i1 + 8);
      arrayOfFile = n();
      if (arrayOfFile.length > i1) {
        break;
      }
      b.a.a.a.f.h().a("CrashlyticsCore", "No open sessions to be closed.");
      return;
    }
    f(a(arrayOfFile[i1]));
    Object localObject = this.n;
    localObject = h.B();
    if (localObject == null)
    {
      b.a.a.a.f.h().a("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
      return;
    }
    a(arrayOfFile, i1, ((p)localObject).c);
  }
  
  private void a(File[] paramArrayOfFile, int paramInt1, int paramInt2)
  {
    b.a.a.a.f.h().a("CrashlyticsCore", "Closing open sessions.");
    while (paramInt1 < paramArrayOfFile.length)
    {
      File localFile = paramArrayOfFile[paramInt1];
      String str = a(localFile);
      b.a.a.a.f.h().a("CrashlyticsCore", "Closing session: " + str);
      a(localFile, str, paramInt2);
      paramInt1 += 1;
    }
  }
  
  private File[] a(FilenameFilter paramFilenameFilter)
  {
    return b(q().listFiles(paramFilenameFilter));
  }
  
  private File[] a(String paramString, File[] paramArrayOfFile, int paramInt)
  {
    File[] arrayOfFile = paramArrayOfFile;
    if (paramArrayOfFile.length > paramInt)
    {
      b.a.a.a.f.h().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] { Integer.valueOf(paramInt) }));
      a(paramString, paramInt);
      arrayOfFile = a(new an(paramString + "SessionEvent"));
    }
    return arrayOfFile;
  }
  
  /* Error */
  private void b(Date paramDate, Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 7
    //   9: aconst_null
    //   10: astore 5
    //   12: aload_0
    //   13: invokespecial 653	com/c/a/c/ac:j	()Ljava/lang/String;
    //   16: astore 6
    //   18: aload 6
    //   20: ifnonnull +31 -> 51
    //   23: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   26: ldc -38
    //   28: ldc_w 655
    //   31: aconst_null
    //   32: invokeinterface 248 4 0
    //   37: aconst_null
    //   38: ldc -6
    //   40: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   43: aconst_null
    //   44: ldc_w 257
    //   47: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   50: return
    //   51: aload 6
    //   53: aload_3
    //   54: invokevirtual 659	java/lang/Object:getClass	()Ljava/lang/Class;
    //   57: invokevirtual 662	java/lang/Class:getName	()Ljava/lang/String;
    //   60: invokestatic 284	com/c/a/c/h:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: new 286	com/c/a/c/d
    //   66: dup
    //   67: aload_0
    //   68: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   71: new 220	java/lang/StringBuilder
    //   74: dup
    //   75: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   78: aload 6
    //   80: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: ldc_w 291
    //   86: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   95: astore 6
    //   97: aload 8
    //   99: astore 4
    //   101: aload 7
    //   103: astore 5
    //   105: aload 6
    //   107: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   110: astore 7
    //   112: aload 7
    //   114: astore 4
    //   116: aload 7
    //   118: astore 5
    //   120: aload_0
    //   121: aload 7
    //   123: aload_1
    //   124: aload_2
    //   125: aload_3
    //   126: ldc_w 664
    //   129: iconst_1
    //   130: invokespecial 666	com/c/a/c/ac:a	(Lcom/c/a/c/f;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Z)V
    //   133: aload 7
    //   135: ldc -6
    //   137: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   140: aload 6
    //   142: ldc_w 257
    //   145: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   148: return
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_1
    //   152: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   155: ldc -38
    //   157: ldc_w 668
    //   160: aload_2
    //   161: invokeinterface 248 4 0
    //   166: aload 5
    //   168: ldc -6
    //   170: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   173: aload_1
    //   174: ldc_w 257
    //   177: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   180: return
    //   181: astore_2
    //   182: aconst_null
    //   183: astore_1
    //   184: aload 4
    //   186: ldc -6
    //   188: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   191: aload_1
    //   192: ldc_w 257
    //   195: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   198: aload_2
    //   199: athrow
    //   200: astore_2
    //   201: aload 6
    //   203: astore_1
    //   204: goto -20 -> 184
    //   207: astore_2
    //   208: aload 5
    //   210: astore 4
    //   212: goto -28 -> 184
    //   215: astore_2
    //   216: aload 6
    //   218: astore_1
    //   219: goto -67 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	ac
    //   0	222	1	paramDate	Date
    //   0	222	2	paramThread	Thread
    //   0	222	3	paramThrowable	Throwable
    //   1	210	4	localObject1	Object
    //   10	199	5	localf1	f
    //   16	201	6	localObject2	Object
    //   7	127	7	localf2	f
    //   4	94	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   12	18	149	java/lang/Exception
    //   23	37	149	java/lang/Exception
    //   51	97	149	java/lang/Exception
    //   12	18	181	finally
    //   23	37	181	finally
    //   51	97	181	finally
    //   105	112	200	finally
    //   120	133	200	finally
    //   152	166	207	finally
    //   105	112	215	java/lang/Exception
    //   120	133	215	java/lang/Exception
  }
  
  private File[] b(String paramString)
  {
    return a(new ap(paramString));
  }
  
  private File[] b(File[] paramArrayOfFile)
  {
    File[] arrayOfFile = paramArrayOfFile;
    if (paramArrayOfFile == null) {
      arrayOfFile = new File[0];
    }
    return arrayOfFile;
  }
  
  /* Error */
  private void c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 286	com/c/a/c/d
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   10: new 220	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   17: aload_1
    //   18: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: ldc 92
    //   23: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   32: astore_2
    //   33: aload_2
    //   34: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   37: astore 4
    //   39: aload 4
    //   41: aload_0
    //   42: getfield 114	com/c/a/c/ac:m	Lb/a/a/a/a/b/y;
    //   45: invokevirtual 440	b/a/a/a/a/b/y:c	()Ljava/lang/String;
    //   48: aload_0
    //   49: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   52: invokevirtual 674	com/c/a/c/h:i	()Ljava/lang/String;
    //   55: aload_0
    //   56: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   59: invokevirtual 676	com/c/a/c/h:l	()Ljava/lang/String;
    //   62: aload_0
    //   63: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   66: invokevirtual 677	com/c/a/c/h:k	()Ljava/lang/String;
    //   69: aload_0
    //   70: getfield 114	com/c/a/c/ac:m	Lb/a/a/a/a/b/y;
    //   73: invokevirtual 679	b/a/a/a/a/b/y:b	()Ljava/lang/String;
    //   76: aload_0
    //   77: getfield 116	com/c/a/c/ac:n	Lcom/c/a/c/h;
    //   80: invokevirtual 680	com/c/a/c/h:j	()Ljava/lang/String;
    //   83: invokestatic 685	b/a/a/a/a/b/s:a	(Ljava/lang/String;)Lb/a/a/a/a/b/s;
    //   86: invokevirtual 687	b/a/a/a/a/b/s:a	()I
    //   89: aload_0
    //   90: getfield 123	com/c/a/c/ac:q	Ljava/lang/String;
    //   93: invokestatic 690	com/c/a/c/by:a	(Lcom/c/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    //   96: aload 4
    //   98: ldc_w 692
    //   101: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   104: aload_2
    //   105: ldc_w 694
    //   108: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   111: return
    //   112: astore_1
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_3
    //   116: ldc_w 692
    //   119: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   122: aload_2
    //   123: ldc_w 694
    //   126: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   129: aload_1
    //   130: athrow
    //   131: astore_1
    //   132: goto -17 -> 115
    //   135: astore_1
    //   136: aload 4
    //   138: astore_3
    //   139: goto -24 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	ac
    //   0	142	1	paramString	String
    //   32	91	2	locald	d
    //   1	138	3	localObject	Object
    //   37	100	4	localf	f
    // Exception table:
    //   from	to	target	type
    //   2	33	112	finally
    //   33	39	131	finally
    //   39	96	135	finally
  }
  
  private void d(String paramString)
  {
    Object localObject3 = null;
    Object localObject1 = null;
    try
    {
      locald = new d(q(), paramString + "SessionOS");
      paramString = (String)localObject3;
      m.a(paramString, "Failed to flush to session OS file.");
    }
    finally
    {
      try
      {
        localObject1 = f.a(locald);
        paramString = (String)localObject1;
        by.a((f)localObject1, m.g(this.n.E()));
        m.a((Flushable)localObject1, "Failed to flush to session OS file.");
        m.a(locald, "Failed to close session OS file.");
        return;
      }
      finally
      {
        d locald;
        for (;;) {}
      }
      localObject4 = finally;
      locald = null;
      paramString = (String)localObject1;
      localObject1 = localObject4;
    }
    m.a(locald, "Failed to close session OS file.");
    throw ((Throwable)localObject1);
  }
  
  private void e(String paramString)
  {
    Context localContext = null;
    String str = null;
    Object localObject1 = null;
    try
    {
      localObject3 = new d(q(), paramString + "SessionDevice");
      paramString = str;
      Object localObject5;
      int i1;
      int i2;
      long l1;
      long l2;
      long l3;
      boolean bool;
      int i3;
      m.a(paramString, "Failed to flush session device info.");
    }
    finally
    {
      try
      {
        localObject1 = f.a((OutputStream)localObject3);
        paramString = (String)localObject1;
        localContext = this.n.E();
        paramString = (String)localObject1;
        localObject5 = new StatFs(Environment.getDataDirectory().getPath());
        paramString = (String)localObject1;
        str = this.m.h();
        paramString = (String)localObject1;
        i1 = m.a();
        paramString = (String)localObject1;
        i2 = Runtime.getRuntime().availableProcessors();
        paramString = (String)localObject1;
        l1 = m.b();
        paramString = (String)localObject1;
        l2 = ((StatFs)localObject5).getBlockCount();
        paramString = (String)localObject1;
        l3 = ((StatFs)localObject5).getBlockSize();
        paramString = (String)localObject1;
        bool = m.f(localContext);
        paramString = (String)localObject1;
        localObject5 = this.m.i();
        paramString = (String)localObject1;
        i3 = m.h(localContext);
        paramString = (String)localObject1;
        by.a((f)localObject1, str, i1, Build.MODEL, i2, l1, l2 * l3, bool, (Map)localObject5, i3, Build.MANUFACTURER, Build.PRODUCT);
        m.a((Flushable)localObject1, "Failed to flush session device info.");
        m.a((Closeable)localObject3, "Failed to close session device file.");
        return;
      }
      finally
      {
        Object localObject3;
        for (;;) {}
      }
      localObject4 = finally;
      localObject3 = localContext;
      paramString = (String)localObject1;
      localObject1 = localObject4;
    }
    m.a((Closeable)localObject3, "Failed to close session device file.");
    throw ((Throwable)localObject1);
  }
  
  /* Error */
  private void f(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: new 286	com/c/a/c/d
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 289	com/c/a/c/ac:q	()Ljava/io/File;
    //   13: new 220	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   20: aload_1
    //   21: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: ldc 90
    //   26: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokespecial 294	com/c/a/c/d:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   35: astore 4
    //   37: aload 5
    //   39: astore_3
    //   40: aload 4
    //   42: invokestatic 299	com/c/a/c/f:a	(Ljava/io/OutputStream;)Lcom/c/a/c/f;
    //   45: astore 5
    //   47: aload 5
    //   49: astore_3
    //   50: aload_0
    //   51: aload_1
    //   52: invokespecial 752	com/c/a/c/ac:g	(Ljava/lang/String;)Lcom/c/a/c/cb;
    //   55: astore_1
    //   56: aload 5
    //   58: astore_3
    //   59: aload_1
    //   60: invokevirtual 755	com/c/a/c/cb:a	()Z
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq +20 -> 85
    //   68: aload 5
    //   70: ldc_w 757
    //   73: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   76: aload 4
    //   78: ldc_w 759
    //   81: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   84: return
    //   85: aload 5
    //   87: astore_3
    //   88: aload 5
    //   90: aload_1
    //   91: getfield 760	com/c/a/c/cb:b	Ljava/lang/String;
    //   94: aload_1
    //   95: getfield 762	com/c/a/c/cb:c	Ljava/lang/String;
    //   98: aload_1
    //   99: getfield 764	com/c/a/c/cb:d	Ljava/lang/String;
    //   102: invokestatic 767	com/c/a/c/by:a	(Lcom/c/a/c/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload 5
    //   107: ldc_w 757
    //   110: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   113: aload 4
    //   115: ldc_w 759
    //   118: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   121: return
    //   122: astore_1
    //   123: aconst_null
    //   124: astore 4
    //   126: aload_3
    //   127: ldc_w 757
    //   130: invokestatic 255	b/a/a/a/a/b/m:a	(Ljava/io/Flushable;Ljava/lang/String;)V
    //   133: aload 4
    //   135: ldc_w 759
    //   138: invokestatic 260	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: goto -18 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	ac
    //   0	147	1	paramString	String
    //   63	2	2	bool	boolean
    //   4	123	3	localf1	f
    //   35	99	4	locald	d
    //   1	105	5	localf2	f
    // Exception table:
    //   from	to	target	type
    //   5	37	122	finally
    //   40	47	143	finally
    //   50	56	143	finally
    //   59	64	143	finally
    //   88	105	143	finally
  }
  
  private cb g(String paramString)
  {
    if (a()) {
      return new cb(this.n.p(), this.n.r(), this.n.q());
    }
    return new bc(q()).a(paramString);
  }
  
  private String j()
  {
    File[] arrayOfFile = n();
    if (arrayOfFile.length > 0) {
      return a(arrayOfFile[0]);
    }
    return null;
  }
  
  private String k()
  {
    File[] arrayOfFile = n();
    if (arrayOfFile.length > 1) {
      return a(arrayOfFile[1]);
    }
    return null;
  }
  
  private void l()
  {
    Date localDate = new Date();
    String str = new c(this.m).toString();
    b.a.a.a.f.h().a("CrashlyticsCore", "Opening an new session with ID " + str);
    a(str, localDate);
    c(str);
    d(str);
    e(str);
    this.o.a(str);
  }
  
  private File[] m()
  {
    return a(a);
  }
  
  private File[] n()
  {
    File[] arrayOfFile = e();
    Arrays.sort(arrayOfFile, b);
    return arrayOfFile;
  }
  
  private void o()
  {
    File localFile = new File(this.n.w(), "invalidClsFiles");
    if (!localFile.exists()) {
      return;
    }
    if (localFile.isDirectory())
    {
      File[] arrayOfFile = localFile.listFiles();
      int i2 = arrayOfFile.length;
      int i1 = 0;
      while (i1 < i2)
      {
        arrayOfFile[i1].delete();
        i1 += 1;
      }
    }
    localFile.delete();
  }
  
  private void p()
  {
    File[] arrayOfFile = m();
    int i2 = arrayOfFile.length;
    int i1 = 0;
    while (i1 < i2)
    {
      File localFile = arrayOfFile[i1];
      this.l.a(new ao(this.n, localFile));
      i1 += 1;
    }
  }
  
  private File q()
  {
    return this.j.a();
  }
  
  void a(File[] paramArrayOfFile)
  {
    o();
    int i3 = paramArrayOfFile.length;
    int i1 = 0;
    while (i1 < i3)
    {
      Object localObject = paramArrayOfFile[i1];
      b.a.a.a.f.h().a("CrashlyticsCore", "Found invalid session part file: " + localObject);
      localObject = a((File)localObject);
      ah localah = new ah(this, (String)localObject);
      b.a.a.a.f.h().a("CrashlyticsCore", "Deleting all part files for invalid session: " + (String)localObject);
      localObject = a(localah);
      int i4 = localObject.length;
      int i2 = 0;
      while (i2 < i4)
      {
        localah = localObject[i2];
        b.a.a.a.f.h().a("CrashlyticsCore", "Deleting session file: " + localah);
        localah.delete();
        i2 += 1;
      }
      i1 += 1;
    }
  }
  
  boolean a()
  {
    return this.k.get();
  }
  
  void b()
  {
    this.l.b(new ae(this));
  }
  
  boolean c()
  {
    return ((Boolean)this.l.a(new af(this))).booleanValue();
  }
  
  void d()
  {
    a(false);
  }
  
  File[] e()
  {
    return a(new an("BeginSession"));
  }
  
  void f()
  {
    cc.a(q(), a, 4, c);
  }
  
  void g()
  {
    this.l.a(new ag(this));
  }
  
  /* Error */
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 132	com/c/a/c/ac:k	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_1
    //   7: invokevirtual 871	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   10: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   13: ldc -38
    //   15: new 220	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 221	java/lang/StringBuilder:<init>	()V
    //   22: ldc_w 873
    //   25: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_2
    //   29: invokevirtual 835	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: ldc_w 875
    //   35: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_1
    //   39: invokevirtual 876	java/lang/Thread:getName	()Ljava/lang/String;
    //   42: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokeinterface 235 3 0
    //   53: aload_0
    //   54: getfield 152	com/c/a/c/ac:p	Lcom/c/a/c/at;
    //   57: invokevirtual 878	com/c/a/c/at:b	()V
    //   60: new 369	java/util/Date
    //   63: dup
    //   64: invokespecial 541	java/util/Date:<init>	()V
    //   67: astore_3
    //   68: aload_0
    //   69: getfield 112	com/c/a/c/ac:l	Lcom/c/a/c/v;
    //   72: new 880	com/c/a/c/al
    //   75: dup
    //   76: aload_0
    //   77: aload_3
    //   78: aload_1
    //   79: aload_2
    //   80: invokespecial 882	com/c/a/c/al:<init>	(Lcom/c/a/c/ac;Ljava/util/Date;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //   83: invokevirtual 860	com/c/a/c/v:a	(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    //   86: pop
    //   87: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   90: ldc -38
    //   92: ldc_w 884
    //   95: invokeinterface 235 3 0
    //   100: aload_0
    //   101: getfield 110	com/c/a/c/ac:i	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   104: aload_1
    //   105: aload_2
    //   106: invokeinterface 886 3 0
    //   111: aload_0
    //   112: getfield 132	com/c/a/c/ac:k	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   115: iconst_0
    //   116: invokevirtual 871	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   119: aload_0
    //   120: monitorexit
    //   121: return
    //   122: astore_3
    //   123: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   126: ldc -38
    //   128: ldc_w 888
    //   131: aload_3
    //   132: invokeinterface 248 4 0
    //   137: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   140: ldc -38
    //   142: ldc_w 884
    //   145: invokeinterface 235 3 0
    //   150: aload_0
    //   151: getfield 110	com/c/a/c/ac:i	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   154: aload_1
    //   155: aload_2
    //   156: invokeinterface 886 3 0
    //   161: aload_0
    //   162: getfield 132	com/c/a/c/ac:k	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   165: iconst_0
    //   166: invokevirtual 871	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   169: goto -50 -> 119
    //   172: astore_1
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_1
    //   176: athrow
    //   177: astore_3
    //   178: invokestatic 216	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   181: ldc -38
    //   183: ldc_w 884
    //   186: invokeinterface 235 3 0
    //   191: aload_0
    //   192: getfield 110	com/c/a/c/ac:i	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   195: aload_1
    //   196: aload_2
    //   197: invokeinterface 886 3 0
    //   202: aload_0
    //   203: getfield 132	com/c/a/c/ac:k	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   206: iconst_0
    //   207: invokevirtual 871	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   210: aload_3
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	this	ac
    //   0	212	1	paramThread	Thread
    //   0	212	2	paramThrowable	Throwable
    //   67	11	3	localDate	Date
    //   122	10	3	localException	Exception
    //   177	34	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	87	122	java/lang/Exception
    //   2	10	172	finally
    //   87	119	172	finally
    //   137	169	172	finally
    //   178	212	172	finally
    //   10	87	177	finally
    //   123	137	177	finally
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */