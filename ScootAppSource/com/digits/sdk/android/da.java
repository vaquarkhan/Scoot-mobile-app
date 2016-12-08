package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.m;

final class da
  extends be<eg>
{
  da(cw paramcw, Context paramContext1, bn parambn, cb paramcb, Context paramContext2)
  {
    super(paramContext1, parambn);
  }
  
  public void a(k<eg> paramk)
  {
    paramk = cb.a((eg)paramk.a);
    if (cw.a(this.d, paramk, this.a))
    {
      this.d.g.a(paramk);
      this.d.a(this.b, cw.b(this.d));
      return;
    }
    this.d.a(this.b, paramk, cw.b(this.d));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */