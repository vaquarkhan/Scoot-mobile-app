package com.twitter.sdk.android.core.identity;

import com.twitter.sdk.android.core.n;
import com.twitter.sdk.android.core.x;

final class ShareEmailClient
  extends n
{
  ShareEmailClient(x paramx)
  {
    super(paramx);
  }
  
  protected void a(com.twitter.sdk.android.core.f<com.twitter.sdk.android.core.a.f> paramf)
  {
    ((ShareEmailClient.EmailService)a(ShareEmailClient.EmailService.class)).verifyCredentials(Boolean.valueOf(true), Boolean.valueOf(true), paramf);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\identity\ShareEmailClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */