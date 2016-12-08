package com.twitter.sdk.android.core.internal.oauth;

import b.a.a.a.a.e.g;
import b.a.a.a.a.e.s;
import b.a.a.a.f;
import b.a.a.a.t;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

final class d
{
  private static final SecureRandom a = new SecureRandom();
  private final TwitterAuthConfig b;
  private final TwitterAuthToken c;
  private final String d;
  private final String e;
  private final String f;
  private final Map<String, String> g;
  
  public d(TwitterAuthConfig paramTwitterAuthConfig, TwitterAuthToken paramTwitterAuthToken, String paramString1, String paramString2, String paramString3, Map<String, String> paramMap)
  {
    this.b = paramTwitterAuthConfig;
    this.c = paramTwitterAuthToken;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramMap;
  }
  
  private String a(TreeMap<String, String> paramTreeMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramTreeMap.size();
    paramTreeMap = paramTreeMap.entrySet().iterator();
    int i = 0;
    while (paramTreeMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramTreeMap.next();
      localStringBuilder.append(s.c(s.c((String)localEntry.getKey()))).append("%3D").append(s.c(s.c((String)localEntry.getValue())));
      i += 1;
      if (i < j) {
        localStringBuilder.append("%26");
      }
    }
    return localStringBuilder.toString();
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramStringBuilder.append(' ').append(s.c(paramString1)).append("=\"").append(s.c(paramString2)).append("\",");
    }
  }
  
  private String b()
  {
    return String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(a.nextLong()));
  }
  
  private String c()
  {
    return Long.toString(System.currentTimeMillis() / 1000L);
  }
  
  private String d()
  {
    if (this.c != null) {}
    for (String str = this.c.c;; str = null) {
      return s.a(this.b.b()) + '&' + s.a(str);
    }
  }
  
  public String a()
  {
    String str1 = b();
    String str2 = c();
    return a(str1, str2, a(a(str1, str2)));
  }
  
  String a(String paramString)
  {
    try
    {
      Object localObject = d();
      paramString = paramString.getBytes("UTF8");
      localObject = new SecretKeySpec(((String)localObject).getBytes("UTF8"), "HmacSHA1");
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init((Key)localObject);
      paramString = localMac.doFinal(paramString);
      paramString = new String(g.b(paramString, 0, paramString.length), "UTF8");
      return paramString;
    }
    catch (InvalidKeyException paramString)
    {
      f.h().e("Twitter", "Failed to calculate signature", paramString);
      return "";
    }
    catch (NoSuchAlgorithmException paramString)
    {
      f.h().e("Twitter", "Failed to calculate signature", paramString);
      return "";
    }
    catch (UnsupportedEncodingException paramString)
    {
      f.h().e("Twitter", "Failed to calculate signature", paramString);
    }
    return "";
  }
  
  String a(String paramString1, String paramString2)
  {
    URI localURI = URI.create(this.f);
    TreeMap localTreeMap = s.a(localURI, true);
    if (this.g != null) {
      localTreeMap.putAll(this.g);
    }
    if (this.d != null) {
      localTreeMap.put("oauth_callback", this.d);
    }
    localTreeMap.put("oauth_consumer_key", this.b.a());
    localTreeMap.put("oauth_nonce", paramString1);
    localTreeMap.put("oauth_signature_method", "HMAC-SHA1");
    localTreeMap.put("oauth_timestamp", paramString2);
    if ((this.c != null) && (this.c.b != null)) {
      localTreeMap.put("oauth_token", this.c.b);
    }
    localTreeMap.put("oauth_version", "1.0");
    paramString1 = localURI.getScheme() + "://" + localURI.getHost() + localURI.getPath();
    return this.e.toUpperCase(Locale.ENGLISH) + '&' + s.c(paramString1) + '&' + a(localTreeMap);
  }
  
  String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder("OAuth");
    a(localStringBuilder, "oauth_callback", this.d);
    a(localStringBuilder, "oauth_consumer_key", this.b.a());
    a(localStringBuilder, "oauth_nonce", paramString1);
    a(localStringBuilder, "oauth_signature", paramString3);
    a(localStringBuilder, "oauth_signature_method", "HMAC-SHA1");
    a(localStringBuilder, "oauth_timestamp", paramString2);
    if (this.c != null) {}
    for (paramString1 = this.c.b;; paramString1 = null)
    {
      a(localStringBuilder, "oauth_token", paramString1);
      a(localStringBuilder, "oauth_version", "1.0");
      return localStringBuilder.substring(0, localStringBuilder.length() - 1);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */