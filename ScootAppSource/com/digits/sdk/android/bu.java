package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.u;

final class bu
  extends f<OAuth2Token>
{
  final m<cb> a;
  final f<l> b;
  
  bu(m<cb> paramm, f<l> paramf)
  {
    this.a = paramm;
    this.b = paramf;
  }
  
  public void a(k<OAuth2Token> paramk)
  {
    cb localcb = new cb((OAuth2Token)paramk.a);
    this.a.a(localcb.e(), localcb);
    if (this.b != null) {
      this.b.a(new k(localcb, paramk.b));
    }
  }
  
  public void a(u paramu)
  {
    if (this.b != null) {
      this.b.a(paramu);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */