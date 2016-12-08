package com.twitter.sdk.android.core.internal.oauth;

import b.a.a.a.t;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.u;

final class f
  extends com.twitter.sdk.android.core.f<AppAuthToken>
{
  f(OAuth2Service paramOAuth2Service, com.twitter.sdk.android.core.f paramf) {}
  
  public void a(k<AppAuthToken> paramk)
  {
    paramk = (OAuth2Token)paramk.a;
    g localg = new g(this, paramk);
    this.b.a(localg, paramk);
  }
  
  public void a(u paramu)
  {
    b.a.a.a.f.h().e("Twitter", "Failed to get app auth token", paramu);
    if (this.a != null) {
      this.a.a(paramu);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */