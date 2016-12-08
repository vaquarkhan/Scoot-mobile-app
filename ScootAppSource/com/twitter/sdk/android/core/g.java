package com.twitter.sdk.android.core;

import b.a.a.a.f;
import b.a.a.a.t;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import retrofit.client.Client;
import retrofit.client.Request;
import retrofit.client.Response;

public class g
  implements Client
{
  final Client a;
  final SSLSocketFactory b;
  
  public g(SSLSocketFactory paramSSLSocketFactory)
  {
    this.b = paramSSLSocketFactory;
    if (a())
    {
      this.a = new h(this);
      return;
    }
    this.a = new i(this);
  }
  
  private boolean a()
  {
    bool2 = true;
    try
    {
      Class.forName("com.squareup.okhttp.OkUrlFactory");
      boolean bool1 = true;
      return bool2;
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      try
      {
        for (;;)
        {
          Class.forName("com.squareup.okhttp.OkHttpClient");
          if (bool2 == bool1) {
            break;
          }
          f.h().a("Twitter", "Retrofit detected an unsupported OkHttp on the classpath.\nTo use OkHttp with this version of Retrofit, you'll need:\n1. com.squareup.okhttp:okhttp:1.6.0 (or newer)\n2. com.squareup.okhttp:okhttp-urlconnection:1.6.0 (or newer)\nNote that OkHttp 2.0.0+ is supported!");
          return false;
          localClassNotFoundException1 = localClassNotFoundException1;
          bool1 = false;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException2)
      {
        for (;;)
        {
          bool2 = false;
        }
      }
    }
  }
  
  HttpURLConnection a(HttpURLConnection paramHttpURLConnection)
  {
    if ((this.b != null) && ((paramHttpURLConnection instanceof HttpsURLConnection))) {
      ((HttpsURLConnection)paramHttpURLConnection).setSSLSocketFactory(this.b);
    }
    return paramHttpURLConnection;
  }
  
  public Response execute(Request paramRequest)
  {
    return this.a.execute(paramRequest);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */