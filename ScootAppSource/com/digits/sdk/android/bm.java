package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.u;

abstract class bm<T>
  extends f<DigitsApiClient>
{
  final f<T> e;
  
  public bm(f<T> paramf)
  {
    this.e = paramf;
  }
  
  public void a(u paramu)
  {
    if (this.e != null) {
      this.e.a(paramu);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */