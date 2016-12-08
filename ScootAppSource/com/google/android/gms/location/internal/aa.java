package com.google.android.gms.location.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.b.bf;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.g;

public final class aa
  extends a
{
  private final w e = new w(paramContext, this.d);
  
  public aa(Context paramContext, Looper paramLooper, s params, t paramt, String paramString, ai paramai)
  {
    super(paramContext, paramLooper, params, paramt, paramString, paramai);
  }
  
  public void a(LocationRequest paramLocationRequest, g paramg, Looper paramLooper, k paramk)
  {
    synchronized (this.e)
    {
      this.e.a(paramLocationRequest, paramg, paramLooper, paramk);
      return;
    }
  }
  
  public void a(LocationSettingsRequest paramLocationSettingsRequest, bf<LocationSettingsResult> parambf, String paramString)
  {
    boolean bool2 = true;
    r();
    if (paramLocationSettingsRequest != null)
    {
      bool1 = true;
      b.b(bool1, "locationSettingsRequest can't be null nor empty.");
      if (parambf == null) {
        break label67;
      }
    }
    label67:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      b.b(bool1, "listener can't be null.");
      parambf = new ab(parambf);
      ((q)t()).a(paramLocationSettingsRequest, parambf, paramString);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void a(g paramg, k paramk)
  {
    this.e.a(paramg, paramk);
  }
  
  public Location f()
  {
    return this.e.a();
  }
  
  public void g()
  {
    synchronized (this.e)
    {
      boolean bool = h();
      if (bool) {}
      try
      {
        this.e.b();
        this.e.c();
        super.g();
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", localException);
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */