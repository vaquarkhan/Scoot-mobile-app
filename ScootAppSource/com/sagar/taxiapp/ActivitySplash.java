package com.sagar.taxiapp;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.a.ah;
import android.util.Log;
import android.view.View;
import android.view.Window;
import b.a.a.a.f;
import com.appsee.Appsee;
import com.digits.sdk.android.ao;
import com.google.android.gms.analytics.o;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.u;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;
import com.google.android.gms.location.m;
import com.google.android.gms.location.n;
import com.scootapp.taxiapp.utils.b;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.Set;

public class ActivitySplash
  extends ah
  implements s, com.google.android.gms.common.api.t, com.google.android.gms.common.api.y<LocationSettingsResult>, g
{
  protected com.google.android.gms.common.api.q m;
  protected LocationRequest n;
  protected LocationSettingsRequest o;
  protected Location p;
  protected Boolean q;
  private View r;
  private boolean s = false;
  private SharedPreferences t;
  private SharedPreferences.Editor u;
  
  private void b(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      if (paramBundle.keySet().contains("requesting-location-updates")) {
        this.q = Boolean.valueOf(paramBundle.getBoolean("requesting-location-updates"));
      }
      if (paramBundle.keySet().contains("location")) {
        this.p = ((Location)paramBundle.getParcelable("location"));
      }
      r();
    }
  }
  
  /* Error */
  private void r()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	com/sagar/taxiapp/ActivitySplash:s	Z
    //   6: ifne +51 -> 57
    //   9: aload_0
    //   10: invokespecial 85	com/sagar/taxiapp/ActivitySplash:s	()Z
    //   13: ifeq +47 -> 60
    //   16: aload_0
    //   17: getfield 80	com/sagar/taxiapp/ActivitySplash:p	Landroid/location/Location;
    //   20: ifnull +37 -> 57
    //   23: aload_0
    //   24: getfield 80	com/sagar/taxiapp/ActivitySplash:p	Landroid/location/Location;
    //   27: putstatic 89	com/sagar/taxiapp/bh:a	Landroid/location/Location;
    //   30: aload_0
    //   31: iconst_1
    //   32: putfield 37	com/sagar/taxiapp/ActivitySplash:s	Z
    //   35: new 91	android/os/Handler
    //   38: dup
    //   39: invokespecial 92	android/os/Handler:<init>	()V
    //   42: new 94	com/sagar/taxiapp/u
    //   45: dup
    //   46: aload_0
    //   47: invokespecial 97	com/sagar/taxiapp/u:<init>	(Lcom/sagar/taxiapp/ActivitySplash;)V
    //   50: ldc2_w 98
    //   53: invokevirtual 103	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   56: pop
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: ldc 105
    //   63: iconst_0
    //   64: invokestatic 111	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   67: invokevirtual 114	android/widget/Toast:show	()V
    //   70: new 91	android/os/Handler
    //   73: dup
    //   74: invokespecial 92	android/os/Handler:<init>	()V
    //   77: new 116	com/sagar/taxiapp/w
    //   80: dup
    //   81: aload_0
    //   82: invokespecial 117	com/sagar/taxiapp/w:<init>	(Lcom/sagar/taxiapp/ActivitySplash;)V
    //   85: ldc2_w 98
    //   88: invokevirtual 103	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   91: pop
    //   92: goto -35 -> 57
    //   95: astore_1
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	ActivitySplash
    //   95	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	57	95	finally
    //   60	92	95	finally
  }
  
  private boolean s()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }
  
  private void t()
  {
    if ((android.support.v4.app.a.a(this, "android.permission.ACCESS_FINE_LOCATION")) || (android.support.v4.app.a.a(this, "android.permission.ACCESS_COARSE_LOCATION")))
    {
      Log.i("Scoot", "Displaying location permission rationale to provide additional context.");
      Snackbar.a(this.r, 2131296585, -2).a(2131296578, new y(this)).a();
      return;
    }
    android.support.v4.app.a.a(this, com.scootapp.tv.a.a.b, 101);
  }
  
  public void a(Location paramLocation)
  {
    this.p = paramLocation;
    r();
  }
  
  public void a(Bundle paramBundle)
  {
    Log.i("ActivitySplash", "Connected to GoogleApiClient");
    if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.b.c.a(this, "android.permission.ACCESS_FINE_LOCATION") != 0) && (android.support.v4.b.c.a(this, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
      t();
    }
    while (this.p != null) {
      return;
    }
    this.p = i.b.a(this.m);
    r();
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    Log.i("ActivitySplash", "Connection failed: ConnectionResult.getErrorCode() = " + paramConnectionResult.c());
  }
  
  public void a(LocationSettingsResult paramLocationSettingsResult)
  {
    paramLocationSettingsResult = paramLocationSettingsResult.b();
    switch (paramLocationSettingsResult.g())
    {
    default: 
      return;
    case 0: 
      Log.i("ActivitySplash", "All location settings are satisfied.");
      p();
      return;
    case 6: 
      Log.i("ActivitySplash", "Location settings are not satisfied. Show the user a dialog toupgrade location settings ");
      try
      {
        paramLocationSettingsResult.a(this, 1);
        return;
      }
      catch (IntentSender.SendIntentException paramLocationSettingsResult)
      {
        Log.i("ActivitySplash", "PendingIntent unable to execute request.");
        return;
      }
    }
    Log.i("ActivitySplash", "Location settings are inadequate, and cannot be fixed here. Dialog not created.");
  }
  
  public void c_(int paramInt)
  {
    Log.i("ActivitySplash", "Connection suspended");
  }
  
  protected void l()
  {
    try
    {
      Log.i("ActivitySplash", "Building GoogleApiClient");
      this.m = new com.google.android.gms.common.api.r(this).a(this).a(this).a(i.a).b();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void m()
  {
    this.n = new LocationRequest();
    this.n.a(10000L);
    this.n.b(5000L);
    this.n.a(100);
  }
  
  protected void n()
  {
    m localm = new m();
    localm.a(this.n);
    localm.a(true);
    this.o = localm.a();
  }
  
  protected void o()
  {
    i.d.a(this.m, this.o).a(this);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      return;
    }
    switch (paramInt2)
    {
    default: 
      return;
    case -1: 
      Log.i("ActivitySplash", "User agreed to make required location settings changes.");
      p();
      return;
    }
    Log.i("ActivitySplash", "User chose not to make required location settings changes.");
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968622);
    Object localObject = new TwitterAuthConfig("YJCwPc7IwEsBdaVmBikWXhFeq", "FAjKL3izroxFGBKk643ToiEHvFPtyKRNmxgIC6IRWh6rRhBTDT");
    f.a(this, new b.a.a.a.q[] { new com.c.a.a(), new com.twitter.sdk.android.core.t((TwitterAuthConfig)localObject), new ao() });
    Appsee.start(getString(2131296538));
    this.t = getSharedPreferences("shareddata", 0);
    this.u = this.t.edit();
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).clearFlags(67108864);
      ((Window)localObject).setStatusBarColor(android.support.v4.b.c.c(this, 2131689628));
    }
    com.appsflyer.c.b("ZPTzfXctUSmiuR4ZrPrMB7");
    com.appsflyer.c.a(getApplicationContext());
    this.u.putString("destLat", "").apply();
    this.u.putString("destLng", "").apply();
    this.r = findViewById(2131755340);
    localObject = ((ApplicationTaxi)getApplication()).a(ab.a);
    ((com.google.android.gms.analytics.r)localObject).a("Splash Screen");
    ((com.google.android.gms.analytics.r)localObject).a(new o().a());
    this.q = Boolean.valueOf(false);
    b(paramBundle);
    l();
    m();
    n();
    o();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.m.i()) {
      q();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Log.v("Scoot", "Request Code " + paramInt);
    if (paramInt == 101)
    {
      if (b.a(paramArrayOfInt))
      {
        Log.v("Scoot", "Granted Permission");
        try
        {
          this.p = i.b.a(this.m);
          r();
          return;
        }
        catch (SecurityException paramArrayOfString)
        {
          for (;;)
          {
            Log.v("Security Exception", paramArrayOfString.getMessage());
          }
        }
      }
      p();
      return;
    }
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.m.i()) && (this.q.booleanValue())) {
      p();
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putBoolean("requesting-location-updates", this.q.booleanValue());
    paramBundle.putParcelable("location", this.p);
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
    this.m.e();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.m.g();
  }
  
  protected void p()
  {
    if ((Build.VERSION.SDK_INT >= 23) && (android.support.v4.b.c.a(this, "android.permission.ACCESS_FINE_LOCATION") != 0) && (android.support.v4.b.c.a(this, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
      t();
    }
    while (!this.m.i()) {
      return;
    }
    i.b.a(this.m, this.n, this).a(new t(this));
  }
  
  protected void q()
  {
    i.b.a(this.m, this).a(new x(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ActivitySplash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */