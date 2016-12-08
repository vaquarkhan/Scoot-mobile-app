package com.twitter.sdk.android.core;

import b.a.a.a.f;
import com.google.a.k;
import com.google.a.r;
import com.twitter.sdk.android.core.a.b;
import com.twitter.sdk.android.core.a.d;
import com.twitter.sdk.android.core.services.AccountService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.RestAdapter.Builder;
import retrofit.android.MainThreadExecutor;
import retrofit.converter.GsonConverter;

public class n
{
  final ConcurrentHashMap<Class, Object> a;
  final RestAdapter b;
  final RestAdapter c;
  
  n(TwitterAuthConfig paramTwitterAuthConfig, l paraml, com.twitter.sdk.android.core.internal.l paraml1, SSLSocketFactory paramSSLSocketFactory, ExecutorService paramExecutorService)
  {
    if (paraml == null) {
      throw new IllegalArgumentException("Session must not be null.");
    }
    this.a = new ConcurrentHashMap();
    k localk = new r().a(new b()).a(new d()).a();
    this.b = new RestAdapter.Builder().setClient(new e(paramTwitterAuthConfig, paraml, paramSSLSocketFactory)).setEndpoint(paraml1.a()).setConverter(new GsonConverter(localk)).setExecutors(paramExecutorService, new MainThreadExecutor()).build();
    this.c = new RestAdapter.Builder().setClient(new e(paramTwitterAuthConfig, paraml, paramSSLSocketFactory)).setEndpoint("https://upload.twitter.com").setConverter(new GsonConverter(localk)).setExecutors(paramExecutorService, new MainThreadExecutor()).build();
  }
  
  public n(l paraml)
  {
    this(t.d().f(), paraml, new com.twitter.sdk.android.core.internal.l(), t.d().g(), t.d().F().f());
  }
  
  public AccountService a()
  {
    return (AccountService)a(AccountService.class);
  }
  
  protected <T> T a(Class<T> paramClass)
  {
    return (T)a(this.b, paramClass);
  }
  
  protected <T> T a(RestAdapter paramRestAdapter, Class<T> paramClass)
  {
    if (!this.a.contains(paramClass)) {
      this.a.putIfAbsent(paramClass, paramRestAdapter.create(paramClass));
    }
    return (T)this.a.get(paramClass);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */