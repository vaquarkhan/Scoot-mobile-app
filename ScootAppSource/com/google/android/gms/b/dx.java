package com.google.android.gms.b;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;

final class dx
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      int i = paramMessage.what;
      Log.e("TransformedResultImpl", 70 + "TransformationResultHandler received unknown message type: " + i);
      return;
    case 0: 
      u localu1 = (u)paramMessage.obj;
      paramMessage = dv.d(this.a);
      if (localu1 == null) {}
      for (;;)
      {
        try
        {
          dv.a(dv.e(this.a), new Status(13, "Transform returned null"));
          return;
        }
        finally {}
        if ((localu2 instanceof dq)) {
          dv.a(dv.e(this.a), ((dq)localu2).b());
        } else {
          dv.e(this.a).a(localu2);
        }
      }
    }
    RuntimeException localRuntimeException = (RuntimeException)paramMessage.obj;
    paramMessage = String.valueOf(localRuntimeException.getMessage());
    if (paramMessage.length() != 0) {}
    for (paramMessage = "Runtime exception on the transformation worker thread: ".concat(paramMessage);; paramMessage = new String("Runtime exception on the transformation worker thread: "))
    {
      Log.e("TransformedResultImpl", paramMessage);
      throw localRuntimeException;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */