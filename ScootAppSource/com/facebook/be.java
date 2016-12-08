package com.facebook;

import android.os.Handler;

final class be
{
  private final GraphRequest a;
  private final Handler b;
  private final long c;
  private long d;
  private long e;
  private long f;
  
  be(Handler paramHandler, GraphRequest paramGraphRequest)
  {
    this.a = paramGraphRequest;
    this.b = paramHandler;
    this.c = w.h();
  }
  
  void a()
  {
    Object localObject;
    long l1;
    long l2;
    if (this.d > this.e)
    {
      localObject = this.a.g();
      if ((this.f > 0L) && ((localObject instanceof al)))
      {
        l1 = this.d;
        l2 = this.f;
        localObject = (al)localObject;
        if (this.b != null) {
          break label80;
        }
        ((al)localObject).a(l1, l2);
      }
    }
    for (;;)
    {
      this.e = this.d;
      return;
      label80:
      this.b.post(new bf(this, (al)localObject, l1, l2));
    }
  }
  
  void a(long paramLong)
  {
    this.d += paramLong;
    if ((this.d >= this.e + this.c) || (this.d >= this.f)) {
      a();
    }
  }
  
  void b(long paramLong)
  {
    this.f += paramLong;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */