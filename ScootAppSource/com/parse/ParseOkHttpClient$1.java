package com.parse;

import a.l;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import com.parse.http.ParseNetworkInterceptor;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Interceptor.Chain;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Response.Builder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ParseOkHttpClient$1
  implements Interceptor
{
  ParseOkHttpClient$1(ParseOkHttpClient paramParseOkHttpClient, ParseNetworkInterceptor paramParseNetworkInterceptor) {}
  
  public Response intercept(Interceptor.Chain paramChain)
  {
    Object localObject1 = paramChain.request();
    Object localObject2 = ParseOkHttpClient.access$000(this.this$0, (Request)localObject1);
    localObject1 = new l();
    paramChain = this.val$parseNetworkInterceptor.intercept(new ParseOkHttpClient.1.1(this, (ParseHttpRequest)localObject2, paramChain, (l)localObject1));
    localObject1 = ((Response)((l)localObject1).a()).newBuilder();
    ((Response.Builder)localObject1).code(paramChain.getStatusCode()).message(paramChain.getReasonPhrase());
    if (paramChain.getAllHeaders() != null)
    {
      localObject2 = paramChain.getAllHeaders().entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        ((Response.Builder)localObject1).header((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    ((Response.Builder)localObject1).body(new ParseOkHttpClient.1.2(this, paramChain));
    return ((Response.Builder)localObject1).build();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseOkHttpClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */