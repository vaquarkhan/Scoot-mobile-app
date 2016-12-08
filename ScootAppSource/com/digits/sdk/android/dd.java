package com.digits.sdk.android;

import b.a.a.a.t;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.u;

final class dd
  extends com.twitter.sdk.android.core.f<i>
{
  dd(dc paramdc) {}
  
  public void a(k<i> paramk)
  {
    this.a.a(dc.a(this.a, (i)paramk.a));
  }
  
  public void a(u paramu)
  {
    bs localbs = dc.a(this.a, paramu);
    b.a.a.a.f.h().e("Digits", "HTTP Error: " + paramu.getMessage() + ", API Error: " + "" + localbs.a() + ", User Message: " + localbs.getMessage());
    if ((localbs instanceof ag))
    {
      dc.a(this.a);
      return;
    }
    this.a.a(localbs);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */