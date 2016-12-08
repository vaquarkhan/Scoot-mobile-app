package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.bb;
import com.google.android.gms.common.internal.bn;

public abstract interface g
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, Account paramAccount, d paramd);
  
  public abstract void a(AuthAccountRequest paramAuthAccountRequest, d paramd);
  
  public abstract void a(ResolveAccountRequest paramResolveAccountRequest, bn parambn);
  
  public abstract void a(bb parambb, int paramInt, boolean paramBoolean);
  
  public abstract void a(CheckServerAuthResult paramCheckServerAuthResult);
  
  public abstract void a(RecordConsentRequest paramRecordConsentRequest, d paramd);
  
  public abstract void a(SignInRequest paramSignInRequest, d paramd);
  
  public abstract void a(d paramd);
  
  public abstract void a(boolean paramBoolean);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\signin\internal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */