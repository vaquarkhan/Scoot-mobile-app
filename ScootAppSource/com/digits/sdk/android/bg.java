package com.digits.sdk.android;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import java.util.Locale;

final class bg
  extends bm<i>
{
  bg(bf parambf, f paramf, String paramString, ef paramef)
  {
    super(paramf);
  }
  
  public void a(k<DigitsApiClient> paramk)
  {
    ((DigitsApiClient)paramk.a).b().auth(this.a, this.b.name(), Locale.getDefault().getLanguage(), this.e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */