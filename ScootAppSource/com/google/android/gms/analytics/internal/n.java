package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.common.a.c;

public final class n
  extends af
{
  private SharedPreferences a;
  private long b;
  private long c = -1L;
  private final p d = new p(this, "monitoring", q().G(), null);
  
  protected n(ah paramah)
  {
    super(paramah);
  }
  
  protected void a()
  {
    this.a = o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public void a(String paramString)
  {
    m();
    D();
    SharedPreferences.Editor localEditor = this.a.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    }
    for (;;)
    {
      if (!localEditor.commit()) {
        e("Failed to commit campaign data");
      }
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }
  
  public long b()
  {
    m();
    D();
    long l;
    if (this.b == 0L)
    {
      l = this.a.getLong("first_run", 0L);
      if (l == 0L) {
        break label46;
      }
    }
    for (this.b = l;; this.b = l)
    {
      return this.b;
      label46:
      l = n().a();
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putLong("first_run", l);
      if (!localEditor.commit()) {
        e("Failed to commit first run time");
      }
    }
  }
  
  public s c()
  {
    return new s(n(), b());
  }
  
  public long d()
  {
    m();
    D();
    if (this.c == -1L) {
      this.c = this.a.getLong("last_dispatch", 0L);
    }
    return this.c;
  }
  
  public void e()
  {
    m();
    D();
    long l = n().a();
    SharedPreferences.Editor localEditor = this.a.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.c = l;
  }
  
  public String f()
  {
    m();
    D();
    String str = this.a.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return str;
  }
  
  public p g()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */