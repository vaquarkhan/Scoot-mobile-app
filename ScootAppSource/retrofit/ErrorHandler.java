package retrofit;

public abstract interface ErrorHandler
{
  public static final ErrorHandler DEFAULT = new ErrorHandler.1();
  
  public abstract Throwable handleError(RetrofitError paramRetrofitError);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\ErrorHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */