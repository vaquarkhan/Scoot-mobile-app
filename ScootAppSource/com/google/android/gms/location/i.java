package com.google.android.gms.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.internal.aa;
import com.google.android.gms.location.internal.ag;

public final class i
{
  public static final a<com.google.android.gms.common.api.d> a = new a("LocationServices.API", f, e);
  public static final d b = new com.google.android.gms.location.internal.d();
  public static final e c = new com.google.android.gms.location.internal.j();
  public static final n d = new ag();
  private static final l<aa> e = new l();
  private static final g<aa, com.google.android.gms.common.api.d> f = new j();
  
  public static aa a(q paramq)
  {
    boolean bool2 = true;
    if (paramq != null)
    {
      bool1 = true;
      b.b(bool1, "GoogleApiClient parameter is required.");
      paramq = (aa)paramq.a(e);
      if (paramq == null) {
        break label44;
      }
    }
    label44:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      b.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return paramq;
      bool1 = false;
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */