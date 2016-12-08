package com.facebook.b;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.p;

public class bf
{
  private Context a;
  private String b;
  private String c;
  private int d = 16973840;
  private bh e;
  private Bundle f;
  private AccessToken g;
  
  public bf(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.g = AccessToken.a();
    if (this.g == null)
    {
      String str = as.a(paramContext);
      if (str != null) {
        this.b = str;
      }
    }
    else
    {
      a(paramContext, paramString, paramBundle);
      return;
    }
    throw new p("Attempted to create a builder without a valid access token or a valid default Application ID.");
  }
  
  public bf(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = as.a(paramContext);
    }
    az.a(str, "applicationId");
    this.b = str;
    a(paramContext, paramString2, paramBundle);
  }
  
  private void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.a = paramContext;
    this.c = paramString;
    if (paramBundle != null)
    {
      this.f = paramBundle;
      return;
    }
    this.f = new Bundle();
  }
  
  public ba a()
  {
    if (this.g != null)
    {
      this.f.putString("app_id", this.g.h());
      this.f.putString("access_token", this.g.b());
    }
    for (;;)
    {
      return new ba(this.a, this.c, this.f, this.d, this.e);
      this.f.putString("app_id", this.b);
    }
  }
  
  public bf a(int paramInt)
  {
    this.d = paramInt;
    return this;
  }
  
  public bf a(bh parambh)
  {
    this.e = parambh;
    return this;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public Context c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public Bundle e()
  {
    return this.f;
  }
  
  public bh f()
  {
    return this.e;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */