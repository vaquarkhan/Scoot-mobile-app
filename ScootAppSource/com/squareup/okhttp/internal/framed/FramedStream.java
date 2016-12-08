package com.squareup.okhttp.internal.framed;

import d.ac;
import d.ad;
import d.ae;
import d.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public final class FramedStream
{
  long bytesLeftInWriteWindow;
  private final FramedConnection connection;
  private ErrorCode errorCode = null;
  private final int id;
  private final FramedStream.StreamTimeout readTimeout = new FramedStream.StreamTimeout(this);
  private final List<Header> requestHeaders;
  private List<Header> responseHeaders;
  final FramedStream.FramedDataSink sink;
  private final FramedStream.FramedDataSource source;
  long unacknowledgedBytesRead = 0L;
  private final FramedStream.StreamTimeout writeTimeout = new FramedStream.StreamTimeout(this);
  
  static
  {
    if (!FramedStream.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  FramedStream(int paramInt, FramedConnection paramFramedConnection, boolean paramBoolean1, boolean paramBoolean2, List<Header> paramList)
  {
    if (paramFramedConnection == null) {
      throw new NullPointerException("connection == null");
    }
    if (paramList == null) {
      throw new NullPointerException("requestHeaders == null");
    }
    this.id = paramInt;
    this.connection = paramFramedConnection;
    this.bytesLeftInWriteWindow = paramFramedConnection.peerSettings.getInitialWindowSize(65536);
    this.source = new FramedStream.FramedDataSource(this, paramFramedConnection.okHttpSettings.getInitialWindowSize(65536), null);
    this.sink = new FramedStream.FramedDataSink(this);
    FramedStream.FramedDataSource.access$102(this.source, paramBoolean2);
    FramedStream.FramedDataSink.access$202(this.sink, paramBoolean1);
    this.requestHeaders = paramList;
  }
  
  private void cancelStreamIfNecessary()
  {
    assert (!Thread.holdsLock(this));
    for (;;)
    {
      try
      {
        boolean bool;
        if ((!FramedStream.FramedDataSource.access$100(this.source)) && (FramedStream.FramedDataSource.access$300(this.source)))
        {
          if (FramedStream.FramedDataSink.access$200(this.sink)) {
            break label112;
          }
          if (FramedStream.FramedDataSink.access$400(this.sink))
          {
            break label112;
            bool = isOpen();
            if (i == 0) {
              break label95;
            }
            close(ErrorCode.CANCEL);
            return;
          }
        }
        i = 0;
        continue;
        if (bool) {
          continue;
        }
      }
      finally {}
      label95:
      this.connection.removeStream(this.id);
      return;
      label112:
      int i = 1;
    }
  }
  
  private void checkOutNotClosed()
  {
    if (FramedStream.FramedDataSink.access$400(this.sink)) {
      throw new IOException("stream closed");
    }
    if (FramedStream.FramedDataSink.access$200(this.sink)) {
      throw new IOException("stream finished");
    }
    if (this.errorCode != null) {
      throw new IOException("stream was reset: " + this.errorCode);
    }
  }
  
  private boolean closeInternal(ErrorCode paramErrorCode)
  {
    assert (!Thread.holdsLock(this));
    try
    {
      if (this.errorCode != null) {
        return false;
      }
      if ((FramedStream.FramedDataSource.access$100(this.source)) && (FramedStream.FramedDataSink.access$200(this.sink))) {
        return false;
      }
    }
    finally {}
    this.errorCode = paramErrorCode;
    notifyAll();
    this.connection.removeStream(this.id);
    return true;
  }
  
  private void waitForIo()
  {
    try
    {
      wait();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new InterruptedIOException();
    }
  }
  
  void addBytesToWriteWindow(long paramLong)
  {
    this.bytesLeftInWriteWindow += paramLong;
    if (paramLong > 0L) {
      notifyAll();
    }
  }
  
  public void close(ErrorCode paramErrorCode)
  {
    if (!closeInternal(paramErrorCode)) {
      return;
    }
    this.connection.writeSynReset(this.id, paramErrorCode);
  }
  
  public void closeLater(ErrorCode paramErrorCode)
  {
    if (!closeInternal(paramErrorCode)) {
      return;
    }
    this.connection.writeSynResetLater(this.id, paramErrorCode);
  }
  
  public FramedConnection getConnection()
  {
    return this.connection;
  }
  
  public ErrorCode getErrorCode()
  {
    try
    {
      ErrorCode localErrorCode = this.errorCode;
      return localErrorCode;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public List<Header> getRequestHeaders()
  {
    return this.requestHeaders;
  }
  
  /* Error */
  public List<Header> getResponseHeaders()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	com/squareup/okhttp/internal/framed/FramedStream:readTimeout	Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   6: invokevirtual 230	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:enter	()V
    //   9: aload_0
    //   10: getfield 232	com/squareup/okhttp/internal/framed/FramedStream:responseHeaders	Ljava/util/List;
    //   13: ifnonnull +32 -> 45
    //   16: aload_0
    //   17: getfield 54	com/squareup/okhttp/internal/framed/FramedStream:errorCode	Lcom/squareup/okhttp/internal/framed/ErrorCode;
    //   20: ifnonnull +25 -> 45
    //   23: aload_0
    //   24: invokespecial 130	com/squareup/okhttp/internal/framed/FramedStream:waitForIo	()V
    //   27: goto -18 -> 9
    //   30: astore_1
    //   31: aload_0
    //   32: getfield 50	com/squareup/okhttp/internal/framed/FramedStream:readTimeout	Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   35: invokevirtual 235	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:exitAndThrowIfTimedOut	()V
    //   38: aload_1
    //   39: athrow
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    //   45: aload_0
    //   46: getfield 50	com/squareup/okhttp/internal/framed/FramedStream:readTimeout	Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    //   49: invokevirtual 235	com/squareup/okhttp/internal/framed/FramedStream$StreamTimeout:exitAndThrowIfTimedOut	()V
    //   52: aload_0
    //   53: getfield 232	com/squareup/okhttp/internal/framed/FramedStream:responseHeaders	Ljava/util/List;
    //   56: ifnull +12 -> 68
    //   59: aload_0
    //   60: getfield 232	com/squareup/okhttp/internal/framed/FramedStream:responseHeaders	Ljava/util/List;
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: areturn
    //   68: new 171	java/io/IOException
    //   71: dup
    //   72: new 178	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 179	java/lang/StringBuilder:<init>	()V
    //   79: ldc -75
    //   81: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: aload_0
    //   85: getfield 54	com/squareup/okhttp/internal/framed/FramedStream:errorCode	Lcom/squareup/okhttp/internal/framed/ErrorCode;
    //   88: invokevirtual 188	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: invokespecial 174	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	FramedStream
    //   30	9	1	localObject1	Object
    //   40	4	1	localObject2	Object
    //   63	4	1	localList	List
    // Exception table:
    //   from	to	target	type
    //   9	27	30	finally
    //   2	9	40	finally
    //   31	40	40	finally
    //   45	64	40	finally
    //   68	98	40	finally
  }
  
  public ac getSink()
  {
    try
    {
      if ((this.responseHeaders == null) && (!isLocallyInitiated())) {
        throw new IllegalStateException("reply before requesting the sink");
      }
    }
    finally {}
    return this.sink;
  }
  
  public ad getSource()
  {
    return this.source;
  }
  
  public boolean isLocallyInitiated()
  {
    if ((this.id & 0x1) == 1) {}
    for (int i = 1; this.connection.client == i; i = 0) {
      return true;
    }
    return false;
  }
  
  /* Error */
  public boolean isOpen()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 54	com/squareup/okhttp/internal/framed/FramedStream:errorCode	Lcom/squareup/okhttp/internal/framed/ErrorCode;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield 92	com/squareup/okhttp/internal/framed/FramedStream:source	Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;
    //   21: invokestatic 143	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:access$100	(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z
    //   24: ifne +13 -> 37
    //   27: aload_0
    //   28: getfield 92	com/squareup/okhttp/internal/framed/FramedStream:source	Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;
    //   31: invokestatic 146	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSource:access$300	(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z
    //   34: ifeq +32 -> 66
    //   37: aload_0
    //   38: getfield 97	com/squareup/okhttp/internal/framed/FramedStream:sink	Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;
    //   41: invokestatic 150	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSink:access$200	(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z
    //   44: ifne +13 -> 57
    //   47: aload_0
    //   48: getfield 97	com/squareup/okhttp/internal/framed/FramedStream:sink	Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;
    //   51: invokestatic 153	com/squareup/okhttp/internal/framed/FramedStream$FramedDataSink:access$400	(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z
    //   54: ifeq +12 -> 66
    //   57: aload_0
    //   58: getfield 232	com/squareup/okhttp/internal/framed/FramedStream:responseHeaders	Ljava/util/List;
    //   61: astore_2
    //   62: aload_2
    //   63: ifnonnull -50 -> 13
    //   66: iconst_1
    //   67: istore_1
    //   68: goto -55 -> 13
    //   71: astore_2
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	FramedStream
    //   1	67	1	bool	boolean
    //   8	55	2	localObject1	Object
    //   71	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	71	finally
    //   17	37	71	finally
    //   37	57	71	finally
    //   57	62	71	finally
  }
  
  public ae readTimeout()
  {
    return this.readTimeout;
  }
  
  void receiveData(j paramj, int paramInt)
  {
    assert (!Thread.holdsLock(this));
    this.source.receive(paramj, paramInt);
  }
  
  void receiveFin()
  {
    assert (!Thread.holdsLock(this));
    try
    {
      FramedStream.FramedDataSource.access$102(this.source, true);
      boolean bool = isOpen();
      notifyAll();
      if (!bool) {
        this.connection.removeStream(this.id);
      }
      return;
    }
    finally {}
  }
  
  void receiveHeaders(List<Header> paramList, HeadersMode paramHeadersMode)
  {
    assert (!Thread.holdsLock(this));
    Object localObject = null;
    boolean bool = true;
    label97:
    do
    {
      for (;;)
      {
        try
        {
          if (this.responseHeaders == null)
          {
            if (paramHeadersMode.failIfHeadersAbsent())
            {
              paramList = ErrorCode.PROTOCOL_ERROR;
              if (paramList == null) {
                break;
              }
              closeLater(paramList);
              return;
            }
            this.responseHeaders = paramList;
            bool = isOpen();
            notifyAll();
            paramList = (List<Header>)localObject;
            continue;
          }
          if (!paramHeadersMode.failIfHeadersPresent()) {
            break label97;
          }
        }
        finally {}
        paramList = ErrorCode.STREAM_IN_USE;
        continue;
        paramHeadersMode = new ArrayList();
        paramHeadersMode.addAll(this.responseHeaders);
        paramHeadersMode.addAll(paramList);
        this.responseHeaders = paramHeadersMode;
        paramList = (List<Header>)localObject;
      }
    } while (bool);
    this.connection.removeStream(this.id);
  }
  
  void receiveRstStream(ErrorCode paramErrorCode)
  {
    try
    {
      if (this.errorCode == null)
      {
        this.errorCode = paramErrorCode;
        notifyAll();
      }
      return;
    }
    finally
    {
      paramErrorCode = finally;
      throw paramErrorCode;
    }
  }
  
  public void reply(List<Header> paramList, boolean paramBoolean)
  {
    boolean bool = true;
    assert (!Thread.holdsLock(this));
    if (paramList == null) {
      try
      {
        throw new NullPointerException("responseHeaders == null");
      }
      finally {}
    }
    if (this.responseHeaders != null) {
      throw new IllegalStateException("reply already sent");
    }
    this.responseHeaders = paramList;
    if (!paramBoolean) {
      FramedStream.FramedDataSink.access$202(this.sink, true);
    }
    for (paramBoolean = bool;; paramBoolean = false)
    {
      this.connection.writeSynReply(this.id, paramBoolean, paramList);
      if (paramBoolean) {
        this.connection.flush();
      }
      return;
    }
  }
  
  public ae writeTimeout()
  {
    return this.writeTimeout;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */