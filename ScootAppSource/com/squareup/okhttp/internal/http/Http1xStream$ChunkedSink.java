package com.squareup.okhttp.internal.http;

import d.ac;
import d.ae;
import d.f;
import d.i;
import d.o;

final class Http1xStream$ChunkedSink
  implements ac
{
  private boolean closed;
  private final o timeout = new o(Http1xStream.access$300(this.this$0).timeout());
  
  private Http1xStream$ChunkedSink(Http1xStream paramHttp1xStream) {}
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:closed	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:closed	Z
    //   19: aload_0
    //   20: getfield 16	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:this$0	Lcom/squareup/okhttp/internal/http/Http1xStream;
    //   23: invokestatic 27	com/squareup/okhttp/internal/http/Http1xStream:access$300	(Lcom/squareup/okhttp/internal/http/Http1xStream;)Ld/i;
    //   26: ldc 46
    //   28: invokeinterface 50 2 0
    //   33: pop
    //   34: aload_0
    //   35: getfield 16	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:this$0	Lcom/squareup/okhttp/internal/http/Http1xStream;
    //   38: aload_0
    //   39: getfield 37	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:timeout	Ld/o;
    //   42: invokestatic 54	com/squareup/okhttp/internal/http/Http1xStream:access$400	(Lcom/squareup/okhttp/internal/http/Http1xStream;Ld/o;)V
    //   45: aload_0
    //   46: getfield 16	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:this$0	Lcom/squareup/okhttp/internal/http/Http1xStream;
    //   49: iconst_3
    //   50: invokestatic 58	com/squareup/okhttp/internal/http/Http1xStream:access$502	(Lcom/squareup/okhttp/internal/http/Http1xStream;I)I
    //   53: pop
    //   54: goto -43 -> 11
    //   57: astore_2
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_2
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	ChunkedSink
    //   6	2	1	bool	boolean
    //   57	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	57	finally
    //   14	54	57	finally
  }
  
  /* Error */
  public void flush()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:closed	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 16	com/squareup/okhttp/internal/http/Http1xStream$ChunkedSink:this$0	Lcom/squareup/okhttp/internal/http/Http1xStream;
    //   18: invokestatic 27	com/squareup/okhttp/internal/http/Http1xStream:access$300	(Lcom/squareup/okhttp/internal/http/Http1xStream;)Ld/i;
    //   21: invokeinterface 61 1 0
    //   26: goto -15 -> 11
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	ChunkedSink
    //   6	2	1	bool	boolean
    //   29	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
    //   14	26	29	finally
  }
  
  public ae timeout()
  {
    return this.timeout;
  }
  
  public void write(f paramf, long paramLong)
  {
    if (this.closed) {
      throw new IllegalStateException("closed");
    }
    if (paramLong == 0L) {
      return;
    }
    Http1xStream.access$300(this.this$0).j(paramLong);
    Http1xStream.access$300(this.this$0).b("\r\n");
    Http1xStream.access$300(this.this$0).write(paramf, paramLong);
    Http1xStream.access$300(this.this$0).b("\r\n");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http1xStream$ChunkedSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */