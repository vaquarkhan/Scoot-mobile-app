package b.a.a.a.a.e;

import b.a.a.a.f;
import b.a.a.a.t;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

final class q
  implements X509TrustManager
{
  private static final X509Certificate[] a = new X509Certificate[0];
  private final TrustManager[] b = a(paramr);
  private final r c;
  private final long d;
  private final List<byte[]> e = new LinkedList();
  private final Set<X509Certificate> f = Collections.synchronizedSet(new HashSet());
  
  public q(r paramr, p paramp)
  {
    this.c = paramr;
    this.d = paramp.d();
    paramr = paramp.c();
    int j = paramr.length;
    int i = 0;
    while (i < j)
    {
      paramp = paramr[i];
      this.e.add(a(paramp));
      i += 1;
    }
  }
  
  private void a(X509Certificate[] paramArrayOfX509Certificate)
  {
    if ((this.d != -1L) && (System.currentTimeMillis() - this.d > 15552000000L))
    {
      f.h().d("Fabric", "Certificate pins are stale, (" + (System.currentTimeMillis() - this.d) + " millis vs " + 15552000000L + " millis) " + "falling back to system trust.");
      return;
    }
    paramArrayOfX509Certificate = a.a(paramArrayOfX509Certificate, this.c);
    int j = paramArrayOfX509Certificate.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label120;
      }
      if (a(paramArrayOfX509Certificate[i])) {
        break;
      }
      i += 1;
    }
    label120:
    throw new CertificateException("No valid pins found in chain!");
  }
  
  private void a(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    TrustManager[] arrayOfTrustManager = this.b;
    int j = arrayOfTrustManager.length;
    int i = 0;
    while (i < j)
    {
      ((X509TrustManager)arrayOfTrustManager[i]).checkServerTrusted(paramArrayOfX509Certificate, paramString);
      i += 1;
    }
  }
  
  private boolean a(X509Certificate paramX509Certificate)
  {
    try
    {
      paramX509Certificate = MessageDigest.getInstance("SHA1").digest(paramX509Certificate.getPublicKey().getEncoded());
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
      {
        boolean bool = Arrays.equals((byte[])localIterator.next(), paramX509Certificate);
        if (bool) {
          return true;
        }
      }
      return false;
    }
    catch (NoSuchAlgorithmException paramX509Certificate)
    {
      throw new CertificateException(paramX509Certificate);
    }
  }
  
  private byte[] a(String paramString)
  {
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int i = 0;
    while (i < j)
    {
      arrayOfByte[(i / 2)] = ((byte)((Character.digit(paramString.charAt(i), 16) << 4) + Character.digit(paramString.charAt(i + 1), 16)));
      i += 2;
    }
    return arrayOfByte;
  }
  
  private TrustManager[] a(r paramr)
  {
    try
    {
      TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance("X509");
      localTrustManagerFactory.init(paramr.a);
      paramr = localTrustManagerFactory.getTrustManagers();
      return paramr;
    }
    catch (NoSuchAlgorithmException paramr)
    {
      throw new AssertionError(paramr);
    }
    catch (KeyStoreException paramr)
    {
      throw new AssertionError(paramr);
    }
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    throw new CertificateException("Client certificates not supported!");
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    if (this.f.contains(paramArrayOfX509Certificate[0])) {
      return;
    }
    a(paramArrayOfX509Certificate, paramString);
    a(paramArrayOfX509Certificate);
    this.f.add(paramArrayOfX509Certificate[0]);
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */