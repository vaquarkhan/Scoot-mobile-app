package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.x;

public abstract interface cq
{
  public abstract <A extends h, R extends x, T extends be<R, A>> T a(T paramT);
  
  public abstract void a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt);
  
  public abstract <A extends h, T extends be<? extends x, A>> T b(T paramT);
  
  public abstract boolean b();
  
  public abstract void c();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */