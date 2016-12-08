package com.facebook;

import android.content.Intent;
import android.support.v4.b.q;
import com.facebook.b.as;

final class az
{
  private static volatile az a;
  private final q b;
  private final ay c;
  private Profile d;
  
  az(q paramq, ay paramay)
  {
    com.facebook.b.az.a(paramq, "localBroadcastManager");
    com.facebook.b.az.a(paramay, "profileCache");
    this.b = paramq;
    this.c = paramay;
  }
  
  static az a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new az(q.a(w.f()), new ay());
      }
      return a;
    }
    finally {}
  }
  
  private void a(Profile paramProfile1, Profile paramProfile2)
  {
    Intent localIntent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", paramProfile1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", paramProfile2);
    this.b.a(localIntent);
  }
  
  private void a(Profile paramProfile, boolean paramBoolean)
  {
    Profile localProfile = this.d;
    this.d = paramProfile;
    if (paramBoolean)
    {
      if (paramProfile == null) {
        break label41;
      }
      this.c.a(paramProfile);
    }
    for (;;)
    {
      if (!as.a(localProfile, paramProfile)) {
        a(localProfile, paramProfile);
      }
      return;
      label41:
      this.c.b();
    }
  }
  
  void a(Profile paramProfile)
  {
    a(paramProfile, true);
  }
  
  Profile b()
  {
    return this.d;
  }
  
  boolean c()
  {
    boolean bool = false;
    Profile localProfile = this.c.a();
    if (localProfile != null)
    {
      a(localProfile, false);
      bool = true;
    }
    return bool;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */