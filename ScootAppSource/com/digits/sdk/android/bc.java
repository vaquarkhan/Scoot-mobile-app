package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.internal.a;
import com.twitter.sdk.android.core.internal.j;

final class bc
  extends a
{
  final bf a;
  
  bc(bf parambf, j paramj)
  {
    super(paramj);
    this.a = parambf;
  }
  
  protected boolean a(f<DigitsApiClient> paramf)
  {
    try
    {
      boolean bool = b(new bd(this, paramf));
      return bool;
    }
    finally
    {
      paramf = finally;
      throw paramf;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */