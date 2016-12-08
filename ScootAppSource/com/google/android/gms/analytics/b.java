package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.bh;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.b.fl;

public class b
  extends Service
{
  private static Boolean b;
  private Handler a;
  
  private void a()
  {
    try
    {
      synchronized (a.a)
      {
        fl localfl = a.b;
        if ((localfl != null) && (localfl.b())) {
          localfl.a();
        }
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  public static boolean a(Context paramContext)
  {
    com.google.android.gms.common.internal.b.a(paramContext);
    if (b != null) {
      return b.booleanValue();
    }
    boolean bool = w.a(paramContext, "com.google.android.gms.analytics.CampaignTrackingService");
    b = Boolean.valueOf(bool);
    return bool;
  }
  
  private Handler b()
  {
    Handler localHandler2 = this.a;
    Handler localHandler1 = localHandler2;
    if (localHandler2 == null)
    {
      localHandler1 = new Handler(getMainLooper());
      this.a = localHandler1;
    }
    return localHandler1;
  }
  
  protected void a(j paramj, Handler paramHandler, int paramInt)
  {
    paramHandler.post(new e(this, paramInt, paramj));
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    ah.a(this).f().b("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    ah.a(this).f().b("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a();
    ah localah = ah.a(this);
    j localj = localah.f();
    Handler localHandler = null;
    if (localah.e().a()) {
      localj.f("Unexpected installation campaign (package side)");
    }
    for (paramIntent = localHandler;; paramIntent = paramIntent.getStringExtra("referrer"))
    {
      localHandler = b();
      if (!TextUtils.isEmpty(paramIntent)) {
        break;
      }
      if (!localah.e().a()) {
        localj.e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
      }
      localah.h().a(new c(this, localj, localHandler, paramInt2));
      return 2;
    }
    paramInt1 = localah.e().e();
    if (paramIntent.length() <= paramInt1) {}
    for (;;)
    {
      localj.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(paramInt2), paramIntent);
      localah.i().a(paramIntent, new d(this, localj, localHandler, paramInt2));
      return 2;
      localj.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(paramIntent.length()), Integer.valueOf(paramInt1));
      paramIntent = paramIntent.substring(0, paramInt1);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */