package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.scribe.c;
import com.twitter.sdk.android.core.internal.scribe.d;

final class j
  implements ca
{
  private final bw a;
  
  j(bw parambw)
  {
    if (parambw == null) {
      throw new NullPointerException("scribeClient must not be null");
    }
    this.a = parambw;
  }
  
  public void a()
  {
    c localc = by.a.d("").e("").f("impression").a();
    this.a.a(localc);
  }
  
  public void a(bs parambs) {}
  
  public void a(bz parambz) {}
  
  public void b()
  {
    c localc = by.a.d("").e("").f("failure").a();
    this.a.a(localc);
  }
  
  public void c()
  {
    c localc = by.a.d("").e("").f("logged_in").a();
    this.a.a(localc);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */