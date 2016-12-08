package com.payu.custombrowser;

import android.app.Activity;
import android.content.Intent;

final class u
  implements Runnable
{
  u(a parama) {}
  
  public void run()
  {
    Intent localIntent;
    if ((a.e(this.a) != null) && (!a.e(this.a).isFinishing()) && (this.a.p()))
    {
      localIntent = new Intent();
      localIntent.putExtra(this.a.a(R.string.cb_result), a.F(this.a));
      localIntent.putExtra(this.a.a(R.string.cb_payu_response), a.G(this.a));
      if ((a.i(this.a) == 1) && (a.H(this.a) != null)) {
        localIntent.putExtra("merchant_hash", a.H(this.a));
      }
      if (!a.I(this.a).booleanValue()) {
        break label156;
      }
      a.e(this.a).setResult(-1, localIntent);
    }
    for (;;)
    {
      a.e(this.a).finish();
      return;
      label156:
      a.e(this.a).setResult(0, localIntent);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */