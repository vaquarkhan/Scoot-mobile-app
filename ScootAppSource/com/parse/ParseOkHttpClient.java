package com.parse;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpRequest.Builder;
import com.parse.http.ParseHttpRequest.Method;
import com.parse.http.ParseHttpResponse;
import com.parse.http.ParseHttpResponse.Builder;
import com.parse.http.ParseNetworkInterceptor;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Headers.Builder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Request.Builder;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class ParseOkHttpClient
  extends ParseHttpClient<Request, Response>
{
  private static final String OKHTTP_DELETE = "DELETE";
  private static final String OKHTTP_GET = "GET";
  private static final String OKHTTP_POST = "POST";
  private static final String OKHTTP_PUT = "PUT";
  private OkHttpClient okHttpClient = new OkHttpClient();
  
  public ParseOkHttpClient(int paramInt, SSLSessionCache paramSSLSessionCache)
  {
    this.okHttpClient.setConnectTimeout(paramInt, TimeUnit.MILLISECONDS);
    this.okHttpClient.setReadTimeout(paramInt, TimeUnit.MILLISECONDS);
    this.okHttpClient.setFollowRedirects(false);
    this.okHttpClient.setSslSocketFactory(SSLCertificateSocketFactory.getDefault(paramInt, paramSSLSessionCache));
  }
  
  private ParseHttpRequest getParseHttpRequest(Request paramRequest)
  {
    ParseHttpRequest.Builder localBuilder = new ParseHttpRequest.Builder();
    Object localObject = paramRequest.method();
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        throw new IllegalArgumentException("Invalid http method " + paramRequest.method());
        if (((String)localObject).equals("GET"))
        {
          i = 0;
          continue;
          if (((String)localObject).equals("DELETE"))
          {
            i = 1;
            continue;
            if (((String)localObject).equals("POST"))
            {
              i = 2;
              continue;
              if (((String)localObject).equals("PUT")) {
                i = 3;
              }
            }
          }
        }
        break;
      }
    }
    localBuilder.setMethod(ParseHttpRequest.Method.GET);
    for (;;)
    {
      localBuilder.setUrl(paramRequest.urlString());
      localObject = paramRequest.headers().toMultimap().entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        localBuilder.addHeader((String)localEntry.getKey(), (String)((List)localEntry.getValue()).get(0));
      }
      localBuilder.setMethod(ParseHttpRequest.Method.DELETE);
      continue;
      localBuilder.setMethod(ParseHttpRequest.Method.POST);
      continue;
      localBuilder.setMethod(ParseHttpRequest.Method.PUT);
    }
    paramRequest = (ParseOkHttpClient.ParseOkHttpRequestBody)paramRequest.body();
    if (paramRequest != null) {
      localBuilder.setBody(paramRequest.getParseHttpBody());
    }
    return localBuilder.build();
  }
  
  void addExternalInterceptor(ParseNetworkInterceptor paramParseNetworkInterceptor)
  {
    this.okHttpClient.networkInterceptors().add(new ParseOkHttpClient.1(this, paramParseNetworkInterceptor));
  }
  
  ParseHttpResponse executeInternal(ParseHttpRequest paramParseHttpRequest)
  {
    paramParseHttpRequest = getRequest(paramParseHttpRequest);
    return getResponse(this.okHttpClient.newCall(paramParseHttpRequest).execute());
  }
  
  Request getRequest(ParseHttpRequest paramParseHttpRequest)
  {
    Request.Builder localBuilder = new Request.Builder();
    ParseHttpRequest.Method localMethod = paramParseHttpRequest.getMethod();
    switch (ParseOkHttpClient.2.$SwitchMap$com$parse$http$ParseHttpRequest$Method[localMethod.ordinal()])
    {
    default: 
      throw new IllegalStateException("Unsupported http method " + localMethod.toString());
    case 1: 
      localBuilder.get();
    }
    for (;;)
    {
      localBuilder.url(paramParseHttpRequest.getUrl());
      localObject = new Headers.Builder();
      Iterator localIterator = paramParseHttpRequest.getAllHeaders().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        ((Headers.Builder)localObject).add((String)localEntry.getKey(), (String)localEntry.getValue());
      }
      localBuilder.delete();
    }
    localBuilder.headers(((Headers.Builder)localObject).build());
    Object localObject = paramParseHttpRequest.getBody();
    paramParseHttpRequest = null;
    if ((localObject instanceof ParseByteArrayHttpBody)) {
      paramParseHttpRequest = new ParseOkHttpClient.ParseOkHttpRequestBody((ParseHttpBody)localObject);
    }
    switch (ParseOkHttpClient.2.$SwitchMap$com$parse$http$ParseHttpRequest$Method[localMethod.ordinal()])
    {
    }
    for (;;)
    {
      return localBuilder.build();
      localBuilder.put(paramParseHttpRequest);
      continue;
      localBuilder.post(paramParseHttpRequest);
    }
  }
  
  ParseHttpResponse getResponse(Response paramResponse)
  {
    int i = paramResponse.code();
    InputStream localInputStream = paramResponse.body().byteStream();
    int j = (int)paramResponse.body().contentLength();
    String str = paramResponse.message();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramResponse.headers().names().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localHashMap.put(localObject, paramResponse.header((String)localObject));
    }
    localIterator = null;
    Object localObject = paramResponse.body();
    paramResponse = localIterator;
    if (localObject != null)
    {
      paramResponse = localIterator;
      if (((ResponseBody)localObject).contentType() != null) {
        paramResponse = ((ResponseBody)localObject).contentType().toString();
      }
    }
    return new ParseHttpResponse.Builder().setStatusCode(i).setContent(localInputStream).setTotalSize(j).setReasonPhrase(str).setHeaders(localHashMap).setContentType(paramResponse).build();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOkHttpClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */