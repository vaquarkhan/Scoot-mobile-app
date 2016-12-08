package com.google.android.gms.auth.api.credentials.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract interface f
  extends IInterface
{
  public abstract void a(Status paramStatus);
  
  public abstract void a(Status paramStatus, Credential paramCredential);
  
  public abstract void a(Status paramStatus, String paramString);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */