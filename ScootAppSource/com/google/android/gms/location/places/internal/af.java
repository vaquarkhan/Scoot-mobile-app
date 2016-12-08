package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.k;

public final class af
  extends ai
  implements k
{
  private final String c = d("photo_fife_url");
  
  public af(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public k b()
  {
    return new ae(this.c, c(), d(), e(), this.b);
  }
  
  public int c()
  {
    return a("photo_max_width", 0);
  }
  
  public int d()
  {
    return a("photo_max_height", 0);
  }
  
  public CharSequence e()
  {
    return a("photo_attributions", null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */