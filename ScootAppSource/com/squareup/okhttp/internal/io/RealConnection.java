package com.squareup.okhttp.internal.io;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Response.Builder;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.ConnectionSpecSelector;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedConnection.Builder;
import com.squareup.okhttp.internal.http.Http1xStream;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.tls.CertificateAuthorityCouncil;
import d.ad;
import d.ae;
import d.f;
import d.i;
import d.j;
import d.r;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class RealConnection
  implements Connection
{
  private static CertificateAuthorityCouncil lastCertificateAuthorityCouncil;
  private static SSLSocketFactory lastSslSocketFactory;
  public final List<Reference<StreamAllocation>> allocations = new ArrayList();
  public volatile FramedConnection framedConnection;
  private Handshake handshake;
  public long idleAtNanos = Long.MAX_VALUE;
  public boolean noNewStreams;
  private Protocol protocol;
  private Socket rawSocket;
  private final Route route;
  public i sink;
  public Socket socket;
  public j source;
  public int streamCount;
  
  public RealConnection(Route paramRoute)
  {
    this.route = paramRoute;
  }
  
  private static CertificateAuthorityCouncil certificateAuthorityCouncil(SSLSocketFactory paramSSLSocketFactory)
  {
    try
    {
      if (paramSSLSocketFactory != lastSslSocketFactory)
      {
        lastCertificateAuthorityCouncil = new CertificateAuthorityCouncil(Platform.get().trustManager(paramSSLSocketFactory).getAcceptedIssuers());
        lastSslSocketFactory = paramSSLSocketFactory;
      }
      paramSSLSocketFactory = lastCertificateAuthorityCouncil;
      return paramSSLSocketFactory;
    }
    finally {}
  }
  
  private void connectSocket(int paramInt1, int paramInt2, int paramInt3, ConnectionSpecSelector paramConnectionSpecSelector)
  {
    this.rawSocket.setSoTimeout(paramInt2);
    for (;;)
    {
      try
      {
        Platform.get().connectSocket(this.rawSocket, this.route.getSocketAddress(), paramInt1);
        this.source = r.a(r.b(this.rawSocket));
        this.sink = r.a(r.a(this.rawSocket));
        if (this.route.getAddress().getSslSocketFactory() != null)
        {
          connectTls(paramInt2, paramInt3, paramConnectionSpecSelector);
          if ((this.protocol == Protocol.SPDY_3) || (this.protocol == Protocol.HTTP_2))
          {
            this.socket.setSoTimeout(0);
            paramConnectionSpecSelector = new FramedConnection.Builder(true).socket(this.socket, this.route.getAddress().url().host(), this.source, this.sink).protocol(this.protocol).build();
            paramConnectionSpecSelector.sendConnectionPreface();
            this.framedConnection = paramConnectionSpecSelector;
          }
          return;
        }
      }
      catch (ConnectException paramConnectionSpecSelector)
      {
        throw new ConnectException("Failed to connect to " + this.route.getSocketAddress());
      }
      this.protocol = Protocol.HTTP_1_1;
      this.socket = this.rawSocket;
    }
  }
  
  /* Error */
  private void connectTls(int paramInt1, int paramInt2, ConnectionSpecSelector paramConnectionSpecSelector)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 7
    //   9: aload_0
    //   10: getfield 50	com/squareup/okhttp/internal/io/RealConnection:route	Lcom/squareup/okhttp/Route;
    //   13: invokevirtual 204	com/squareup/okhttp/Route:requiresTunnel	()Z
    //   16: ifeq +9 -> 25
    //   19: aload_0
    //   20: iload_1
    //   21: iload_2
    //   22: invokespecial 208	com/squareup/okhttp/internal/io/RealConnection:createTunnel	(II)V
    //   25: aload_0
    //   26: getfield 50	com/squareup/okhttp/internal/io/RealConnection:route	Lcom/squareup/okhttp/Route;
    //   29: invokevirtual 123	com/squareup/okhttp/Route:getAddress	()Lcom/squareup/okhttp/Address;
    //   32: astore 8
    //   34: aload 8
    //   36: invokevirtual 129	com/squareup/okhttp/Address:getSslSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   39: astore 5
    //   41: aload 5
    //   43: aload_0
    //   44: getfield 84	com/squareup/okhttp/internal/io/RealConnection:rawSocket	Ljava/net/Socket;
    //   47: aload 8
    //   49: invokevirtual 211	com/squareup/okhttp/Address:getUriHost	()Ljava/lang/String;
    //   52: aload 8
    //   54: invokevirtual 215	com/squareup/okhttp/Address:getUriPort	()I
    //   57: iconst_1
    //   58: invokevirtual 221	javax/net/ssl/SSLSocketFactory:createSocket	(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    //   61: checkcast 223	javax/net/ssl/SSLSocket
    //   64: astore 5
    //   66: aload_3
    //   67: aload 5
    //   69: invokevirtual 229	com/squareup/okhttp/internal/ConnectionSpecSelector:configureSecureSocket	(Ljavax/net/ssl/SSLSocket;)Lcom/squareup/okhttp/ConnectionSpec;
    //   72: astore 7
    //   74: aload 7
    //   76: invokevirtual 234	com/squareup/okhttp/ConnectionSpec:supportsTlsExtensions	()Z
    //   79: ifeq +21 -> 100
    //   82: invokestatic 63	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   85: aload 5
    //   87: aload 8
    //   89: invokevirtual 211	com/squareup/okhttp/Address:getUriHost	()Ljava/lang/String;
    //   92: aload 8
    //   94: invokevirtual 238	com/squareup/okhttp/Address:getProtocols	()Ljava/util/List;
    //   97: invokevirtual 242	com/squareup/okhttp/internal/Platform:configureTlsExtensions	(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    //   100: aload 5
    //   102: invokevirtual 245	javax/net/ssl/SSLSocket:startHandshake	()V
    //   105: aload 5
    //   107: invokevirtual 249	javax/net/ssl/SSLSocket:getSession	()Ljavax/net/ssl/SSLSession;
    //   110: invokestatic 254	com/squareup/okhttp/Handshake:get	(Ljavax/net/ssl/SSLSession;)Lcom/squareup/okhttp/Handshake;
    //   113: astore 4
    //   115: aload 8
    //   117: invokevirtual 258	com/squareup/okhttp/Address:getHostnameVerifier	()Ljavax/net/ssl/HostnameVerifier;
    //   120: aload 8
    //   122: invokevirtual 211	com/squareup/okhttp/Address:getUriHost	()Ljava/lang/String;
    //   125: aload 5
    //   127: invokevirtual 249	javax/net/ssl/SSLSocket:getSession	()Ljavax/net/ssl/SSLSession;
    //   130: invokeinterface 264 3 0
    //   135: ifne +154 -> 289
    //   138: aload 4
    //   140: invokevirtual 267	com/squareup/okhttp/Handshake:peerCertificates	()Ljava/util/List;
    //   143: iconst_0
    //   144: invokeinterface 272 2 0
    //   149: checkcast 274	java/security/cert/X509Certificate
    //   152: astore_3
    //   153: new 276	javax/net/ssl/SSLPeerUnverifiedException
    //   156: dup
    //   157: new 179	java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   164: ldc_w 278
    //   167: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: aload 8
    //   172: invokevirtual 211	com/squareup/okhttp/Address:getUriHost	()Ljava/lang/String;
    //   175: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: ldc_w 280
    //   181: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: ldc_w 282
    //   187: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload_3
    //   191: invokestatic 288	com/squareup/okhttp/CertificatePinner:pin	(Ljava/security/cert/Certificate;)Ljava/lang/String;
    //   194: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: ldc_w 290
    //   200: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: aload_3
    //   204: invokevirtual 294	java/security/cert/X509Certificate:getSubjectDN	()Ljava/security/Principal;
    //   207: invokeinterface 299 1 0
    //   212: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: ldc_w 301
    //   218: invokevirtual 186	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_3
    //   222: invokestatic 307	com/squareup/okhttp/internal/tls/OkHostnameVerifier:allSubjectAltNames	(Ljava/security/cert/X509Certificate;)Ljava/util/List;
    //   225: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: invokespecial 308	javax/net/ssl/SSLPeerUnverifiedException:<init>	(Ljava/lang/String;)V
    //   234: athrow
    //   235: astore 4
    //   237: aload 5
    //   239: astore_3
    //   240: aload 4
    //   242: astore 5
    //   244: aload_3
    //   245: astore 4
    //   247: aload 5
    //   249: invokestatic 314	com/squareup/okhttp/internal/Util:isAndroidGetsocknameError	(Ljava/lang/AssertionError;)Z
    //   252: ifeq +174 -> 426
    //   255: aload_3
    //   256: astore 4
    //   258: new 316	java/io/IOException
    //   261: dup
    //   262: aload 5
    //   264: invokespecial 319	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   267: athrow
    //   268: astore_3
    //   269: aload 4
    //   271: ifnull +11 -> 282
    //   274: invokestatic 63	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   277: aload 4
    //   279: invokevirtual 323	com/squareup/okhttp/internal/Platform:afterHandshake	(Ljavax/net/ssl/SSLSocket;)V
    //   282: aload 4
    //   284: invokestatic 327	com/squareup/okhttp/internal/Util:closeQuietly	(Ljava/net/Socket;)V
    //   287: aload_3
    //   288: athrow
    //   289: aload 8
    //   291: invokevirtual 331	com/squareup/okhttp/Address:getCertificatePinner	()Lcom/squareup/okhttp/CertificatePinner;
    //   294: getstatic 335	com/squareup/okhttp/CertificatePinner:DEFAULT	Lcom/squareup/okhttp/CertificatePinner;
    //   297: if_acmpeq +34 -> 331
    //   300: aload 8
    //   302: invokevirtual 129	com/squareup/okhttp/Address:getSslSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   305: invokestatic 337	com/squareup/okhttp/internal/io/RealConnection:certificateAuthorityCouncil	(Ljavax/net/ssl/SSLSocketFactory;)Lcom/squareup/okhttp/internal/tls/CertificateAuthorityCouncil;
    //   308: aload 4
    //   310: invokevirtual 267	com/squareup/okhttp/Handshake:peerCertificates	()Ljava/util/List;
    //   313: invokevirtual 341	com/squareup/okhttp/internal/tls/CertificateAuthorityCouncil:normalizeCertificateChain	(Ljava/util/List;)Ljava/util/List;
    //   316: astore_3
    //   317: aload 8
    //   319: invokevirtual 331	com/squareup/okhttp/Address:getCertificatePinner	()Lcom/squareup/okhttp/CertificatePinner;
    //   322: aload 8
    //   324: invokevirtual 211	com/squareup/okhttp/Address:getUriHost	()Ljava/lang/String;
    //   327: aload_3
    //   328: invokevirtual 345	com/squareup/okhttp/CertificatePinner:check	(Ljava/lang/String;Ljava/util/List;)V
    //   331: aload 6
    //   333: astore_3
    //   334: aload 7
    //   336: invokevirtual 234	com/squareup/okhttp/ConnectionSpec:supportsTlsExtensions	()Z
    //   339: ifeq +12 -> 351
    //   342: invokestatic 63	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   345: aload 5
    //   347: invokevirtual 349	com/squareup/okhttp/internal/Platform:getSelectedProtocol	(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    //   350: astore_3
    //   351: aload_0
    //   352: aload 5
    //   354: putfield 145	com/squareup/okhttp/internal/io/RealConnection:socket	Ljava/net/Socket;
    //   357: aload_0
    //   358: aload_0
    //   359: getfield 145	com/squareup/okhttp/internal/io/RealConnection:socket	Ljava/net/Socket;
    //   362: invokestatic 105	d/r:b	(Ljava/net/Socket;)Ld/ad;
    //   365: invokestatic 109	d/r:a	(Ld/ad;)Ld/j;
    //   368: putfield 111	com/squareup/okhttp/internal/io/RealConnection:source	Ld/j;
    //   371: aload_0
    //   372: aload_0
    //   373: getfield 145	com/squareup/okhttp/internal/io/RealConnection:socket	Ljava/net/Socket;
    //   376: invokestatic 114	d/r:a	(Ljava/net/Socket;)Ld/ac;
    //   379: invokestatic 117	d/r:a	(Ld/ac;)Ld/i;
    //   382: putfield 119	com/squareup/okhttp/internal/io/RealConnection:sink	Ld/i;
    //   385: aload_0
    //   386: aload 4
    //   388: putfield 351	com/squareup/okhttp/internal/io/RealConnection:handshake	Lcom/squareup/okhttp/Handshake;
    //   391: aload_3
    //   392: ifnull +27 -> 419
    //   395: aload_3
    //   396: invokestatic 354	com/squareup/okhttp/Protocol:get	(Ljava/lang/String;)Lcom/squareup/okhttp/Protocol;
    //   399: astore_3
    //   400: aload_0
    //   401: aload_3
    //   402: putfield 135	com/squareup/okhttp/internal/io/RealConnection:protocol	Lcom/squareup/okhttp/Protocol;
    //   405: aload 5
    //   407: ifnull +11 -> 418
    //   410: invokestatic 63	com/squareup/okhttp/internal/Platform:get	()Lcom/squareup/okhttp/internal/Platform;
    //   413: aload 5
    //   415: invokevirtual 323	com/squareup/okhttp/internal/Platform:afterHandshake	(Ljavax/net/ssl/SSLSocket;)V
    //   418: return
    //   419: getstatic 198	com/squareup/okhttp/Protocol:HTTP_1_1	Lcom/squareup/okhttp/Protocol;
    //   422: astore_3
    //   423: goto -23 -> 400
    //   426: aload_3
    //   427: astore 4
    //   429: aload 5
    //   431: athrow
    //   432: astore_3
    //   433: aload 5
    //   435: astore 4
    //   437: goto -168 -> 269
    //   440: astore 5
    //   442: aload 7
    //   444: astore_3
    //   445: goto -201 -> 244
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	448	0	this	RealConnection
    //   0	448	1	paramInt1	int
    //   0	448	2	paramInt2	int
    //   0	448	3	paramConnectionSpecSelector	ConnectionSpecSelector
    //   1	138	4	localHandshake	Handshake
    //   235	6	4	localAssertionError1	AssertionError
    //   245	191	4	localObject1	Object
    //   39	395	5	localObject2	Object
    //   440	1	5	localAssertionError2	AssertionError
    //   4	328	6	localObject3	Object
    //   7	436	7	localConnectionSpec	ConnectionSpec
    //   32	291	8	localAddress	Address
    // Exception table:
    //   from	to	target	type
    //   66	100	235	java/lang/AssertionError
    //   100	235	235	java/lang/AssertionError
    //   289	331	235	java/lang/AssertionError
    //   334	351	235	java/lang/AssertionError
    //   351	391	235	java/lang/AssertionError
    //   395	400	235	java/lang/AssertionError
    //   400	405	235	java/lang/AssertionError
    //   419	423	235	java/lang/AssertionError
    //   41	66	268	finally
    //   247	255	268	finally
    //   258	268	268	finally
    //   429	432	268	finally
    //   66	100	432	finally
    //   100	235	432	finally
    //   289	331	432	finally
    //   334	351	432	finally
    //   351	391	432	finally
    //   395	400	432	finally
    //   400	405	432	finally
    //   419	423	432	finally
    //   41	66	440	java/lang/AssertionError
  }
  
  private void createTunnel(int paramInt1, int paramInt2)
  {
    Object localObject1 = createTunnelRequest();
    Object localObject2 = ((Request)localObject1).httpUrl();
    String str = "CONNECT " + ((HttpUrl)localObject2).host() + ":" + ((HttpUrl)localObject2).port() + " HTTP/1.1";
    do
    {
      localObject2 = new Http1xStream(null, this.source, this.sink);
      this.source.timeout().timeout(paramInt1, TimeUnit.MILLISECONDS);
      this.sink.timeout().timeout(paramInt2, TimeUnit.MILLISECONDS);
      ((Http1xStream)localObject2).writeRequest(((Request)localObject1).headers(), str);
      ((Http1xStream)localObject2).finishRequest();
      localObject1 = ((Http1xStream)localObject2).readResponse().request((Request)localObject1).build();
      long l2 = OkHeaders.contentLength((Response)localObject1);
      long l1 = l2;
      if (l2 == -1L) {
        l1 = 0L;
      }
      localObject2 = ((Http1xStream)localObject2).newFixedLengthSource(l1);
      Util.skipAll((ad)localObject2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
      ((ad)localObject2).close();
      switch (((Response)localObject1).code())
      {
      default: 
        throw new IOException("Unexpected response code for CONNECT: " + ((Response)localObject1).code());
      case 200: 
        if ((this.source.b().f()) && (this.sink.b().f())) {
          break;
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
      case 407: 
        localObject2 = OkHeaders.processAuthHeader(this.route.getAddress().getAuthenticator(), (Response)localObject1, this.route.getProxy());
        localObject1 = localObject2;
      }
    } while (localObject2 != null);
    throw new IOException("Failed to authenticate with proxy");
  }
  
  private Request createTunnelRequest()
  {
    return new Request.Builder().url(this.route.getAddress().url()).header("Host", Util.hostHeader(this.route.getAddress().url())).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
  }
  
  public int allocationLimit()
  {
    FramedConnection localFramedConnection = this.framedConnection;
    if (localFramedConnection != null) {
      return localFramedConnection.maxConcurrentStreams();
    }
    return 1;
  }
  
  public void cancel()
  {
    Util.closeQuietly(this.rawSocket);
  }
  
  public void connect(int paramInt1, int paramInt2, int paramInt3, List<ConnectionSpec> paramList, boolean paramBoolean)
  {
    if (this.protocol != null) {
      throw new IllegalStateException("already connected");
    }
    ConnectionSpecSelector localConnectionSpecSelector = new ConnectionSpecSelector(paramList);
    Proxy localProxy = this.route.getProxy();
    Address localAddress = this.route.getAddress();
    if ((this.route.getAddress().getSslSocketFactory() == null) && (!paramList.contains(ConnectionSpec.CLEARTEXT))) {
      throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + paramList));
    }
    for (;;)
    {
      try
      {
        localObject = new Socket(localProxy);
        this.rawSocket = ((Socket)localObject);
        connectSocket(paramInt1, paramInt2, paramInt3, localConnectionSpecSelector);
      }
      catch (IOException localIOException)
      {
        Util.closeQuietly(this.socket);
        Util.closeQuietly(this.rawSocket);
        this.socket = null;
        this.rawSocket = null;
        this.source = null;
        this.sink = null;
        this.handshake = null;
        this.protocol = null;
        if (paramList != null) {
          continue;
        }
        Object localObject = new RouteException(localIOException);
        if (!paramBoolean) {
          continue;
        }
        paramList = (List<ConnectionSpec>)localObject;
        if (localConnectionSpecSelector.connectionFailed(localIOException)) {
          continue;
        }
        throw ((Throwable)localObject);
        paramList.addConnectException(localIOException);
        localObject = paramList;
        continue;
      }
      if (this.protocol == null)
      {
        if ((localProxy.type() == Proxy.Type.DIRECT) || (localProxy.type() == Proxy.Type.HTTP)) {
          localObject = localAddress.getSocketFactory().createSocket();
        }
      }
      else
      {
        return;
        paramList = null;
      }
    }
  }
  
  public Handshake getHandshake()
  {
    return this.handshake;
  }
  
  public Protocol getProtocol()
  {
    if (this.protocol != null) {
      return this.protocol;
    }
    return Protocol.HTTP_1_1;
  }
  
  public Route getRoute()
  {
    return this.route;
  }
  
  public Socket getSocket()
  {
    return this.socket;
  }
  
  boolean isConnected()
  {
    return this.protocol != null;
  }
  
  public boolean isHealthy(boolean paramBoolean)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((this.socket.isClosed()) || (this.socket.isInputShutdown()) || (this.socket.isOutputShutdown())) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (this.framedConnection != null);
      bool1 = bool2;
    } while (!paramBoolean);
    try
    {
      int i = this.socket.getSoTimeout();
      try
      {
        this.socket.setSoTimeout(1);
        paramBoolean = this.source.f();
        return !paramBoolean;
      }
      finally
      {
        this.socket.setSoTimeout(i);
      }
      return true;
    }
    catch (IOException localIOException)
    {
      return false;
    }
    catch (SocketTimeoutException localSocketTimeoutException) {}
  }
  
  public boolean isMultiplexed()
  {
    return this.framedConnection != null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("Connection{").append(this.route.getAddress().url().host()).append(":").append(this.route.getAddress().url().port()).append(", proxy=").append(this.route.getProxy()).append(" hostAddress=").append(this.route.getSocketAddress()).append(" cipherSuite=");
    if (this.handshake != null) {}
    for (String str = this.handshake.cipherSuite();; str = "none") {
      return str + " protocol=" + this.protocol + '}';
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\io\RealConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */