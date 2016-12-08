package android.support.v4.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class r
  extends Handler
{
  r(q paramq, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    }
    q.a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */