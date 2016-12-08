package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.e;
import com.google.android.gms.location.places.h;

public final class ac
  extends ai
  implements h
{
  private final Context c;
  
  public ac(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder, paramInt);
    this.c = paramContext;
  }
  
  public h b()
  {
    return PlaceLikelihoodEntity.a((PlaceEntity)d().a(), c());
  }
  
  public float c()
  {
    return a("place_likelihood", -1.0F);
  }
  
  public e d()
  {
    return new ag(this.a, this.b, this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */