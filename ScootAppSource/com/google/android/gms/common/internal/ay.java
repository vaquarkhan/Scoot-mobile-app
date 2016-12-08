package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.b;
import java.util.HashSet;
import java.util.Set;

final class ay
{
  private final az b;
  private final Set<ServiceConnection> c;
  private int d;
  private boolean e;
  private IBinder f;
  private final ax g;
  private ComponentName h;
  
  public ay(aw paramaw, ax paramax)
  {
    this.g = paramax;
    this.b = new az(this);
    this.c = new HashSet();
    this.d = 2;
  }
  
  public void a(ServiceConnection paramServiceConnection, String paramString)
  {
    aw.c(this.a).a(aw.b(this.a), paramServiceConnection, paramString, this.g.a());
    this.c.add(paramServiceConnection);
  }
  
  @TargetApi(14)
  public void a(String paramString)
  {
    this.d = 3;
    this.e = aw.c(this.a).a(aw.b(this.a), paramString, this.g.a(), this.b, 129);
    if (!this.e) {
      this.d = 2;
    }
    try
    {
      aw.c(this.a).a(aw.b(this.a), this.b);
      return;
    }
    catch (IllegalArgumentException paramString) {}
  }
  
  public boolean a()
  {
    return this.e;
  }
  
  public boolean a(ServiceConnection paramServiceConnection)
  {
    return this.c.contains(paramServiceConnection);
  }
  
  public int b()
  {
    return this.d;
  }
  
  public void b(ServiceConnection paramServiceConnection, String paramString)
  {
    aw.c(this.a).b(aw.b(this.a), paramServiceConnection);
    this.c.remove(paramServiceConnection);
  }
  
  public void b(String paramString)
  {
    aw.c(this.a).a(aw.b(this.a), this.b);
    this.e = false;
    this.d = 2;
  }
  
  public boolean c()
  {
    return this.c.isEmpty();
  }
  
  public IBinder d()
  {
    return this.f;
  }
  
  public ComponentName e()
  {
    return this.h;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */