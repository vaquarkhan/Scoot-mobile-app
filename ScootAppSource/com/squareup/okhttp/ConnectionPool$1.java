package com.squareup.okhttp;

class ConnectionPool$1
  implements Runnable
{
  ConnectionPool$1(ConnectionPool paramConnectionPool) {}
  
  public void run()
  {
    long l1;
    do
    {
      l1 = this.this$0.cleanup(System.nanoTime());
      if (l1 == -1L) {
        return;
      }
    } while (l1 <= 0L);
    long l2 = l1 / 1000000L;
    try
    {
      synchronized (this.this$0)
      {
        this.this$0.wait(l2, (int)(l1 - l2 * 1000000L));
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\ConnectionPool$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */