package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.location.places.internal.ac;

public final class i
  extends a<h>
  implements x
{
  private final String b;
  private final Context c;
  private final int d;
  private final Status e;
  
  public i(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder);
    this.c = paramContext;
    this.e = q.c(paramDataHolder.e());
    this.d = j.a(paramInt);
    if ((paramDataHolder != null) && (paramDataHolder.f() != null))
    {
      this.b = paramDataHolder.f().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
      return;
    }
    this.b = null;
  }
  
  public static int a(Bundle paramBundle)
  {
    return paramBundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
  }
  
  public Status b()
  {
    return this.e;
  }
  
  public h b(int paramInt)
  {
    return new ac(this.a, paramInt, this.c);
  }
  
  public String toString()
  {
    return br.a(this).a("status", b()).a("attributions", this.b).toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */