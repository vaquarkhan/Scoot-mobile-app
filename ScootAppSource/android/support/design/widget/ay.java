package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class ay
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    case 0: 
      ((Snackbar)paramMessage.obj).c();
      return true;
    }
    ((Snackbar)paramMessage.obj).b(paramMessage.arg1);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */