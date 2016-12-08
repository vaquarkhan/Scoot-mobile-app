package com.digits.sdk.android;

import com.twitter.sdk.android.core.internal.k;
import com.twitter.sdk.android.core.l;
import java.util.concurrent.ConcurrentHashMap;

final class ce
  implements k
{
  private final cf a;
  
  ce()
  {
    this(new cf(new ConcurrentHashMap(), ao.f()));
  }
  
  ce(cf paramcf)
  {
    this.a = paramcf;
  }
  
  public void a(l paraml)
  {
    if (((paraml instanceof cb)) && (!((cb)paraml).a())) {
      b(paraml).verifyAccount(this.a);
    }
  }
  
  DigitsApiClient.AccountService b(l paraml)
  {
    return new DigitsApiClient(paraml).d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */