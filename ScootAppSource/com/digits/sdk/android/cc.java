package com.digits.sdk.android;

import android.text.TextUtils;
import b.a.a.a.t;
import com.google.a.k;
import com.google.a.r;
import com.twitter.sdk.android.core.c;
import com.twitter.sdk.android.core.d;

public final class cc
  implements b.a.a.a.a.f.f<cb>
{
  private final k a = new r().a(c.class, new d()).a();
  
  public cb a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        Object localObject = (cb)this.a.a(paramString, cb.class);
        c localc = ((cb)localObject).d();
        long l = ((cb)localObject).e();
        if (cb.a((cb)localObject) == null)
        {
          paramString = "";
          if (cb.b((cb)localObject) != null) {
            break label82;
          }
        }
        label82:
        for (localObject = cb.a;; localObject = cb.b((cb)localObject))
        {
          return new cb(localc, l, paramString, (ci)localObject);
          paramString = cb.a((cb)localObject);
          break;
        }
        return null;
      }
      catch (Exception paramString)
      {
        b.a.a.a.f.h().a("Digits", paramString.getMessage());
      }
    }
  }
  
  public String a(cb paramcb)
  {
    if ((paramcb != null) && (paramcb.d() != null)) {
      try
      {
        paramcb = this.a.b(paramcb);
        return paramcb;
      }
      catch (Exception paramcb)
      {
        b.a.a.a.f.h().a("Digits", paramcb.getMessage());
      }
    }
    return "";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */