package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class a
  extends Thread
{
  CountDownLatch a;
  boolean b;
  private WeakReference<AdvertisingIdClient> c;
  private long d;
  
  public a(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
  {
    this.c = new WeakReference(paramAdvertisingIdClient);
    this.d = paramLong;
    this.a = new CountDownLatch(1);
    this.b = false;
    start();
  }
  
  private void c()
  {
    AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.c.get();
    if (localAdvertisingIdClient != null)
    {
      localAdvertisingIdClient.finish();
      this.b = true;
    }
  }
  
  public void a()
  {
    this.a.countDown();
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public void run()
  {
    try
    {
      if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
        c();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      c();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\ads\identifier\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */