package retrofit;

import retrofit.client.Response;

public abstract interface Callback<T>
{
  public abstract void failure(RetrofitError paramRetrofitError);
  
  public abstract void success(T paramT, Response paramResponse);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Callback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */