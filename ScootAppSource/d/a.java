package d;

import java.io.IOException;
import java.io.InterruptedIOException;

public class a
  extends ae
{
  private static a head;
  private boolean inQueue;
  private a next;
  private long timeoutAt;
  
  private static a awaitTimeout()
  {
    a locala1 = null;
    for (;;)
    {
      a locala2;
      try
      {
        locala2 = head.next;
        if (locala2 == null)
        {
          a.class.wait();
          return locala1;
        }
        long l1 = locala2.remainingNanos(System.nanoTime());
        if (l1 > 0L)
        {
          long l2 = l1 / 1000000L;
          a.class.wait(l2, (int)(l1 - 1000000L * l2));
          continue;
        }
        head.next = locala2.next;
      }
      finally {}
      locala2.next = null;
      Object localObject2 = locala2;
    }
  }
  
  /* Error */
  private static boolean cancelScheduledTimeout(a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 23	d/a:head	Ld/a;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +39 -> 47
    //   11: aload_2
    //   12: getfield 25	d/a:next	Ld/a;
    //   15: aload_0
    //   16: if_acmpne +23 -> 39
    //   19: aload_2
    //   20: aload_0
    //   21: getfield 25	d/a:next	Ld/a;
    //   24: putfield 25	d/a:next	Ld/a;
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 25	d/a:next	Ld/a;
    //   32: iconst_0
    //   33: istore_1
    //   34: ldc 2
    //   36: monitorexit
    //   37: iload_1
    //   38: ireturn
    //   39: aload_2
    //   40: getfield 25	d/a:next	Ld/a;
    //   43: astore_2
    //   44: goto -37 -> 7
    //   47: iconst_1
    //   48: istore_1
    //   49: goto -15 -> 34
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	parama	a
    //   33	16	1	bool	boolean
    //   6	38	2	locala	a
    // Exception table:
    //   from	to	target	type
    //   3	7	52	finally
    //   11	32	52	finally
    //   39	44	52	finally
  }
  
  private long remainingNanos(long paramLong)
  {
    return this.timeoutAt - paramLong;
  }
  
  private static void scheduleTimeout(a parama, long paramLong, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (head == null)
        {
          head = new a();
          new d().start();
        }
        long l = System.nanoTime();
        if ((paramLong != 0L) && (paramBoolean))
        {
          parama.timeoutAt = (Math.min(paramLong, parama.deadlineNanoTime() - l) + l);
          paramLong = parama.remainingNanos(l);
          locala = head;
          if ((locala.next != null) && (paramLong >= locala.next.remainingNanos(l))) {
            break label175;
          }
          parama.next = locala.next;
          locala.next = parama;
          if (locala == head) {
            a.class.notify();
          }
          return;
        }
        if (paramLong != 0L)
        {
          parama.timeoutAt = (l + paramLong);
          continue;
        }
        if (!paramBoolean) {
          break label167;
        }
      }
      finally {}
      parama.timeoutAt = parama.deadlineNanoTime();
      continue;
      label167:
      throw new AssertionError();
      label175:
      a locala = locala.next;
    }
  }
  
  public final void enter()
  {
    if (this.inQueue) {
      throw new IllegalStateException("Unbalanced enter/exit");
    }
    long l = timeoutNanos();
    boolean bool = hasDeadline();
    if ((l == 0L) && (!bool)) {
      return;
    }
    this.inQueue = true;
    scheduleTimeout(this, l, bool);
  }
  
  final IOException exit(IOException paramIOException)
  {
    if (!exit()) {
      return paramIOException;
    }
    return newTimeoutException(paramIOException);
  }
  
  final void exit(boolean paramBoolean)
  {
    if ((exit()) && (paramBoolean)) {
      throw newTimeoutException(null);
    }
  }
  
  public final boolean exit()
  {
    if (!this.inQueue) {
      return false;
    }
    this.inQueue = false;
    return cancelScheduledTimeout(this);
  }
  
  protected IOException newTimeoutException(IOException paramIOException)
  {
    InterruptedIOException localInterruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null) {
      localInterruptedIOException.initCause(paramIOException);
    }
    return localInterruptedIOException;
  }
  
  public final ac sink(ac paramac)
  {
    return new b(this, paramac);
  }
  
  public final ad source(ad paramad)
  {
    return new c(this, paramad);
  }
  
  protected void timedOut() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */