package com.appsee;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

class wn
{
  private static String A;
  private static String B;
  private static String D;
  private static final DisplayMetrics E = new DisplayMetrics();
  private static boolean F;
  private static boolean G;
  private static String M;
  private static final zk c;
  private static String e;
  private static final Point f;
  private static float g = 0.0F;
  private static int h = 0;
  private static boolean j;
  private static boolean l;
  
  static
  {
    c = new zk();
    f = new Point();
  }
  
  public static String A()
  {
    if (B == null)
    {
      B = bp.C().getPackageName();
      if (bb.C(B)) {
        B = "";
      }
    }
    return B;
  }
  
  public static float C()
  {
    return bp.C().getResources().getConfiguration().fontScale;
  }
  
  public static float C(float paramFloat)
  {
    C();
    return paramFloat / g;
  }
  
  public static int C()
  {
    C();
    return h;
  }
  
  public static long C()
  {
    return SystemClock.elapsedRealtime();
  }
  
  public static qh C()
  {
    Object localObject = bp.C();
    if (((Context)localObject).checkCallingOrSelfPermission(wc.C("W\032R\006Y\035RZF\021D\031_\007E\035Y\032\0305u7s'e+x1b#y&}+e w s")) != 0)
    {
      localObject = qh.B;
      return (qh)localObject;
    }
    qh localqh = qh.B;
    NetworkInfo localNetworkInfo = ((ConnectivityManager)((Context)localObject).getSystemService(sb.C("\r,\000-\013 \032*\030*\032:"))).getActiveNetworkInfo();
    if (localNetworkInfo == null) {}
    for (localqh = qh.M;; localqh = qh.A)
    {
      localObject = localqh;
      if (localNetworkInfo == null) {
        break;
      }
      localObject = localqh;
      if (localNetworkInfo.isConnected()) {
        break;
      }
      return qh.M;
      if ((localNetworkInfo.getType() != 1) && (localNetworkInfo.getType() != 6) && (localNetworkInfo.getType() != 7) && ((Build.VERSION.SDK_INT <= 13) || (localNetworkInfo.getType() != 9))) {
        break label119;
      }
    }
    label119:
    if ((localNetworkInfo.getType() == 0) || (localNetworkInfo.getType() == 4) || (localNetworkInfo.getType() == 5)) {
      localqh = qh.G;
    }
    for (;;)
    {
      break;
    }
  }
  
  public static zk C()
  {
    return c;
  }
  
  @TargetApi(23)
  public static JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(sb.C("\r,\n&\000\"\003&"), Build.VERSION.CODENAME);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localJSONObject.put(wc.C("\007S\027C\006_\000O+F\025B\027^"), Build.VERSION.SECURITY_PATCH);
        localJSONObject.put(sb.C("!\0170\013\034\0010"), Build.VERSION.BASE_OS);
        localJSONObject.put(wc.C("F\006S\002_\021A+E\020]+_\032B"), Build.VERSION.PREVIEW_SDK_INT);
      }
      localJSONObject.put(sb.C("!\001\"\034'"), Build.BOARD);
      localJSONObject.put(wc.C("\026Y\033B\030Y\025R\021D"), Build.BOOTLOADER);
      localJSONObject.put(sb.C("!\034\"\000'"), Build.BRAND);
      localJSONObject.put(wc.C("U\004C+W\026_"), Build.CPU_ABI);
      localJSONObject.put(sb.C("\r3\033\034\017!\007q"), Build.CPU_ABI2);
      localJSONObject.put(wc.C("\020S\002_\027S"), Build.DEVICE);
      localJSONObject.put(sb.C("'\0070\036/\017:"), Build.DISPLAY);
      localJSONObject.put(wc.C("P\035X\023S\006F\006_\032B"), Build.FINGERPRINT);
      localJSONObject.put(sb.C("\006,\0357"), Build.HOST);
      localJSONObject.put(wc.C("\034W\006R\003W\006S"), Build.HARDWARE);
      localJSONObject.put(sb.C("\007'"), Build.ID);
      localJSONObject.put(wc.C("F\006Y\020C\027B"), Build.PRODUCT);
      Object localObject2 = sb.C("1\017'\007,");
      if (Build.VERSION.SDK_INT >= 14) {}
      for (Object localObject1 = Build.getRadioVersion();; localObject1 = Build.RADIO)
      {
        localJSONObject.put((String)localObject2, localObject1);
        localJSONObject.put(wc.C("\000W\023E"), Build.TAGS);
        localJSONObject.put(sb.C("\032*\003&"), Build.TIME);
        localJSONObject.put(wc.C("\000O\004S"), Build.TYPE);
        localJSONObject.put(sb.C("\f6\007/\n\034\0330\0131"), Build.USER);
        localJSONObject.put(wc.C("C\032]\032Y\003X"), sb.C("6\000(\000,\031-"));
        if (Build.VERSION.SDK_INT >= 9) {
          localJSONObject.put(wc.C("\007S\006_\025Z"), Build.SERIAL);
        }
        if (Build.VERSION.SDK_INT < 21) {
          break label453;
        }
        localObject1 = new JSONArray();
        localObject2 = Build.SUPPORTED_ABIS;
        int m = localObject2.length;
        int i = 0;
        for (int k = 0; i < m; k = i)
        {
          Object localObject3 = localObject2[k];
          i = k + 1;
          ((JSONArray)localObject1).put(localObject3);
        }
      }
      localJSONObject.put(sb.C("\0356\0363\0011\032&\n\034\017!\0070"), localObject1);
      label453:
      return localJSONObject;
    }
    catch (Exception localException) {}
    return localJSONObject;
  }
  
  /* Error */
  public static boolean C()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 406	com/appsee/wn:F	Z
    //   8: ifne +49 -> 57
    //   11: iconst_1
    //   12: putstatic 406	com/appsee/wn:F	Z
    //   15: invokestatic 408	com/appsee/wn:C	()Lcom/appsee/zk;
    //   18: iconst_1
    //   19: invokevirtual 411	com/appsee/zk:C	(Z)Lcom/appsee/Dimension;
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 370	com/appsee/Dimension:getWidth	()I
    //   27: i2f
    //   28: invokestatic 413	com/appsee/wn:C	(F)F
    //   31: ldc_w 414
    //   34: fcmpl
    //   35: iflt +31 -> 66
    //   38: aload_1
    //   39: invokevirtual 369	com/appsee/Dimension:getHeight	()I
    //   42: i2f
    //   43: invokestatic 413	com/appsee/wn:C	(F)F
    //   46: ldc_w 414
    //   49: fcmpl
    //   50: iflt +16 -> 66
    //   53: iload_0
    //   54: putstatic 416	com/appsee/wn:G	Z
    //   57: getstatic 416	com/appsee/wn:G	Z
    //   60: istore_0
    //   61: ldc 2
    //   63: monitorexit
    //   64: iload_0
    //   65: ireturn
    //   66: iconst_0
    //   67: istore_0
    //   68: goto -15 -> 53
    //   71: astore_1
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	67	0	bool	boolean
    //   22	17	1	localDimension	Dimension
    //   71	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	53	71	finally
    //   53	57	71	finally
    //   57	61	71	finally
  }
  
  public static String D()
  {
    if (e == null)
    {
      Object localObject = bp.C();
      localObject = ((Context)localObject).getPackageManager().getPackageInfo(((Context)localObject).getPackageName(), 0);
      if (localObject == null) {
        throw new PackageManager.NameNotFoundException(wc.C("7W\032X\033BTQ\021BTF\025U\037W\023ST_\032P\033D\031W\000_\033X"));
      }
      e = ((PackageInfo)localObject).versionName;
      if (bb.C(e)) {
        e = "0.0";
      }
    }
    return e;
  }
  
  public static float H()
  {
    C();
    return g;
  }
  
  public static float H(float paramFloat)
  {
    C();
    return g * paramFloat;
  }
  
  public static int H()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public static String H()
  {
    return Build.MODEL;
  }
  
  /* Error */
  public static boolean H()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 489	com/appsee/wn:j	Z
    //   8: ifne +31 -> 39
    //   11: iconst_1
    //   12: putstatic 489	com/appsee/wn:j	Z
    //   15: invokestatic 408	com/appsee/wn:C	()Lcom/appsee/zk;
    //   18: iconst_1
    //   19: invokevirtual 492	com/appsee/zk:C	(Z)[Lcom/appsee/Dimension;
    //   22: astore_1
    //   23: aload_1
    //   24: iconst_0
    //   25: aaload
    //   26: aload_1
    //   27: iconst_1
    //   28: aaload
    //   29: invokevirtual 496	com/appsee/Dimension:equals	(Ljava/lang/Object;)Z
    //   32: ifne +16 -> 48
    //   35: iload_0
    //   36: putstatic 498	com/appsee/wn:l	Z
    //   39: getstatic 498	com/appsee/wn:l	Z
    //   42: istore_0
    //   43: ldc 2
    //   45: monitorexit
    //   46: iload_0
    //   47: ireturn
    //   48: iconst_0
    //   49: istore_0
    //   50: goto -15 -> 35
    //   53: astore_1
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	49	0	bool	boolean
    //   22	5	1	arrayOfDimension	Dimension[]
    //   53	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	35	53	finally
    //   35	39	53	finally
    //   39	43	53	finally
  }
  
  public static String J()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ei.C(new dk(localStringBuilder));
    return localStringBuilder.toString();
  }
  
  public static String K()
  {
    if (D == null)
    {
      Locale localLocale = bp.C().getResources().getConfiguration().locale;
      D = String.format(wc.C("\023\007\033QE"), new Object[] { localLocale.getLanguage(), localLocale.getCountry() });
    }
    return D;
  }
  
  public static String M()
  {
    if (A == null) {
      A = Build.MANUFACTURER;
    }
    return A;
  }
  
  public static float a()
  {
    try
    {
      Runtime localRuntime = Runtime.getRuntime();
      long l1 = localRuntime.freeMemory();
      long l2 = localRuntime.totalMemory();
      return (1.0F - (float)l1 / (float)l2) * 100.0F;
    }
    catch (Exception localException) {}
    return -1.0F;
  }
  
  public static String a()
  {
    return Build.VERSION.INCREMENTAL;
  }
  
  @TargetApi(14)
  public static boolean a()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return ViewConfiguration.get(bp.C()).hasPermanentMenuKey();
    }
    return true;
  }
  
  public static String h()
  {
    if (M == null)
    {
      M = Build.VERSION.RELEASE;
      vd.C(1, sb.C("=\007%c8&\0340\007,\000yK'"), new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    return M;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */