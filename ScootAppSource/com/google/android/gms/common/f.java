package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.app.w;
import com.google.android.gms.common.internal.b;

public final class f
  extends w
{
  private Dialog ai = null;
  private DialogInterface.OnCancelListener aj = null;
  
  public static f a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    f localf = new f();
    paramDialog = (Dialog)b.a(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localf.ai = paramDialog;
    if (paramOnCancelListener != null) {
      localf.aj = paramOnCancelListener;
    }
    return localf;
  }
  
  public void a(ah paramah, String paramString)
  {
    super.a(paramah, paramString);
  }
  
  public Dialog c(Bundle paramBundle)
  {
    if (this.ai == null) {
      b(false);
    }
    return this.ai;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.aj != null) {
      this.aj.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */