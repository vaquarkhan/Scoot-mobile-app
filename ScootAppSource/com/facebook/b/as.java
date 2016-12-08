package com.facebook.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.p;
import com.facebook.w;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class as
{
  private static final String[] a = { "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories" };
  private static Map<String, ax> b = new ConcurrentHashMap();
  private static AtomicBoolean c = new AtomicBoolean(false);
  private static int d = 0;
  private static long e = -1L;
  private static long f = -1L;
  private static long g = -1L;
  private static String h = "";
  private static String i = "NoCarrier";
  
  public static int a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    int j = 0;
    try
    {
      localBufferedInputStream = new BufferedInputStream(paramInputStream);
      byte[] arrayOfByte;
      int k;
      if (localBufferedInputStream == null) {
        break label81;
      }
    }
    finally
    {
      try
      {
        arrayOfByte = new byte[' '];
        for (;;)
        {
          k = localBufferedInputStream.read(arrayOfByte);
          if (k == -1) {
            break;
          }
          paramOutputStream.write(arrayOfByte, 0, k);
          j += k;
        }
        if (localBufferedInputStream != null) {
          localBufferedInputStream.close();
        }
        if (paramInputStream != null) {
          paramInputStream.close();
        }
        return j;
      }
      finally
      {
        BufferedInputStream localBufferedInputStream;
        for (;;) {}
      }
      paramOutputStream = finally;
      localBufferedInputStream = null;
    }
    localBufferedInputStream.close();
    label81:
    if (paramInputStream != null) {
      paramInputStream.close();
    }
    throw paramOutputStream;
  }
  
  private static long a(double paramDouble)
  {
    return Math.round(paramDouble / 1.073741824E9D);
  }
  
  public static long a(Uri paramUri)
  {
    try
    {
      paramUri = w.f().getContentResolver().query(paramUri, null, null, null, null);
      int j;
      long l;
      if (paramUri == null) {
        break label65;
      }
    }
    finally
    {
      try
      {
        j = paramUri.getColumnIndex("_size");
        paramUri.moveToFirst();
        l = paramUri.getLong(j);
        if (paramUri != null) {
          paramUri.close();
        }
        return l;
      }
      finally {}
      localObject1 = finally;
      paramUri = null;
    }
    paramUri.close();
    label65:
    throw ((Throwable)localObject1);
  }
  
  public static Uri a(String paramString1, String paramString2, Bundle paramBundle)
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.authority(paramString1);
    localBuilder.path(paramString2);
    if (paramBundle != null)
    {
      paramString1 = paramBundle.keySet().iterator();
      while (paramString1.hasNext())
      {
        paramString2 = (String)paramString1.next();
        Object localObject = paramBundle.get(paramString2);
        if ((localObject instanceof String)) {
          localBuilder.appendQueryParameter(paramString2, (String)localObject);
        }
      }
    }
    return localBuilder.build();
  }
  
  public static ax a(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) && (b.containsKey(paramString))) {
      return (ax)b.get(paramString);
    }
    JSONObject localJSONObject = f(paramString);
    if (localJSONObject == null) {
      return null;
    }
    return b(paramString, localJSONObject);
  }
  
  public static Object a(Object paramObject, Method paramMethod, Object... paramVarArgs)
  {
    try
    {
      paramObject = paramMethod.invoke(paramObject, paramVarArgs);
      return paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      return null;
    }
    catch (InvocationTargetException paramObject) {}
    return null;
  }
  
  public static Object a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    paramJSONObject = paramJSONObject.opt(paramString1);
    if ((paramJSONObject != null) && ((paramJSONObject instanceof String))) {
      paramJSONObject = new JSONTokener((String)paramJSONObject).nextValue();
    }
    for (;;)
    {
      if ((paramJSONObject != null) && (!(paramJSONObject instanceof JSONObject)) && (!(paramJSONObject instanceof JSONArray)))
      {
        if (paramString2 != null)
        {
          paramString1 = new JSONObject();
          paramString1.putOpt(paramString2, paramJSONObject);
          return paramString1;
        }
        throw new p("Got an unexpected non-JSON object.");
      }
      return paramJSONObject;
    }
  }
  
  public static String a(Context paramContext)
  {
    az.a(paramContext, "context");
    w.a(paramContext);
    return w.i();
  }
  
  /* Error */
  public static String a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 72	java/io/BufferedInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 75	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   10: astore_0
    //   11: new 255	java/io/InputStreamReader
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 256	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   19: astore_2
    //   20: new 258	java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial 259	java/lang/StringBuilder:<init>	()V
    //   27: astore_3
    //   28: sipush 2048
    //   31: newarray <illegal type>
    //   33: astore 4
    //   35: aload_2
    //   36: aload 4
    //   38: invokevirtual 262	java/io/InputStreamReader:read	([C)I
    //   41: istore_1
    //   42: iload_1
    //   43: iconst_m1
    //   44: if_icmpeq +32 -> 76
    //   47: aload_3
    //   48: aload 4
    //   50: iconst_0
    //   51: iload_1
    //   52: invokevirtual 266	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: goto -21 -> 35
    //   59: astore 4
    //   61: aload_0
    //   62: astore_3
    //   63: aload 4
    //   65: astore_0
    //   66: aload_3
    //   67: invokestatic 269	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   70: aload_2
    //   71: invokestatic 269	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   74: aload_0
    //   75: athrow
    //   76: aload_3
    //   77: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: astore_3
    //   81: aload_0
    //   82: invokestatic 269	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   85: aload_2
    //   86: invokestatic 269	com/facebook/b/as:a	(Ljava/io/Closeable;)V
    //   89: aload_3
    //   90: areturn
    //   91: astore_0
    //   92: aconst_null
    //   93: astore_2
    //   94: goto -28 -> 66
    //   97: astore 4
    //   99: aconst_null
    //   100: astore_2
    //   101: aload_0
    //   102: astore_3
    //   103: aload 4
    //   105: astore_0
    //   106: goto -40 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramInputStream	InputStream
    //   41	11	1	j	int
    //   19	82	2	localInputStreamReader	java.io.InputStreamReader
    //   1	102	3	localObject1	Object
    //   33	16	4	arrayOfChar	char[]
    //   59	5	4	localObject2	Object
    //   97	7	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   20	35	59	finally
    //   35	42	59	finally
    //   47	56	59	finally
    //   76	81	59	finally
    //   2	11	91	finally
    //   11	20	97	finally
  }
  
  private static String a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return a(paramString, paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException paramString) {}
    return null;
  }
  
  private static String a(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    paramMessageDigest.update(paramArrayOfByte);
    paramMessageDigest = paramMessageDigest.digest();
    paramArrayOfByte = new StringBuilder();
    int k = paramMessageDigest.length;
    int j = 0;
    while (j < k)
    {
      int m = paramMessageDigest[j];
      paramArrayOfByte.append(Integer.toHexString(m >> 4 & 0xF));
      paramArrayOfByte.append(Integer.toHexString(m >> 0 & 0xF));
      j += 1;
    }
    return paramArrayOfByte.toString();
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a("SHA-1", paramArrayOfByte);
  }
  
  public static Method a(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, paramVarArgs);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass) {}
    return null;
  }
  
  public static Method a(String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    try
    {
      paramString1 = a(Class.forName(paramString1), paramString2, paramVarArgs);
      return paramString1;
    }
    catch (ClassNotFoundException paramString1) {}
    return null;
  }
  
  public static <T> Collection<T> a(T... paramVarArgs)
  {
    return Collections.unmodifiableCollection(Arrays.asList(paramVarArgs));
  }
  
  public static Date a(Bundle paramBundle, String paramString, Date paramDate)
  {
    if (paramBundle == null) {
      return null;
    }
    paramBundle = paramBundle.get(paramString);
    long l;
    if ((paramBundle instanceof Long)) {
      l = ((Long)paramBundle).longValue();
    }
    for (;;)
    {
      if (l != 0L) {
        break label67;
      }
      return new Date(Long.MAX_VALUE);
      if ((paramBundle instanceof String)) {
        try
        {
          l = Long.parseLong((String)paramBundle);
        }
        catch (NumberFormatException paramBundle)
        {
          return null;
        }
      }
    }
    return null;
    label67:
    return new Date(l * 1000L + paramDate.getTime());
  }
  
  public static List<String> a(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    while (j < paramJSONArray.length())
    {
      localArrayList.add(paramJSONArray.getString(j));
      j += 1;
    }
    return localArrayList;
  }
  
  public static Map<String, String> a(Parcel paramParcel)
  {
    int k = paramParcel.readInt();
    Object localObject;
    if (k < 0)
    {
      localObject = null;
      return (Map<String, String>)localObject;
    }
    HashMap localHashMap = new HashMap();
    int j = 0;
    for (;;)
    {
      localObject = localHashMap;
      if (j >= k) {
        break;
      }
      localHashMap.put(paramParcel.readString(), paramParcel.readString());
      j += 1;
    }
  }
  
  private static Map<String, Map<String, aw>> a(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
      if (localJSONArray != null)
      {
        int j = 0;
        if (j < localJSONArray.length())
        {
          aw localaw = aw.a(localJSONArray.optJSONObject(j));
          if (localaw == null) {}
          for (;;)
          {
            j += 1;
            break;
            String str = localaw.a();
            Map localMap = (Map)localHashMap.get(str);
            paramJSONObject = localMap;
            if (localMap == null)
            {
              paramJSONObject = new HashMap();
              localHashMap.put(str, paramJSONObject);
            }
            paramJSONObject.put(localaw.b(), localaw);
          }
        }
      }
    }
    return localHashMap;
  }
  
  public static void a(Context paramContext, String paramString)
  {
    boolean bool = c.compareAndSet(false, true);
    if ((a(paramString)) || (b.containsKey(paramString)) || (!bool)) {
      return;
    }
    String str = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] { paramString });
    w.d().execute(new at(paramContext, str, paramString));
  }
  
  public static void a(Parcel paramParcel, Map<String, String> paramMap)
  {
    if (paramMap == null) {
      paramParcel.writeInt(-1);
    }
    for (;;)
    {
      return;
      paramParcel.writeInt(paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        paramParcel.writeString((String)localEntry.getKey());
        paramParcel.writeString((String)localEntry.getValue());
      }
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
    catch (IOException paramCloseable) {}
  }
  
  public static void a(String paramString, ay paramay)
  {
    JSONObject localJSONObject = aq.a(paramString);
    if (localJSONObject != null)
    {
      paramay.a(localJSONObject);
      return;
    }
    paramay = new au(paramay, paramString);
    paramString = g(paramString);
    paramString.a(paramay);
    paramString.j();
  }
  
  public static void a(String paramString, Exception paramException)
  {
    if ((w.b()) && (paramString != null) && (paramException != null)) {
      Log.d(paramString, paramException.getClass().getSimpleName() + ": " + paramException.getMessage());
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if ((w.b()) && (paramString1 != null) && (paramString2 != null)) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((w.b()) && (!a(paramString1))) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void a(URLConnection paramURLConnection)
  {
    if ((paramURLConnection instanceof HttpURLConnection)) {
      ((HttpURLConnection)paramURLConnection).disconnect();
    }
  }
  
  public static void a(JSONObject paramJSONObject, Context paramContext)
  {
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put("a2");
    d(paramContext);
    String str = paramContext.getPackageName();
    k = -1;
    Object localObject1 = "";
    j = k;
    try
    {
      Object localObject2 = paramContext.getPackageManager().getPackageInfo(str, 0);
      j = k;
      k = ((PackageInfo)localObject2).versionCode;
      j = k;
      localObject2 = ((PackageInfo)localObject2).versionName;
      j = k;
      localObject1 = localObject2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int m;
        continue;
        double d1 = 0.0D;
        j = 0;
        k = 0;
      }
    }
    localJSONArray.put(str);
    localJSONArray.put(j);
    localJSONArray.put(localObject1);
    localJSONArray.put(Build.VERSION.RELEASE);
    localJSONArray.put(Build.MODEL);
    try
    {
      localObject1 = paramContext.getResources().getConfiguration().locale;
      localJSONArray.put(((Locale)localObject1).getLanguage() + "_" + ((Locale)localObject1).getCountry());
      localJSONArray.put(h);
      localJSONArray.put(i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext = (WindowManager)paramContext.getSystemService("window");
          if (paramContext == null) {
            break label403;
          }
          paramContext = paramContext.getDefaultDisplay();
          localObject1 = new DisplayMetrics();
          paramContext.getMetrics((DisplayMetrics)localObject1);
          j = ((DisplayMetrics)localObject1).widthPixels;
        }
        catch (Exception paramContext)
        {
          float f1;
          Locale localLocale;
          j = 0;
          k = 0;
          d1 = 0.0D;
          continue;
        }
        try
        {
          k = ((DisplayMetrics)localObject1).heightPixels;
        }
        catch (Exception paramContext)
        {
          m = 0;
          k = j;
          j = m;
          continue;
        }
        try
        {
          f1 = ((DisplayMetrics)localObject1).density;
          d1 = f1;
          m = k;
          k = j;
          j = m;
          localJSONArray.put(k);
          localJSONArray.put(j);
          localJSONArray.put(String.format("%.2f", new Object[] { Double.valueOf(d1) }));
          localJSONArray.put(b());
          localJSONArray.put(f);
          localJSONArray.put(g);
          paramJSONObject.put("extinfo", localJSONArray.toString());
          return;
        }
        catch (Exception paramContext)
        {
          m = j;
          j = k;
          k = m;
          continue;
        }
        localException = localException;
        localLocale = Locale.getDefault();
      }
    }
  }
  
  public static void a(JSONObject paramJSONObject, d paramd, String paramString, boolean paramBoolean)
  {
    boolean bool2 = true;
    if ((paramd != null) && (paramd.a() != null)) {
      paramJSONObject.put("attribution", paramd.a());
    }
    boolean bool1;
    if ((paramd != null) && (paramd.b() != null))
    {
      paramJSONObject.put("advertiser_id", paramd.b());
      if (!paramd.d())
      {
        bool1 = true;
        paramJSONObject.put("advertiser_tracking_enabled", bool1);
      }
    }
    else
    {
      if ((paramd != null) && (paramd.c() != null)) {
        paramJSONObject.put("installer_package", paramd.c());
      }
      paramJSONObject.put("anon_id", paramString);
      if (paramBoolean) {
        break label124;
      }
    }
    label124:
    for (paramBoolean = bool2;; paramBoolean = false)
    {
      paramJSONObject.put("application_tracking_enabled", paramBoolean);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static boolean a(AccessToken paramAccessToken)
  {
    if (paramAccessToken != null) {
      return paramAccessToken.equals(AccessToken.a());
    }
    return false;
  }
  
  public static <T> boolean a(T paramT1, T paramT2)
  {
    if (paramT1 == null) {
      return paramT2 == null;
    }
    return paramT1.equals(paramT2);
  }
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static <T> boolean a(Collection<T> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.size() == 0);
  }
  
  private static int b()
  {
    if (d > 0) {
      return d;
    }
    try
    {
      d = new File("/sys/devices/system/cpu/").listFiles(new av()).length;
      if (d <= 0) {
        d = Math.max(Runtime.getRuntime().availableProcessors(), 1);
      }
      return d;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public static Bundle b(String paramString)
  {
    Bundle localBundle = new Bundle();
    int k;
    int j;
    if (!a(paramString))
    {
      paramString = paramString.split("&");
      k = paramString.length;
      j = 0;
    }
    for (;;)
    {
      if (j < k)
      {
        String[] arrayOfString = paramString[j].split("=");
        try
        {
          if (arrayOfString.length == 2) {
            localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), URLDecoder.decode(arrayOfString[1], "UTF-8"));
          } else if (arrayOfString.length == 1) {
            localBundle.putString(URLDecoder.decode(arrayOfString[0], "UTF-8"), "");
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          a("FacebookSDK", localUnsupportedEncodingException);
        }
      }
      return localBundle;
      j += 1;
    }
  }
  
  private static ax b(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject.optJSONArray("android_sdk_error_categories");
    if (localObject == null) {}
    for (localObject = x.a();; localObject = x.a((JSONArray)localObject))
    {
      paramJSONObject = new ax(paramJSONObject.optBoolean("supports_implicit_sdk_logging", false), paramJSONObject.optString("gdpv4_nux_content", ""), paramJSONObject.optBoolean("gdpv4_nux_enabled", false), a(paramJSONObject.optJSONObject("android_dialog_configs")), (x)localObject, null);
      b.put(paramString, paramJSONObject);
      return paramJSONObject;
    }
  }
  
  public static <T> List<T> b(T... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int k = paramVarArgs.length;
    int j = 0;
    while (j < k)
    {
      T ? = paramVarArgs[j];
      if (? != null) {
        localArrayList.add(?);
      }
      j += 1;
    }
    return localArrayList;
  }
  
  public static void b(Context paramContext)
  {
    b(paramContext, "facebook.com");
    b(paramContext, ".facebook.com");
    b(paramContext, "https://facebook.com");
    b(paramContext, "https://.facebook.com");
  }
  
  private static void b(Context paramContext, String paramString)
  {
    CookieSyncManager.createInstance(paramContext).sync();
    paramContext = CookieManager.getInstance();
    Object localObject = paramContext.getCookie(paramString);
    if (localObject == null) {
      return;
    }
    localObject = ((String)localObject).split(";");
    int k = localObject.length;
    int j = 0;
    while (j < k)
    {
      String[] arrayOfString = localObject[j].split("=");
      if (arrayOfString.length > 0) {
        paramContext.setCookie(paramString, arrayOfString[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
      }
      j += 1;
    }
    paramContext.removeExpiredCookie();
  }
  
  public static ax c(String paramString)
  {
    if (paramString != null) {
      return (ax)b.get(paramString);
    }
    return null;
  }
  
  public static String c(Context paramContext)
  {
    if (paramContext == null) {
      return "null";
    }
    if (paramContext == paramContext.getApplicationContext()) {
      return "unknown";
    }
    return paramContext.getClass().getSimpleName();
  }
  
  private static void c()
  {
    try
    {
      TimeZone localTimeZone = TimeZone.getDefault();
      h = localTimeZone.getDisplayName(localTimeZone.inDaylightTime(new Date()), 0);
      return;
    }
    catch (Exception localException) {}
  }
  
  public static JSONObject d(String paramString)
  {
    JSONObject localJSONObject = aq.a(paramString);
    if (localJSONObject != null) {
      return localJSONObject;
    }
    paramString = g(paramString).i();
    if (paramString.a() != null) {
      return null;
    }
    return paramString.b();
  }
  
  private static void d(Context paramContext)
  {
    if ((e == -1L) || (System.currentTimeMillis() - e >= 1800000L))
    {
      e = System.currentTimeMillis();
      c();
      e(paramContext);
      f();
      e();
    }
  }
  
  private static boolean d()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  private static void e()
  {
    try
    {
      if (d())
      {
        StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l = localStatFs.getAvailableBlocks();
        g = localStatFs.getBlockSize() * l;
      }
      g = a(g);
      return;
    }
    catch (Exception localException) {}
  }
  
  private static void e(Context paramContext)
  {
    if (i.equals("NoCarrier")) {}
    try
    {
      i = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private static JSONObject f(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", TextUtils.join(",", a));
    paramString = GraphRequest.a(null, paramString, null);
    paramString.a(true);
    paramString.a(localBundle);
    return paramString.i().b();
  }
  
  private static void f()
  {
    try
    {
      if (d())
      {
        StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l = localStatFs.getBlockCount();
        f = localStatFs.getBlockSize() * l;
      }
      f = a(f);
      return;
    }
    catch (Exception localException) {}
  }
  
  private static GraphRequest g(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
    localBundle.putString("access_token", paramString);
    return new GraphRequest(null, "me", localBundle, com.facebook.at.a, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */