package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class ct
  extends Handler
{
  ct(cr paramcr, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      Log.w("GACStateManager", 31 + "Unknown message id: " + i);
      return;
    case 1: 
      ((cs)paramMessage.obj).a(this.a);
      return;
    }
    throw ((RuntimeException)paramMessage.obj);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */