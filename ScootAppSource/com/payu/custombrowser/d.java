package com.payu.custombrowser;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class d
  implements DialogInterface.OnClickListener
{
  d(b paramb) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.a(this.a.a, "user_input", "back_button_cancel");
    this.a.a.W();
    paramDialogInterface.dismiss();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */