package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.scribe.c;
import com.twitter.sdk.android.core.internal.scribe.d;

final class cn
  implements ca
{
  private final bw a;
  
  public cn(bw parambw)
  {
    if (parambw == null) {
      throw new NullPointerException("scribeClient must not be null");
    }
    this.a = parambw;
  }
  
  public void a()
  {
    c localc = by.a.d("email").e("").f("impression").a();
    this.a.a(localc);
  }
  
  public void a(bs parambs)
  {
    parambs = by.a.d("email").e("").f("error").a();
    this.a.a(parambs);
  }
  
  public void a(bz parambz)
  {
    parambz = by.a.d("email").e(parambz.toString()).f("click").a();
    this.a.a(parambz);
  }
  
  public void b()
  {
    c localc = by.a.d("email").e("").f("failure").a();
    this.a.a(localc);
  }
  
  public void c()
  {
    c localc = by.a.d("email").e("").f("success").a();
    this.a.a(localc);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */