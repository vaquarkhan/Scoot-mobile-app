package com.parse;

import android.content.Context;
import com.parse.http.ParseNetworkInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Parse$Configuration
{
  final String applicationId;
  final String clientKey;
  final Context context;
  final List<ParseNetworkInterceptor> interceptors;
  final boolean localDataStoreEnabled;
  final String server;
  
  private Parse$Configuration(Parse.Configuration.Builder paramBuilder)
  {
    this.context = Parse.Configuration.Builder.access$100(paramBuilder);
    this.applicationId = Parse.Configuration.Builder.access$200(paramBuilder);
    this.clientKey = Parse.Configuration.Builder.access$300(paramBuilder);
    this.server = Parse.Configuration.Builder.access$400(paramBuilder);
    this.localDataStoreEnabled = Parse.Configuration.Builder.access$500(paramBuilder);
    if (Parse.Configuration.Builder.access$600(paramBuilder) != null) {}
    for (paramBuilder = Collections.unmodifiableList(new ArrayList(Parse.Configuration.Builder.access$600(paramBuilder)));; paramBuilder = null)
    {
      this.interceptors = paramBuilder;
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\Parse$Configuration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */