package retrofit;

 enum RequestInterceptorTape$Command$3
{
  RequestInterceptorTape$Command$3()
  {
    super(paramString, paramInt, null);
  }
  
  public void intercept(RequestInterceptor.RequestFacade paramRequestFacade, String paramString1, String paramString2)
  {
    paramRequestFacade.addEncodedPathParam(paramString1, paramString2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\RequestInterceptorTape$Command$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */