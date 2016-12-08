package retrofit;

public abstract interface Profiler<T>
{
  public abstract void afterCall(Profiler.RequestInformation paramRequestInformation, long paramLong, int paramInt, T paramT);
  
  public abstract T beforeCall();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\Profiler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */