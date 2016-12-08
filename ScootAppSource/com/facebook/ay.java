package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.b.az;
import org.json.JSONException;
import org.json.JSONObject;

final class ay
{
  private final SharedPreferences a = w.f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
  
  Profile a()
  {
    Object localObject = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
    if (localObject != null) {
      try
      {
        localObject = new Profile(new JSONObject((String)localObject));
        return (Profile)localObject;
      }
      catch (JSONException localJSONException) {}
    }
    return null;
  }
  
  void a(Profile paramProfile)
  {
    az.a(paramProfile, "profile");
    paramProfile = paramProfile.c();
    if (paramProfile != null) {
      this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", paramProfile.toString()).apply();
    }
  }
  
  void b()
  {
    this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */