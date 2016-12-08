package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;

public final class c
  extends a<b>
  implements x
{
  public c(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Status b()
  {
    return q.c(this.a.e());
  }
  
  public b b(int paramInt)
  {
    return new com.google.android.gms.location.places.internal.c(this.a, paramInt);
  }
  
  public String toString()
  {
    return br.a(this).a("status", b()).toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */