package com.google.android.gms.location.places.a;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.d;
import com.google.android.gms.location.places.e;
import com.google.android.gms.location.places.internal.PlaceEntity;

abstract class c
{
  public static e c(Context paramContext, Intent paramIntent)
  {
    b.a(paramIntent, "intent must not be null");
    b.a(paramContext, "context must not be null");
    return (e)d.a(paramIntent, "selected_place", PlaceEntity.CREATOR);
  }
  
  public static Status d(Context paramContext, Intent paramIntent)
  {
    b.a(paramIntent, "intent must not be null");
    b.a(paramContext, "context must not be null");
    return (Status)d.a(paramIntent, "status", Status.CREATOR);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */