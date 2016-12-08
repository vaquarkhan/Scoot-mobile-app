package com.c.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;

final class k
{
  private final c a;
  
  k(c paramc)
  {
    this.a = paramc;
  }
  
  public static k a(Context paramContext)
  {
    return new k(new d(paramContext, "settings"));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public void a()
  {
    this.a.a(this.a.b().putBoolean("analytics_launched", true));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public boolean b()
  {
    return this.a.a().getBoolean("analytics_launched", false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */