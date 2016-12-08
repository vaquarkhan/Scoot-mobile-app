package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.b;

class k
  extends BroadcastReceiver
{
  static final String a = k.class.getName();
  private final ah b;
  private boolean c;
  private boolean d;
  
  k(ah paramah)
  {
    b.a(paramah);
    this.b = paramah;
  }
  
  private void g()
  {
    i();
    j();
  }
  
  private Context h()
  {
    return this.b.b();
  }
  
  private j i()
  {
    return this.b.f();
  }
  
  private y j()
  {
    return this.b.i();
  }
  
  public void a()
  {
    g();
    if (this.c) {
      return;
    }
    Context localContext = h();
    localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
    localIntentFilter.addCategory(localContext.getPackageName());
    localContext.registerReceiver(this, localIntentFilter);
    this.d = f();
    this.b.f().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
    this.c = true;
  }
  
  public void b()
  {
    if (!d()) {
      return;
    }
    this.b.f().b("Unregistering connectivity change receiver");
    this.c = false;
    this.d = false;
    Context localContext = h();
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      i().e("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }
  
  public void c()
  {
    if (Build.VERSION.SDK_INT <= 10) {
      return;
    }
    Context localContext = h();
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(localContext.getPackageName());
    localIntent.putExtra(a, true);
    localContext.sendOrderedBroadcast(localIntent, null);
  }
  
  public boolean d()
  {
    return this.c;
  }
  
  public boolean e()
  {
    if (!this.c) {
      this.b.f().e("Connectivity unknown. Receiver not registered");
    }
    return this.d;
  }
  
  protected boolean f()
  {
    Object localObject = (ConnectivityManager)h().getSystemService("connectivity");
    try
    {
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject != null)
      {
        boolean bool = ((NetworkInfo)localObject).isConnected();
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (SecurityException localSecurityException) {}
    return false;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g();
    paramContext = paramIntent.getAction();
    this.b.f().a("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = f();
      if (this.d != bool)
      {
        this.d = bool;
        j().a(bool);
      }
    }
    do
    {
      return;
      if (!"com.google.analytics.RADIO_POWERED".equals(paramContext)) {
        break;
      }
    } while (paramIntent.hasExtra(a));
    j().f();
    return;
    this.b.f().d("NetworkBroadcastReceiver received unknown action", paramContext);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */