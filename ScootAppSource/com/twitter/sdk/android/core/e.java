package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.internal.m;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;
import retrofit.client.Client;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.FormUrlEncodedTypedOutput;
import retrofit.mime.TypedOutput;

public final class e
  extends g
{
  private final l c;
  private final TwitterAuthConfig d;
  
  public e(TwitterAuthConfig paramTwitterAuthConfig, l paraml, SSLSocketFactory paramSSLSocketFactory)
  {
    super(paramSSLSocketFactory);
    this.d = paramTwitterAuthConfig;
    this.c = paraml;
  }
  
  protected String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = URLDecoder.decode(paramString1, paramString2);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new IllegalArgumentException("bad parameter encoding");
    }
  }
  
  protected List<Header> a(Request paramRequest)
  {
    Object localObject = new m(paramRequest.getMethod(), paramRequest.getUrl(), this.d, this.c, null, b(paramRequest));
    paramRequest = new ArrayList(paramRequest.getHeaders());
    localObject = ((m)localObject).a().entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramRequest.add(new Header((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
    return paramRequest;
  }
  
  protected Map<String, String> a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Scanner localScanner = new Scanner(paramString).useDelimiter("&");
    while (localScanner.hasNext())
    {
      String[] arrayOfString = localScanner.next().split("=");
      if ((arrayOfString.length == 0) || (arrayOfString.length > 2)) {
        throw new IllegalArgumentException("bad parameter");
      }
      String str = a(arrayOfString[0], "UTF-8");
      paramString = "";
      if (arrayOfString.length == 2) {
        paramString = a(arrayOfString[1], "UTF-8");
      }
      localHashMap.put(str, paramString);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  protected Map<String, String> b(Request paramRequest)
  {
    TreeMap localTreeMap = new TreeMap();
    if ("POST".equals(paramRequest.getMethod().toUpperCase(Locale.US)))
    {
      paramRequest = paramRequest.getBody();
      if ((paramRequest instanceof FormUrlEncodedTypedOutput))
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        paramRequest.writeTo(localByteArrayOutputStream);
        paramRequest = localByteArrayOutputStream.toString("UTF-8");
        if (paramRequest.length() > 0) {
          localTreeMap.putAll(a(paramRequest));
        }
      }
    }
    return localTreeMap;
  }
  
  public Response execute(Request paramRequest)
  {
    paramRequest = new Request(paramRequest.getMethod(), paramRequest.getUrl(), a(paramRequest), paramRequest.getBody());
    return this.a.execute(paramRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */