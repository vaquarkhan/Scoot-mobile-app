package android.support.v7.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class ad
  extends Handler
{
  private WeakReference<DialogInterface> a;
  
  public ad(DialogInterface paramDialogInterface)
  {
    this.a = new WeakReference(paramDialogInterface);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    case 0: 
    default: 
      return;
    case -3: 
    case -2: 
    case -1: 
      ((DialogInterface.OnClickListener)paramMessage.obj).onClick((DialogInterface)this.a.get(), paramMessage.what);
      return;
    }
    ((DialogInterface)paramMessage.obj).dismiss();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */