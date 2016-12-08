package com.sagar.taxiapp;

import com.b.a.a.h;
import com.b.a.a.i;
import com.b.a.r;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

public final class dc
  extends h
{
  public dc(HttpClient paramHttpClient)
  {
    super(paramHttpClient);
  }
  
  private static void a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, r<?> paramr)
  {
    paramr = paramr.q();
    if (paramr != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(paramr));
    }
  }
  
  private static void a(HttpUriRequest paramHttpUriRequest, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }
  
  static HttpUriRequest c(r<?> paramr, Map<String, String> paramMap)
  {
    switch (paramr.a())
    {
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      paramMap = paramr.m();
      if (paramMap != null)
      {
        HttpPost localHttpPost = new HttpPost(paramr.d());
        localHttpPost.addHeader("Content-Type", paramr.l());
        localHttpPost.setEntity(new ByteArrayEntity(paramMap));
        return localHttpPost;
      }
      return new HttpGet(paramr.d());
    case 0: 
      return new HttpGet(paramr.d());
    case 3: 
      paramMap = new dd(paramr.d());
      paramMap.addHeader("Content-Type", paramr.p());
      a(paramMap, paramr);
      return paramMap;
    case 1: 
      paramMap = new HttpPost(paramr.d());
      paramMap.addHeader("Content-Type", paramr.p());
      a(paramMap, paramr);
      return paramMap;
    case 2: 
      paramMap = new HttpPut(paramr.d());
      paramMap.addHeader("Content-Type", paramr.p());
      a(paramMap, paramr);
      return paramMap;
    case 4: 
      return new HttpHead(paramr.d());
    case 5: 
      return new HttpOptions(paramr.d());
    case 6: 
      return new HttpTrace(paramr.d());
    }
    paramMap = new i(paramr.d());
    paramMap.addHeader("Content-Type", paramr.p());
    a(paramMap, paramr);
    return paramMap;
  }
  
  public HttpResponse a(r<?> paramr, Map<String, String> paramMap)
  {
    HttpUriRequest localHttpUriRequest = c(paramr, paramMap);
    a(localHttpUriRequest, paramMap);
    a(localHttpUriRequest, paramr.i());
    a(localHttpUriRequest);
    paramMap = localHttpUriRequest.getParams();
    int i = paramr.t();
    HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
    HttpConnectionParams.setSoTimeout(paramMap, i);
    return this.a.execute(localHttpUriRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */