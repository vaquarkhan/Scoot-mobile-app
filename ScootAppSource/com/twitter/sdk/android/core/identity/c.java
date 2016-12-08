package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import b.a.a.a.t;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.u;

final class c
  extends com.twitter.sdk.android.core.f<OAuthResponse>
{
  c(a parama) {}
  
  public void a(k<OAuthResponse> paramk)
  {
    Intent localIntent = new Intent();
    paramk = (OAuthResponse)paramk.a;
    localIntent.putExtra("screen_name", paramk.b);
    localIntent.putExtra("user_id", paramk.c);
    localIntent.putExtra("tk", paramk.a.b);
    localIntent.putExtra("ts", paramk.a.c);
    this.a.a.a(-1, localIntent);
  }
  
  public void a(u paramu)
  {
    b.a.a.a.f.h().e("Twitter", "Failed to get access token", paramu);
    this.a.a(1, new q("Failed to get access token"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */