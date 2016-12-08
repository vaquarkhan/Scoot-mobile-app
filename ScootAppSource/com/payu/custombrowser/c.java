package com.payu.custombrowser;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class c
  implements DialogInterface.OnClickListener
{
  c(b paramb) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.a(this.a.a, "user_input", "back_button_ok");
    paramDialogInterface.dismiss();
    this.a.a.V();
    a.e(this.a.a).finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */