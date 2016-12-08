package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import d.k;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class CertificatePinner
{
  public static final CertificatePinner DEFAULT = new CertificatePinner.Builder().build();
  private final Map<String, Set<k>> hostnameToPins;
  
  private CertificatePinner(CertificatePinner.Builder paramBuilder)
  {
    this.hostnameToPins = Util.immutableMap(CertificatePinner.Builder.access$000(paramBuilder));
  }
  
  public static String pin(Certificate paramCertificate)
  {
    if (!(paramCertificate instanceof X509Certificate)) {
      throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
    return "sha1/" + sha1((X509Certificate)paramCertificate).b();
  }
  
  private static k sha1(X509Certificate paramX509Certificate)
  {
    return Util.sha1(k.a(paramX509Certificate.getPublicKey().getEncoded()));
  }
  
  public void check(String paramString, List<Certificate> paramList)
  {
    int j = 0;
    Set localSet = findMatchingPins(paramString);
    if (localSet == null) {
      return;
    }
    int k = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i >= k) {
        break label62;
      }
      if (localSet.contains(sha1((X509Certificate)paramList.get(i)))) {
        break;
      }
      i += 1;
    }
    label62:
    StringBuilder localStringBuilder = new StringBuilder().append("Certificate pinning failure!").append("\n  Peer certificate chain:");
    k = paramList.size();
    i = j;
    while (i < k)
    {
      X509Certificate localX509Certificate = (X509Certificate)paramList.get(i);
      localStringBuilder.append("\n    ").append(pin(localX509Certificate)).append(": ").append(localX509Certificate.getSubjectDN().getName());
      i += 1;
    }
    localStringBuilder.append("\n  Pinned certificates for ").append(paramString).append(":");
    paramString = localSet.iterator();
    while (paramString.hasNext())
    {
      paramList = (k)paramString.next();
      localStringBuilder.append("\n    sha1/").append(paramList.b());
    }
    throw new SSLPeerUnverifiedException(localStringBuilder.toString());
  }
  
  public void check(String paramString, Certificate... paramVarArgs)
  {
    check(paramString, Arrays.asList(paramVarArgs));
  }
  
  Set<k> findMatchingPins(String paramString)
  {
    Set localSet = (Set)this.hostnameToPins.get(paramString);
    int i = paramString.indexOf('.');
    if (i != paramString.lastIndexOf('.')) {}
    for (paramString = (Set)this.hostnameToPins.get("*." + paramString.substring(i + 1));; paramString = null)
    {
      Object localObject;
      if ((localSet == null) && (paramString == null)) {
        localObject = null;
      }
      do
      {
        return (Set<k>)localObject;
        if ((localSet != null) && (paramString != null))
        {
          localObject = new LinkedHashSet();
          ((Set)localObject).addAll(localSet);
          ((Set)localObject).addAll(paramString);
          return (Set<k>)localObject;
        }
        localObject = localSet;
      } while (localSet != null);
      return paramString;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\CertificatePinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */