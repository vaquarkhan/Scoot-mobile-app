package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.a.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.places.internal.u;
import com.google.android.gms.location.places.personalized.g;

public class ab
  extends u
{
  private static final String a = ab.class.getSimpleName();
  private final af b = null;
  private final ac c;
  private final ag d;
  private final ah e;
  private final ae f;
  private final Context g;
  
  public ab(ac paramac)
  {
    this.c = paramac;
    this.d = null;
    this.e = null;
    this.f = null;
    this.g = null;
  }
  
  public ab(ae paramae, Context paramContext)
  {
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = paramae;
    this.g = paramContext.getApplicationContext();
  }
  
  public void a(Status paramStatus)
  {
    this.e.b(paramStatus);
  }
  
  public void a(DataHolder paramDataHolder)
  {
    boolean bool;
    if (this.b != null)
    {
      bool = true;
      b.a(bool, "placeEstimator cannot be null");
      if (paramDataHolder != null) {
        break label92;
      }
      if (Log.isLoggable(a, 6))
      {
        localObject = a;
        paramDataHolder = String.valueOf(l.a());
        if (paramDataHolder.length() == 0) {
          break label79;
        }
      }
    }
    label79:
    for (paramDataHolder = "onPlaceEstimated received null DataHolder: ".concat(paramDataHolder);; paramDataHolder = new String("onPlaceEstimated received null DataHolder: "))
    {
      Log.e((String)localObject, paramDataHolder);
      this.b.c(Status.c);
      return;
      bool = false;
      break;
    }
    label92:
    Object localObject = paramDataHolder.f();
    if (localObject == null) {}
    for (int i = 100;; i = i.a((Bundle)localObject))
    {
      paramDataHolder = new i(paramDataHolder, i, this.g);
      this.b.b(paramDataHolder);
      return;
    }
  }
  
  public void b(DataHolder paramDataHolder)
  {
    if (paramDataHolder == null)
    {
      String str;
      if (Log.isLoggable(a, 6))
      {
        str = a;
        paramDataHolder = String.valueOf(l.a());
        if (paramDataHolder.length() == 0) {
          break label57;
        }
      }
      label57:
      for (paramDataHolder = "onAutocompletePrediction received null DataHolder: ".concat(paramDataHolder);; paramDataHolder = new String("onAutocompletePrediction received null DataHolder: "))
      {
        Log.e(str, paramDataHolder);
        this.c.c(Status.c);
        return;
      }
    }
    this.c.b(new c(paramDataHolder));
  }
  
  public void c(DataHolder paramDataHolder)
  {
    if (paramDataHolder == null)
    {
      String str;
      if (Log.isLoggable(a, 6))
      {
        str = a;
        paramDataHolder = String.valueOf(l.a());
        if (paramDataHolder.length() == 0) {
          break label58;
        }
      }
      label58:
      for (paramDataHolder = "onPlaceUserDataFetched received null DataHolder: ".concat(paramDataHolder);; paramDataHolder = new String("onPlaceUserDataFetched received null DataHolder: "))
      {
        Log.e(str, paramDataHolder);
        paramDataHolder = Status.c;
        throw new NullPointerException();
      }
    }
    new g(paramDataHolder);
    throw new NullPointerException();
  }
  
  public void d(DataHolder paramDataHolder)
  {
    paramDataHolder = new f(paramDataHolder, this.g);
    this.f.b(paramDataHolder);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */