package com.google.android.gms.b;

import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.signin.internal.b;
import java.lang.ref.WeakReference;

final class ce
  extends b
{
  private final WeakReference<bx> a;
  
  ce(bx parambx)
  {
    this.a = new WeakReference(parambx);
  }
  
  public void a(SignInResponse paramSignInResponse)
  {
    bx localbx = (bx)this.a.get();
    if (localbx == null) {
      return;
    }
    bx.d(localbx).a(new cf(this, localbx, localbx, paramSignInResponse));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */