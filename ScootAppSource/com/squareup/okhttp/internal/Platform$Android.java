package com.squareup.okhttp.internal;

import android.util.Log;
import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

class Platform$Android
  extends Platform
{
  private static final int MAX_LOG_LENGTH = 4000;
  private final OptionalMethod<Socket> getAlpnSelectedProtocol;
  private final OptionalMethod<Socket> setAlpnProtocols;
  private final OptionalMethod<Socket> setHostname;
  private final OptionalMethod<Socket> setUseSessionTickets;
  private final Class<?> sslParametersClass;
  private final Method trafficStatsTagSocket;
  private final Method trafficStatsUntagSocket;
  
  public Platform$Android(Class<?> paramClass, OptionalMethod<Socket> paramOptionalMethod1, OptionalMethod<Socket> paramOptionalMethod2, Method paramMethod1, Method paramMethod2, OptionalMethod<Socket> paramOptionalMethod3, OptionalMethod<Socket> paramOptionalMethod4)
  {
    this.sslParametersClass = paramClass;
    this.setUseSessionTickets = paramOptionalMethod1;
    this.setHostname = paramOptionalMethod2;
    this.trafficStatsTagSocket = paramMethod1;
    this.trafficStatsUntagSocket = paramMethod2;
    this.getAlpnSelectedProtocol = paramOptionalMethod3;
    this.setAlpnProtocols = paramOptionalMethod4;
  }
  
  public void configureTlsExtensions(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    if (paramString != null)
    {
      this.setUseSessionTickets.invokeOptionalWithoutCheckedException(paramSSLSocket, new Object[] { Boolean.valueOf(true) });
      this.setHostname.invokeOptionalWithoutCheckedException(paramSSLSocket, new Object[] { paramString });
    }
    if ((this.setAlpnProtocols != null) && (this.setAlpnProtocols.isSupported(paramSSLSocket)))
    {
      paramString = concatLengthPrefixed(paramList);
      this.setAlpnProtocols.invokeWithoutCheckedException(paramSSLSocket, new Object[] { paramString });
    }
  }
  
  public void connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    try
    {
      paramSocket.connect(paramInetSocketAddress, paramInt);
      return;
    }
    catch (AssertionError paramSocket)
    {
      if (Util.isAndroidGetsocknameError(paramSocket)) {
        throw new IOException(paramSocket);
      }
      throw paramSocket;
    }
    catch (SecurityException paramSocket)
    {
      paramInetSocketAddress = new IOException("Exception in connect");
      paramInetSocketAddress.initCause(paramSocket);
      throw paramInetSocketAddress;
    }
  }
  
  public String getSelectedProtocol(SSLSocket paramSSLSocket)
  {
    if (this.getAlpnSelectedProtocol == null) {}
    while (!this.getAlpnSelectedProtocol.isSupported(paramSSLSocket)) {
      return null;
    }
    paramSSLSocket = (byte[])this.getAlpnSelectedProtocol.invokeWithoutCheckedException(paramSSLSocket, new Object[0]);
    if (paramSSLSocket != null) {}
    for (paramSSLSocket = new String(paramSSLSocket, Util.UTF_8);; paramSSLSocket = null) {
      return paramSSLSocket;
    }
  }
  
  public void log(String paramString)
  {
    int i = 0;
    int k = paramString.length();
    int j;
    if (i < k)
    {
      j = paramString.indexOf('\n', i);
      if (j == -1) {}
    }
    for (;;)
    {
      int m = Math.min(j, i + 4000);
      Log.d("OkHttp", paramString.substring(i, m));
      if (m >= j)
      {
        i = m + 1;
        break;
        j = k;
        continue;
        return;
      }
      i = m;
    }
  }
  
  public void tagSocket(Socket paramSocket)
  {
    if (this.trafficStatsTagSocket == null) {
      return;
    }
    try
    {
      this.trafficStatsTagSocket.invoke(null, new Object[] { paramSocket });
      return;
    }
    catch (IllegalAccessException paramSocket)
    {
      throw new RuntimeException(paramSocket);
    }
    catch (InvocationTargetException paramSocket)
    {
      throw new RuntimeException(paramSocket.getCause());
    }
  }
  
  public X509TrustManager trustManager(SSLSocketFactory paramSSLSocketFactory)
  {
    Object localObject = readFieldOrNull(paramSSLSocketFactory, this.sslParametersClass, "sslParameters");
    if (localObject == null) {
      paramSSLSocketFactory = null;
    }
    X509TrustManager localX509TrustManager;
    do
    {
      return paramSSLSocketFactory;
      localX509TrustManager = (X509TrustManager)readFieldOrNull(localObject, X509TrustManager.class, "x509TrustManager");
      paramSSLSocketFactory = localX509TrustManager;
    } while (localX509TrustManager != null);
    return (X509TrustManager)readFieldOrNull(localObject, X509TrustManager.class, "trustManager");
  }
  
  public void untagSocket(Socket paramSocket)
  {
    if (this.trafficStatsUntagSocket == null) {
      return;
    }
    try
    {
      this.trafficStatsUntagSocket.invoke(null, new Object[] { paramSocket });
      return;
    }
    catch (IllegalAccessException paramSocket)
    {
      throw new RuntimeException(paramSocket);
    }
    catch (InvocationTargetException paramSocket)
    {
      throw new RuntimeException(paramSocket.getCause());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\Platform$Android.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */