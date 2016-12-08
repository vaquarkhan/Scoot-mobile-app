package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;
import java.util.Iterator;
import java.util.Set;

public final class i
  extends aq<p>
{
  private final GoogleSignInOptions d;
  
  public i(Context paramContext, Looper paramLooper, ai paramai, GoogleSignInOptions paramGoogleSignInOptions, s params, t paramt)
  {
    super(paramContext, paramLooper, 91, paramai, params, paramt);
    if (paramGoogleSignInOptions != null) {}
    for (;;)
    {
      paramContext = paramGoogleSignInOptions;
      if (paramai.e().isEmpty()) {
        break label103;
      }
      paramContext = new d(paramGoogleSignInOptions);
      paramLooper = paramai.e().iterator();
      while (paramLooper.hasNext()) {
        paramContext.a((Scope)paramLooper.next(), new Scope[0]);
      }
      paramGoogleSignInOptions = new d().d();
    }
    paramContext = paramContext.d();
    label103:
    this.d = paramContext;
  }
  
  protected p a(IBinder paramIBinder)
  {
    return q.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public boolean d()
  {
    return true;
  }
  
  public Intent e()
  {
    SignInConfiguration localSignInConfiguration = new SignInConfiguration(o().getPackageName(), this.d);
    Intent localIntent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    localIntent.setClass(o(), SignInHubActivity.class);
    localIntent.putExtra("config", localSignInConfiguration);
    return localIntent;
  }
  
  public GoogleSignInOptions f()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */