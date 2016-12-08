package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.b.az;
import org.json.JSONException;
import org.json.JSONObject;

final class b
{
  private final SharedPreferences a;
  private final c b;
  private au c;
  
  public b()
  {
    this(w.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new c());
  }
  
  b(SharedPreferences paramSharedPreferences, c paramc)
  {
    this.a = paramSharedPreferences;
    this.b = paramc;
  }
  
  private boolean c()
  {
    return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
  }
  
  private AccessToken d()
  {
    AccessToken localAccessToken = null;
    String str = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
    if (str != null) {}
    try
    {
      localAccessToken = AccessToken.a(new JSONObject(str));
      return localAccessToken;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  private boolean e()
  {
    return w.c();
  }
  
  private AccessToken f()
  {
    Object localObject2 = null;
    Bundle localBundle = g().a();
    Object localObject1 = localObject2;
    if (localBundle != null)
    {
      localObject1 = localObject2;
      if (au.a(localBundle)) {
        localObject1 = AccessToken.a(localBundle);
      }
    }
    return (AccessToken)localObject1;
  }
  
  private au g()
  {
    if (this.c == null) {}
    try
    {
      if (this.c == null) {
        this.c = this.b.a();
      }
      return this.c;
    }
    finally {}
  }
  
  public AccessToken a()
  {
    Object localObject = null;
    if (c()) {
      localObject = d();
    }
    AccessToken localAccessToken;
    do
    {
      do
      {
        return (AccessToken)localObject;
      } while (!e());
      localAccessToken = f();
      localObject = localAccessToken;
    } while (localAccessToken == null);
    a(localAccessToken);
    g().b();
    return localAccessToken;
  }
  
  public void a(AccessToken paramAccessToken)
  {
    az.a(paramAccessToken, "accessToken");
    try
    {
      paramAccessToken = paramAccessToken.j();
      this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", paramAccessToken.toString()).apply();
      return;
    }
    catch (JSONException paramAccessToken) {}
  }
  
  public void b()
  {
    this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    if (e()) {
      g().b();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */