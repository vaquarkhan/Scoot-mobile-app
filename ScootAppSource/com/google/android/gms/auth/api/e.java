package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import java.util.Collections;
import java.util.List;

final class e
  extends g<i, GoogleSignInOptions>
{
  public i a(Context paramContext, Looper paramLooper, ai paramai, GoogleSignInOptions paramGoogleSignInOptions, s params, t paramt)
  {
    return new i(paramContext, paramLooper, paramai, paramGoogleSignInOptions, params, paramt);
  }
  
  public List<Scope> a(GoogleSignInOptions paramGoogleSignInOptions)
  {
    if (paramGoogleSignInOptions == null) {
      return Collections.emptyList();
    }
    return paramGoogleSignInOptions.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */