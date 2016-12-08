package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.internal.j;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.t;
import java.util.List;

final class bt
  extends j
{
  final m<cb> a;
  final OAuth2Service b;
  
  bt(m<cb> paramm, List<m<? extends l>> paramList)
  {
    this(paramm, paramList, new OAuth2Service(t.d(), t.d().g(), new az()));
  }
  
  bt(m<cb> paramm, List<m<? extends l>> paramList, OAuth2Service paramOAuth2Service)
  {
    super(paramList);
    this.a = paramm;
    this.b = paramOAuth2Service;
  }
  
  public void a(f<l> paramf)
  {
    this.b.a(new bu(this.a, paramf));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */