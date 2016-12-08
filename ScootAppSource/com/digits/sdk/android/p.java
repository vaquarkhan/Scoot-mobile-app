package com.digits.sdk.android;

import android.content.Context;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.m;

final class p
  extends be<cg>
{
  p(o paramo, Context paramContext1, bn parambn, Context paramContext2)
  {
    super(paramContext1, parambn);
  }
  
  public void a(k<cg> paramk)
  {
    this.b.h.c();
    paramk = cb.a(paramk, o.a(this.b));
    if (o.b(this.b).booleanValue())
    {
      this.b.g.a(paramk);
      this.b.a(this.a, o.a(this.b));
      return;
    }
    this.b.a(this.a, paramk, o.a(this.b));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */