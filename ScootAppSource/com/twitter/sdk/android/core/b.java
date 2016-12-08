package com.twitter.sdk.android.core;

import android.text.TextUtils;
import b.a.a.a.t;
import com.google.a.k;
import com.google.a.r;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

final class b
  implements b.a.a.a.a.f.f<a>
{
  private final k a = new r().a(OAuth2Token.class, new d()).a();
  
  public a a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        paramString = (a)this.a.a(paramString, a.class);
        return paramString;
      }
      catch (Exception paramString)
      {
        b.a.a.a.f.h().a("Twitter", "Failed to deserialize session " + paramString.getMessage());
      }
    }
    return null;
  }
  
  public String a(a parama)
  {
    if ((parama != null) && (parama.d() != null)) {
      try
      {
        parama = this.a.b(parama);
        return parama;
      }
      catch (Exception parama)
      {
        b.a.a.a.f.h().a("Twitter", "Failed to serialize session " + parama.getMessage());
      }
    }
    return "";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */