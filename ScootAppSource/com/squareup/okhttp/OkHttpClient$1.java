package com.squareup.okhttp;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.io.RealConnection;
import javax.net.ssl.SSLSocket;

final class OkHttpClient$1
  extends Internal
{
  public void addLenient(Headers.Builder paramBuilder, String paramString)
  {
    paramBuilder.addLenient(paramString);
  }
  
  public void addLenient(Headers.Builder paramBuilder, String paramString1, String paramString2)
  {
    paramBuilder.addLenient(paramString1, paramString2);
  }
  
  public void apply(ConnectionSpec paramConnectionSpec, SSLSocket paramSSLSocket, boolean paramBoolean)
  {
    paramConnectionSpec.apply(paramSSLSocket, paramBoolean);
  }
  
  public StreamAllocation callEngineGetStreamAllocation(Call paramCall)
  {
    return paramCall.engine.streamAllocation;
  }
  
  public void callEnqueue(Call paramCall, Callback paramCallback, boolean paramBoolean)
  {
    paramCall.enqueue(paramCallback, paramBoolean);
  }
  
  public boolean connectionBecameIdle(ConnectionPool paramConnectionPool, RealConnection paramRealConnection)
  {
    return paramConnectionPool.connectionBecameIdle(paramRealConnection);
  }
  
  public RealConnection get(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation)
  {
    return paramConnectionPool.get(paramAddress, paramStreamAllocation);
  }
  
  public HttpUrl getHttpUrlChecked(String paramString)
  {
    return HttpUrl.getChecked(paramString);
  }
  
  public InternalCache internalCache(OkHttpClient paramOkHttpClient)
  {
    return paramOkHttpClient.internalCache();
  }
  
  public void put(ConnectionPool paramConnectionPool, RealConnection paramRealConnection)
  {
    paramConnectionPool.put(paramRealConnection);
  }
  
  public RouteDatabase routeDatabase(ConnectionPool paramConnectionPool)
  {
    return paramConnectionPool.routeDatabase;
  }
  
  public void setCache(OkHttpClient paramOkHttpClient, InternalCache paramInternalCache)
  {
    paramOkHttpClient.setInternalCache(paramInternalCache);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\OkHttpClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */