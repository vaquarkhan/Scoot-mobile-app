package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.k;

final class cx
  extends be<cd>
{
  cx(cw paramcw, Context paramContext1, bn parambn, Context paramContext2)
  {
    super(paramContext1, parambn);
  }
  
  public void a(k<cd> paramk)
  {
    this.b.h.c();
    if (((cd)paramk.a).a())
    {
      cw.a(this.b, this.a);
      return;
    }
    if (cw.a(this.b).booleanValue())
    {
      paramk = cb.a((cd)paramk.a, cw.b(this.b));
      cw.a(this.b, this.a, paramk);
      return;
    }
    paramk = cb.a((cd)paramk.a, cw.b(this.b));
    this.b.a(this.a, paramk, cw.b(this.b));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */