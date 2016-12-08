package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class co
  extends Handler
{
  co(cj paramcj, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      Log.w("GoogleApiClientImpl", 31 + "Unknown message id: " + i);
      return;
    case 1: 
      cj.b(this.a);
      return;
    }
    cj.a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */