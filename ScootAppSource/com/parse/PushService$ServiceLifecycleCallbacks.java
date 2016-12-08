package com.parse;

import android.app.Service;

abstract interface PushService$ServiceLifecycleCallbacks
{
  public abstract void onServiceCreated(Service paramService);
  
  public abstract void onServiceDestroyed(Service paramService);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\PushService$ServiceLifecycleCallbacks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */