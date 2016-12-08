package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.data.DataHolder;

public abstract class ac<A extends k>
  extends ad<c, A>
{
  public ac(a parama, q paramq)
  {
    super(parama, paramq);
  }
  
  protected c a(Status paramStatus)
  {
    return new c(DataHolder.b(paramStatus.g()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */