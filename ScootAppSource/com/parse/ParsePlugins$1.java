package com.parse;

import android.os.Build.VERSION;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpRequest.Builder;
import com.parse.http.ParseHttpResponse;
import com.parse.http.ParseNetworkInterceptor;
import com.parse.http.ParseNetworkInterceptor.Chain;

class ParsePlugins$1
  implements ParseNetworkInterceptor
{
  ParsePlugins$1(ParsePlugins paramParsePlugins) {}
  
  public ParseHttpResponse intercept(ParseNetworkInterceptor.Chain paramChain)
  {
    ParseHttpRequest localParseHttpRequest = paramChain.getRequest();
    ParseHttpRequest.Builder localBuilder = new ParseHttpRequest.Builder(localParseHttpRequest).addHeader("X-Parse-Application-Id", ParsePlugins.access$100(this.this$0)).addHeader("X-Parse-Client-Key", ParsePlugins.access$000(this.this$0)).addHeader("X-Parse-Client-Version", Parse.externalVersionName()).addHeader("X-Parse-App-Build-Version", String.valueOf(ManifestInfo.getVersionCode())).addHeader("X-Parse-App-Display-Version", ManifestInfo.getVersionName()).addHeader("X-Parse-OS-Version", Build.VERSION.RELEASE).addHeader("User-Agent", this.this$0.userAgent());
    if (localParseHttpRequest.getHeader("X-Parse-Installation-Id") == null) {
      localBuilder.addHeader("X-Parse-Installation-Id", this.this$0.installationId().get());
    }
    return paramChain.proceed(localBuilder.build());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePlugins$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */