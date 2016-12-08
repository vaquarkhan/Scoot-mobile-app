package com.twitter.sdk.android.core.identity;

import b.a.a.a.t;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.u;

final class b
  extends com.twitter.sdk.android.core.f<OAuthResponse>
{
  b(a parama) {}
  
  public void a(k<OAuthResponse> paramk)
  {
    this.a.b = ((OAuthResponse)paramk.a).a;
    paramk = a.a(this.a).a(this.a.b);
    b.a.a.a.f.h().a("Twitter", "Redirecting user to web view to complete authorization flow");
    this.a.a(a.b(this.a), new f(a.a(this.a).a(a.c(this.a)), this.a), paramk, new e());
  }
  
  public void a(u paramu)
  {
    b.a.a.a.f.h().e("Twitter", "Failed to get request token", paramu);
    this.a.a(1, new q("Failed to get request token"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */