package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Headers.Builder;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Response.Builder;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedStream;
import com.squareup.okhttp.internal.framed.Header;
import d.ac;
import d.ae;
import d.k;
import d.r;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class Http2xStream
  implements HttpStream
{
  private static final k CONNECTION = k.a("connection");
  private static final k ENCODING;
  private static final k HOST = k.a("host");
  private static final List<k> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(new k[] { CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION });
  private static final List<k> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(new k[] { CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE });
  private static final k KEEP_ALIVE = k.a("keep-alive");
  private static final k PROXY_CONNECTION = k.a("proxy-connection");
  private static final List<k> SPDY_3_SKIPPED_REQUEST_HEADERS;
  private static final List<k> SPDY_3_SKIPPED_RESPONSE_HEADERS;
  private static final k TE;
  private static final k TRANSFER_ENCODING = k.a("transfer-encoding");
  private static final k UPGRADE;
  private final FramedConnection framedConnection;
  private HttpEngine httpEngine;
  private FramedStream stream;
  private final StreamAllocation streamAllocation;
  
  static
  {
    TE = k.a("te");
    ENCODING = k.a("encoding");
    UPGRADE = k.a("upgrade");
    SPDY_3_SKIPPED_REQUEST_HEADERS = Util.immutableList(new k[] { CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TRANSFER_ENCODING, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION });
    SPDY_3_SKIPPED_RESPONSE_HEADERS = Util.immutableList(new k[] { CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TRANSFER_ENCODING });
  }
  
  public Http2xStream(StreamAllocation paramStreamAllocation, FramedConnection paramFramedConnection)
  {
    this.streamAllocation = paramStreamAllocation;
    this.framedConnection = paramFramedConnection;
  }
  
  public static List<Header> http2HeadersList(Request paramRequest)
  {
    Headers localHeaders = paramRequest.headers();
    ArrayList localArrayList = new ArrayList(localHeaders.size() + 4);
    localArrayList.add(new Header(Header.TARGET_METHOD, paramRequest.method()));
    localArrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(paramRequest.httpUrl())));
    localArrayList.add(new Header(Header.TARGET_AUTHORITY, Util.hostHeader(paramRequest.httpUrl())));
    localArrayList.add(new Header(Header.TARGET_SCHEME, paramRequest.httpUrl().scheme()));
    int i = 0;
    int j = localHeaders.size();
    while (i < j)
    {
      paramRequest = k.a(localHeaders.name(i).toLowerCase(Locale.US));
      if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(paramRequest)) {
        localArrayList.add(new Header(paramRequest, localHeaders.value(i)));
      }
      i += 1;
    }
    return localArrayList;
  }
  
  private static String joinOnNull(String paramString1, String paramString2)
  {
    return paramString1 + '\000' + paramString2;
  }
  
  public static Response.Builder readHttp2HeadersList(List<Header> paramList)
  {
    Object localObject = null;
    Headers.Builder localBuilder = new Headers.Builder();
    int j = paramList.size();
    int i = 0;
    if (i < j)
    {
      k localk = ((Header)paramList.get(i)).name;
      String str = ((Header)paramList.get(i)).value.a();
      if (localk.equals(Header.RESPONSE_STATUS)) {
        localObject = str;
      }
      for (;;)
      {
        i += 1;
        break;
        if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(localk)) {
          localBuilder.add(localk.a(), str);
        }
      }
    }
    if (localObject == null) {
      throw new ProtocolException("Expected ':status' header not present");
    }
    paramList = StatusLine.parse("HTTP/1.1 " + (String)localObject);
    return new Response.Builder().protocol(Protocol.HTTP_2).code(paramList.code).message(paramList.message).headers(localBuilder.build());
  }
  
  public static Response.Builder readSpdy3HeadersList(List<Header> paramList)
  {
    Object localObject1 = null;
    Object localObject2 = "HTTP/1.1";
    Headers.Builder localBuilder = new Headers.Builder();
    int n = paramList.size();
    int i = 0;
    while (i < n)
    {
      k localk = ((Header)paramList.get(i)).name;
      String str2 = ((Header)paramList.get(i)).value.a();
      int j = 0;
      if (j < str2.length())
      {
        int m = str2.indexOf(0, j);
        int k = m;
        if (m == -1) {
          k = str2.length();
        }
        String str1 = str2.substring(j, k);
        if (localk.equals(Header.RESPONSE_STATUS)) {
          localObject1 = str1;
        }
        for (;;)
        {
          j = k + 1;
          break;
          if (localk.equals(Header.VERSION)) {
            localObject2 = str1;
          } else if (!SPDY_3_SKIPPED_RESPONSE_HEADERS.contains(localk)) {
            localBuilder.add(localk.a(), str1);
          }
        }
      }
      i += 1;
    }
    if (localObject1 == null) {
      throw new ProtocolException("Expected ':status' header not present");
    }
    paramList = StatusLine.parse((String)localObject2 + " " + (String)localObject1);
    return new Response.Builder().protocol(Protocol.SPDY_3).code(paramList.code).message(paramList.message).headers(localBuilder.build());
  }
  
  public static List<Header> spdy3HeadersList(Request paramRequest)
  {
    Headers localHeaders = paramRequest.headers();
    ArrayList localArrayList = new ArrayList(localHeaders.size() + 5);
    localArrayList.add(new Header(Header.TARGET_METHOD, paramRequest.method()));
    localArrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(paramRequest.httpUrl())));
    localArrayList.add(new Header(Header.VERSION, "HTTP/1.1"));
    localArrayList.add(new Header(Header.TARGET_HOST, Util.hostHeader(paramRequest.httpUrl())));
    localArrayList.add(new Header(Header.TARGET_SCHEME, paramRequest.httpUrl().scheme()));
    paramRequest = new LinkedHashSet();
    int k = localHeaders.size();
    int i = 0;
    if (i < k)
    {
      k localk = k.a(localHeaders.name(i).toLowerCase(Locale.US));
      if (SPDY_3_SKIPPED_REQUEST_HEADERS.contains(localk)) {}
      label322:
      for (;;)
      {
        i += 1;
        break;
        String str = localHeaders.value(i);
        if (paramRequest.add(localk))
        {
          localArrayList.add(new Header(localk, str));
        }
        else
        {
          int j = 0;
          for (;;)
          {
            if (j >= localArrayList.size()) {
              break label322;
            }
            if (((Header)localArrayList.get(j)).name.equals(localk))
            {
              localArrayList.set(j, new Header(localk, joinOnNull(((Header)localArrayList.get(j)).value.a(), str)));
              break;
            }
            j += 1;
          }
        }
      }
    }
    return localArrayList;
  }
  
  public void cancel()
  {
    if (this.stream != null) {
      this.stream.closeLater(ErrorCode.CANCEL);
    }
  }
  
  public ac createRequestBody(Request paramRequest, long paramLong)
  {
    return this.stream.getSink();
  }
  
  public void finishRequest()
  {
    this.stream.getSink().close();
  }
  
  public ResponseBody openResponseBody(Response paramResponse)
  {
    Http2xStream.StreamFinishingSource localStreamFinishingSource = new Http2xStream.StreamFinishingSource(this, this.stream.getSource());
    return new RealResponseBody(paramResponse.headers(), r.a(localStreamFinishingSource));
  }
  
  public Response.Builder readResponseHeaders()
  {
    if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
      return readHttp2HeadersList(this.stream.getResponseHeaders());
    }
    return readSpdy3HeadersList(this.stream.getResponseHeaders());
  }
  
  public void setHttpEngine(HttpEngine paramHttpEngine)
  {
    this.httpEngine = paramHttpEngine;
  }
  
  public void writeRequestBody(RetryableSink paramRetryableSink)
  {
    paramRetryableSink.writeToSocket(this.stream.getSink());
  }
  
  public void writeRequestHeaders(Request paramRequest)
  {
    if (this.stream != null) {
      return;
    }
    this.httpEngine.writingRequestHeaders();
    boolean bool = this.httpEngine.permitsRequestBody(paramRequest);
    if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {}
    for (paramRequest = http2HeadersList(paramRequest);; paramRequest = spdy3HeadersList(paramRequest))
    {
      this.stream = this.framedConnection.newStream(paramRequest, bool, true);
      this.stream.readTimeout().timeout(this.httpEngine.client.getReadTimeout(), TimeUnit.MILLISECONDS);
      this.stream.writeTimeout().timeout(this.httpEngine.client.getWriteTimeout(), TimeUnit.MILLISECONDS);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\Http2xStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */