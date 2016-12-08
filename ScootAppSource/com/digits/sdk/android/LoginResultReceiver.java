package com.digits.sdk.android;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.twitter.sdk.android.core.m;

class LoginResultReceiver
  extends ResultReceiver
{
  final eh a;
  final m<cb> b;
  
  LoginResultReceiver(g paramg, m<cb> paramm)
  {
    super(null);
    this.a = new eh(paramg);
    this.b = paramm;
  }
  
  public void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    if (this.a != null)
    {
      if (paramInt != 200) {
        break label40;
      }
      this.a.a((cb)this.b.b(), paramBundle.getString("phone_number"));
    }
    label40:
    while (paramInt != 400) {
      return;
    }
    this.a.a(new bs(paramBundle.getString("login_error")));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\LoginResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */