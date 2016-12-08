package com.c.a.c;

import java.util.concurrent.CountDownLatch;

final class u
{
  private boolean a = false;
  private final CountDownLatch b = new CountDownLatch(1);
  
  void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b.countDown();
  }
  
  boolean a()
  {
    return this.a;
  }
  
  void b()
  {
    try
    {
      this.b.await();
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */