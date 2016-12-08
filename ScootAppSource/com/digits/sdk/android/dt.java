package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.k;

final class dt
  extends be<cd>
{
  dt(ds paramds, Context paramContext1, bn parambn, Context paramContext2)
  {
    super(paramContext1, parambn);
  }
  
  public void a(k<cd> paramk)
  {
    this.b.h.c();
    paramk = cb.a((cd)paramk.a, ds.a(this.b));
    if (ds.b(this.b).booleanValue())
    {
      ds.a(this.b, this.a, paramk);
      return;
    }
    this.b.a(this.a, paramk, ds.a(this.b));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */