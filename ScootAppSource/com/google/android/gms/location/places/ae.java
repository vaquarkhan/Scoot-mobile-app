package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;

public abstract class ae<A extends k>
  extends ad<f, A>
{
  public ae(a parama, q paramq)
  {
    super(parama, paramq);
  }
  
  protected f a(Status paramStatus)
  {
    return new f(DataHolder.b(paramStatus.g()), null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */