package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.scribe.c;
import com.twitter.sdk.android.core.internal.scribe.d;

final class cu
  implements ca
{
  private final bw a;
  
  cu(bw parambw)
  {
    if (parambw == null) {
      throw new NullPointerException("scribeClient must not be null");
    }
    this.a = parambw;
  }
  
  public void a()
  {
    c localc = by.a.d("fallback").e("").f("impression").a();
    this.a.a(localc);
  }
  
  public void a(bs parambs) {}
  
  public void a(bz parambz)
  {
    parambz = by.a.d("fallback").e(parambz.toString()).f("click").a();
    this.a.a(parambz);
  }
  
  public void b() {}
  
  public void c() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */