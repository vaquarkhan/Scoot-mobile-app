package com.parse;

import android.content.Context;
import android.os.Bundle;
import com.parse.http.ParseNetworkInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class Parse$Configuration$Builder
{
  private String applicationId;
  private String clientKey;
  private Context context;
  private List<ParseNetworkInterceptor> interceptors;
  private boolean localDataStoreEnabled;
  private String server = "https://api.parse.com/1/";
  
  public Parse$Configuration$Builder(Context paramContext)
  {
    this.context = paramContext;
    if (paramContext != null)
    {
      paramContext = ManifestInfo.getApplicationMetadata(paramContext.getApplicationContext());
      if (paramContext != null)
      {
        this.applicationId = paramContext.getString("com.parse.APPLICATION_ID");
        this.clientKey = paramContext.getString("com.parse.CLIENT_KEY");
      }
    }
  }
  
  private Builder setLocalDatastoreEnabled(boolean paramBoolean)
  {
    this.localDataStoreEnabled = paramBoolean;
    return this;
  }
  
  public Builder addNetworkInterceptor(ParseNetworkInterceptor paramParseNetworkInterceptor)
  {
    if (this.interceptors == null) {
      this.interceptors = new ArrayList();
    }
    this.interceptors.add(paramParseNetworkInterceptor);
    return this;
  }
  
  public Builder applicationId(String paramString)
  {
    this.applicationId = paramString;
    return this;
  }
  
  public Parse.Configuration build()
  {
    return new Parse.Configuration(this, null);
  }
  
  public Builder clientKey(String paramString)
  {
    this.clientKey = paramString;
    return this;
  }
  
  public Builder enableLocalDataStore()
  {
    this.localDataStoreEnabled = true;
    return this;
  }
  
  public Builder server(String paramString)
  {
    this.server = paramString;
    return this;
  }
  
  Builder setNetworkInterceptors(Collection<ParseNetworkInterceptor> paramCollection)
  {
    if (this.interceptors == null) {
      this.interceptors = new ArrayList();
    }
    for (;;)
    {
      if (paramCollection != null) {
        this.interceptors.addAll(paramCollection);
      }
      return this;
      this.interceptors.clear();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\Parse$Configuration$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */