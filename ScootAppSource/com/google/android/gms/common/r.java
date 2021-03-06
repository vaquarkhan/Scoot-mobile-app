package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R.string;
import com.google.android.gms.b.fb;
import com.google.android.gms.b.fc;
import com.google.android.gms.common.a.f;
import com.google.android.gms.common.a.h;
import com.google.android.gms.common.a.n;
import com.google.android.gms.common.internal.u;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class r
{
  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = ;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  static final AtomicBoolean zzakA = new AtomicBoolean();
  private static final AtomicBoolean zzakB = new AtomicBoolean();
  public static boolean zzaku = false;
  public static boolean zzakv = false;
  static boolean zzakw = false;
  private static String zzakx = null;
  private static int zzaky = 0;
  private static boolean zzakz = false;
  
  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return j.b().a(paramContext, paramInt1, paramInt2);
  }
  
  @Deprecated
  public static String getErrorString(int paramInt)
  {
    return ConnectionResult.a(paramInt);
  }
  
  @Deprecated
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    Object localObject = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("third_party_licenses").build();
    try
    {
      InputStream localInputStream = paramContext.getContentResolver().openInputStream((Uri)localObject);
      try
      {
        paramContext = new Scanner(localInputStream).useDelimiter("\\A").next();
        localObject = paramContext;
        if (localInputStream != null)
        {
          localInputStream.close();
          return paramContext;
        }
      }
      catch (NoSuchElementException paramContext)
      {
        paramContext = paramContext;
        if (localInputStream == null) {
          break label97;
        }
        localInputStream.close();
        break label97;
      }
      finally
      {
        paramContext = finally;
        if (localInputStream != null) {
          localInputStream.close();
        }
        throw paramContext;
      }
      return (String)localObject;
    }
    catch (Exception paramContext)
    {
      localObject = null;
    }
    label97:
    return null;
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    try
    {
      paramContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    s locals;
    try
    {
      paramContext.getResources().getString(R.string.common_google_play_services_unknown_issue);
      if (!"com.google.android.gms".equals(paramContext.getPackageName())) {
        zzaj(paramContext);
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        try
        {
          PackageInfo localPackageInfo = localPackageManager.getPackageInfo("com.google.android.gms", 64);
          locals = s.a(paramContext);
          if (!f.a(paramContext)) {
            break;
          }
          if (locals.a(localPackageInfo, o.a) != null) {
            break label176;
          }
          Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
          return 9;
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
          return 1;
        }
        localThrowable = localThrowable;
        Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
      }
    }
    try
    {
      paramContext = locals.a(localPackageManager.getPackageInfo("com.android.vending", 8256), o.a);
      if (paramContext == null)
      {
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
      return 9;
    }
    if (locals.a(localThrowable, new l[] { paramContext }) == null)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
      return 9;
    }
    label176:
    int i = h.a(GOOGLE_PLAY_SERVICES_VERSION_CODE);
    if (h.a(localThrowable.versionCode) < i)
    {
      i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
      int j = localThrowable.versionCode;
      Log.w("GooglePlayServicesUtil", 77 + "Google Play services out of date.  Requires " + i + " but found " + j);
      return 2;
    }
    ApplicationInfo localApplicationInfo = localThrowable.applicationInfo;
    paramContext = localApplicationInfo;
    if (localApplicationInfo == null) {}
    try
    {
      paramContext = localPackageManager.getApplicationInfo("com.google.android.gms", 0);
      if (!paramContext.enabled) {
        return 3;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", paramContext);
      return 1;
    }
    return 0;
  }
  
  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      return false;
    }
    return true;
  }
  
  @Deprecated
  public static void zzaa(Context paramContext)
  {
    int i = j.b().a(paramContext);
    if (i != 0)
    {
      paramContext = j.b().a(paramContext, i, "e");
      Log.e("GooglePlayServicesUtil", 57 + "GooglePlayServices not available due to error " + i);
      if (paramContext == null) {
        throw new c(i);
      }
      throw new d(i, "Google Play Services not available", paramContext);
    }
  }
  
  @Deprecated
  public static int zzae(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return paramContext.versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  @Deprecated
  public static void zzag(Context paramContext)
  {
    if (zzakA.getAndSet(true)) {
      return;
    }
    try
    {
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(10436);
      return;
    }
    catch (SecurityException paramContext) {}
  }
  
  private static void zzaj(Context paramContext)
  {
    if (zzakB.get()) {}
    do
    {
      return;
      zzao(paramContext);
      if (zzaky == 0) {
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
      }
    } while (zzaky == GOOGLE_PLAY_SERVICES_VERSION_CODE);
    int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
    int j = zzaky;
    paramContext = String.valueOf("com.google.android.gms.version");
    throw new IllegalStateException(String.valueOf(paramContext).length() + 290 + "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + i + " but found " + j + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"" + paramContext + "\" android:value=\"@integer/google_play_services_version\" />");
  }
  
  public static boolean zzak(Context paramContext)
  {
    zzao(paramContext);
    return zzakw;
  }
  
  public static boolean zzal(Context paramContext)
  {
    return (zzak(paramContext)) || (!zzra());
  }
  
  public static String zzam(Context paramContext)
  {
    Object localObject2 = paramContext.getApplicationInfo().name;
    Object localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject1 = paramContext.getPackageName();
      localObject2 = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      paramContext = fc.b(paramContext).a(paramContext.getPackageName(), 0);
      if (paramContext != null) {
        localObject1 = ((PackageManager)localObject2).getApplicationLabel(paramContext).toString();
      }
      return (String)localObject1;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
      }
    }
  }
  
  @TargetApi(18)
  public static boolean zzan(Context paramContext)
  {
    if (com.google.android.gms.common.a.j.e())
    {
      paramContext = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
  
  private static void zzao(Context paramContext)
  {
    if (!zzakz) {
      zzap(paramContext);
    }
  }
  
  /* Error */
  private static void zzap(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 176	android/content/Context:getPackageName	()Ljava/lang/String;
    //   4: putstatic 40	com/google/android/gms/common/r:zzakx	Ljava/lang/String;
    //   7: aload_0
    //   8: invokestatic 377	com/google/android/gms/b/fc:b	(Landroid/content/Context;)Lcom/google/android/gms/b/fb;
    //   11: astore_1
    //   12: aload_0
    //   13: invokestatic 420	com/google/android/gms/common/internal/bq:a	(Landroid/content/Context;)I
    //   16: putstatic 42	com/google/android/gms/common/r:zzaky	I
    //   19: aload_1
    //   20: ldc 8
    //   22: bipush 64
    //   24: invokevirtual 422	com/google/android/gms/b/fb:b	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +35 -> 64
    //   32: aload_0
    //   33: invokestatic 195	com/google/android/gms/common/s:a	(Landroid/content/Context;)Lcom/google/android/gms/common/s;
    //   36: aload_1
    //   37: iconst_1
    //   38: anewarray 231	com/google/android/gms/common/l
    //   41: dup
    //   42: iconst_0
    //   43: getstatic 205	com/google/android/gms/common/o:a	[Lcom/google/android/gms/common/l;
    //   46: iconst_1
    //   47: aaload
    //   48: aastore
    //   49: invokevirtual 208	com/google/android/gms/common/s:a	(Landroid/content/pm/PackageInfo;[Lcom/google/android/gms/common/l;)Lcom/google/android/gms/common/l;
    //   52: ifnull +12 -> 64
    //   55: iconst_1
    //   56: putstatic 38	com/google/android/gms/common/r:zzakw	Z
    //   59: iconst_1
    //   60: putstatic 44	com/google/android/gms/common/r:zzakz	Z
    //   63: return
    //   64: iconst_0
    //   65: putstatic 38	com/google/android/gms/common/r:zzakw	Z
    //   68: goto -9 -> 59
    //   71: astore_0
    //   72: ldc -46
    //   74: ldc_w 424
    //   77: aload_0
    //   78: invokestatic 426	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: iconst_1
    //   83: putstatic 44	com/google/android/gms/common/r:zzakz	Z
    //   86: return
    //   87: astore_0
    //   88: iconst_1
    //   89: putstatic 44	com/google/android/gms/common/r:zzakz	Z
    //   92: aload_0
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	paramContext	Context
    //   11	26	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	28	71	android/content/pm/PackageManager$NameNotFoundException
    //   32	59	71	android/content/pm/PackageManager$NameNotFoundException
    //   64	68	71	android/content/pm/PackageManager$NameNotFoundException
    //   0	28	87	finally
    //   32	59	87	finally
    //   64	68	87	finally
    //   72	82	87	finally
  }
  
  @Deprecated
  public static Intent zzbC(int paramInt)
  {
    return j.b().a(null, paramInt, null);
  }
  
  static boolean zzbD(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  @Deprecated
  public static boolean zzc(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return zzk(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  @Deprecated
  public static boolean zzd(Context paramContext, int paramInt)
  {
    if (paramInt == 9) {
      return zzk(paramContext, "com.android.vending");
    }
    return false;
  }
  
  @Deprecated
  public static boolean zze(Context paramContext, int paramInt)
  {
    return n.a(paramContext, paramInt);
  }
  
  @TargetApi(21)
  static boolean zzk(Context paramContext, String paramString)
  {
    if (com.google.android.gms.common.a.j.h())
    {
      Iterator localIterator = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      while (localIterator.hasNext()) {
        if (paramString.equals(((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName())) {
          return true;
        }
      }
    }
    if (zzan(paramContext)) {
      return false;
    }
    paramContext = paramContext.getPackageManager();
    try
    {
      boolean bool = paramContext.getApplicationInfo(paramString, 8192).enabled;
      return bool;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private static int zzqZ()
  {
    return u.a;
  }
  
  @Deprecated
  public static boolean zzra()
  {
    return "user".equals(Build.TYPE);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */