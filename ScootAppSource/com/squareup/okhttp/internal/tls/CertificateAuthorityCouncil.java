package com.squareup.okhttp.internal.tls;

import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.auth.x500.X500Principal;

public final class CertificateAuthorityCouncil
{
  private final Map<X500Principal, List<X509Certificate>> subjectToCaCerts = new LinkedHashMap();
  
  public CertificateAuthorityCouncil(X509Certificate... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      X509Certificate localX509Certificate = paramVarArgs[i];
      X500Principal localX500Principal = localX509Certificate.getSubjectX500Principal();
      List localList = (List)this.subjectToCaCerts.get(localX500Principal);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList(1);
        this.subjectToCaCerts.put(localX500Principal, localObject);
      }
      ((List)localObject).add(localX509Certificate);
      i += 1;
    }
  }
  
  private X509Certificate findByIssuerAndSignature(X509Certificate paramX509Certificate)
  {
    Object localObject = paramX509Certificate.getIssuerX500Principal();
    localObject = (List)this.subjectToCaCerts.get(localObject);
    if (localObject == null) {
      return null;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      X509Certificate localX509Certificate = (X509Certificate)((Iterator)localObject).next();
      PublicKey localPublicKey = localX509Certificate.getPublicKey();
      try
      {
        paramX509Certificate.verify(localPublicKey);
        return localX509Certificate;
      }
      catch (Exception localException) {}
    }
    return null;
  }
  
  private boolean verifySignature(X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2)
  {
    try
    {
      paramX509Certificate1.verify(paramX509Certificate2.getPublicKey());
      return true;
    }
    catch (GeneralSecurityException paramX509Certificate1) {}
    return false;
  }
  
  public List<Certificate> normalizeCertificateChain(List<Certificate> paramList)
  {
    paramList = new ArrayDeque(paramList);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramList.removeFirst());
    X509Certificate localX509Certificate1;
    for (;;)
    {
      localX509Certificate1 = (X509Certificate)localArrayList.get(localArrayList.size() - 1);
      Object localObject = findByIssuerAndSignature(localX509Certificate1);
      if ((localObject != null) && (verifySignature(localX509Certificate1, (X509Certificate)localObject)))
      {
        if ((localArrayList.size() > 1) || (!localX509Certificate1.equals(localObject))) {
          localArrayList.add(localObject);
        }
        return localArrayList;
      }
      localObject = paramList.iterator();
      X509Certificate localX509Certificate2;
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localX509Certificate2 = (X509Certificate)((Iterator)localObject).next();
      } while ((!localX509Certificate1.getIssuerDN().equals(localX509Certificate2.getSubjectDN())) || (!verifySignature(localX509Certificate1, localX509Certificate2)));
      ((Iterator)localObject).remove();
      localArrayList.add(localX509Certificate2);
    }
    throw new SSLPeerUnverifiedException("Failed to find a cert that signed " + localX509Certificate1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\tls\CertificateAuthorityCouncil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */