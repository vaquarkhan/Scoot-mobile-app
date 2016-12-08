package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;

final class bj
  extends bm<cd>
{
  bj(bf parambf, f paramf, String paramString1, long paramLong, String paramString2)
  {
    super(paramf);
  }
  
  public void a(k<DigitsApiClient> paramk)
  {
    ((DigitsApiClient)paramk.a).b().login(this.a, this.b, this.c, this.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */