package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.location.places.internal.ag;

public final class f
  extends a<e>
  implements x
{
  private final Context b;
  private final Status c;
  private final String d;
  
  public f(DataHolder paramDataHolder, Context paramContext)
  {
    super(paramDataHolder);
    this.b = paramContext;
    this.c = q.c(paramDataHolder.e());
    if ((paramDataHolder != null) && (paramDataHolder.f() != null))
    {
      this.d = paramDataHolder.f().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
      return;
    }
    this.d = null;
  }
  
  public Status b()
  {
    return this.c;
  }
  
  public e b(int paramInt)
  {
    return new ag(this.a, paramInt, this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */