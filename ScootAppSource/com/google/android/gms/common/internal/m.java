package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

final class m
  extends Handler
{
  public m(i parami, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private void a(Message paramMessage)
  {
    paramMessage = (n)paramMessage.obj;
    paramMessage.b();
    paramMessage.d();
  }
  
  private boolean b(Message paramMessage)
  {
    return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5);
  }
  
  public void handleMessage(Message paramMessage)
  {
    PendingIntent localPendingIntent = null;
    if (this.a.b.get() != paramMessage.arg1)
    {
      if (b(paramMessage)) {
        a(paramMessage);
      }
      return;
    }
    if (((paramMessage.what == 1) || (paramMessage.what == 5)) && (!this.a.i()))
    {
      a(paramMessage);
      return;
    }
    if (paramMessage.what == 3)
    {
      if ((paramMessage.obj instanceof PendingIntent)) {
        localPendingIntent = (PendingIntent)paramMessage.obj;
      }
      paramMessage = new ConnectionResult(paramMessage.arg2, localPendingIntent);
      i.b(this.a).a(paramMessage);
      this.a.a(paramMessage);
      return;
    }
    if (paramMessage.what == 4)
    {
      i.a(this.a, 4, null);
      if (i.c(this.a) != null) {
        i.c(this.a).a(paramMessage.arg2);
      }
      this.a.a(paramMessage.arg2);
      i.a(this.a, 4, 1, null);
      return;
    }
    if ((paramMessage.what == 2) && (!this.a.h()))
    {
      a(paramMessage);
      return;
    }
    if (b(paramMessage))
    {
      ((n)paramMessage.obj).c();
      return;
    }
    int i = paramMessage.what;
    Log.wtf("GmsClient", 45 + "Don't know how to handle message: " + i, new Exception());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */