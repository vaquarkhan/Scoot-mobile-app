package com.digits.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import b.a.a.a.a.b.m;

final class bp
  implements Runnable
{
  bp(bo parambo, String paramString, Context paramContext) {}
  
  public void run()
  {
    this.c.d.send(200, this.c.a(this.a));
    m.a((Activity)this.b, 200);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */