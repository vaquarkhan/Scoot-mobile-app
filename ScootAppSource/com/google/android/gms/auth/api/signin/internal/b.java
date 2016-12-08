package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.support.v4.app.be;
import android.support.v4.b.n;
import com.google.android.gms.common.api.q;

final class b
  implements be<Void>
{
  private b(SignInHubActivity paramSignInHubActivity) {}
  
  public n<Void> a(int paramInt, Bundle paramBundle)
  {
    return new d(this.a, q.a());
  }
  
  public void a(n<Void> paramn) {}
  
  public void a(n<Void> paramn, Void paramVoid)
  {
    this.a.setResult(SignInHubActivity.a(this.a), SignInHubActivity.b(this.a));
    this.a.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */