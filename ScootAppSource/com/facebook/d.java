package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.b.q;
import com.facebook.b.as;
import com.facebook.b.az;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

final class d
{
  private static volatile d a;
  private final q b;
  private final b c;
  private AccessToken d;
  private AtomicBoolean e = new AtomicBoolean(false);
  private Date f = new Date(0L);
  
  d(q paramq, b paramb)
  {
    az.a(paramq, "localBroadcastManager");
    az.a(paramb, "accessTokenCache");
    this.b = paramq;
    this.c = paramb;
  }
  
  private static GraphRequest a(AccessToken paramAccessToken, ai paramai)
  {
    return new GraphRequest(paramAccessToken, "me/permissions", new Bundle(), at.a, paramai);
  }
  
  static d a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new d(q.a(w.f()), new b());
      }
      return a;
    }
    finally {}
  }
  
  private void a(AccessToken paramAccessToken1, AccessToken paramAccessToken2)
  {
    Intent localIntent = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", paramAccessToken1);
    localIntent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", paramAccessToken2);
    this.b.a(localIntent);
  }
  
  private void a(AccessToken paramAccessToken, boolean paramBoolean)
  {
    AccessToken localAccessToken = this.d;
    this.d = paramAccessToken;
    this.e.set(false);
    this.f = new Date(0L);
    if (paramBoolean)
    {
      if (paramAccessToken == null) {
        break label61;
      }
      this.c.a(paramAccessToken);
    }
    for (;;)
    {
      if (!as.a(localAccessToken, paramAccessToken)) {
        a(localAccessToken, paramAccessToken);
      }
      return;
      label61:
      this.c.b();
      as.b(w.f());
    }
  }
  
  private static GraphRequest b(AccessToken paramAccessToken, ai paramai)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("grant_type", "fb_extend_sso_token");
    return new GraphRequest(paramAccessToken, "oauth/access_token", localBundle, at.a, paramai);
  }
  
  private boolean f()
  {
    if (this.d == null) {}
    Long localLong;
    do
    {
      return false;
      localLong = Long.valueOf(new Date().getTime());
    } while ((!this.d.f().a()) || (localLong.longValue() - this.f.getTime() <= 3600000L) || (localLong.longValue() - this.d.g().getTime() <= 86400000L));
    return true;
  }
  
  private void g()
  {
    AccessToken localAccessToken = this.d;
    if (localAccessToken == null) {}
    while (!this.e.compareAndSet(false, true)) {
      return;
    }
    az.a();
    this.f = new Date();
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    i locali = new i(null);
    ap localap = new ap(new GraphRequest[] { a(localAccessToken, new f(this, localAtomicBoolean, localHashSet1, localHashSet2)), b(localAccessToken, new g(this, locali)) });
    localap.a(new h(this, localAccessToken, localAtomicBoolean, locali, localHashSet1, localHashSet2));
    localap.h();
  }
  
  void a(AccessToken paramAccessToken)
  {
    a(paramAccessToken, true);
  }
  
  AccessToken b()
  {
    return this.d;
  }
  
  boolean c()
  {
    boolean bool = false;
    AccessToken localAccessToken = this.c.a();
    if (localAccessToken != null)
    {
      a(localAccessToken, false);
      bool = true;
    }
    return bool;
  }
  
  void d()
  {
    if (!f()) {
      return;
    }
    e();
  }
  
  void e()
  {
    if (Looper.getMainLooper().equals(Looper.myLooper()))
    {
      g();
      return;
    }
    new Handler(Looper.getMainLooper()).post(new e(this));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */