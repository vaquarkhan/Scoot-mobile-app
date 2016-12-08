package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Response.Builder;
import com.squareup.okhttp.ResponseBody;
import d.ac;

public abstract interface HttpStream
{
  public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
  
  public abstract void cancel();
  
  public abstract ac createRequestBody(Request paramRequest, long paramLong);
  
  public abstract void finishRequest();
  
  public abstract ResponseBody openResponseBody(Response paramResponse);
  
  public abstract Response.Builder readResponseHeaders();
  
  public abstract void setHttpEngine(HttpEngine paramHttpEngine);
  
  public abstract void writeRequestBody(RetryableSink paramRetryableSink);
  
  public abstract void writeRequestHeaders(Request paramRequest);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */