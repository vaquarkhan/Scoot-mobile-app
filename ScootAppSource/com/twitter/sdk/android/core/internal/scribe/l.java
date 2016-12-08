package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import b.a.a.a.a.b.y;
import retrofit.RequestInterceptor;
import retrofit.RequestInterceptor.RequestFacade;

final class l
  implements RequestInterceptor
{
  private final f a;
  private final y b;
  
  l(f paramf, y paramy)
  {
    this.a = paramf;
    this.b = paramy;
  }
  
  public void intercept(RequestInterceptor.RequestFacade paramRequestFacade)
  {
    if (!TextUtils.isEmpty(this.a.f)) {
      paramRequestFacade.addHeader("User-Agent", this.a.f);
    }
    if (!TextUtils.isEmpty(this.b.h())) {
      paramRequestFacade.addHeader("X-Client-UUID", this.b.h());
    }
    paramRequestFacade.addHeader("X-Twitter-Polling", "true");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */