package retrofit;

import java.util.concurrent.Executor;

class RestAdapter$RestHandler$2
  extends CallbackRunnable
{
  RestAdapter$RestHandler$2(RestAdapter.RestHandler paramRestHandler, Callback paramCallback, Executor paramExecutor, ErrorHandler paramErrorHandler, RequestInterceptorTape paramRequestInterceptorTape, RestMethodInfo paramRestMethodInfo, Object[] paramArrayOfObject)
  {
    super(paramCallback, paramExecutor, paramErrorHandler);
  }
  
  public ResponseWrapper obtainResponse()
  {
    return (ResponseWrapper)RestAdapter.RestHandler.access$100(this.this$1, this.val$interceptorTape, this.val$methodInfo, this.val$args);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\RestAdapter$RestHandler$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */