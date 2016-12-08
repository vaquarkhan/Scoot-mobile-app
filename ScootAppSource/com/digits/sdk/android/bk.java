package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import java.util.Locale;

final class bk
  extends bm<an>
{
  bk(bf parambf, f paramf, String paramString, ef paramef)
  {
    super(paramf);
  }
  
  public void a(k<DigitsApiClient> paramk)
  {
    ((DigitsApiClient)paramk.a).c().register(this.a, "third_party_confirmation_code", Boolean.valueOf(true), Locale.getDefault().getLanguage(), "digits_sdk", this.b.name(), this.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */