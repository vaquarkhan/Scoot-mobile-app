package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.bh;
import com.google.android.gms.analytics.internal.j;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.b.fl;

public final class a
  extends BroadcastReceiver
{
  static Object a = new Object();
  static fl b;
  static Boolean c;
  
  public static boolean a(Context paramContext)
  {
    com.google.android.gms.common.internal.b.a(paramContext);
    if (c != null) {
      return c.booleanValue();
    }
    boolean bool = w.a(paramContext, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
    c = Boolean.valueOf(bool);
    return bool;
  }
  
  protected Class<? extends b> a()
  {
    return b.class;
  }
  
  protected void a(Context paramContext, String paramString) {}
  
  public void onReceive(Context paramContext, Intent arg2)
  {
    Object localObject = ah.a(paramContext);
    localj = ((ah)localObject).f();
    if (??? == null)
    {
      localj.e("CampaignTrackingReceiver received null intent");
      return;
    }
    String str = ???.getStringExtra("referrer");
    ??? = ???.getAction();
    localj.a("CampaignTrackingReceiver received", ???);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(???)) || (TextUtils.isEmpty(str)))
    {
      localj.e("CampaignTrackingReceiver received unexpected intent without referrer extra");
      return;
    }
    boolean bool = b.a(paramContext);
    if (!bool) {
      localj.e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
    }
    a(paramContext, str);
    if (((ah)localObject).e().a())
    {
      localj.f("Received unexpected installation campaign on package side");
      return;
    }
    ??? = a();
    com.google.android.gms.common.internal.b.a(???);
    localObject = new Intent(paramContext, ???);
    ((Intent)localObject).putExtra("referrer", str);
    synchronized (a)
    {
      paramContext.startService((Intent)localObject);
      if (!bool) {
        return;
      }
    }
    try
    {
      if (b == null)
      {
        b = new fl(paramContext, 1, "Analytics campaign WakeLock");
        b.a(false);
      }
      b.a(1000L);
    }
    catch (SecurityException paramContext)
    {
      for (;;)
      {
        localj.e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */