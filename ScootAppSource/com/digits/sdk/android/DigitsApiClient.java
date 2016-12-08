package com.digits.sdk.android;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.l;
import com.twitter.sdk.android.core.t;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.RestAdapter.Builder;
import retrofit.android.MainThreadExecutor;

final class DigitsApiClient
{
  private final ConcurrentHashMap<Class, Object> a;
  private final RestAdapter b;
  private final l c;
  
  DigitsApiClient(l paraml)
  {
    this(paraml, t.d().f(), t.d().g(), ao.d().l());
  }
  
  DigitsApiClient(l paraml, TwitterAuthConfig paramTwitterAuthConfig, SSLSocketFactory paramSSLSocketFactory, ExecutorService paramExecutorService)
  {
    this(paraml, paramTwitterAuthConfig, paramSSLSocketFactory, paramExecutorService, new ch());
  }
  
  DigitsApiClient(l paraml, TwitterAuthConfig paramTwitterAuthConfig, SSLSocketFactory paramSSLSocketFactory, ExecutorService paramExecutorService, ch paramch)
  {
    this.c = paraml;
    this.a = new ConcurrentHashMap();
    this.b = new RestAdapter.Builder().setEndpoint(new az().a()).setRequestInterceptor(new bv(paramch)).setExecutors(paramExecutorService, new MainThreadExecutor()).setClient(new e(paramTwitterAuthConfig, paraml, paramSSLSocketFactory)).build();
  }
  
  private <T> T a(Class<T> paramClass)
  {
    if (!this.a.containsKey(paramClass)) {
      this.a.put(paramClass, this.b.create(paramClass));
    }
    return (T)this.a.get(paramClass);
  }
  
  public l a()
  {
    return this.c;
  }
  
  public DigitsApiClient.SdkService b()
  {
    return (DigitsApiClient.SdkService)a(DigitsApiClient.SdkService.class);
  }
  
  public DigitsApiClient.DeviceService c()
  {
    return (DigitsApiClient.DeviceService)a(DigitsApiClient.DeviceService.class);
  }
  
  public DigitsApiClient.AccountService d()
  {
    return (DigitsApiClient.AccountService)a(DigitsApiClient.AccountService.class);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\DigitsApiClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */