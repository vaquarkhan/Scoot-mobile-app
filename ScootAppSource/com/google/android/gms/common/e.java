package com.google.android.gms.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class e
  extends Handler
{
  private final Context a;
  
  e(Context paramContext) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i;
    switch (paramMessage.what)
    {
    default: 
      i = paramMessage.what;
      Log.w("GooglePlayServicesUtil", 50 + "Don't know how to handle this message: " + i);
    }
    do
    {
      return;
      i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a);
    } while (!GooglePlayServicesUtil.isUserRecoverableError(i));
    GooglePlayServicesUtil.zzb(i, this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */