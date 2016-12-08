package com.squareup.okhttp.internal.framed;

import d.ad;
import d.ae;
import d.f;
import d.j;
import java.io.EOFException;
import java.io.IOException;

final class FramedStream$FramedDataSource
  implements ad
{
  private boolean closed;
  private boolean finished;
  private final long maxByteCount;
  private final f readBuffer = new f();
  private final f receiveBuffer = new f();
  
  static
  {
    if (!FramedStream.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  private FramedStream$FramedDataSource(FramedStream paramFramedStream, long paramLong)
  {
    this.maxByteCount = paramLong;
  }
  
  private void checkNotClosed()
  {
    if (this.closed) {
      throw new IOException("stream closed");
    }
    if (FramedStream.access$800(this.this$0) != null) {
      throw new IOException("stream was reset: " + FramedStream.access$800(this.this$0));
    }
  }
  
  /* Error */
  private void waitUntilReadable()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:this$0	Lcom/squareup/okhttp/internal/framed/FramedStream;
    //   4: invokestatic 90	com/squareup/okhttp/internal/framed/FramedStream:access$700	(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   7: invokevirtual 95	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:enter	()V
    //   10: aload_0
    //   11: getfield 43	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:readBuffer	Ld/f;
    //   14: invokevirtual 99	d/f:a	()J
    //   17: lconst_0
    //   18: lcmp
    //   19: ifne +50 -> 69
    //   22: aload_0
    //   23: getfield 52	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:finished	Z
    //   26: ifne +43 -> 69
    //   29: aload_0
    //   30: getfield 57	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:closed	Z
    //   33: ifne +36 -> 69
    //   36: aload_0
    //   37: getfield 34	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:this$0	Lcom/squareup/okhttp/internal/framed/FramedStream;
    //   40: invokestatic 69	com/squareup/okhttp/internal/framed/FramedStream:access$800	(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/ErrorCode;
    //   43: ifnonnull +26 -> 69
    //   46: aload_0
    //   47: getfield 34	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:this$0	Lcom/squareup/okhttp/internal/framed/FramedStream;
    //   50: invokestatic 103	com/squareup/okhttp/internal/framed/FramedStream:access$900	(Lcom/squareup/okhttp/internal/framed/FramedStream;)V
    //   53: goto -43 -> 10
    //   56: astore_1
    //   57: aload_0
    //   58: getfield 34	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:this$0	Lcom/squareup/okhttp/internal/framed/FramedStream;
    //   61: invokestatic 90	com/squareup/okhttp/internal/framed/FramedStream:access$700	(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   64: invokevirtual 106	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:exitAndThrowIfTimedOut	()V
    //   67: aload_1
    //   68: athrow
    //   69: aload_0
    //   70: getfield 34	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:this$0	Lcom/squareup/okhttp/internal/framed/FramedStream;
    //   73: invokestatic 90	com/squareup/okhttp/internal/framed/FramedStream:access$700	(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   76: invokevirtual 106	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:exitAndThrowIfTimedOut	()V
    //   79: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	FramedDataSource
    //   56	12	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	53	56	finally
  }
  
  public void close()
  {
    synchronized (this.this$0)
    {
      this.closed = true;
      this.readBuffer.t();
      this.this$0.notifyAll();
      FramedStream.access$1000(this.this$0);
      return;
    }
  }
  
  public long read(f arg1, long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("byteCount < 0: " + paramLong);
    }
    synchronized (this.this$0)
    {
      waitUntilReadable();
      checkNotClosed();
      if (this.readBuffer.a() == 0L) {
        return -1L;
      }
      paramLong = this.readBuffer.read(???, Math.min(paramLong, this.readBuffer.a()));
      ??? = this.this$0;
      ???.unacknowledgedBytesRead += paramLong;
      if (this.this$0.unacknowledgedBytesRead >= FramedStream.access$500(this.this$0).okHttpSettings.getInitialWindowSize(65536) / 2)
      {
        FramedStream.access$500(this.this$0).writeWindowUpdateLater(FramedStream.access$600(this.this$0), this.this$0.unacknowledgedBytesRead);
        this.this$0.unacknowledgedBytesRead = 0L;
      }
      synchronized (FramedStream.access$500(this.this$0))
      {
        ??? = FramedStream.access$500(this.this$0);
        ((FramedConnection)???).unacknowledgedBytesRead += paramLong;
        if (FramedStream.access$500(this.this$0).unacknowledgedBytesRead >= FramedStream.access$500(this.this$0).okHttpSettings.getInitialWindowSize(65536) / 2)
        {
          FramedStream.access$500(this.this$0).writeWindowUpdateLater(0, FramedStream.access$500(this.this$0).unacknowledgedBytesRead);
          FramedStream.access$500(this.this$0).unacknowledgedBytesRead = 0L;
        }
        return paramLong;
      }
    }
  }
  
  void receive(j paramj, long paramLong)
  {
    long l = paramLong;
    if (!$assertionsDisabled)
    {
      l = paramLong;
      if (Thread.holdsLock(this.this$0)) {
        throw new AssertionError();
      }
    }
    for (;;)
    {
      l -= paramLong;
      synchronized (this.this$0)
      {
        if (this.readBuffer.a() == 0L)
        {
          i = 1;
          this.readBuffer.a(this.receiveBuffer);
          if (i != 0) {
            this.this$0.notifyAll();
          }
          if (l > 0L) {}
          boolean bool;
          synchronized (this.this$0)
          {
            bool = this.finished;
            if (this.readBuffer.a() + l > this.maxByteCount)
            {
              i = 1;
              if (i != 0)
              {
                paramj.g(l);
                this.this$0.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
              }
            }
            else
            {
              i = 0;
            }
          }
          if (bool)
          {
            paramj.g(l);
            return;
          }
          paramLong = paramj.read(this.receiveBuffer, l);
          if (paramLong != -1L) {
            continue;
          }
          throw new EOFException();
        }
        int i = 0;
      }
    }
  }
  
  public ae timeout()
  {
    return FramedStream.access$700(this.this$0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedStream$FramedDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */