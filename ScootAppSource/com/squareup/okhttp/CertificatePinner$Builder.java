package com.squareup.okhttp;

import d.k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class CertificatePinner$Builder
{
  private final Map<String, Set<k>> hostnameToPins = new LinkedHashMap();
  
  public Builder add(String paramString, String... paramVarArgs)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("hostname == null");
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    paramString = (Set)this.hostnameToPins.put(paramString, Collections.unmodifiableSet(localLinkedHashSet));
    if (paramString != null) {
      localLinkedHashSet.addAll(paramString);
    }
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      paramString = paramVarArgs[i];
      if (!paramString.startsWith("sha1/")) {
        throw new IllegalArgumentException("pins must start with 'sha1/': " + paramString);
      }
      k localk = k.b(paramString.substring("sha1/".length()));
      if (localk == null) {
        throw new IllegalArgumentException("pins must be base64: " + paramString);
      }
      localLinkedHashSet.add(localk);
      i += 1;
    }
    return this;
  }
  
  public CertificatePinner build()
  {
    return new CertificatePinner(this, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\CertificatePinner$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */