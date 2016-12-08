package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.b.dj;

public abstract class al
  implements DialogInterface.OnClickListener
{
  public static al a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    return new am(paramActivity, paramIntent, paramInt);
  }
  
  public static al a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    return new an(paramFragment, paramIntent, paramInt);
  }
  
  public static al a(dj paramdj, Intent paramIntent, int paramInt)
  {
    return new ao(paramdj, paramIntent, paramInt);
  }
  
  public abstract void a();
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      a();
      paramDialogInterface.dismiss();
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface)
    {
      Log.e("DialogRedirect", "Can't redirect to app settings for Google Play services");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */