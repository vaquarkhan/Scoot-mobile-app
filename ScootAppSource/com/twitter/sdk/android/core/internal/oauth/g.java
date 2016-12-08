package com.twitter.sdk.android.core.internal.oauth;

import b.a.a.a.t;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.u;

final class g
  extends com.twitter.sdk.android.core.f<b>
{
  g(f paramf, OAuth2Token paramOAuth2Token) {}
  
  public void a(k<b> paramk)
  {
    paramk = new GuestAuthToken(this.a.c(), this.a.d(), ((b)paramk.a).a);
    this.b.a.a(new k(paramk, null));
  }
  
  public void a(u paramu)
  {
    b.a.a.a.f.h().e("Twitter", "Your app may not allow guest auth. Please talk to us regarding upgrading your consumer key.", paramu);
    this.b.a.a(paramu);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */