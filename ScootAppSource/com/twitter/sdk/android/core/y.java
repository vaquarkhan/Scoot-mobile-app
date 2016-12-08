package com.twitter.sdk.android.core;

import android.text.TextUtils;
import b.a.a.a.t;
import com.google.a.k;

final class y
  implements b.a.a.a.a.f.f<x>
{
  private final k a = new k();
  
  public x a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        paramString = (x)this.a.a(paramString, x.class);
        return paramString;
      }
      catch (Exception paramString)
      {
        b.a.a.a.f.h().a("Twitter", paramString.getMessage());
      }
    }
    return null;
  }
  
  public String a(x paramx)
  {
    if ((paramx != null) && (paramx.d() != null)) {
      try
      {
        paramx = this.a.b(paramx);
        return paramx;
      }
      catch (Exception paramx)
      {
        b.a.a.a.f.h().a("Twitter", paramx.getMessage());
      }
    }
    return "";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */