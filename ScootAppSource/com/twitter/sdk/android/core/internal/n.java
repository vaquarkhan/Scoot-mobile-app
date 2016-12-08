package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.internal.scribe.a;
import com.twitter.sdk.android.core.internal.scribe.c;
import com.twitter.sdk.android.core.internal.scribe.d;
import com.twitter.sdk.android.core.internal.scribe.r;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.services.AccountService;
import retrofit.RetrofitError;

public final class n
  implements k
{
  private final o a = new o();
  private final a b = r.a();
  
  private void a()
  {
    if (this.b == null) {
      return;
    }
    c localc = new d().a("android").b("credentials").c("").d("").e("").f("impression").a();
    this.b.a(new c[] { localc });
  }
  
  public void a(l paraml)
  {
    paraml = this.a.a(paraml);
    try
    {
      a();
      paraml.verifyCredentials(Boolean.valueOf(true), Boolean.valueOf(false));
      return;
    }
    catch (RetrofitError paraml) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */