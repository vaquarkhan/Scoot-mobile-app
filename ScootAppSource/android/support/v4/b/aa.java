package android.support.v4.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class aa
  extends Handler
{
  public aa()
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    z localz = (z)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      u.c(localz.a, localz.b[0]);
      return;
    }
    localz.a.b(localz.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */