package com.google.android.gms.location;

import java.util.ArrayList;

public final class m
{
  private final ArrayList<LocationRequest> a = new ArrayList();
  private boolean b = false;
  private boolean c = false;
  
  public LocationSettingsRequest a()
  {
    return new LocationSettingsRequest(this.a, this.b, this.c, null);
  }
  
  public m a(LocationRequest paramLocationRequest)
  {
    this.a.add(paramLocationRequest);
    return this;
  }
  
  public m a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */