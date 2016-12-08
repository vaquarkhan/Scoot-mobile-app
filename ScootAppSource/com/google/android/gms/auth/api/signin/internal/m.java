package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract interface m
  extends IInterface
{
  public abstract void a(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus);
  
  public abstract void a(Status paramStatus);
  
  public abstract void b(Status paramStatus);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */