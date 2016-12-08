package b.a.a.a.a.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class g
  extends Handler
{
  public g()
  {
    super(Looper.getMainLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    f localf = (f)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      a.c(localf.a, localf.b[0]);
      return;
    }
    localf.a.b(localf.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */