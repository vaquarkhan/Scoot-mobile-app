package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;

public final class e
  implements x
{
  private Status a;
  private GoogleSignInAccount b;
  
  public e(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    this.b = paramGoogleSignInAccount;
    this.a = paramStatus;
  }
  
  public GoogleSignInAccount a()
  {
    return this.b;
  }
  
  public Status b()
  {
    return this.a;
  }
  
  public boolean c()
  {
    return this.a.f();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */