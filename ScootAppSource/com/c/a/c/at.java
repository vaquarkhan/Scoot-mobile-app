package com.c.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

final class at
{
  private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
  private static final IntentFilter b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
  private static final IntentFilter c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
  private final AtomicBoolean d;
  private final Context e;
  private final BroadcastReceiver f;
  private final BroadcastReceiver g;
  private boolean h;
  
  public at(Context paramContext)
  {
    this.e = paramContext;
    Intent localIntent = paramContext.registerReceiver(null, a);
    if (localIntent != null) {
      i = localIntent.getIntExtra("status", -1);
    }
    if ((i == 2) || (i == 5)) {}
    for (boolean bool = true;; bool = false)
    {
      this.h = bool;
      this.g = new au(this);
      this.f = new av(this);
      paramContext.registerReceiver(this.g, b);
      paramContext.registerReceiver(this.f, c);
      this.d = new AtomicBoolean(true);
      return;
    }
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public void b()
  {
    if (!this.d.getAndSet(false)) {
      return;
    }
    this.e.unregisterReceiver(this.g);
    this.e.unregisterReceiver(this.f);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */