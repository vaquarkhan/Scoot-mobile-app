package com.sagar.taxiapp;

import android.util.Log;
import android.widget.Toast;
import com.digits.sdk.android.bs;
import com.digits.sdk.android.cb;
import com.digits.sdk.android.g;

final class cc
  implements g
{
  cc(MobileVerification paramMobileVerification) {}
  
  public void a(bs parambs)
  {
    Log.d("Digits", "Sign in with Digits failure", parambs);
  }
  
  public void a(cb paramcb, String paramString)
  {
    Toast.makeText(this.a.getApplicationContext(), "Authentication successful for " + paramString, 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */