package com.payu.payuui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class u
  implements DialogInterface.OnClickListener
{
  u(PaymentsActivity paramPaymentsActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.o = true;
    paramDialogInterface.dismiss();
    this.a.onBackPressed();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */