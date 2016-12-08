package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.a.c;
import com.google.android.gms.common.internal.b;

final class s
{
  private final c a;
  private long b;
  
  public s(c paramc)
  {
    b.a(paramc);
    this.a = paramc;
  }
  
  public s(c paramc, long paramLong)
  {
    b.a(paramc);
    this.a = paramc;
    this.b = paramLong;
  }
  
  public void a()
  {
    this.b = this.a.b();
  }
  
  public boolean a(long paramLong)
  {
    if (this.b == 0L) {}
    while (this.a.b() - this.b > paramLong) {
      return true;
    }
    return false;
  }
  
  public void b()
  {
    this.b = 0L;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */