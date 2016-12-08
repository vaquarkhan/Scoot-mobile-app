package com.squareup.okhttp.internal.framed;

import d.a;
import java.io.IOException;
import java.net.SocketTimeoutException;

class FramedStream$StreamTimeout
  extends a
{
  FramedStream$StreamTimeout(FramedStream paramFramedStream) {}
  
  public void exitAndThrowIfTimedOut()
  {
    if (exit()) {
      throw newTimeoutException(null);
    }
  }
  
  protected IOException newTimeoutException(IOException paramIOException)
  {
    SocketTimeoutException localSocketTimeoutException = new SocketTimeoutException("timeout");
    if (paramIOException != null) {
      localSocketTimeoutException.initCause(paramIOException);
    }
    return localSocketTimeoutException;
  }
  
  protected void timedOut()
  {
    this.this$0.closeLater(ErrorCode.CANCEL);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedStream$StreamTimeout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */