package retrofit;

class RestAdapter$RestHandler$1
  implements RxSupport.Invoker
{
  RestAdapter$RestHandler$1(RestAdapter.RestHandler paramRestHandler, RestMethodInfo paramRestMethodInfo, Object[] paramArrayOfObject) {}
  
  public ResponseWrapper invoke(RequestInterceptor paramRequestInterceptor)
  {
    return (ResponseWrapper)RestAdapter.RestHandler.access$100(this.this$1, paramRequestInterceptor, this.val$methodInfo, this.val$args);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\RestAdapter$RestHandler$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */