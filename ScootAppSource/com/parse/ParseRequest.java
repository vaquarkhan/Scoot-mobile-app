package com.parse;

import a.o;
import android.os.Build.VERSION;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpRequest.Builder;
import com.parse.http.ParseHttpRequest.Method;
import com.parse.http.ParseHttpResponse;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

abstract class ParseRequest<Response>
{
  private static final int CORE_POOL_SIZE = CPU_COUNT * 2 + 1;
  private static final int CPU_COUNT;
  static final long DEFAULT_INITIAL_RETRY_DELAY = 1000L;
  protected static final int DEFAULT_MAX_RETRIES = 4;
  private static final long KEEP_ALIVE_TIME = 1L;
  private static final int MAX_POOL_SIZE = CPU_COUNT * 2 * 2 + 1;
  private static final int MAX_QUEUE_SIZE = 128;
  static final ExecutorService NETWORK_EXECUTOR = newThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), sThreadFactory);
  private static long defaultInitialRetryDelay = 1000L;
  private static final ThreadFactory sThreadFactory = new ParseRequest.1();
  private int maxRetries = 4;
  ParseHttpRequest.Method method;
  String url;
  
  static
  {
    CPU_COUNT = Runtime.getRuntime().availableProcessors();
  }
  
  public ParseRequest(ParseHttpRequest.Method paramMethod, String paramString)
  {
    this.method = paramMethod;
    this.url = paramString;
  }
  
  public ParseRequest(String paramString)
  {
    this(ParseHttpRequest.Method.GET, paramString);
  }
  
  private o<Response> executeAsync(ParseHttpClient paramParseHttpClient, ParseHttpRequest paramParseHttpRequest, int paramInt, long paramLong, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    if ((paramo != null) && (paramo.d())) {
      return o.i();
    }
    return sendOneRequestAsync(paramParseHttpClient, paramParseHttpRequest, paramProgressCallback).b(new ParseRequest.4(this, paramo, paramInt, paramLong, paramParseHttpClient, paramParseHttpRequest, paramProgressCallback));
  }
  
  private o<Response> executeAsync(ParseHttpClient paramParseHttpClient, ParseHttpRequest paramParseHttpRequest, ProgressCallback paramProgressCallback, o<Void> paramo)
  {
    return executeAsync(paramParseHttpClient, paramParseHttpRequest, 0, defaultInitialRetryDelay + (defaultInitialRetryDelay * Math.random()), paramProgressCallback, paramo);
  }
  
  public static long getDefaultInitialRetryDelay()
  {
    return defaultInitialRetryDelay;
  }
  
  private static ThreadPoolExecutor newThreadPoolExecutor(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    paramTimeUnit = new ThreadPoolExecutor(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
    if (Build.VERSION.SDK_INT >= 9) {
      paramTimeUnit.allowCoreThreadTimeOut(true);
    }
    return paramTimeUnit;
  }
  
  private o<Response> sendOneRequestAsync(ParseHttpClient paramParseHttpClient, ParseHttpRequest paramParseHttpRequest, ProgressCallback paramProgressCallback)
  {
    return o.a(null).d(new ParseRequest.3(this, paramParseHttpClient, paramParseHttpRequest, paramProgressCallback), NETWORK_EXECUTOR).b(new ParseRequest.2(this), o.a);
  }
  
  public static void setDefaultInitialRetryDelay(long paramLong)
  {
    defaultInitialRetryDelay = paramLong;
  }
  
  public o<Response> executeAsync(ParseHttpClient paramParseHttpClient)
  {
    return executeAsync(paramParseHttpClient, (ProgressCallback)null, null, null);
  }
  
  public o<Response> executeAsync(ParseHttpClient paramParseHttpClient, o<Void> paramo)
  {
    return executeAsync(paramParseHttpClient, (ProgressCallback)null, null, paramo);
  }
  
  public o<Response> executeAsync(ParseHttpClient paramParseHttpClient, ProgressCallback paramProgressCallback1, ProgressCallback paramProgressCallback2)
  {
    return executeAsync(paramParseHttpClient, paramProgressCallback1, paramProgressCallback2, null);
  }
  
  public o<Response> executeAsync(ParseHttpClient paramParseHttpClient, ProgressCallback paramProgressCallback1, ProgressCallback paramProgressCallback2, o<Void> paramo)
  {
    return executeAsync(paramParseHttpClient, newRequest(this.method, this.url, paramProgressCallback1), paramProgressCallback2, paramo);
  }
  
  protected ParseHttpBody newBody(ProgressCallback paramProgressCallback)
  {
    return null;
  }
  
  protected ParseException newPermanentException(int paramInt, String paramString)
  {
    paramString = new ParseRequest.ParseRequestException(paramInt, paramString);
    paramString.isPermanentFailure = true;
    return paramString;
  }
  
  protected ParseHttpRequest newRequest(ParseHttpRequest.Method paramMethod, String paramString, ProgressCallback paramProgressCallback)
  {
    paramString = new ParseHttpRequest.Builder().setMethod(paramMethod).setUrl(paramString);
    switch (ParseRequest.5.$SwitchMap$com$parse$http$ParseHttpRequest$Method[paramMethod.ordinal()])
    {
    default: 
      throw new IllegalStateException("Invalid method " + paramMethod);
    case 3: 
    case 4: 
      paramString.setBody(newBody(paramProgressCallback));
    }
    return paramString.build();
  }
  
  protected ParseException newTemporaryException(int paramInt, String paramString)
  {
    paramString = new ParseRequest.ParseRequestException(paramInt, paramString);
    paramString.isPermanentFailure = false;
    return paramString;
  }
  
  protected ParseException newTemporaryException(String paramString, Throwable paramThrowable)
  {
    paramString = new ParseRequest.ParseRequestException(100, paramString, paramThrowable);
    paramString.isPermanentFailure = false;
    return paramString;
  }
  
  protected abstract o<Response> onResponseAsync(ParseHttpResponse paramParseHttpResponse, ProgressCallback paramProgressCallback);
  
  public void setMaxRetries(int paramInt)
  {
    this.maxRetries = paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */