package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.api.y;

public final class bm<R extends x>
  extends Handler
{
  public bm()
  {
    this(Looper.getMainLooper());
  }
  
  public bm(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void a()
  {
    removeMessages(2);
  }
  
  public void a(y<? super R> paramy, R paramR)
  {
    sendMessage(obtainMessage(1, new Pair(paramy, paramR)));
  }
  
  protected void b(y<? super R> paramy, R paramR)
  {
    try
    {
      paramy.a(paramR);
      return;
    }
    catch (RuntimeException paramy)
    {
      bk.c(paramR);
      throw paramy;
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      Log.wtf("BasePendingResult", 45 + "Don't know how to handle message: " + i, new Exception());
      return;
    case 1: 
      paramMessage = (Pair)paramMessage.obj;
      b((y)paramMessage.first, (x)paramMessage.second);
      return;
    }
    ((bk)paramMessage.obj).d(Status.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */