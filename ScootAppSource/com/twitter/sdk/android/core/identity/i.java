package com.twitter.sdk.android.core.identity;

import b.a.a.a.t;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.u;

final class i
  extends com.twitter.sdk.android.core.f<com.twitter.sdk.android.core.a.f>
{
  i(h paramh) {}
  
  public void a(k<com.twitter.sdk.android.core.a.f> paramk)
  {
    this.a.a((com.twitter.sdk.android.core.a.f)paramk.a);
  }
  
  public void a(u paramu)
  {
    b.a.a.a.f.h().e("Twitter", "Failed to get email address.", paramu);
    this.a.a(new u("Failed to get email address."));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */