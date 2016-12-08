package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.places.q;

@Deprecated
public final class g
  extends k<PlaceUserData>
  implements x
{
  private final Status b;
  
  public g(DataHolder paramDataHolder)
  {
    this(paramDataHolder, q.c(paramDataHolder.e()));
  }
  
  private g(DataHolder paramDataHolder, Status paramStatus)
  {
    super(paramDataHolder, PlaceUserData.CREATOR);
    if ((paramDataHolder == null) || (paramDataHolder.e() == paramStatus.g())) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool);
      this.b = paramStatus;
      return;
    }
  }
  
  public Status b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */