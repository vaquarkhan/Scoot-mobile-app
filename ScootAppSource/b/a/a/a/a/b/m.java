package b.a.a.a.a.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public final class m
{
  public static final Comparator<File> a = new n();
  private static Boolean b = null;
  private static final char[] c = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static long d = -1L;
  
  public static int a()
  {
    return o.a().ordinal();
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getResources().getIdentifier(paramString1, paramString2, j(paramContext));
  }
  
  public static int a(Context paramContext, boolean paramBoolean)
  {
    float f = c(paramContext);
    if (!paramBoolean) {
      return 1;
    }
    if ((paramBoolean) && (f >= 99.0D)) {
      return 3;
    }
    if ((paramBoolean) && (f < 99.0D)) {
      return 2;
    }
    return 0;
  }
  
  static long a(String paramString1, String paramString2, int paramInt)
  {
    return Long.parseLong(paramString1.split(paramString2)[0].trim()) * paramInt;
  }
  
  public static ActivityManager.RunningAppProcessInfo a(String paramString, Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext != null)
    {
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (localRunningAppProcessInfo.processName.equals(paramString)) {
          return localRunningAppProcessInfo;
        }
      }
    }
    return null;
  }
  
  public static SharedPreferences a(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.crashlytics.prefs", 0);
  }
  
  /* Error */
  public static String a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: invokevirtual 150	java/io/File:exists	()Z
    //   9: ifeq +86 -> 95
    //   12: new 152	java/io/BufferedReader
    //   15: dup
    //   16: new 154	java/io/FileReader
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 157	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   24: sipush 1024
    //   27: invokespecial 160	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   30: astore_3
    //   31: aload_3
    //   32: astore_2
    //   33: aload_3
    //   34: invokevirtual 163	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload 4
    //   41: astore_2
    //   42: aload 5
    //   44: ifnull +45 -> 89
    //   47: aload_3
    //   48: astore_2
    //   49: ldc -91
    //   51: invokestatic 171	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   54: aload 5
    //   56: iconst_2
    //   57: invokevirtual 174	java/util/regex/Pattern:split	(Ljava/lang/CharSequence;I)[Ljava/lang/String;
    //   60: astore 5
    //   62: aload_3
    //   63: astore_2
    //   64: aload 5
    //   66: arraylength
    //   67: iconst_1
    //   68: if_icmple -37 -> 31
    //   71: aload_3
    //   72: astore_2
    //   73: aload 5
    //   75: iconst_0
    //   76: aaload
    //   77: aload_1
    //   78: invokevirtual 135	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   81: ifeq -50 -> 31
    //   84: aload 5
    //   86: iconst_1
    //   87: aaload
    //   88: astore_2
    //   89: aload_3
    //   90: ldc -80
    //   92: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   95: aload_2
    //   96: areturn
    //   97: astore 4
    //   99: aconst_null
    //   100: astore_1
    //   101: aload_1
    //   102: astore_2
    //   103: invokestatic 185	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   106: ldc -69
    //   108: new 189	java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   115: ldc -64
    //   117: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: aload_0
    //   121: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: aload 4
    //   129: invokeinterface 208 4 0
    //   134: aload_1
    //   135: ldc -80
    //   137: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   140: aconst_null
    //   141: areturn
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_2
    //   145: aload_2
    //   146: ldc -80
    //   148: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   151: aload_0
    //   152: athrow
    //   153: astore_0
    //   154: goto -9 -> 145
    //   157: astore 4
    //   159: aload_3
    //   160: astore_1
    //   161: goto -60 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	paramFile	File
    //   0	164	1	paramString	String
    //   1	145	2	localObject1	Object
    //   30	130	3	localBufferedReader	java.io.BufferedReader
    //   3	37	4	localObject2	Object
    //   97	31	4	localException1	Exception
    //   157	1	4	localException2	Exception
    //   37	48	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   12	31	97	java/lang/Exception
    //   12	31	142	finally
    //   33	39	153	finally
    //   49	62	153	finally
    //   64	71	153	finally
    //   73	84	153	finally
    //   103	134	153	finally
    //   33	39	157	java/lang/Exception
    //   49	62	157	java/lang/Exception
    //   64	71	157	java/lang/Exception
    //   73	84	157	java/lang/Exception
  }
  
  public static String a(InputStream paramInputStream)
  {
    paramInputStream = new Scanner(paramInputStream).useDelimiter("\\A");
    if (paramInputStream.hasNext()) {
      return paramInputStream.next();
    }
    return "";
  }
  
  private static String a(InputStream paramInputStream, String paramString)
  {
    try
    {
      paramString = MessageDigest.getInstance("SHA-1");
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        paramString.update(arrayOfByte, 0, i);
      }
      paramInputStream = a(paramString.digest());
    }
    catch (Exception paramInputStream)
    {
      f.h().e("Fabric", "Could not calculate hash for app icon.", paramInputStream);
      return "";
    }
    return paramInputStream;
  }
  
  public static String a(String paramString)
  {
    return a(paramString, "SHA-1");
  }
  
  private static String a(String paramString1, String paramString2)
  {
    return a(paramString1.getBytes(), paramString2);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i * 2)] = c[(j >>> 4)];
      arrayOfChar[(i * 2 + 1)] = c[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  private static String a(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
      localMessageDigest.update(paramArrayOfByte);
      return a(localMessageDigest.digest());
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      f.h().e("Fabric", "Could not create hashing algorithm: " + paramString + ", returning empty string.", paramArrayOfByte);
    }
    return "";
  }
  
  public static String a(String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return null;
    }
    Object localObject = new ArrayList();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      String str = paramVarArgs[i];
      if (str != null) {
        ((List)localObject).add(str.replace("-", "").toLowerCase(Locale.US));
      }
      i += 1;
    }
    Collections.sort((List)localObject);
    paramVarArgs = new StringBuilder();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramVarArgs.append((String)((Iterator)localObject).next());
    }
    paramVarArgs = paramVarArgs.toString();
    if (paramVarArgs.length() > 0) {
      return a(paramVarArgs);
    }
    return null;
  }
  
  @TargetApi(16)
  public static void a(Activity paramActivity, int paramInt)
  {
    if (paramActivity == null) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      paramActivity.finishAffinity();
      return;
    }
    paramActivity.setResult(paramInt);
    paramActivity.finish();
  }
  
  @TargetApi(16)
  public static void a(Context paramContext, int paramInt)
  {
    if ((paramContext instanceof Activity)) {
      a((Activity)paramContext, paramInt);
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (e(paramContext)) {
      f.h().a(paramInt, "Fabric", paramString2);
    }
  }
  
  public static void a(Context paramContext, View paramView)
  {
    paramContext = (InputMethodManager)paramContext.getSystemService("input_method");
    if (paramContext != null) {
      paramContext.hideSoftInputFromWindow(paramView.getWindowToken(), 0);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (e(paramContext)) {
      f.h().a("Fabric", paramString);
    }
  }
  
  public static void a(Context paramContext, String paramString, Throwable paramThrowable)
  {
    if (e(paramContext)) {
      f.h().e("Fabric", paramString);
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void a(Closeable paramCloseable, String paramString)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      f.h().e("Fabric", paramString, paramCloseable);
    }
  }
  
  public static void a(Flushable paramFlushable, String paramString)
  {
    if (paramFlushable != null) {}
    try
    {
      paramFlushable.flush();
      return;
    }
    catch (IOException paramFlushable)
    {
      f.h().e("Fabric", paramString, paramFlushable);
    }
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    for (;;)
    {
      int i = paramInputStream.read(paramArrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(paramArrayOfByte, 0, i);
    }
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    int i;
    if (paramContext != null)
    {
      Resources localResources = paramContext.getResources();
      bool = paramBoolean;
      if (localResources != null)
      {
        i = a(paramContext, paramString, "bool");
        if (i <= 0) {
          break label45;
        }
        bool = localResources.getBoolean(i);
      }
    }
    label45:
    do
    {
      return bool;
      i = a(paramContext, paramString, "string");
      bool = paramBoolean;
    } while (i <= 0);
    return Boolean.parseBoolean(paramContext.getString(i));
  }
  
  /* Error */
  public static long b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 39	b/a/a/a/a/b/m:d	J
    //   6: ldc2_w 36
    //   9: lcmp
    //   10: ifne +70 -> 80
    //   13: lconst_0
    //   14: lstore_2
    //   15: new 147	java/io/File
    //   18: dup
    //   19: ldc_w 412
    //   22: invokespecial 415	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: ldc_w 417
    //   28: invokestatic 419	b/a/a/a/a/b/m:a	(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    //   31: astore 4
    //   33: lload_2
    //   34: lstore_0
    //   35: aload 4
    //   37: invokestatic 425	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   40: ifne +36 -> 76
    //   43: aload 4
    //   45: getstatic 291	java/util/Locale:US	Ljava/util/Locale;
    //   48: invokevirtual 428	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   51: astore 4
    //   53: aload 4
    //   55: ldc_w 430
    //   58: invokevirtual 433	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   61: ifeq +28 -> 89
    //   64: aload 4
    //   66: ldc_w 430
    //   69: sipush 1024
    //   72: invokestatic 435	b/a/a/a/a/b/m:a	(Ljava/lang/String;Ljava/lang/String;I)J
    //   75: lstore_0
    //   76: lload_0
    //   77: putstatic 39	b/a/a/a/a/b/m:d	J
    //   80: getstatic 39	b/a/a/a/a/b/m:d	J
    //   83: lstore_0
    //   84: ldc 2
    //   86: monitorexit
    //   87: lload_0
    //   88: lreturn
    //   89: aload 4
    //   91: ldc_w 437
    //   94: invokevirtual 433	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   97: ifeq +18 -> 115
    //   100: aload 4
    //   102: ldc_w 437
    //   105: ldc_w 438
    //   108: invokestatic 435	b/a/a/a/a/b/m:a	(Ljava/lang/String;Ljava/lang/String;I)J
    //   111: lstore_0
    //   112: goto -36 -> 76
    //   115: aload 4
    //   117: ldc_w 440
    //   120: invokevirtual 433	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   123: ifeq +18 -> 141
    //   126: aload 4
    //   128: ldc_w 440
    //   131: ldc_w 441
    //   134: invokestatic 435	b/a/a/a/a/b/m:a	(Ljava/lang/String;Ljava/lang/String;I)J
    //   137: lstore_0
    //   138: goto -62 -> 76
    //   141: invokestatic 185	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   144: ldc -69
    //   146: new 189	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   153: ldc_w 443
    //   156: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: aload 4
    //   161: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokeinterface 361 3 0
    //   172: lload_2
    //   173: lstore_0
    //   174: goto -98 -> 76
    //   177: astore 5
    //   179: invokestatic 185	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   182: ldc -69
    //   184: new 189	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   191: ldc_w 443
    //   194: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload 4
    //   199: invokevirtual 196	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: aload 5
    //   207: invokeinterface 208 4 0
    //   212: lload_2
    //   213: lstore_0
    //   214: goto -138 -> 76
    //   217: astore 4
    //   219: ldc 2
    //   221: monitorexit
    //   222: aload 4
    //   224: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	180	0	l1	long
    //   14	199	2	l2	long
    //   31	167	4	str	String
    //   217	6	4	localObject	Object
    //   177	29	5	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   53	76	177	java/lang/NumberFormatException
    //   89	112	177	java/lang/NumberFormatException
    //   115	138	177	java/lang/NumberFormatException
    //   141	172	177	java/lang/NumberFormatException
    //   3	13	217	finally
    //   15	33	217	finally
    //   35	53	217	finally
    //   53	76	217	finally
    //   76	80	217	finally
    //   80	84	217	finally
    //   89	112	217	finally
    //   115	138	217	finally
    //   141	172	217	finally
    //   179	212	217	finally
  }
  
  public static long b(Context paramContext)
  {
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    ((ActivityManager)paramContext.getSystemService("activity")).getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem;
  }
  
  public static long b(String paramString)
  {
    paramString = new StatFs(paramString);
    long l = paramString.getBlockSize();
    return paramString.getBlockCount() * l - paramString.getAvailableBlocks() * l;
  }
  
  public static String b(Context paramContext, String paramString)
  {
    int i = a(paramContext, paramString, "string");
    if (i > 0) {
      return paramContext.getString(i);
    }
    return "";
  }
  
  public static String b(InputStream paramInputStream)
  {
    return a(paramInputStream, "SHA-1");
  }
  
  public static void b(Context paramContext, View paramView)
  {
    paramContext = (InputMethodManager)paramContext.getSystemService("input_method");
    if (paramContext != null) {
      paramContext.showSoftInputFromInputMethod(paramView.getWindowToken(), 0);
    }
  }
  
  public static float c(Context paramContext)
  {
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    int i = paramContext.getIntExtra("level", -1);
    int j = paramContext.getIntExtra("scale", -1);
    return i / j;
  }
  
  public static boolean c()
  {
    return (Debug.isDebuggerConnected()) || (Debug.waitingForDebugger());
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
  }
  
  public static boolean c(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static boolean d(Context paramContext)
  {
    if (f(paramContext)) {
      return false;
    }
    if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(8) != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean e(Context paramContext)
  {
    if (b == null) {
      b = Boolean.valueOf(a(paramContext, "com.crashlytics.Trace", false));
    }
    return b.booleanValue();
  }
  
  public static boolean f(Context paramContext)
  {
    paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    return ("sdk".equals(Build.PRODUCT)) || ("google_sdk".equals(Build.PRODUCT)) || (paramContext == null);
  }
  
  public static boolean g(Context paramContext)
  {
    boolean bool = f(paramContext);
    paramContext = Build.TAGS;
    if ((!bool) && (paramContext != null) && (paramContext.contains("test-keys"))) {}
    do
    {
      do
      {
        return true;
      } while (new File("/system/app/Superuser.apk").exists());
      paramContext = new File("/system/xbin/su");
    } while ((!bool) && (paramContext.exists()));
    return false;
  }
  
  public static int h(Context paramContext)
  {
    int j = 0;
    if (f(paramContext)) {
      j = 1;
    }
    int i = j;
    if (g(paramContext)) {
      i = j | 0x2;
    }
    j = i;
    if (c()) {
      j = i | 0x4;
    }
    return j;
  }
  
  public static boolean i(Context paramContext)
  {
    return (paramContext.getApplicationInfo().flags & 0x2) != 0;
  }
  
  public static String j(Context paramContext)
  {
    int i = paramContext.getApplicationContext().getApplicationInfo().icon;
    if (i > 0) {
      return paramContext.getResources().getResourcePackageName(i);
    }
    return paramContext.getPackageName();
  }
  
  /* Error */
  public static String k(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 63	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   6: aload_0
    //   7: invokestatic 592	b/a/a/a/a/b/m:l	(Landroid/content/Context;)I
    //   10: invokevirtual 596	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   13: astore_0
    //   14: aload_0
    //   15: astore_2
    //   16: aload_0
    //   17: invokestatic 598	b/a/a/a/a/b/m:b	(Ljava/io/InputStream;)Ljava/lang/String;
    //   20: astore 4
    //   22: aload_0
    //   23: astore_2
    //   24: aload 4
    //   26: invokestatic 600	b/a/a/a/a/b/m:c	(Ljava/lang/String;)Z
    //   29: istore_1
    //   30: iload_1
    //   31: ifeq +14 -> 45
    //   34: aload_3
    //   35: astore_2
    //   36: aload_0
    //   37: ldc_w 602
    //   40: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   43: aload_2
    //   44: areturn
    //   45: aload 4
    //   47: astore_2
    //   48: goto -12 -> 36
    //   51: astore_3
    //   52: aconst_null
    //   53: astore_0
    //   54: aload_0
    //   55: astore_2
    //   56: invokestatic 185	b/a/a/a/f:h	()Lb/a/a/a/t;
    //   59: ldc -69
    //   61: ldc -10
    //   63: aload_3
    //   64: invokeinterface 208 4 0
    //   69: aload_0
    //   70: ldc_w 602
    //   73: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   76: aconst_null
    //   77: areturn
    //   78: astore_0
    //   79: aconst_null
    //   80: astore_2
    //   81: aload_2
    //   82: ldc_w 602
    //   85: invokestatic 179	b/a/a/a/a/b/m:a	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   88: aload_0
    //   89: athrow
    //   90: astore_0
    //   91: goto -10 -> 81
    //   94: astore_3
    //   95: goto -41 -> 54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramContext	Context
    //   29	2	1	bool	boolean
    //   15	67	2	localObject1	Object
    //   1	34	3	localObject2	Object
    //   51	13	3	localException1	Exception
    //   94	1	3	localException2	Exception
    //   20	26	4	str	String
    // Exception table:
    //   from	to	target	type
    //   2	14	51	java/lang/Exception
    //   2	14	78	finally
    //   16	22	90	finally
    //   24	30	90	finally
    //   56	69	90	finally
    //   16	22	94	java/lang/Exception
    //   24	30	94	java/lang/Exception
  }
  
  public static int l(Context paramContext)
  {
    return paramContext.getApplicationContext().getApplicationInfo().icon;
  }
  
  public static String m(Context paramContext)
  {
    String str = null;
    int j = a(paramContext, "io.fabric.android.build_id", "string");
    int i = j;
    if (j == 0) {
      i = a(paramContext, "com.crashlytics.android.build_id", "string");
    }
    if (i != 0)
    {
      str = paramContext.getResources().getString(i);
      f.h().a("Fabric", "Build ID is: " + str);
    }
    return str;
  }
  
  public static boolean n(Context paramContext)
  {
    if (c(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      return (paramContext != null) && (paramContext.isConnectedOrConnecting());
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */