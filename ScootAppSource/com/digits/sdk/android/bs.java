package com.digits.sdk.android;

import com.twitter.sdk.android.core.o;
import com.twitter.sdk.android.core.u;
import retrofit.RetrofitError;

public class bs
  extends RuntimeException
{
  private final int a;
  private final AuthConfig b;
  
  bs(String paramString)
  {
    this(paramString, -1, new AuthConfig());
  }
  
  bs(String paramString, int paramInt, AuthConfig paramAuthConfig)
  {
    super(paramString);
    this.a = paramInt;
    this.b = paramAuthConfig;
  }
  
  private static bs a(int paramInt, String paramString, AuthConfig paramAuthConfig)
  {
    if (paramInt == 32) {
      return new ag(paramString, paramInt, paramAuthConfig);
    }
    if (paramInt == 286) {
      return new df(paramString, paramInt, paramAuthConfig);
    }
    if (a(paramInt)) {
      return new ec(paramString, paramInt, paramAuthConfig);
    }
    return new bs(paramString, paramInt, paramAuthConfig);
  }
  
  static bs a(co paramco, u paramu)
  {
    if ((paramu instanceof o))
    {
      paramu = (o)paramu;
      paramco = a(paramco, paramu);
      return a(paramu.a(), paramco, (AuthConfig)paramu.c().getBodyAs(AuthConfig.class));
    }
    return new bs(paramco.a());
  }
  
  private static String a(co paramco, o paramo)
  {
    if (paramo.c().isNetworkError()) {
      return paramco.b();
    }
    return paramco.a(paramo.a());
  }
  
  private static boolean a(int paramInt)
  {
    return (paramInt == 269) || (paramInt == 235) || (paramInt == 237) || (paramInt == 299) || (paramInt == 284);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public AuthConfig b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */