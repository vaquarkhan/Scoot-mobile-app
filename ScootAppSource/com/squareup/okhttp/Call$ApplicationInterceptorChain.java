package com.squareup.okhttp;

import java.util.List;

class Call$ApplicationInterceptorChain
  implements Interceptor.Chain
{
  private final boolean forWebSocket;
  private final int index;
  private final Request request;
  
  Call$ApplicationInterceptorChain(Call paramCall, int paramInt, Request paramRequest, boolean paramBoolean)
  {
    this.index = paramInt;
    this.request = paramRequest;
    this.forWebSocket = paramBoolean;
  }
  
  public Connection connection()
  {
    return null;
  }
  
  public Response proceed(Request paramRequest)
  {
    if (this.index < Call.access$300(this.this$0).interceptors().size())
    {
      Object localObject = new ApplicationInterceptorChain(this.this$0, this.index + 1, paramRequest, this.forWebSocket);
      paramRequest = (Interceptor)Call.access$300(this.this$0).interceptors().get(this.index);
      localObject = paramRequest.intercept((Interceptor.Chain)localObject);
      if (localObject == null) {
        throw new NullPointerException("application interceptor " + paramRequest + " returned null");
      }
      return (Response)localObject;
    }
    return this.this$0.getResponse(paramRequest, this.forWebSocket);
  }
  
  public Request request()
  {
    return this.request;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Call$ApplicationInterceptorChain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */