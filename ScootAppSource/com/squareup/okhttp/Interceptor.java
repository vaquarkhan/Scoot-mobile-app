package com.squareup.okhttp;

public abstract interface Interceptor
{
  public abstract Response intercept(Interceptor.Chain paramChain);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Interceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */