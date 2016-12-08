package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;

final class bo
  implements Handler.Callback
{
  bo(bn parambn) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return false;
    }
    bn.a(this.a, (bq)paramMessage.obj);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */