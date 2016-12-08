package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.u;
import com.google.android.gms.b.fh;
import com.google.android.gms.b.fi;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.r;

public final class k
  extends aq<g>
  implements fh
{
  private final boolean d;
  private final ai e;
  private final Bundle f;
  private Integer g;
  
  public k(Context paramContext, Looper paramLooper, boolean paramBoolean, ai paramai, Bundle paramBundle, s params, t paramt)
  {
    super(paramContext, paramLooper, 44, paramai, params, paramt);
    this.d = paramBoolean;
    this.e = paramai;
    this.f = paramBundle;
    this.g = paramai.j();
  }
  
  public k(Context paramContext, Looper paramLooper, boolean paramBoolean, ai paramai, fi paramfi, s params, t paramt)
  {
    this(paramContext, paramLooper, paramBoolean, paramai, a(paramai), params, paramt);
  }
  
  public static Bundle a(ai paramai)
  {
    fi localfi = paramai.i();
    Integer localInteger = paramai.j();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", paramai.b());
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    if (localfi != null)
    {
      localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", localfi.a());
      localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", localfi.b());
      localBundle.putString("com.google.android.gms.signin.internal.serverClientId", localfi.c());
      localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
      localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", localfi.d());
      localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", localfi.e());
      localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", localfi.f());
    }
    return localBundle;
  }
  
  private ResolveAccountRequest x()
  {
    Account localAccount = this.e.c();
    GoogleSignInAccount localGoogleSignInAccount = null;
    if ("<<default account>>".equals(localAccount.name)) {
      localGoogleSignInAccount = u.a(o()).a();
    }
    return new ResolveAccountRequest(localAccount, this.g.intValue(), localGoogleSignInAccount);
  }
  
  protected g a(IBinder paramIBinder)
  {
    return h.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public void a(bb parambb, boolean paramBoolean)
  {
    try
    {
      ((g)t()).a(parambb, this.g.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException parambb)
    {
      Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
    }
  }
  
  public void a(d paramd)
  {
    b.a(paramd, "Expecting a valid ISignInCallbacks");
    try
    {
      ResolveAccountRequest localResolveAccountRequest = x();
      ((g)t()).a(new SignInRequest(localResolveAccountRequest), paramd);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try
      {
        paramd.a(new SignInResponse(8));
        return;
      }
      catch (RemoteException paramd)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException);
      }
    }
  }
  
  protected String b()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected Bundle c()
  {
    String str = this.e.g();
    if (!o().getPackageName().equals(str)) {
      this.f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.e.g());
    }
    return this.f;
  }
  
  public void f()
  {
    try
    {
      ((g)t()).a(this.g.intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
    }
  }
  
  public boolean j()
  {
    return this.d;
  }
  
  public void m()
  {
    a(new r(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\signin\internal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */