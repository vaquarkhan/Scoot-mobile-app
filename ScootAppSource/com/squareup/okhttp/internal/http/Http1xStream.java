package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Headers.Builder;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Response.Builder;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.io.RealConnection;
import d.ac;
import d.ad;
import d.ae;
import d.i;
import d.j;
import d.o;
import d.r;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

public final class Http1xStream
  implements HttpStream
{
  private static final int STATE_CLOSED = 6;
  private static final int STATE_IDLE = 0;
  private static final int STATE_OPEN_REQUEST_BODY = 1;
  private static final int STATE_OPEN_RESPONSE_BODY = 4;
  private static final int STATE_READING_RESPONSE_BODY = 5;
  private static final int STATE_READ_RESPONSE_HEADERS = 3;
  private static final int STATE_WRITING_REQUEST_BODY = 2;
  private HttpEngine httpEngine;
  private final i sink;
  private final j source;
  private int state = 0;
  private final StreamAllocation streamAllocation;
  
  public Http1xStream(StreamAllocation paramStreamAllocation, j paramj, i parami)
  {
    this.streamAllocation = paramStreamAllocation;
    this.source = paramj;
    this.sink = parami;
  }
  
  private void detachTimeout(o paramo)
  {
    ae localae = paramo.a();
    paramo.a(ae.NONE);
    localae.clearDeadline();
    localae.clearTimeout();
  }
  
  private ad getTransferStream(Response paramResponse)
  {
    if (!HttpEngine.hasBody(paramResponse)) {
      return newFixedLengthSource(0L);
    }
    if ("chunked".equalsIgnoreCase(paramResponse.header("Transfer-Encoding"))) {
      return newChunkedSource(this.httpEngine);
    }
    long l = OkHeaders.contentLength(paramResponse);
    if (l != -1L) {
      return newFixedLengthSource(l);
    }
    return newUnknownLengthSource();
  }
  
  public void cancel()
  {
    RealConnection localRealConnection = this.streamAllocation.connection();
    if (localRealConnection != null) {
      localRealConnection.cancel();
    }
  }
  
  public ac createRequestBody(Request paramRequest, long paramLong)
  {
    if ("chunked".equalsIgnoreCase(paramRequest.header("Transfer-Encoding"))) {
      return newChunkedSink();
    }
    if (paramLong != -1L) {
      return newFixedLengthSink(paramLong);
    }
    throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
  }
  
  public void finishRequest()
  {
    this.sink.flush();
  }
  
  public boolean isClosed()
  {
    return this.state == 6;
  }
  
  public ac newChunkedSink()
  {
    if (this.state != 1) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.state = 2;
    return new Http1xStream.ChunkedSink(this, null);
  }
  
  public ad newChunkedSource(HttpEngine paramHttpEngine)
  {
    if (this.state != 4) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.state = 5;
    return new Http1xStream.ChunkedSource(this, paramHttpEngine);
  }
  
  public ac newFixedLengthSink(long paramLong)
  {
    if (this.state != 1) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.state = 2;
    return new Http1xStream.FixedLengthSink(this, paramLong, null);
  }
  
  public ad newFixedLengthSource(long paramLong)
  {
    if (this.state != 4) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.state = 5;
    return new Http1xStream.FixedLengthSource(this, paramLong);
  }
  
  public ad newUnknownLengthSource()
  {
    if (this.state != 4) {
      throw new IllegalStateException("state: " + this.state);
    }
    if (this.streamAllocation == null) {
      throw new IllegalStateException("streamAllocation == null");
    }
    this.state = 5;
    this.streamAllocation.noNewStreams();
    return new Http1xStream.UnknownLengthSource(this, null);
  }
  
  public ResponseBody openResponseBody(Response paramResponse)
  {
    ad localad = getTransferStream(paramResponse);
    return new RealResponseBody(paramResponse.headers(), r.a(localad));
  }
  
  public Headers readHeaders()
  {
    Headers.Builder localBuilder = new Headers.Builder();
    for (;;)
    {
      String str = this.source.r();
      if (str.length() == 0) {
        break;
      }
      Internal.instance.addLenient(localBuilder, str);
    }
    return localBuilder.build();
  }
  
  public Response.Builder readResponse()
  {
    if ((this.state != 1) && (this.state != 3)) {
      throw new IllegalStateException("state: " + this.state);
    }
    try
    {
      StatusLine localStatusLine;
      do
      {
        localStatusLine = StatusLine.parse(this.source.r());
        localObject = new Response.Builder().protocol(localStatusLine.protocol).code(localStatusLine.code).message(localStatusLine.message).headers(readHeaders());
      } while (localStatusLine.code == 100);
      this.state = 4;
      return (Response.Builder)localObject;
    }
    catch (EOFException localEOFException)
    {
      Object localObject = new IOException("unexpected end of stream on " + this.streamAllocation);
      ((IOException)localObject).initCause(localEOFException);
      throw ((Throwable)localObject);
    }
  }
  
  public Response.Builder readResponseHeaders()
  {
    return readResponse();
  }
  
  public void setHttpEngine(HttpEngine paramHttpEngine)
  {
    this.httpEngine = paramHttpEngine;
  }
  
  public void writeRequest(Headers paramHeaders, String paramString)
  {
    if (this.state != 0) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.sink.b(paramString).b("\r\n");
    int i = 0;
    int j = paramHeaders.size();
    while (i < j)
    {
      this.sink.b(paramHeaders.name(i)).b(": ").b(paramHeaders.value(i)).b("\r\n");
      i += 1;
    }
    this.sink.b("\r\n");
    this.state = 1;
  }
  
  public void writeRequestBody(RetryableSink paramRetryableSink)
  {
    if (this.state != 1) {
      throw new IllegalStateException("state: " + this.state);
    }
    this.state = 3;
    paramRetryableSink.writeToSocket(this.sink);
  }
  
  public void writeRequestHeaders(Request paramRequest)
  {
    this.httpEngine.writingRequestHeaders();
    String str = RequestLine.get(paramRequest, this.httpEngine.getConnection().getRoute().getProxy().type());
    writeRequest(paramRequest.headers(), str);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http1xStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */