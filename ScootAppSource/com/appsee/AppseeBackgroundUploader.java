package com.appsee;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

public class AppseeBackgroundUploader
  extends IntentService
{
  public AppseeBackgroundUploader()
  {
    super(qc.C("F$w'b1E5d?`&h!i0R$k;f0b&"));
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    localObject2 = kj.A;
    if (paramIntent != null) {}
    for (;;)
    {
      try
      {
        if (paramIntent.getExtras() == null)
        {
          vd.H(1, qc.C("\025w$t1b\026f7l3u;r:c\001w8h5c1utd5i:h '2n:ctE!i0k1';itn:s1i ''b&q=d1"));
          return;
        }
        localObject1 = kj.values()[paramIntent.getExtras().getInt("com.appsee.Action.Mode")];
      }
      catch (Exception paramIntent)
      {
        int i;
        boolean bool;
        localObject1 = localObject2;
        continue;
      }
      catch (NullPointerException paramIntent)
      {
        Object localObject1 = localObject2;
        continue;
      }
      try
      {
        vd.C(1, fc.C("Njsaip'Wbvqmda'Wseupb`+$jkca'9'!t"), new Object[] { ((kj)localObject1).toString() });
        i = og.l[localObject1.ordinal()];
        localObject2 = localObject1;
        switch (i)
        {
        default: 
          localObject2 = localObject1;
        }
      }
      catch (NullPointerException paramIntent)
      {
        if (paramIntent.getMessage() != "APPSEE_NO_CONTEXT") {
          continue;
        }
        vd.H(1, fc.C("EwttabFfglcukrjcQwhhecau$deijhp'bnjc$ftwhngfpnki$dkipb|s"));
        return;
        bool = paramIntent.getExtras().getBoolean("com.appsee.Action.UploadMode");
        fd.C().H(bool);
        localObject2 = localObject1;
        continue;
      }
      catch (Exception paramIntent)
      {
        C(paramIntent, (kj)localObject1);
        localObject2 = localObject1;
        continue;
        fd.C().K();
        localObject2 = localObject1;
        continue;
        id.C().a();
        localObject2 = localObject1;
        continue;
        if (fc.C().C()) {
          continue;
        }
        fd.C().H();
        localObject2 = localObject1;
        continue;
        vd.H(3, qc.C("\027f:  '2h&d1'5':b#''b't=h:'#o=k1'5itb,n's=i3''b't=h:'=ttf7s=q1"));
        localObject2 = localObject1;
        continue;
        C(paramIntent, (kj)localObject1);
        localObject2 = localObject1;
        continue;
      }
      vd.C(1, qc.C("N:s1i '\007b&q=d1'\022n:n'o1cx'9h0bt:t\"'"), new Object[] { ((kj)localObject2).toString() });
      return;
      fd.C().h();
      localObject2 = localObject1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\AppseeBackgroundUploader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */