package com.mixpanel.android.mpmetrics;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

final class bk
{
  private final Context a;
  private final Boolean b;
  private final Boolean c;
  private final DisplayMetrics d;
  private final String e;
  private final Integer f;
  
  /* Error */
  public bk(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: invokespecial 28	java/lang/Object:<init>	()V
    //   7: aload_0
    //   8: aload_1
    //   9: putfield 30	com/mixpanel/android/mpmetrics/bk:a	Landroid/content/Context;
    //   12: aload_0
    //   13: getfield 30	com/mixpanel/android/mpmetrics/bk:a	Landroid/content/Context;
    //   16: invokevirtual 36	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   19: astore 6
    //   21: aload 6
    //   23: aload_0
    //   24: getfield 30	com/mixpanel/android/mpmetrics/bk:a	Landroid/content/Context;
    //   27: invokevirtual 40	android/content/Context:getPackageName	()Ljava/lang/String;
    //   30: iconst_0
    //   31: invokevirtual 46	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   34: astore_3
    //   35: aload_3
    //   36: getfield 51	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   39: astore_1
    //   40: aload_3
    //   41: getfield 55	android/content/pm/PackageInfo:versionCode	I
    //   44: istore_2
    //   45: iload_2
    //   46: invokestatic 61	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   49: astore 5
    //   51: aload_1
    //   52: astore_3
    //   53: aload 5
    //   55: astore_1
    //   56: aload_0
    //   57: aload_3
    //   58: putfield 63	com/mixpanel/android/mpmetrics/bk:e	Ljava/lang/String;
    //   61: aload_0
    //   62: aload_1
    //   63: putfield 65	com/mixpanel/android/mpmetrics/bk:f	Ljava/lang/Integer;
    //   66: aload 6
    //   68: invokevirtual 69	java/lang/Object:getClass	()Ljava/lang/Class;
    //   71: astore_1
    //   72: aload_1
    //   73: ldc 71
    //   75: iconst_1
    //   76: anewarray 73	java/lang/Class
    //   79: dup
    //   80: iconst_0
    //   81: ldc 75
    //   83: aastore
    //   84: invokevirtual 79	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   87: astore_3
    //   88: aload_3
    //   89: ifnull +157 -> 246
    //   92: aload_3
    //   93: aload 6
    //   95: iconst_1
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: ldc 81
    //   103: aastore
    //   104: invokevirtual 87	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast 89	java/lang/Boolean
    //   110: astore_1
    //   111: aload_3
    //   112: aload 6
    //   114: iconst_1
    //   115: anewarray 4	java/lang/Object
    //   118: dup
    //   119: iconst_0
    //   120: ldc 91
    //   122: aastore
    //   123: invokevirtual 87	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   126: checkcast 89	java/lang/Boolean
    //   129: astore_3
    //   130: aload_0
    //   131: aload_1
    //   132: putfield 93	com/mixpanel/android/mpmetrics/bk:b	Ljava/lang/Boolean;
    //   135: aload_0
    //   136: aload_3
    //   137: putfield 95	com/mixpanel/android/mpmetrics/bk:c	Ljava/lang/Boolean;
    //   140: aload_0
    //   141: new 97	android/util/DisplayMetrics
    //   144: dup
    //   145: invokespecial 98	android/util/DisplayMetrics:<init>	()V
    //   148: putfield 100	com/mixpanel/android/mpmetrics/bk:d	Landroid/util/DisplayMetrics;
    //   151: aload_0
    //   152: getfield 30	com/mixpanel/android/mpmetrics/bk:a	Landroid/content/Context;
    //   155: ldc 102
    //   157: invokevirtual 106	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   160: checkcast 108	android/view/WindowManager
    //   163: invokeinterface 112 1 0
    //   168: aload_0
    //   169: getfield 100	com/mixpanel/android/mpmetrics/bk:d	Landroid/util/DisplayMetrics;
    //   172: invokevirtual 118	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   175: return
    //   176: astore_1
    //   177: aconst_null
    //   178: astore_1
    //   179: ldc 120
    //   181: ldc 122
    //   183: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   186: pop
    //   187: aload_1
    //   188: astore_3
    //   189: aconst_null
    //   190: astore_1
    //   191: goto -135 -> 56
    //   194: astore_1
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -109 -> 88
    //   200: astore_1
    //   201: aconst_null
    //   202: astore_1
    //   203: ldc 120
    //   205: ldc -126
    //   207: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   210: pop
    //   211: aload 4
    //   213: astore_3
    //   214: goto -84 -> 130
    //   217: astore_1
    //   218: aconst_null
    //   219: astore_1
    //   220: ldc 120
    //   222: ldc -126
    //   224: invokestatic 128	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aload 4
    //   230: astore_3
    //   231: goto -101 -> 130
    //   234: astore_3
    //   235: goto -15 -> 220
    //   238: astore_3
    //   239: goto -36 -> 203
    //   242: astore_3
    //   243: goto -64 -> 179
    //   246: aconst_null
    //   247: astore_1
    //   248: aload 4
    //   250: astore_3
    //   251: goto -121 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	bk
    //   0	254	1	paramContext	Context
    //   44	2	2	i	int
    //   34	197	3	localObject1	Object
    //   234	1	3	localIllegalAccessException	IllegalAccessException
    //   238	1	3	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    //   242	1	3	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   250	1	3	localObject2	Object
    //   1	248	4	localObject3	Object
    //   49	5	5	localInteger	Integer
    //   19	94	6	localPackageManager	PackageManager
    // Exception table:
    //   from	to	target	type
    //   21	40	176	android/content/pm/PackageManager$NameNotFoundException
    //   72	88	194	java/lang/NoSuchMethodException
    //   92	111	200	java/lang/reflect/InvocationTargetException
    //   92	111	217	java/lang/IllegalAccessException
    //   111	130	234	java/lang/IllegalAccessException
    //   111	130	238	java/lang/reflect/InvocationTargetException
    //   40	45	242	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public String a()
  {
    return this.e;
  }
  
  public boolean b()
  {
    return this.b.booleanValue();
  }
  
  public boolean c()
  {
    return this.c.booleanValue();
  }
  
  public DisplayMetrics d()
  {
    return this.d;
  }
  
  public String e()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)this.a.getSystemService("phone");
    if (localTelephonyManager != null) {
      return localTelephonyManager.getNetworkOperatorName();
    }
    return null;
  }
  
  public Boolean f()
  {
    Boolean localBoolean = null;
    if (this.a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
      localBoolean = Boolean.valueOf(((ConnectivityManager)this.a.getSystemService("connectivity")).getNetworkInfo(1).isConnected());
    }
    return localBoolean;
  }
  
  public Boolean g()
  {
    Boolean localBoolean = null;
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      if (localBluetoothAdapter != null)
      {
        boolean bool = localBluetoothAdapter.isEnabled();
        localBoolean = Boolean.valueOf(bool);
      }
      return localBoolean;
    }
    catch (SecurityException localSecurityException) {}
    return null;
  }
  
  public String h()
  {
    String str = null;
    if (Build.VERSION.SDK_INT >= 8)
    {
      str = "none";
      if ((Build.VERSION.SDK_INT < 18) || (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))) {
        break label41;
      }
      str = "ble";
    }
    label41:
    while (!this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
      return str;
    }
    return "classic";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */