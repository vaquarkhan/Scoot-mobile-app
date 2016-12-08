package com.parse;

import android.content.Intent;
import android.os.IBinder;

abstract interface ProxyService
{
  public abstract IBinder onBind(Intent paramIntent);
  
  public abstract void onCreate();
  
  public abstract void onDestroy();
  
  public abstract int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ProxyService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */