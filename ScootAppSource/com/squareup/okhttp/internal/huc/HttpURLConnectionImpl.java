package com.squareup.okhttp.internal.huc;

import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Headers.Builder;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.http.HttpDate;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RetryableSink;
import com.squareup.okhttp.internal.http.StatusLine;
import com.squareup.okhttp.internal.http.StreamAllocation;
import d.ac;
import d.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HttpURLConnectionImpl
  extends HttpURLConnection
{
  private static final RequestBody EMPTY_REQUEST_BODY = RequestBody.create(null, new byte[0]);
  private static final Set<String> METHODS = new LinkedHashSet(Arrays.asList(new String[] { "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH" }));
  final OkHttpClient client;
  private long fixedContentLength = -1L;
  private int followUpCount;
  Handshake handshake;
  protected HttpEngine httpEngine;
  protected IOException httpEngineFailure;
  private Headers.Builder requestHeaders = new Headers.Builder();
  private Headers responseHeaders;
  private Route route;
  
  public HttpURLConnectionImpl(URL paramURL, OkHttpClient paramOkHttpClient)
  {
    super(paramURL);
    this.client = paramOkHttpClient;
  }
  
  private String defaultUserAgent()
  {
    String str = System.getProperty("http.agent");
    if (str != null) {
      return Util.toHumanReadableAscii(str);
    }
    return Version.userAgent();
  }
  
  /* Error */
  private boolean execute(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   6: invokevirtual 121	com/squareup/okhttp/internal/http/HttpEngine:sendRequest	()V
    //   9: aload_0
    //   10: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   13: invokevirtual 125	com/squareup/okhttp/internal/http/HttpEngine:getConnection	()Lcom/squareup/okhttp/Connection;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +36 -> 54
    //   21: aload_0
    //   22: aload_3
    //   23: invokeinterface 131 1 0
    //   28: putfield 133	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:route	Lcom/squareup/okhttp/Route;
    //   31: aload_0
    //   32: aload_3
    //   33: invokeinterface 137 1 0
    //   38: putfield 139	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:handshake	Lcom/squareup/okhttp/Handshake;
    //   41: iload_1
    //   42: ifeq +128 -> 170
    //   45: aload_0
    //   46: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   49: invokevirtual 142	com/squareup/okhttp/internal/http/HttpEngine:readResponse	()V
    //   52: iconst_1
    //   53: ireturn
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 133	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:route	Lcom/squareup/okhttp/Route;
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 139	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:handshake	Lcom/squareup/okhttp/Handshake;
    //   64: goto -23 -> 41
    //   67: astore_3
    //   68: aload_3
    //   69: invokevirtual 146	com/squareup/okhttp/internal/http/RequestException:getCause	()Ljava/io/IOException;
    //   72: astore_3
    //   73: aload_0
    //   74: aload_3
    //   75: putfield 148	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngineFailure	Ljava/io/IOException;
    //   78: aload_3
    //   79: athrow
    //   80: astore_3
    //   81: iconst_1
    //   82: istore_2
    //   83: iload_2
    //   84: ifeq +13 -> 97
    //   87: aload_0
    //   88: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   91: invokevirtual 152	com/squareup/okhttp/internal/http/HttpEngine:close	()Lcom/squareup/okhttp/internal/http/StreamAllocation;
    //   94: invokevirtual 157	com/squareup/okhttp/internal/http/StreamAllocation:release	()V
    //   97: aload_3
    //   98: athrow
    //   99: astore_3
    //   100: aload_0
    //   101: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   104: aload_3
    //   105: invokevirtual 161	com/squareup/okhttp/internal/http/HttpEngine:recover	(Lcom/squareup/okhttp/internal/http/RouteException;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   108: astore 4
    //   110: aload 4
    //   112: ifnull +11 -> 123
    //   115: aload_0
    //   116: aload 4
    //   118: putfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   121: iconst_0
    //   122: ireturn
    //   123: aload_3
    //   124: invokevirtual 164	com/squareup/okhttp/internal/http/RouteException:getLastConnectException	()Ljava/io/IOException;
    //   127: astore_3
    //   128: aload_0
    //   129: aload_3
    //   130: putfield 148	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngineFailure	Ljava/io/IOException;
    //   133: aload_3
    //   134: athrow
    //   135: astore_3
    //   136: aload_0
    //   137: getfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   140: aload_3
    //   141: invokevirtual 167	com/squareup/okhttp/internal/http/HttpEngine:recover	(Ljava/io/IOException;)Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   144: astore 4
    //   146: aload 4
    //   148: ifnull +11 -> 159
    //   151: aload_0
    //   152: aload 4
    //   154: putfield 116	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngine	Lcom/squareup/okhttp/internal/http/HttpEngine;
    //   157: iconst_0
    //   158: ireturn
    //   159: aload_0
    //   160: aload_3
    //   161: putfield 148	com/squareup/okhttp/internal/huc/HttpURLConnectionImpl:httpEngineFailure	Ljava/io/IOException;
    //   164: aload_3
    //   165: athrow
    //   166: astore_3
    //   167: goto -84 -> 83
    //   170: iconst_1
    //   171: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	HttpURLConnectionImpl
    //   0	172	1	paramBoolean	boolean
    //   1	83	2	i	int
    //   16	17	3	localConnection	com.squareup.okhttp.Connection
    //   67	2	3	localRequestException	com.squareup.okhttp.internal.http.RequestException
    //   72	7	3	localIOException1	IOException
    //   80	18	3	localObject1	Object
    //   99	25	3	localRouteException	com.squareup.okhttp.internal.http.RouteException
    //   127	7	3	localIOException2	IOException
    //   135	30	3	localIOException3	IOException
    //   166	1	3	localObject2	Object
    //   108	45	4	localHttpEngine	HttpEngine
    // Exception table:
    //   from	to	target	type
    //   2	17	67	com/squareup/okhttp/internal/http/RequestException
    //   21	41	67	com/squareup/okhttp/internal/http/RequestException
    //   45	52	67	com/squareup/okhttp/internal/http/RequestException
    //   54	64	67	com/squareup/okhttp/internal/http/RequestException
    //   2	17	80	finally
    //   21	41	80	finally
    //   45	52	80	finally
    //   54	64	80	finally
    //   68	80	80	finally
    //   100	110	80	finally
    //   123	135	80	finally
    //   136	146	80	finally
    //   159	166	80	finally
    //   2	17	99	com/squareup/okhttp/internal/http/RouteException
    //   21	41	99	com/squareup/okhttp/internal/http/RouteException
    //   45	52	99	com/squareup/okhttp/internal/http/RouteException
    //   54	64	99	com/squareup/okhttp/internal/http/RouteException
    //   2	17	135	java/io/IOException
    //   21	41	135	java/io/IOException
    //   45	52	135	java/io/IOException
    //   54	64	135	java/io/IOException
    //   115	121	166	finally
    //   151	157	166	finally
  }
  
  private Headers getHeaders()
  {
    if (this.responseHeaders == null)
    {
      Response localResponse = getResponse().getResponse();
      this.responseHeaders = localResponse.headers().newBuilder().add(OkHeaders.SELECTED_PROTOCOL, localResponse.protocol().toString()).add(OkHeaders.RESPONSE_SOURCE, responseSourceHeader(localResponse)).build();
    }
    return this.responseHeaders;
  }
  
  private HttpEngine getResponse()
  {
    initHttpEngine();
    if (this.httpEngine.hasResponse()) {
      return this.httpEngine;
    }
    for (;;)
    {
      if (execute(true))
      {
        Response localResponse = this.httpEngine.getResponse();
        Request localRequest = this.httpEngine.followUpRequest();
        if (localRequest == null)
        {
          this.httpEngine.releaseStreamAllocation();
          return this.httpEngine;
        }
        int i = this.followUpCount + 1;
        this.followUpCount = i;
        if (i > 20) {
          throw new ProtocolException("Too many follow-up requests: " + this.followUpCount);
        }
        this.url = localRequest.url();
        this.requestHeaders = localRequest.headers().newBuilder();
        ac localac = this.httpEngine.getRequestBody();
        if (!localRequest.method().equals(this.method)) {
          localac = null;
        }
        if ((localac != null) && (!(localac instanceof RetryableSink))) {
          throw new HttpRetryException("Cannot retry streamed HTTP body", this.responseCode);
        }
        StreamAllocation localStreamAllocation2 = this.httpEngine.close();
        StreamAllocation localStreamAllocation1 = localStreamAllocation2;
        if (!this.httpEngine.sameConnection(localRequest.httpUrl()))
        {
          localStreamAllocation2.release();
          localStreamAllocation1 = null;
        }
        this.httpEngine = newHttpEngine(localRequest.method(), localStreamAllocation1, (RetryableSink)localac, localResponse);
      }
    }
  }
  
  private void initHttpEngine()
  {
    if (this.httpEngineFailure != null) {
      throw this.httpEngineFailure;
    }
    if (this.httpEngine != null) {
      return;
    }
    this.connected = true;
    do
    {
      try
      {
        if (this.doOutput)
        {
          if (this.method.equals("GET")) {
            this.method = "POST";
          }
        }
        else
        {
          this.httpEngine = newHttpEngine(this.method, null, null, null);
          return;
        }
      }
      catch (IOException localIOException)
      {
        this.httpEngineFailure = localIOException;
        throw localIOException;
      }
    } while (HttpMethod.permitsRequestBody(this.method));
    throw new ProtocolException(this.method + " does not support writing");
  }
  
  private HttpEngine newHttpEngine(String paramString, StreamAllocation paramStreamAllocation, RetryableSink paramRetryableSink, Response paramResponse)
  {
    if (HttpMethod.requiresRequestBody(paramString)) {}
    Object localObject2;
    for (Object localObject1 = EMPTY_REQUEST_BODY;; localObject1 = null)
    {
      localObject2 = getURL();
      localObject2 = Internal.instance.getHttpUrlChecked(((URL)localObject2).toString());
      localObject1 = new Request.Builder().url((HttpUrl)localObject2).method(paramString, (RequestBody)localObject1);
      localObject2 = this.requestHeaders.build();
      int i = 0;
      int j = ((Headers)localObject2).size();
      while (i < j)
      {
        ((Request.Builder)localObject1).addHeader(((Headers)localObject2).name(i), ((Headers)localObject2).value(i));
        i += 1;
      }
    }
    boolean bool2 = false;
    boolean bool1 = false;
    if (HttpMethod.permitsRequestBody(paramString))
    {
      if (this.fixedContentLength == -1L) {
        break label275;
      }
      ((Request.Builder)localObject1).header("Content-Length", Long.toString(this.fixedContentLength));
    }
    for (;;)
    {
      bool2 = bool1;
      if (((Headers)localObject2).get("Content-Type") == null)
      {
        ((Request.Builder)localObject1).header("Content-Type", "application/x-www-form-urlencoded");
        bool2 = bool1;
      }
      if (((Headers)localObject2).get("User-Agent") == null) {
        ((Request.Builder)localObject1).header("User-Agent", defaultUserAgent());
      }
      localObject2 = ((Request.Builder)localObject1).build();
      localObject1 = this.client;
      paramString = (String)localObject1;
      if (Internal.instance.internalCache((OkHttpClient)localObject1) != null)
      {
        paramString = (String)localObject1;
        if (!getUseCaches()) {
          paramString = this.client.clone().setCache(null);
        }
      }
      return new HttpEngine(paramString, (Request)localObject2, bool2, true, false, paramStreamAllocation, paramRetryableSink, paramResponse);
      label275:
      if (this.chunkLength > 0) {
        ((Request.Builder)localObject1).header("Transfer-Encoding", "chunked");
      } else {
        bool1 = true;
      }
    }
  }
  
  private static String responseSourceHeader(Response paramResponse)
  {
    if (paramResponse.networkResponse() == null)
    {
      if (paramResponse.cacheResponse() == null) {
        return "NONE";
      }
      return "CACHE " + paramResponse.code();
    }
    if (paramResponse.cacheResponse() == null) {
      return "NETWORK " + paramResponse.code();
    }
    return "CONDITIONAL_CACHE " + paramResponse.networkResponse().code();
  }
  
  private void setProtocols(String paramString, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean) {
      localArrayList.addAll(this.client.getProtocols());
    }
    paramString = paramString.split(",", -1);
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramString[i];
      try
      {
        localArrayList.add(Protocol.get(str));
        i += 1;
      }
      catch (IOException paramString)
      {
        throw new IllegalStateException(paramString);
      }
    }
    this.client.setProtocols(localArrayList);
  }
  
  public final void addRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot add request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      Platform.get().logW("Ignoring header " + paramString1 + " because its value was null.");
      return;
    }
    if (("X-Android-Transports".equals(paramString1)) || ("X-Android-Protocols".equals(paramString1)))
    {
      setProtocols(paramString2, true);
      return;
    }
    this.requestHeaders.add(paramString1, paramString2);
  }
  
  public final void connect()
  {
    initHttpEngine();
    while (!execute(false)) {}
  }
  
  public final void disconnect()
  {
    if (this.httpEngine == null) {
      return;
    }
    this.httpEngine.cancel();
  }
  
  public int getConnectTimeout()
  {
    return this.client.getConnectTimeout();
  }
  
  public final InputStream getErrorStream()
  {
    Object localObject2 = null;
    try
    {
      HttpEngine localHttpEngine = getResponse();
      Object localObject1 = localObject2;
      if (HttpEngine.hasBody(localHttpEngine.getResponse()))
      {
        localObject1 = localObject2;
        if (localHttpEngine.getResponse().code() >= 400) {
          localObject1 = localHttpEngine.getResponse().body().byteStream();
        }
      }
      return (InputStream)localObject1;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final String getHeaderField(int paramInt)
  {
    try
    {
      String str = getHeaders().value(paramInt);
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final String getHeaderField(String paramString)
  {
    if (paramString == null) {}
    try
    {
      return StatusLine.get(getResponse().getResponse()).toString();
    }
    catch (IOException paramString) {}
    paramString = getHeaders().get(paramString);
    return paramString;
    return null;
  }
  
  public final String getHeaderFieldKey(int paramInt)
  {
    try
    {
      String str = getHeaders().name(paramInt);
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  public final Map<String, List<String>> getHeaderFields()
  {
    try
    {
      Map localMap = OkHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse().getResponse()).toString());
      return localMap;
    }
    catch (IOException localIOException) {}
    return Collections.emptyMap();
  }
  
  public final InputStream getInputStream()
  {
    if (!this.doInput) {
      throw new ProtocolException("This protocol does not support input");
    }
    HttpEngine localHttpEngine = getResponse();
    if (getResponseCode() >= 400) {
      throw new FileNotFoundException(this.url.toString());
    }
    return localHttpEngine.getResponse().body().byteStream();
  }
  
  public boolean getInstanceFollowRedirects()
  {
    return this.client.getFollowRedirects();
  }
  
  public final OutputStream getOutputStream()
  {
    connect();
    i locali = this.httpEngine.getBufferedRequestBody();
    if (locali == null) {
      throw new ProtocolException("method does not support a request body: " + this.method);
    }
    if (this.httpEngine.hasResponse()) {
      throw new ProtocolException("cannot write request body after response has been read");
    }
    return locali.c();
  }
  
  public final Permission getPermission()
  {
    Object localObject = getURL();
    String str = ((URL)localObject).getHost();
    if (((URL)localObject).getPort() != -1) {}
    for (int i = ((URL)localObject).getPort();; i = HttpUrl.defaultPort(((URL)localObject).getProtocol()))
    {
      if (usingProxy())
      {
        localObject = (InetSocketAddress)this.client.getProxy().address();
        str = ((InetSocketAddress)localObject).getHostName();
        i = ((InetSocketAddress)localObject).getPort();
      }
      return new SocketPermission(str + ":" + i, "connect, resolve");
    }
  }
  
  public int getReadTimeout()
  {
    return this.client.getReadTimeout();
  }
  
  public final Map<String, List<String>> getRequestProperties()
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot access request header fields after connection is set");
    }
    return OkHeaders.toMultimap(this.requestHeaders.build(), null);
  }
  
  public final String getRequestProperty(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return this.requestHeaders.get(paramString);
  }
  
  public final int getResponseCode()
  {
    return getResponse().getResponse().code();
  }
  
  public String getResponseMessage()
  {
    return getResponse().getResponse().message();
  }
  
  public void setConnectTimeout(int paramInt)
  {
    this.client.setConnectTimeout(paramInt, TimeUnit.MILLISECONDS);
  }
  
  public void setFixedLengthStreamingMode(int paramInt)
  {
    setFixedLengthStreamingMode(paramInt);
  }
  
  public void setFixedLengthStreamingMode(long paramLong)
  {
    if (this.connected) {
      throw new IllegalStateException("Already connected");
    }
    if (this.chunkLength > 0) {
      throw new IllegalStateException("Already in chunked mode");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("contentLength < 0");
    }
    this.fixedContentLength = paramLong;
    this.fixedContentLength = ((int)Math.min(paramLong, 2147483647L));
  }
  
  public void setIfModifiedSince(long paramLong)
  {
    super.setIfModifiedSince(paramLong);
    if (this.ifModifiedSince != 0L)
    {
      this.requestHeaders.set("If-Modified-Since", HttpDate.format(new Date(this.ifModifiedSince)));
      return;
    }
    this.requestHeaders.removeAll("If-Modified-Since");
  }
  
  public void setInstanceFollowRedirects(boolean paramBoolean)
  {
    this.client.setFollowRedirects(paramBoolean);
  }
  
  public void setReadTimeout(int paramInt)
  {
    this.client.setReadTimeout(paramInt, TimeUnit.MILLISECONDS);
  }
  
  public void setRequestMethod(String paramString)
  {
    if (!METHODS.contains(paramString)) {
      throw new ProtocolException("Expected one of " + METHODS + " but was " + paramString);
    }
    this.method = paramString;
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot set request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      Platform.get().logW("Ignoring header " + paramString1 + " because its value was null.");
      return;
    }
    if (("X-Android-Transports".equals(paramString1)) || ("X-Android-Protocols".equals(paramString1)))
    {
      setProtocols(paramString2, false);
      return;
    }
    this.requestHeaders.set(paramString1, paramString2);
  }
  
  public final boolean usingProxy()
  {
    if (this.route != null) {}
    for (Proxy localProxy = this.route.getProxy(); (localProxy != null) && (localProxy.type() != Proxy.Type.DIRECT); localProxy = this.client.getProxy()) {
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\huc\HttpURLConnectionImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */