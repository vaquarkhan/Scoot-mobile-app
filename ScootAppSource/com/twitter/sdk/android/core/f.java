package com.twitter.sdk.android.core;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public abstract class f<T>
  implements Callback<T>
{
  public abstract void a(k<T> paramk);
  
  public abstract void a(u paramu);
  
  public final void failure(RetrofitError paramRetrofitError)
  {
    a(o.a(paramRetrofitError));
  }
  
  public final void success(T paramT, Response paramResponse)
  {
    a(new k(paramT, paramResponse));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */