package com.payu.custombrowser;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.util.Timer;

final class t
  implements DialogInterface.OnDismissListener
{
  t(a parama, Timer paramTimer) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.cancel();
    if (a.E(this.b) == 1) {
      a.d(this.b, 2);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */