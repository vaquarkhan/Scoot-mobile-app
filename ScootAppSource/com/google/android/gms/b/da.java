package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class da
  extends BroadcastReceiver
{
  protected Context a;
  private final db b;
  
  public da(db paramdb)
  {
    this.b = paramdb;
  }
  
  public void a()
  {
    try
    {
      if (this.a != null) {
        this.a.unregisterReceiver(this);
      }
      this.a = null;
      return;
    }
    finally {}
  }
  
  public void a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getData();
    paramContext = null;
    if (paramIntent != null) {
      paramContext = paramIntent.getSchemeSpecificPart();
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      this.b.a();
      a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */