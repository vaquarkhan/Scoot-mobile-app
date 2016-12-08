package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.bu;
import android.util.TypedValue;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.string;
import com.google.android.gms.common.a.j;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.al;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GooglePlayServicesUtil
  extends r
{
  public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
  @Deprecated
  public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
  @Deprecated
  public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = r.GOOGLE_PLAY_SERVICES_VERSION_CODE;
  public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
  
  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return getErrorDialog(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static Dialog getErrorDialog(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return zza(paramInt1, paramActivity, al.a(paramActivity, b.a().a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  @Deprecated
  public static PendingIntent getErrorPendingIntent(int paramInt1, Context paramContext, int paramInt2)
  {
    return r.getErrorPendingIntent(paramInt1, paramContext, paramInt2);
  }
  
  @Deprecated
  public static String getErrorString(int paramInt)
  {
    return r.getErrorString(paramInt);
  }
  
  @Deprecated
  public static String getOpenSourceSoftwareLicenseInfo(Context paramContext)
  {
    return r.getOpenSourceSoftwareLicenseInfo(paramContext);
  }
  
  public static Context getRemoteContext(Context paramContext)
  {
    return r.getRemoteContext(paramContext);
  }
  
  public static Resources getRemoteResource(Context paramContext)
  {
    return r.getRemoteResource(paramContext);
  }
  
  @Deprecated
  public static int isGooglePlayServicesAvailable(Context paramContext)
  {
    return r.isGooglePlayServicesAvailable(paramContext);
  }
  
  @Deprecated
  public static boolean isUserRecoverableError(int paramInt)
  {
    return r.isUserRecoverableError(paramInt);
  }
  
  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, paramInt2, null);
  }
  
  @Deprecated
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return showErrorDialogFragment(paramInt1, paramActivity, null, paramInt2, paramOnCancelListener);
  }
  
  public static boolean showErrorDialogFragment(int paramInt1, Activity paramActivity, Fragment paramFragment, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Intent localIntent = b.a().a(paramActivity, paramInt1, "d");
    if (paramFragment == null) {}
    for (paramFragment = al.a(paramActivity, localIntent, paramInt2);; paramFragment = al.a(paramFragment, localIntent, paramInt2))
    {
      paramFragment = zza(paramInt1, paramActivity, paramFragment, paramOnCancelListener);
      if (paramFragment != null) {
        break;
      }
      return false;
    }
    zza(paramActivity, paramOnCancelListener, "GooglePlayServicesErrorDialog", paramFragment);
    return true;
  }
  
  @Deprecated
  public static void showErrorNotification(int paramInt, Context paramContext)
  {
    int i = paramInt;
    if (com.google.android.gms.common.a.f.a(paramContext))
    {
      i = paramInt;
      if (paramInt == 2) {
        i = 42;
      }
    }
    if ((zzc(paramContext, i)) || (zzd(paramContext, i)))
    {
      zzai(paramContext);
      return;
    }
    zza(i, paramContext);
  }
  
  @TargetApi(14)
  public static Dialog zza(int paramInt, Activity paramActivity, al paramal, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject2 = null;
    if (paramInt == 0) {
      return null;
    }
    int i = paramInt;
    if (com.google.android.gms.common.a.f.a(paramActivity))
    {
      i = paramInt;
      if (paramInt == 2) {
        i = 42;
      }
    }
    paramInt = i;
    if (zzc(paramActivity, i)) {
      paramInt = 18;
    }
    Object localObject1 = localObject2;
    if (j.c())
    {
      TypedValue localTypedValue = new TypedValue();
      paramActivity.getTheme().resolveAttribute(16843529, localTypedValue, true);
      localObject1 = localObject2;
      if ("Theme.Dialog.Alert".equals(paramActivity.getResources().getResourceEntryName(localTypedValue.resourceId))) {
        localObject1 = new AlertDialog.Builder(paramActivity, 5);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new AlertDialog.Builder(paramActivity);
    }
    ((AlertDialog.Builder)localObject2).setMessage(ak.a(paramActivity, paramInt, zzam(paramActivity)));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject2).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = ak.c(paramActivity, paramInt);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject2).setPositiveButton(paramOnCancelListener, paramal);
    }
    paramActivity = ak.a(paramActivity, paramInt);
    if (paramActivity != null) {
      ((AlertDialog.Builder)localObject2).setTitle(paramActivity);
    }
    return ((AlertDialog.Builder)localObject2).create();
  }
  
  private static void zza(int paramInt, Context paramContext)
  {
    zza(paramInt, paramContext, null);
  }
  
  static void zza(int paramInt, Context paramContext, PendingIntent paramPendingIntent)
  {
    zza(paramInt, paramContext, null, paramPendingIntent);
  }
  
  private static void zza(int paramInt, Context paramContext, String paramString)
  {
    zza(paramInt, paramContext, paramString, b.a().a(paramContext, paramInt, 0, "n"));
  }
  
  @TargetApi(20)
  private static void zza(int paramInt, Context paramContext, String paramString, PendingIntent paramPendingIntent)
  {
    Object localObject = paramContext.getResources();
    String str3 = zzam(paramContext);
    String str2 = ak.b(paramContext, paramInt);
    String str1 = str2;
    if (str2 == null) {
      str1 = ((Resources)localObject).getString(R.string.common_google_play_services_notification_ticker);
    }
    str2 = ak.b(paramContext, paramInt, str3);
    if (com.google.android.gms.common.a.f.a(paramContext))
    {
      com.google.android.gms.common.internal.b.a(j.d());
      paramPendingIntent = new Notification.Builder(paramContext).setSmallIcon(R.drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + " " + str2)).addAction(R.drawable.common_full_open_on_phone, ((Resources)localObject).getString(R.string.common_open_on_phone), paramPendingIntent).build();
      if (!zzbD(paramInt)) {
        break label374;
      }
      zzakA.set(false);
    }
    label374:
    for (paramInt = 10436;; paramInt = 39789)
    {
      paramContext = (NotificationManager)paramContext.getSystemService("notification");
      if (paramString == null) {
        break label381;
      }
      paramContext.notify(paramString, paramInt, paramPendingIntent);
      return;
      localObject = ((Resources)localObject).getString(R.string.common_google_play_services_notification_ticker);
      if (j.a())
      {
        paramPendingIntent = new Notification.Builder(paramContext).setSmallIcon(17301642).setContentTitle(str1).setContentText(str2).setContentIntent(paramPendingIntent).setTicker((CharSequence)localObject).setAutoCancel(true);
        if (j.g()) {
          paramPendingIntent.setLocalOnly(true);
        }
        if (j.d()) {
          paramPendingIntent.setStyle(new Notification.BigTextStyle().bigText(str2));
        }
        for (paramPendingIntent = paramPendingIntent.build();; paramPendingIntent = paramPendingIntent.getNotification())
        {
          if (Build.VERSION.SDK_INT == 19) {
            paramPendingIntent.extras.putBoolean("android.support.localOnly", true);
          }
          break;
        }
      }
      paramPendingIntent = new bu(paramContext).a(17301642).c((CharSequence)localObject).a(System.currentTimeMillis()).a(true).a(paramPendingIntent).a(str1).b(str2).a();
      break;
    }
    label381:
    paramContext.notify(paramInt, paramPendingIntent);
  }
  
  @TargetApi(11)
  public static void zza(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener, String paramString, Dialog paramDialog)
  {
    try
    {
      bool = paramActivity instanceof aa;
      if (bool)
      {
        paramActivity = ((aa)paramActivity).f();
        f.a(paramDialog, paramOnCancelListener).a(paramActivity, paramString);
        return;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        boolean bool = false;
      }
      if (j.a())
      {
        paramActivity = paramActivity.getFragmentManager();
        a.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
        return;
      }
      throw new RuntimeException("This Activity does not support Fragments.");
    }
  }
  
  private static void zzai(Context paramContext)
  {
    paramContext = new e(paramContext);
    paramContext.sendMessageDelayed(paramContext.obtainMessage(1), 120000L);
  }
  
  @Deprecated
  public static Intent zzbC(int paramInt)
  {
    return r.zzbC(paramInt);
  }
  
  @Deprecated
  public static boolean zzc(Context paramContext, int paramInt)
  {
    return r.zzc(paramContext, paramInt);
  }
  
  @Deprecated
  public static boolean zzd(Context paramContext, int paramInt)
  {
    return r.zzd(paramContext, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\GooglePlayServicesUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */