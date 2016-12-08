package b.a.a.a.a.e;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class o
{
  public static final SSLSocketFactory a(p paramp)
  {
    SSLContext localSSLContext = SSLContext.getInstance("TLS");
    localSSLContext.init(null, new TrustManager[] { new q(new r(paramp.a(), paramp.b()), paramp) }, null);
    return localSSLContext.getSocketFactory();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */