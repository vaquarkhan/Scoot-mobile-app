package b.a.a.a.a.e;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

final class a
{
  private static boolean a(X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2)
  {
    if (!paramX509Certificate1.getSubjectX500Principal().equals(paramX509Certificate2.getIssuerX500Principal())) {
      return false;
    }
    try
    {
      paramX509Certificate2.verify(paramX509Certificate1.getPublicKey());
      return true;
    }
    catch (GeneralSecurityException paramX509Certificate1) {}
    return false;
  }
  
  public static X509Certificate[] a(X509Certificate[] paramArrayOfX509Certificate, r paramr)
  {
    int m = 1;
    LinkedList localLinkedList = new LinkedList();
    if (paramr.a(paramArrayOfX509Certificate[0])) {}
    for (int i = 1;; i = 0)
    {
      localLinkedList.add(paramArrayOfX509Certificate[0]);
      int k = 1;
      int j;
      for (;;)
      {
        j = i;
        if (k >= paramArrayOfX509Certificate.length) {
          break;
        }
        if (paramr.a(paramArrayOfX509Certificate[k])) {
          i = 1;
        }
        j = i;
        if (!a(paramArrayOfX509Certificate[k], paramArrayOfX509Certificate[(k - 1)])) {
          break;
        }
        localLinkedList.add(paramArrayOfX509Certificate[k]);
        k += 1;
      }
      paramArrayOfX509Certificate = paramr.b(paramArrayOfX509Certificate[(k - 1)]);
      if (paramArrayOfX509Certificate != null) {
        localLinkedList.add(paramArrayOfX509Certificate);
      }
      for (i = m;; i = j)
      {
        if (i != 0) {
          return (X509Certificate[])localLinkedList.toArray(new X509Certificate[localLinkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */