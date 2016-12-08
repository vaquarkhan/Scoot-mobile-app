package retrofit;

public abstract interface RequestInterceptor
{
  public static final RequestInterceptor NONE = new RequestInterceptor.1();
  
  public abstract void intercept(RequestInterceptor.RequestFacade paramRequestFacade);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\RequestInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */