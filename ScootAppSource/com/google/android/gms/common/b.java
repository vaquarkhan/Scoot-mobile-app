package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.R.string;
import com.google.android.gms.b.da;
import com.google.android.gms.b.db;
import com.google.android.gms.b.dj;
import com.google.android.gms.common.a.f;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.al;

public final class b
  extends j
{
  public static final int a = j.b;
  private static final b c = new b();
  
  public static b a()
  {
    return c;
  }
  
  public int a(Context paramContext)
  {
    return super.a(paramContext);
  }
  
  public Dialog a(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject2 = new ProgressBar(paramActivity, null, 16842874);
    ((ProgressBar)localObject2).setIndeterminate(true);
    ((ProgressBar)localObject2).setVisibility(0);
    Object localObject1 = new AlertDialog.Builder(paramActivity);
    ((AlertDialog.Builder)localObject1).setView((View)localObject2);
    localObject2 = GooglePlayServicesUtil.zzam(paramActivity);
    ((AlertDialog.Builder)localObject1).setMessage(paramActivity.getResources().getString(R.string.common_google_play_services_updating_text, new Object[] { localObject2 }));
    ((AlertDialog.Builder)localObject1).setTitle(R.string.common_google_play_services_updating_title);
    ((AlertDialog.Builder)localObject1).setPositiveButton("", null);
    localObject1 = ((AlertDialog.Builder)localObject1).create();
    GooglePlayServicesUtil.zza(paramActivity, paramOnCancelListener, "GooglePlayServicesUpdatingDialog", (Dialog)localObject1);
    return (Dialog)localObject1;
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.a(paramContext, paramInt1, paramInt2);
  }
  
  public PendingIntent a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return super.a(paramContext, paramInt1, paramInt2, paramString);
  }
  
  public PendingIntent a(Context paramContext, ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.a()) {
      return paramConnectionResult.d();
    }
    int j = paramConnectionResult.c();
    int i = j;
    if (f.a(paramContext))
    {
      i = j;
      if (j == 2) {
        i = 42;
      }
    }
    return a(paramContext, i, 0);
  }
  
  public Intent a(Context paramContext, int paramInt, String paramString)
  {
    return super.a(paramContext, paramInt, paramString);
  }
  
  public da a(Context paramContext, db paramdb)
  {
    Object localObject = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    ((IntentFilter)localObject).addDataScheme("package");
    da localda = new da(paramdb);
    paramContext.registerReceiver(localda, (IntentFilter)localObject);
    localda.a(paramContext);
    localObject = localda;
    if (!a(paramContext, "com.google.android.gms"))
    {
      paramdb.a();
      localda.a();
      localObject = null;
    }
    return (da)localObject;
  }
  
  public void a(Context paramContext, ConnectionResult paramConnectionResult, int paramInt)
  {
    PendingIntent localPendingIntent = a(paramContext, paramConnectionResult);
    if (localPendingIntent != null) {
      GooglePlayServicesUtil.zza(paramConnectionResult.c(), paramContext, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt));
    }
  }
  
  public final boolean a(int paramInt)
  {
    return super.a(paramInt);
  }
  
  public boolean a(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return GooglePlayServicesUtil.showErrorDialogFragment(paramInt1, paramActivity, paramInt2, paramOnCancelListener);
  }
  
  public boolean a(Activity paramActivity, dj paramdj, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramdj = GooglePlayServicesUtil.zza(paramInt1, paramActivity, al.a(paramdj, a(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
    if (paramdj == null) {
      return false;
    }
    GooglePlayServicesUtil.zza(paramActivity, paramOnCancelListener, "GooglePlayServicesErrorDialog", paramdj);
    return true;
  }
  
  public boolean a(Context paramContext, int paramInt)
  {
    return super.a(paramContext, paramInt);
  }
  
  @Deprecated
  public Intent b(int paramInt)
  {
    return super.b(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */